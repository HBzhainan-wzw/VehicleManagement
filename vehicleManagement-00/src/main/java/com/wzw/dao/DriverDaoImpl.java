package com.wzw.dao;

import java.sql.*;

public class DriverDaoImpl implements DriverDao{

    //司机注册
    @Override
    public void driverRegister(Integer uid, String identifier, String idType, String name, String licenseID, String state,
                               String FICO, String regType, String insuranceID, String contractType, String contractStatus) {

        //配置mysql信息
        final String DRIVER_NAME = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://127.0.0.1:3306/james";
        final String USER_NAME = "root";
        final String PASSWORD = "james007";

        Connection conn = null;
        Statement stmt = null;
        try {
            //注册mysql数据库驱动
            Class.forName(DRIVER_NAME);
            //连接数据库
            conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            //设置插入语句
            String sql = "INSERT INTO DRIVER VALUES (" + uid + ", '" + identifier + "', '" + idType + "', '" + name + "', '" + licenseID + "', '" + state + "', '" +
                    FICO + "', '" + regType + "', '" + insuranceID + "', '" + contractType + "', '" + contractStatus + "');";
            System.out.println(sql);
            //执行插入语句
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (conn != null){
                    //关闭数据库连接
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 司机注册车辆
    @Override
    public int driverRegVehicle(Integer uid, Integer vid){

        //配置mysql信息
        final String DRIVER_NAME = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://127.0.0.0:3306/vhr";
        final String USER_NAME = "root";
        final String PASSWORD = "james007";

        Connection conn = null;
        Statement stmt = null;
        try {
            //注册mysql数据库驱动
            Class.forName(DRIVER_NAME);
            //连接数据库
            conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            //查询sql
            String sql = "SELECT * FROM bindDriver WHERE vid = " + vid;
            //执行查询语句
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //如果车辆已经被绑定，返回
            if (rs.next()){return 1;}
            rs.close();
            //将注册信息插入
            sql = "INSERT INTO bindDriver ( " + uid + ", " + vid + ")";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (conn != null){
                    //关闭数据库连接
                    conn.close();
                }
                return 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    //司机解绑车辆
    @Override
    public int driverDelVehicle(Integer uid, Integer vid){

        //配置mysql信息
        final String DRIVER_NAME = "com.mysql.jdbc.Driver";
        final String URL = "jdbc:mysql://127.0.0.0:3306/vhr";
        final String USER_NAME = "root";
        final String PASSWORD = "james007";

        Connection conn = null;
        Statement stmt = null;
        try {
            //注册mysql数据库驱动
            Class.forName(DRIVER_NAME);
            //连接数据库
            conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            //查询sql
            String sql = "SELECT * FROM bindDriver WHERE vid = " + vid;
            //执行查询语句
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //如果车辆与司机未绑定，返回
            if (!rs.next()){return 1;}
            rs.close();
            //从数据库删除记录
            sql = "DELETE FROM bindDriver WHERE uid = " + uid + " AND vid = " + vid;
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (conn != null){
                    //关闭数据库连接
                    conn.close();
                }
                return 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
