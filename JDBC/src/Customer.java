//import java.sql.*;
//import java.sql.Date;
//import java.util.*;
//public class Customer {
//    private boolean sessionlogout = false;
//    private int id ;
//    private ResultSet rs;
//    private Connection con;
//    private Statement st;
//    String query;
//    String format;
//    Scanner sc = new Scanner(System.in);
//    Customer(int id, Connection con, Statement st){
//
//        this.id = id;
//        this.con = con;
//        this.st = st;
//        //this.rs = rs;
//    }
//
//    public void option() throws SQLException {
//
//        System.out.println("Choose what you want to look for");
//        System.out.println("\n1)Check the Customer Details\n2)Add a customer\n3) Update the Customer List\n4)Check your Bill\n5)Check the prescriptions given to you\n6)Logout");
//        int op =sc.nextInt();
//        if(op == 1)
//            list();
//
//
//    }
//    public void list() throws SQLException {
//        rs = st.executeQuery("select * from customers");
//        format = "%-10s%-30s%-10s%-10s%-10s%-10s%-10s%n";
//        System.out.printf(format, "Customer ID", "Customer Name", "Address", "Gender", "Phone Number", "DOB", "Age");
//        while (rs.next()) {
//            String id = rs.getString(1);
//            String name = rs.getString(2);
//            String address = rs.getString(3);
//            String gender = rs.getString(4);
//            int phone = rs.getInt(5);
//            Date date = rs.getDate(6);
//            System.out.printf(format, id, name, address, gender, phone, date);
//        }
//        option();
//
//    }
//    public void Add() throws SQLException {
//        System.out.println("Enter ID, Name, Address, Gender, Phone No, Age");
//        st.executeUpdate("INSERT INTO \n" +
//                "\tCustomers(Customer_Id ,C_Name,Address,Gender,Phone_No,Age)\n" +
//                "values ("+sc.next()+ sc.next()+ sc.next()+ sc.next()+ sc.nextInt()+ sc.nextInt() +")" );
//
//        option();
//
//    }
////    public void update() throws SQLException {
////        System.out.println("Enter ID, Name, Address, Gender, Phone No, Age");
////        st.executeUpdate("INSERT INTO \n" +
////                "\tCustomers(Customer_Id ,C_Name,Address,Gender,Phone_No,Age)\n" +
////                "values ("+sc.next()+ sc.next()+ sc.next()+ sc.next()+ sc.nextInt()+ sc.nextInt() +")" );
////
////        option();
////
////    }
//    public void bill() throws SQLException {
//        query = "select b.customer_no, c.c_name, sum(b.total_sum) as Total_sum " +
//                "from bill as b " +
//                "inner join customers as c " +
//                "on b.customer_no = c.customer_id " +
//                "group by b.customer_no " +
//                "order by Total_sum desc ";
//        ResultSet r2 = st.executeQuery(query);
//        format = "%-13s%-20s%-10s%n";
//        System.out.println("The total amount of money to be payed by each customer.\n");
//        System.out.printf(format, "Customer ID", "Customer Name", "Total sum");
//        while (r2.next()) {
//            String id = r2.getString("b.customer_no");
//            String name = r2.getString("c.c_name");
//            int sum = r2.getInt("Total_sum");
//            System.out.printf(format, id, name, sum);
//        }
//        System.out.println();
//
//        option();
//    }
//
//}
//
//
//
//
