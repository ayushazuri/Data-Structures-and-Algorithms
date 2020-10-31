//import java.util.*;
//import java.sql.*;
//
//public class login {
//    private int userid, option;
//    private String loguser;
//    private ResultSet rs;
//    private Connection con;
//    private Statement st;
//
//    public login() throws SQLException {
//        String url = "jdbc:mysql://localhost:3306/project";
//        Connection con = DriverManager.getConnection(url, "root", "Azuri$123");
//        Statement st = con.createStatement();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to our Pharmacy Management System.");
//
//        HashMap<Integer, String> map = new HashMap<Integer, String>();
//
//        map.put(1, "Employee");
//        map.put(2, "Customer");
//        map.put(3, "Medicine");
//
//        System.out.println("Choose your Interest: ");
//        map.forEach((k, v) -> System.out.println(k + " : " + v));
//
//
//    }
//}
