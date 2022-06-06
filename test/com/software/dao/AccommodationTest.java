package com.software.dao;


import com.software.entity.Accommodation;
import com.software.entity.Doctor;
import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class AccommodationTest {
    AccommodationDao accommodationDao = new AccommodationDao();

    @Test
    public void testAddWork(){
        Accommodation accommodation = new Accommodation();
        accommodation.setID(10);
        accommodation.setStartTime("2020/2/2");
        accommodation.setEndTime("2021/2/2");
        accommodation.setBedId(5);
        accommodation.setPrincipal(1);
        accommodation.setOperateTime("2020-2-2");
        accommodation.setDelMark(1);
        accommodation.setRemarks(null);
        int count = accommodationDao.addWork(accommodation);
        if (count > 0) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdateWork(){
        Accommodation accommodation = new Accommodation();
        accommodation.setID(12);
        accommodation.setStartTime("2020/5/6");
        accommodation.setEndTime("2021/7/8");
        accommodation.setBedId(9);
        accommodation.setPrincipal(2);
        accommodation.setOperateTime("2020-5-6");
        accommodation.setDelMark(1);
        accommodation.setRemarks(null);

        int count = accommodationDao.addWork(accommodation);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDelWork(){
        Accommodation accommodation = new Accommodation();
        accommodation.setID(3);
        accommodation.setRemarks(null);
        int count = accommodationDao.deleteWork(accommodation);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testFindAllWork(){
        List<Accommodation> accommodations = accommodationDao.findWork();
        for (Accommodation accommodation : accommodations) {
            System.out.println(accommodation.getID() + "," +
                    accommodation.getStartTime() + "," + accommodation.getEndTime() + "," + accommodation.getBedId() + ","
                    + accommodation.getPrincipal() + "," + accommodation.getOperateTime() + ","
                    + accommodation.getDelMark() + "," + accommodation.getRemarks());
    }
}
}
