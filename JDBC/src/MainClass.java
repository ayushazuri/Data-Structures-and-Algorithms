//import java.sql.*;
//import java.util.HashMap;
//import java.util.Scanner;
//
//
//public class MainClass {
//    static private int id, option;
//    static private String loguser;
//    static private ResultSet rs;
//    static private Connection con;
//    static private Statement st;
//    public static void main(String[] args) throws SQLException {
//
//        String url = "jdbc:mysql://localhost:3306/project";
//        Connection con = DriverManager.getConnection(url, "root", "Azuri$123");
//        Statement st = con.createStatement();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to our Pharmacy Management System.");
//
//        HashMap<Integer, String> map = new HashMap<Integer, String>();
//
//
//        map.put(1, "Employee");
//        map.put(2, "Customer");
//        map.put(3, "Medicine");
//        int option;
//
//        do{
//            System.out.println("Choose your Interest: ");
//            map.forEach((k, v) -> System.out.println(k + " : " + v));
//            option = sc.nextInt();
//
//            switch (option){
//                case 1: System.out.println("Enter the Customer ID");
//                        Customer cus = new Customer(id, con, st);
//            }
//
//        }
//
//
//    }
//}
