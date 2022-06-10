//package com.software.dao;
//
//
//
//
//import com.software.entity.RareUseEntity;
//import com.software.utils.DBUtils;
//import org.junit.Test;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.List;
//
///**
// * @author 吴思天
// *
// * */
//
//public class RareUseDaoTest {
//    RareUseDao rareUseDao = new RareUseDao();
//    @Test
//    public void testAddWork(){
//        //1.创建测试用例
//        RareUseEntity rareUseEntity = new RareUseEntity();
//        //2.设置测试用例的数据
//        rareUseEntity.setStartTime("2022-6-3");
//        rareUseEntity.setEndTime("2022-6-5");
//        rareUseEntity.setUserID(5);
//        rareUseEntity.setDelMark(1);
//        rareUseEntity.setRemarks("Null");
//
//
//        //3.验证添加功能是否实现
//        int count =rareUseDao.addWork(rareUseEntity);
//        if(count >0){
//            System.out.println("success");
//        }else{
//            System.out.println("failure");
//        }
//    }
//
//    @Test
//    public void testUpdateWork(){
//        //1.创建测试用例
//        RareUseEntity rareUseEntity = new RareUseEntity();
//        //2.设置测试用例的数据
//        rareUseEntity.setUserID(1);
//        rareUseEntity.setStartTime("2022-5-9");
//        rareUseEntity.setEndTime("2022-5-24");
//        rareUseEntity.setUserID(2);
//        rareUseEntity.setDelMark(2);
//        rareUseEntity.setRemarks("Null");
//
//
//        //3.验证添加功能是否实现
//        int count =rareUseDao.updateWork(rareUseEntity);
//        if(count >0){
//            System.out.println("success");
//        }else{
//            System.out.println("failure");
//        }
//    }
//
//    @Test
//    public void testDelWork(){
//        RareUseEntity rareUSeEntity=new RareUseEntity();
//        rareUSeEntity.setUserID(2);
//        int result = rareUseDao.deleteWorkById(rareUSeEntity);
//
//
//
//
//        if(result >0){
//            System.out.println("success");
//        }else{
//            System.out.println("failure");
//        }
//    }
//
//    @Test
//    public void testFindAllWork(){
//        List<RareUseEntity> works =rareUseDao.findWork();
//        for(RareUseEntity RareUse:works){
//            System.out.println(RareUse.getUserID() + "," +
//                    RareUse.getStartTime() + "," + RareUse.getEndTime());
//        }
//    }
//}
