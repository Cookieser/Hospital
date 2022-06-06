package com.software.dao;

import com.software.entity.RoomEntity;
import com.software.utils.DBUtils;
import com.sun.deploy.net.MessageHeader;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RoomDao {

    public int addWork(RoomEntity roomEntity) {
        String sql = "Insert into room(Type,Max,Remark,department,Room_ID,principal,Delmark,remarks)values("+roomEntity.getType()+","+roomEntity.getMax()+",\n"+
                "'"+roomEntity.getRemark()+"',"+roomEntity.getDepartment()+","+roomEntity.getRoomID()+","+roomEntity.getPrincipal()+",\n"+
        ""+roomEntity.getDelmark()+",Null)";
        int count = DBUtils.executeSql(sql);
        return count;
    }

    public int updateWork(RoomEntity roomEntity) {
        String sql="update room set Room_ID="+roomEntity.getRoomID()+" where ID="+roomEntity.getID()+"";

        int count = DBUtils.executeSql(sql);
        return count;
    }

    public int deleteWork(RoomEntity roomEntity){
        String sql="update room set DelMark=0 where ID="+roomEntity.getID()+" ";
        //1.5执行sql语句操作
        int count = DBUtils.executeSql(sql);
        return count;
    }

    public List<RoomEntity>findWork() {
        List<RoomEntity> works = new ArrayList<RoomEntity>();
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st = connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql = "select ID,`Type`,`Max`,Remark,department,Room_ID,principal,Delmark,remarks from room where DelMark=1";
            rs = st.executeQuery(sql);
                RoomEntity roomEntity=null;
            while (rs.next()) {
                roomEntity=new RoomEntity();
                int RID = rs.getInt("ID");
                int Rroom_ID = rs.getInt("Room_ID");
                String remark = rs.getString("Remark");

                roomEntity.setID(RID);
                roomEntity.setRoomID(Rroom_ID);
                roomEntity.setRemark(remark);

                works.add(roomEntity);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs, st, connection);
        }
        return works;
    }
}
