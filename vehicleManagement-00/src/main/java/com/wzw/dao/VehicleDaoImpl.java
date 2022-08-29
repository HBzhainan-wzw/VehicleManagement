package com.wzw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VehicleDaoImpl implements VehicleDao{

    //机动车注册
    @Override
    public void VehicleRegister(Integer vid, String plate, String VIN, String brand, String make, String color,
                                String serveType, Integer numSeat, String vehicleCondition, Integer year){

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
            //查询sql
            String sql = "INSERT INTO DRIVER (" + vid + ", " + plate + ", " + VIN + ", " + brand + ", " + make + ", " + color + ", " +
                    serveType + ", " + numSeat + ", " + vehicleCondition + ", " + year + ")";
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
}
