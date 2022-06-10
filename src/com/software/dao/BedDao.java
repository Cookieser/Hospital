package com.software.dao;

import com.software.entity.BedEntity;
import com.software.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BedDao {
    public int addWork(BedEntity bedEntity) {
        String sql = "Insert into bed(Bed_Number,State,Room_ID,Room_Clean,Delmark,remarks,PatientID)values("+bedEntity.getBedNumber()+","+bedEntity.getState()+",\n"+
                ""+bedEntity.getRoomID()+",'"+bedEntity.getRoomClean()+"',"+bedEntity.getDelmark()+",Null,"+bedEntity.getPatientID()+")";
        int count = DBUtils.executeSql(sql);
        return count;
    }

    public int updateWork(BedEntity bedEntity) {
        String sql="update bed set Bed_Number='"+bedEntity.getBedNumber()+"'," +
                "State='"+bedEntity.getState()+"',Room_ID='"+bedEntity.getRoomID()+"',\n" +
                "Room_Clean='"+bedEntity.getRoomClean()+"',Delmark='"+bedEntity.getDelmark()+"',PatientID='"+bedEntity.getPatientID()+"' where ID='"+bedEntity.getID()+"'";
        System.out.println(sql);

        int count = DBUtils.executeSql(sql);
        return count;
    }

    public int deleteWork(BedEntity bedEntity){
        String sql="update bed set DelMark=0 where ID="+bedEntity.getID()+" ";
        System.out.println(sql);
        //1.5执行sql语句操作
        int count = DBUtils.executeSql(sql);
        return count;
    }

    public List<BedEntity> findWork() {
        List<BedEntity> works = new ArrayList<BedEntity>();
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = DBUtils.getConnection();
            //1.3 创建Statement对象
            st = connection.createStatement();
            //1.4定义要执行操作的SQL语句
            String sql="select ID,Bed_Number,State,Room_ID,Room_Clean,PatientID from bed where DelMark=1" ;
            rs = st.executeQuery(sql);
            BedEntity bedEntity=null;
            while (rs.next()) {
                bedEntity=new BedEntity();
                int ID= rs.getInt("ID");
                int number= rs.getInt("Bed_Number");
                int BState =rs.getInt("State");
                int RoomID = rs.getInt("Room_ID");
                String RoomClean = rs.getString("Room_Clean");
                int PatientID= rs.getInt("PatientID");
                bedEntity.setID(ID);
                bedEntity.setBedNumber(number);
                bedEntity.setState(BState);
                bedEntity.setRoomID(RoomID);
                bedEntity.setRoomClean(RoomClean);
                bedEntity.setPatientID(PatientID);
                works.add(bedEntity);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.closeAll(rs, st, connection);
        }
        return works;
    }
}
