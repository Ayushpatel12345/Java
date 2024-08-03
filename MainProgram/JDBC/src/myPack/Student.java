package myPack;

import java.sql.*;

class Student {

    static String url = "jdbc:mysql://localhost:3306/test_db1";
    static String userName = "root";
    static String password = "Ayush.9094";

    public void createDatabase(){
        try{
            Connection conn = DriverManager.getConnection(url,userName,password);
            Statement st = conn.createStatement();

            String query = "create database test_db1";
            st.execute(query);

            System.out.println("database create successfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTable(){
        try{
            Connection conn = DriverManager.getConnection(url,userName,password);
            Statement st = conn.createStatement();

            String query = "create table student(id int,sname varchar(200),semail varchar(200))";
            st.execute(query);

            System.out.println("table create successfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertData(){
        try{
            Connection conn = DriverManager.getConnection(url,userName,password);
            Statement st = conn.createStatement();

            String query = "INSERT INTO student VALUES (101, 'Alisha', 'Alisha@gmail.com')";
            st.execute(query);
            query = "INSERT INTO student VALUES (102, 'Khan', 'Khan@gmail.com')";
            st.execute(query);
            query = "INSERT INTO student VALUES(103, 'Mittal', 'Mittal@gmail.com')";
            st.execute(query);

            System.out.println("insert data successfully");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        try{
            Connection conn = DriverManager.getConnection(url,userName,password);
            Statement st = conn.createStatement();

            String query = "select * from student";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
            st.execute(query);

            System.out.println("read data successfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateData(){
        try{
            Connection conn = DriverManager.getConnection(url,userName,password);
            Statement st = conn.createStatement();

            String query = "update student set id = ? where sname = ?";
            st.execute(query);

            System.out.println("update data successfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteData(){
        try{
            Connection conn = DriverManager.getConnection(url,userName,password);
            Statement st = conn.createStatement();

            String query = "delete from student where id = 103";
            st.execute(query);

            System.out.println("delete data successfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
