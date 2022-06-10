package com.software.dao;


import com.software.entity.RareManageEntity;
import com.software.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据库访问层操作--工作人员的增、删、改、查
 */
public class RareManageDao {
    /**
     * 功能：添加员工信息
     * @return
     */
    public int addWork(RareManageEntity rareManageEntity){


        String sql="insert into rare_equipment_management_table(equipment_name,\n" +
                "equipment_type,in_use,Delmark,Room_ID,remarks\n" +
                ") values ('"+rareManageEntity.getEquipmentName()+"','"+
                rareManageEntity.getEquipmentType()+"','"+rareManageEntity.getInUse()+"',\n" +
                "'"+rareManageEntity.getDelMark()+"','"+rareManageEntity.getRoomID()+"','"+rareManageEntity.getRemarks()+"')";
        int count = DBUtils.executeSql(sql);
        return count;
    }

    /**
     * 根据员工工号修改员工信息
     * @return
     */
    public int updateWork(RareManageEntity rareManageEntity){
        String sql="update rare_equipment_management_table set equipment_name='"+rareManageEntity.getEquipmentName()+"',equipment_type='"+rareManageEntity.getEquipmentType()+"',\n" +
                "in_use='"+rareManageEntity.getInUse()+"',Delmark='1',Room_ID='"+rareManageEntity.getRoomID()+"',remarks=Null where ID='"+rareManageEntity.getID()+"'";

        System.out.println(sql);

        int count =DBUtils.executeSql(sql);
        return count;
    }

    /**
     * 功能：根据员工工号删除员工信息
     * @return
     */
    public int deleteWorkById(String rareManageEntity){
        String sql="update rare_equipment_management_table set Delmark=0 \n" +
                "where ID="+rareManageEntity+"";

        int count =DBUtils.executeSql(sql);
        return count;
    }

    public List<RareManageEntity> findWork(){
        List<RareManageEntity> works = new ArrayList<RareManageEntity>();

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select ID,equipment_name,equipment_type,in_use,Delmark,\n" +
                    "Room_ID,remarks from rare_equipment_management_table where Delmark='1'";
            rs = st.executeQuery(sql);
            RareManageEntity RareManageEntity = null;
            while(rs.next()){
                RareManageEntity = new RareManageEntity();

                int id =rs.getInt("ID");
                String en= rs.getString("equipment_name");
                String et =rs.getString("equipment_type");
                int iu =rs.getInt("in_use");
                int roomid =rs.getInt("Room_ID");
                String remarks=rs.getString("remarks");

                RareManageEntity.setID(id);
                RareManageEntity.setEquipmentName(en);
                RareManageEntity.setEquipmentType(et);
                RareManageEntity.setInUse(iu);
                RareManageEntity.setRoomID(roomid);
                RareManageEntity.setRemarks(remarks);

                //添加集合对象(封装)
                works.add(RareManageEntity);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return works;
    }
    public RareManageEntity findWorkById(Integer ID){
        RareManageEntity workmodel = new RareManageEntity();

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st =connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select ID,equipment_name,equipment_type,in_use,Delmark," +
                    "Room_ID,remarks from rare_equipment_management_table where ID="+ID+"";

            rs = st.executeQuery(sql);

            if(rs.next()){

                Integer id =rs.getInt("ID");
                String name= rs.getString("equipment_name");
                String type =rs.getString("equipment_type");
                int inuse =rs.getInt("in_use");
                int roomid =rs.getInt("Room_ID");
                String remark=rs.getString("remarks");


                workmodel.setID(id);
                workmodel.setEquipmentName(name);
                workmodel.setEquipmentType(type);
                workmodel.setInUse(inuse);
                workmodel.setRoomID(roomid);
                workmodel.setRemarks(remark);

            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,st,connection);
        }
        return  workmodel;
    }

}
