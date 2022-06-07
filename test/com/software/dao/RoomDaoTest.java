package com.software.dao;


import com.software.entity.RoomEntity;
import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
/**
 * @author 李欣然
 *
 * */


public class RoomDaoTest {
    RoomDao roomDao=new RoomDao();
    @Test
public void testAdd(){
    RoomEntity roomEntity = new RoomEntity();

    roomEntity.setType(1);
    roomEntity.setMax(10);
    roomEntity.setRemark("阴面大窗");
    roomEntity.setDepartment(1);
    roomEntity.setRoomID(1205);
    roomEntity.setPrincipal(3);

    int count = roomDao.addWork(roomEntity);
    if(count >0){
        System.out.println("success");
    }else{
        System.out.println("failure");
    }
}

    @Test
    public void testUpdate(){
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setID(3);
        roomEntity.setRoomID(1208);
        roomEntity.setType(2);

        int count=roomDao.updateWork(roomEntity);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelete(){
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setDelmark(0);
        roomEntity.setID(4);

        int result = roomDao.deleteWork(roomEntity);
        if(result >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testFindAllWork(){
       List<RoomEntity> works = roomDao.findWork();
       for(RoomEntity work:works){

                System.out.println(work.getID()+","+
                        work.getRoomID()+","+
                        work.getPrincipal());
            }


        }
    }

