package com.software.dao;


import com.software.entity.Accommodation;
import com.software.utils.DBUtils;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccommodationDao {

        /**
         * 功能：添加员工信息
         * @return
         */

        public int addWork(Accommodation accommodation){

            String sql="insert into accommodation (ID,Start_time,End_time,bed_id,principal,operate_time,Delmark,remarks)values("+accommodation.getID()+",'"+accommodation.getStartTime()+"','"+accommodation.getEndTime()+"'," +
                    "'"+accommodation.getBedId()+"','"+accommodation.getPrincipal()+"','"+accommodation.getOperateTime()+"','"+accommodation.getDelMark()+"'," +
                    "'"+accommodation.getRemarks()+"')";
            int count = DBUtils.executeSql(sql);
            return count;
        }

        /**
         * 根据员工工号修改员工信息
         * @return
         */
        public int updateWork(Accommodation accommodation){
            String sql="update accommodation set Start_time='"+accommodation.getStartTime()+"'," +
                    "End_time='"+accommodation.getEndTime()+"',bed_id='"+accommodation.getBedId()+"',\n" +
                    "principal='"+accommodation.getPrincipal()+"',operate_time='"+accommodation.getOperateTime()+"'," +
                    "Delmark='"+accommodation.getDelMark()+"',remarks='"+accommodation.getRemarks()+"' where ID='"+accommodation.getID()+"'";

            int count =DBUtils.executeSql(sql);
            return count;
        }

        /**
         * 功能：根据员工工号删除员工信息
         * @return
         */
        public int deleteWork(Accommodation accommodation){
            String sql="update accommodation set Delmark=0 where ID = "+accommodation.getID()+"";

            int count =DBUtils.executeSql(sql);
            return count;
        }

        public List<Accommodation> findWork(){
            List<Accommodation> works = new ArrayList<Accommodation>();

            Connection connection = null;
            Statement st = null;
            ResultSet rs = null;
            try {
                connection = DBUtils.getConnection();
                //1.3 创建Statement对象
                st =connection.createStatement();
                //1.4定义要执行操作的SQL语句
                String sql="select ID,bed_id,Start_time,principal,End_time,\n" +
                        "operate_time,Delmark,remarks from accommodation where Delmark = '1'";
                rs = st.executeQuery(sql);
                Accommodation Accommodation = null;
                while(rs.next()){
                    Accommodation accommodation= new Accommodation();

                    int ID = rs.getInt("ID");
                    int bed_id = rs.getInt("bed_id");
                    String Start_time= rs.getString("start_time");
                    int principal =rs.getInt("principal");
                    String End_time= rs.getString("End_time");
                    String operate_time= rs.getString("operate_time");
                    int Delmark= rs.getInt("Delmark");
                    String remarks =rs.getString("remarks");
                    accommodation.setID(ID);
                    accommodation.setStartTime(Start_time);
                    accommodation.setEndTime(End_time);
                    accommodation.setBedId(bed_id);
                    accommodation.setPrincipal(principal);
                    accommodation.setOperateTime(operate_time);
                    accommodation.setDelMark(Delmark);
                    accommodation.setRemarks(remarks);

                    //添加集合对象(封装)
                    works.add(accommodation);
                }

            } catch(Exception e){
                e.printStackTrace();
            } finally {
                DBUtils.closeAll(rs,st,connection);
            }
            return works;
        }

    }

