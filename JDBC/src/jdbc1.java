//import javax.xml.transform.Result;
//import java.sql.*;
//public class jdbc1 {
//        public static void main(String[] args) {
//            try{
//                //Class.forName("com.mysql.jdbc.Driver");
//                //System.out.println("Driver Loaded");
//                String url = "jdbc:mysql://localhost:3306/project";
//                Connection con = DriverManager.getConnection(url, "root", "Azuri$123");
//                //System.out.println("Connection to database created");
//
//                Statement st = con.createStatement();
//                System.out.println("Statement object created");
//
//                String query1 ="select c.customer_id, c.c_name, l.name, l.quantity, l.pres_date from customers as c " +
//                        "left join (select p.name, p.quantity, pr.pres_date, pr.customer_id from presciption_drugs as p "
//                        +"inner join pres as pr on p.pres_id=pr.pres_id) as l on c.customer_id=l.customer_id";
//                ResultSet r1 = st.executeQuery(query1);
//                String format = "%-20s%-30s%-10s%-10s%n";
//                System.out.printf(format, "Customer ID", "Prescription Drugs", "Quantity", "Date");
//                while(r1.next()){
//                    String id=r1.getString("c.customer_id");
//                    String name = r1.getString("l.name");
//                    int quantity=r1.getInt("l.quantity");
//                    Date date=r1.getDate("l.pres_date");
//                    System.out.printf(format, id, name, quantity, date);
//                }
//
//                String query2 = "select b.customer_no, c.c_name, sum(b.total_sum) as Total_sum " +
//                        "from bill as b " +
//                        "inner join customers as c " +
//                        "on b.customer_no = c.customer_id " +
//                        "group by b.customer_no " +
//                        "order by Total_sum desc ";
//                ResultSet r2 = st.executeQuery(query2);
//                String format1 = "%-20s%-20s%-10s%n";
//                System.out.printf(format1, "Customer ID", "Customer Name", "Total sum");
//                while(r2.next()){
//                    String id=r2.getString(1);
//                    String name = r2.getString(2);
//                    int sum = r2.getInt(3);
//                    System.out.printf(format1, id, name, sum);
//                }
//
//
//
//                String query3 = "create view newemp as select emp_id, first_name, last_name, salary from employee";
//                st.execute(query3);
//                query3="delete from newemp where emp_id='E010'";
//                System.out.printf("Row Deleted");
//                st.executeUpdate(query3);
//                query3 = "select * from newemp";
//                ResultSet r3 = st.executeQuery(query3);
//                String format3 = "%-10s%-10s%-10s%-10s%n";
//                while(r3.next()){
//                    String id=r3.getString("emp_id");
//                    String firstname=r3.getString("first_name");
//                    String lastname=r3.getString("last_name");
//                    int sal = r3.getInt("salary");
//                    System.out.printf(format3, id, firstname, lastname, sal);
//                }
//
//                 query3 = "select * from employee";
//                 r3 = st.executeQuery(query3);
//                 format3 = "%-10s%-10s%-10s%-10s%n";
//                while(r3.next()){
//                    String id=r3.getString("emp_id");
//                    String firstname=r3.getString("first_name");
//                    String lastname=r3.getString("last_name");
//                    int sal = r3.getInt("salary");
//                    System.out.printf(format3, id, firstname, lastname, sal);
//                }
//
//            }
//            catch(Exception e)
//            {
//                System.out.println("Error "+e.getMessage());
//            }
//        }
//
//}
