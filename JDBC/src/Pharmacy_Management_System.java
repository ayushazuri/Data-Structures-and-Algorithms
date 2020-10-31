//import java.sql.*;
//import java.util.Scanner;
//
//public class Pharmacy_Management_System {
//    public static void main(String[] args){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/project";
//            Connection con = DriverManager.getConnection(url, "root", "Azuri$123");
//            Statement st = con.createStatement();
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Welcome to our Pharmacy Management System.");
//            String query, format;
//            char w;
//            ResultSet r;
//            do {
//                System.out.println("\nChoose the Query that you want to be displayed\n");
//                System.out.println("1) Display the Prescription Drugs issued to each customer along with the quantity and the date.");
//                System.out.println("2) Total amount of money to be payed by each customer.");
//                System.out.println("3) Search for a Drugs name using a letter or a substring.");
//                System.out.println("4) Find out revenue generated total orders processed by pharmacy by date.");
//                System.out.println("5) Find out total revenue and medicines processed by the employee by date.");
//                System.out.println("6) Find out all the drugs that have been expired.");
//                System.out.println("7) Exit.\n");
//
//                int ch = sc.nextInt();
//                switch (ch) {
//                    case 1:
//                            query = "select c.customer_id, c.c_name, l.name, l.quantity, l.pres_date from customers as c " +
//                                    "left join (select p.name, p.quantity, pr.pres_date, pr.customer_id from presciption_drugs as p "
//                                    + "inner join pres as pr on p.pres_id=pr.pres_id) as l on c.customer_id=l.customer_id";
//                            r = st.executeQuery(query);
//                            format = "%-20s%-30s%-10s%-10s%n";
//                            System.out.println("Displaying the Prescription Drugs issued to each customer.\n");
//                            System.out.printf(format, "Customer ID", "Prescription Drugs", "Quantity", "Date");
//                            while (r.next()) {
//                                String id = r.getString("c.customer_id");
//                                String name = r.getString("l.name");
//                                int quantity = r.getInt("l.quantity");
//                                Date date = r.getDate("l.pres_date");
//                                System.out.printf(format, id, name, quantity, date);
//                            }
//                            System.out.println();
//                            break;
//
//                    case 2:
//                            query = "select b.customer_no, c.c_name, sum(b.total_sum) as Total_sum " +
//                                    "from bill as b " +
//                                    "inner join customers as c " +
//                                    "on b.customer_no = c.customer_id " +
//                                    "group by b.customer_no " +
//                                    "order by Total_sum desc ";
//                            ResultSet r2 = st.executeQuery(query);
//                            format = "%-13s%-20s%-10s%n";
//                            System.out.println("The total amount of money to be payed by each customer.\n");
//                            System.out.printf(format, "Customer ID", "Customer Name", "Total sum");
//                            while (r2.next()) {
//                                String id = r2.getString("b.customer_no");
//                                String name = r2.getString("c.c_name");
//                                int sum = r2.getInt("Total_sum");
//                                System.out.printf(format, id, name, sum);
//                            }
//                            System.out.println();
//                            break;
//
//                    case 3: System.out.println("Enter the substring from the Prescription Drugs name that you want to look for: ");
//                            String s=sc.next();
//                            query = "SELECT medicineList.DrugName,medicineList.Price,medicineList.StockQty "
//                            + "FROM medicineList WHERE medicineList.DrugName LIKE '%"+s+"%' ";
//                            ResultSet rs = st.executeQuery (query);
//                            format = "%-20s%-20s%-10s%n";
//                            System.out.println("The Drugs names are :\n");
//                            System.out.printf (format, "DrugName","Price","StockQty");
//                            while (rs.next ())
//                            {
//                                String DrugName = rs.getString (1);
//                                int Price = rs.getInt (2);
//                                int StockQty= rs.getInt (3);
//                                System.out.printf (format, DrugName,Price,StockQty);
//                            }
//                            System.out.println();
//                            break;
//
//                    case 4: query ="select orders.order_date, count(*) total_orders,\n" +
//                            "sum(grand_total_amount) as total_revenue from orders\n" +
//                            "left join bill\n" +
//                            "on  bill.order_id = orders.order_id\n" +
//                            "group by order_date ";
//                            r =st.executeQuery(query);
//                            format = "%-20s%-20s%-10s%n";
//                            System.out.println("Total Revenue generated by date.\n");
//                            System.out.printf (format, "Order Date","Total Orders","Total Revenue");
//                            while(r.next()){
//                                Date orderdate = r.getDate(1);
//                                int totalOrder = r.getInt(2);
//                                int totalRevenue = r.getInt(3);
//                                System.out.printf (format, orderdate,totalOrder,totalRevenue);
//                            }
//                            System.out.println();
//                            break;
//
//                    case 5: query = "select orders.order_date, orders.emp_id,\n" +
//                            "sum(grand_total_amount) as total_revenue_processed_by_the_employee,\n" +
//                            "sum(quantity) as total_medicines_processed_by_the_employee\n" +
//                            "from bill\n" +
//                            "left join orders\n" +
//                            "on bill.order_id = orders.order_id\n" +
//                            "group by emp_id,order_date;";
//                            r = st.executeQuery(query);
//                            format = "%-15s%-10s%-25s%-25s%n";
//                            System.out.println("Total Revenue and Medicines processed by the employee are \n");
//                            System.out.printf (format, "Order Date","Employee","Total Revenue Processed", "Total Medicine processed");
//                            while(r.next()){
//                                Date orderDate = r.getDate(1);
//                                String emp_id = r.getString(2);
//                                int t_revenue = r.getInt(3);
//                                int t_medicine = r.getInt(4);
//                                System.out.printf (format, orderDate,emp_id,t_revenue, t_medicine);
//                            }
//                            System.out.println();
//                            break;
//                    case 6: query = "SELECT medicineList.DrugName,medicineList.ExpiryDate,medicineList.Price,medicineList.StockQty\r\n" +
//                            "FROM medicineList\r\n" +
//                            "WHERE ExpiryDate<SYSDATE(); ";
//                            r = st.executeQuery (query);
//                            format = "%-17s%-14s%-10s%-10s%n";
//                            System.out.println("All the expired drugs are\n");
//                            System.out.printf (format,"DrugName","ExpiryDate","Price", "StockQty");
//                            while (r.next())
//                            {
//                                String DrugName = r.getString (1);
//                                Date ExpiryDate= r.getDate(2);
//                                int Price = r.getInt (3);
//                                int StockQty= r.getInt (4);
//                                System.out.printf (format, DrugName, ExpiryDate,Price, StockQty);
//                            }
//                            System.out.println();
//                            break;
//
//                    default: System.out.println("Wrong Option!!");
//                             break;
//                }
//
//                System.out.println("Do you wish to continue: 'y/n' ??");
//                w=sc.next().charAt(0);
//
//            }while(w == 'y' || w == 'Y');
//        }
//        catch (Exception e){
//            System.out.println("Error occured " + e.getMessage());
//        }
//        finally {
//            System.out.println("Bye Bye :)");
//        }
//    }
//}
