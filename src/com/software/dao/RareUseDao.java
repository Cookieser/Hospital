package com.software.dao;


import com.software.entity.RareUseEntity;
import com.software.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据库访问层操作--工作人员的增、删、改、查
 */
public class RareUseDao {
    /**
     * 功能：添加员工信息
     * @return
     */
    public int addWork(RareUseEntity rareUseEntity){
        String sql="insert into rare_equipment_use_table (Start_time,End_time,user_ID,Delmark,remarks) values ('"+rareUseEntity.getStartTime()+"','"+
                rareUseEntity.getEndTime()+"','"+rareUseEntity.getUserID()+"','"+rareUseEntity.getDelMark()+"','"+rareUseEntity.getRemarks()+"')";
        int count = DBUtils.executeSql(sql);
        return count;
    }

    /**
     * 根据员工工号修改员工信息
     * @return
     */
    public int updateWork(RareUseEntity rareUseEntity){
        String sql="update rare_equipment_use_table set Start_time='"+rareUseEntity.getStartTime()+"',End_time='"+rareUseEntity.getEndTime()+"',\n" +
                "user_ID='"+rareUseEntity.getUserID()+"',Delmark=1,remarks=Null where ID='"+rareUseEntity.getID()+"'";
        System.out.println(sql);

        int count =DBUtils.executeSql(sql);
        return count;
    }

    /**
     * 功能：根据员工工号删除员工信息
     * @return
     */
    public int deleteWorkById(String rareUseEntity){
        String sql="update rare_equipment_use_table set Delmark='0' where ID='"+rareUseEntity+"'";

        int count =DBUtils.executeSql(sql);
        return count;
    }

    public List<RareUseEntity> findWork(){
        List<RareUseEntity> works = new ArrayList<RareUseEntity>();

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select ID,Start_time,End_time,user_ID,Delmark,remarks from rare_equipment_use_table\n" +
                    "where Delmark='1'";
            rs = st.executeQuery(sql);
            RareUseEntity workEntity = null;
            while(rs.next()){
                workEntity = new RareUseEntity();

                int id =rs.getInt("ID");
                String stt= rs.getString("Start_time");
                String et =rs.getString("End_time");
                int uid =rs.getInt("user_ID");
                String remark=rs.getString("remarks");

                workEntity.setID(id);
                workEntity.setStartTime(stt);
                workEntity.setEndTime(et);
                workEntity.setUserID(uid);
                workEntity.setRemarks(remark);

                //添加集合对象(封装)
                works.add(workEntity);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return works;
    }
    public RareUseEntity findWorkById(Integer ID){
        RareUseEntity workmodel = new RareUseEntity();

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select ID,Start_time,End_time,user_ID,Delmark,remarks from rare_equipment_use_table where ID="+ID+"";

            rs = st.executeQuery(sql);

            if(rs.next()){

                Integer id =rs.getInt("ID");
                String stm= rs.getString("Start_time");
                String edtm =rs.getString("End_time");
                int urid =rs.getInt("user_ID");
                String  remk =rs.getString("remarks");


                workmodel.setID(id);
                workmodel.setStartTime(stm);
                workmodel.setEndTime(edtm);
                workmodel.setUserID(urid);
                workmodel.setRemarks(remk);

            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return  workmodel;
    }

}
