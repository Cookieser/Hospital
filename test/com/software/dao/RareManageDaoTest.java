package com.software.dao;

import com.software.model.RareManageEntity;
import com.software.utils.DBUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class RareManageDaoTest {

    //创建数据库访问层对象
    RareManageDao rareManageDao = new RareManageDao();
    /**
     * 测试功能：测试员工信息的添加
     *
     */
    @Test
    public void testAddWork(){
        //1.创建测试用例
        RareManageEntity rareManageEntity = new RareManageEntity();
        //2.设置测试用例的数据
        rareManageEntity.setEquipmentName("安乐椅");
        rareManageEntity.setEquipmentType("娱乐型");
        rareManageEntity.setInUse(1);
        rareManageEntity.setDelMark(1);
        rareManageEntity.setRoom_ID(2);
        rareManageEntity.setRemarks("Null");

        //3.验证添加功能是否实现
        int count =rareManageDao.addWork(rareManageEntity);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testUpdateWork(){
        //1.创建测试用例
        RareManageEntity rareManageEntity = new RareManageEntity();
        //2.设置测试用例的数据
        rareManageEntity.setID(1);
        rareManageEntity.setEquipmentType("医疗型");
        rareManageEntity.setInUse(0);
        rareManageEntity.setDelMark(0);
        rareManageEntity.setRoom_ID(4);
        rareManageEntity.setRemarks("Null");

        //3.验证添加功能是否实现
        int count =rareManageDao.updateWork(rareManageEntity);
        if(count >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    @Test
    public void testDeleWork(){
        RareManageEntity rareManageEntity=new RareManageEntity();
        rareManageEntity.setID(2);
        int result = rareManageDao.deleteWorkById(rareManageEntity);




        if(result >0){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }

    /**
     * 功能：测试用例查询信息
     */
    @Test
    public void testFindAllWork(){

        List<RareManageEntity> works =rareManageDao.findWork();
        for(RareManageEntity RareManage:works){
            System.out.println(RareManage.getEquipmentName() + "," +
                    RareManage.getEquipmentType() + "," + RareManage.getInUse());
        }
    }
}
