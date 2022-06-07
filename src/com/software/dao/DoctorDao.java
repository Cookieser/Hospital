package com.software.dao;
import com.software.entity.Doctor;
import com.software.utils.DBUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * 数据库访问层操作--工作人员的增、删、改、查
 */
public class DoctorDao{
    /**
     * 功能：添加员工信息
     * @return
     */

    public int addWork(Doctor doctor){

        String sql="insert into doctor_chart(principal,doctor_num,name,age,work_year,Account,password," +
                "gender,birthday,Title,department,Delmark,remarks) " +
                "values( '"+doctor.getPrincipal()+"','"+doctor.getDoctorNum()+"','"+doctor.getName()+"'," +
                "'"+doctor.getAge()+"','"+doctor.getYear()+"','"+doctor.getAccount()+"','"+doctor.getPassWord()+"'," +
                "'"+doctor.getGender()+"','"+doctor.getBirthday()+"','"+doctor.getTitle()+"'," +
                "'"+doctor.getDepartment()+"','"+doctor.getDelMark()+"','"+doctor.getRemarks()+"')";
        int count = DBUtils.executeSql(sql);
        return count;
    }

    /**
     * 根据员工工号修改员工信息
     * @return
     */
    public int updateWork(Doctor doctor){
        String sql="update doctor_chart set doctor_num='"+doctor.getDoctorNum()+"'," +
                "name='"+doctor.getName()+"',age='"+doctor.getAge()+"',\n" +
                "work_year='"+doctor.getYear()+"',Account='"+doctor.getAccount()+"'," +
                "password='"+doctor.getPassWord()+"',\n" +
                "gender='"+doctor.getGender()+"', birthday='"+doctor.getBirthday()+"'," +
                "Title='"+doctor.getTitle()+"',department='"+doctor.getDepartment()+"'," +
                "Delmark='"+doctor.getDelMark()+"',remarks='"+doctor.getRemarks()+"' where principal='"+doctor.getPrincipal()+"'";

        int count =DBUtils.executeSql(sql);
        return count;
    }

    /**
     * 功能：根据员工工号删除员工信息
     * @return
     */
    public int deleteWork(Doctor doctor){
        String sql="update doctor_chart set Delmark=0 where principal = '"+doctor.getPrincipal()+"'";

        int count =DBUtils.executeSql(sql);
        return count;
    }

    public List<Doctor> findAllWork(){
        List<Doctor> works = new ArrayList<Doctor>();

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select principal,doctor_num,name,age,work_year,\n" +
                    "Account,password,gender,birthday,Title,\n" +
                    "department,Delmark,remarks from doctor_chart\n where Delmark = '1'";
            rs = st.executeQuery(sql);
            Doctor Doctor = null;
            while(rs.next()){
                Doctor doctor= new Doctor();

                int principal = rs.getInt("principal");
                int doctorNum = rs.getInt("doctor_num");
                String name= rs.getString("name");
                int age =rs.getInt("age");
                String year= rs.getString("work_year");
                String Account= rs.getString("Account");
                String password= rs.getString("password");
                String gender= rs.getString("gender");
                String birthday= rs.getString("birthday");
                String Title= rs.getString("Title");
                String department =rs.getString("department");
                String delMark =rs.getString("delMark");
                String remarks =rs.getString("remarks");
                doctor.setPrincipal(principal);
                doctor.setDoctorNum(doctorNum);
                doctor.setName(name);
                doctor.setAge(age);
                doctor.setYear(year);
                doctor.setAccount(Account);
                doctor.setPassWord(password);
                doctor.setGender(gender);
                doctor.setBirthday(birthday);
                doctor.setTitle(Title);
                doctor.setDepartment(department);
                doctor.setDelMark(delMark);
                doctor.setRemarks(remarks);
                //添加集合对象(封装)
                works.add(doctor);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return works;
    }
    public Doctor findWorkById(Integer principal){
        Doctor doctor = new Doctor();

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select doctor_num,name ,age,work_year,Account,\n" +
                    "   password,gender,birthday,Title,department,Delmark,remarks from doctor_chart " +
                    "where principal="+principal+" and Delmark = '1'";
            rs = st.executeQuery(sql);

            if(rs.next()){

                Integer doctor_num= rs.getInt("doctor_num");
                String name =rs.getString("name");
                Integer age =rs.getInt("age");
                String work_year =rs.getString("work_year");
                String Account = rs.getString("Account");
                String password = rs.getString("password");
                String gender =rs.getString("gender");
                String birthday =rs.getString("birthday");
                String Title = rs.getString("Title");
                String department = rs.getString("department");
                String Delmark = rs.getString("Delmark");
                String remarks = rs.getString("remarks");
                doctor.setPrincipal(principal);
                doctor.setDoctorNum(doctor_num);
                doctor.setName(name);
                doctor.setAge(age);
                doctor.setYear(work_year);
                doctor.setAccount(Account);
                doctor.setPassWord(password);
                doctor.setGender(gender);
                doctor.setBirthday(birthday);
                doctor.setTitle(Title);
                doctor.setDepartment(department);
                doctor.setDelMark(Delmark);
                doctor.setRemarks(remarks);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return doctor;
    }
    public Doctor validateLogin(String loginAccount) {
        Doctor work = null;
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st = connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql = "select Account,password from doctor_chart\n" +
                    " where Account='" + loginAccount + "' and  Delmark='1'";
            rs = st.executeQuery(sql);

            if (rs.next()) {
                work = new Doctor();
                String acc = rs.getString("Account");
                String pwd = rs.getString("password");


                work.setAccount(acc);
                work.setPassWord(pwd);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs, st, connection);
        }
        return work;
    }
}

