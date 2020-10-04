
import java.io.*;
import java.util.*;

class Food implements Serializable{
    private int item_no;
    private int quantity;
    private int price;

    Food(int item_no, int quantity){
        setItem_no(item_no);
        setQuantity(quantity);
        switch (item_no){
            case 1: setPrice(quantity * 100);
                    break;
            case 2: setPrice(quantity * 130);
                    break;
            case 3: setPrice(quantity * 150);
                    break;
            case 4: setPrice(quantity * 60);
                    break;

        }
    }

    public int getItem_no() {
        return item_no;
    }

    public void setItem_no(int item_no) {
        if(item_no <= 4)
            this.item_no = item_no;
        else
        {
            System.out.println("There is no item as " +item_no+ " in the list. Kindly Choose from the list.");

        }

    }

    public int getQuantity() {
            return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0)
            System.out.println("Quantity can not be less than or equal to 0. Add something please.");
        else
            this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class SingleRoom implements Serializable{
    private String name;
    private String contact;
    private String gender;

    ArrayList<Food> food = new ArrayList<>();

    SingleRoom() {
        setName("");
    }
    SingleRoom(String name, String contact, String gender){
        setName(name);
        setContact(contact);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class DoubleRoom extends SingleRoom implements Serializable{
    private String name2;
    private String contact2;
    private String gender2;

    DoubleRoom() {
        setName("");
        setName2("");
    }

    DoubleRoom(String name,String contact,String gender,String name2,String contact2,String gender2){
        super(name, contact, gender);
        setName2(name2);
        setContact2(contact2);
        setGender2(gender2);
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getGender2() {
        return gender2;
    }

    public void setGender2(String gender2) {
        this.gender2 = gender2;
    }
}

class NotAvailable extends Exception{
    @Override
    public String toString() {
        return "Not Available";
    }
}

class holder implements Serializable{

    DoubleRoom[] drl = new DoubleRoom[10]; // Luxury Double Room
    DoubleRoom[] drd = new DoubleRoom[20]; // Deluxe Double Room
    SingleRoom[] srl = new SingleRoom[10]; // Luxury Single Room
    SingleRoom[] srd = new SingleRoom[20]; // Deluxe Single Room
}

class Hotel{
    static holder ob = new holder();
    static Scanner sc = new Scanner(System.in);

    static void custDetail(int ch, int rn){
        String name, contact, gender;
        String name2 = null, contact2 = null;
        String gender2="";
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("Enter contact number: ");
        contact=sc.next();
        System.out.print("Enter gender: ");
        gender = sc.next();
        if(ch < 3){
            System.out.print("Enter second customer name: ");
            name2 = sc.next();
            System.out.print("Enter contact number: ");
            contact2=sc.next();
            System.out.print("Enter gender: ");
            gender2 = sc.next();
        }

        switch (ch){
            case 1: ob.drl[rn] = new DoubleRoom(name, contact, gender, name2, contact2, gender2);
                    break;
            case 2: ob.drd[rn] = new DoubleRoom(name, contact, gender, name2, contact2, gender2);
                    break;
            case 3: ob.srl[rn] = new SingleRoom(name, contact, gender);
                    break;
            case 4: ob.srd[rn] = new SingleRoom(name, contact, gender);
                    break;
            default:System.out.println("Wrong option");
                break;
        }
    }

    static void bookroom(int ch){
        int i;
        int rn;
        System.out.println("Choose the room that you want to book: ");
        switch (ch){
            case 1: for(i = 0;i < ob.drl.length; i++){
                        if(ob.drl[i] == null){
                            System.out.print(i+1+",");
                        }
                    }
                System.out.print("\nEnter the room number that you want to select: ");
                try{
                    rn=sc.nextInt();
                    if(ob.drl[rn] != null)
                        throw new NotAvailable();

                    custDetail(ch, --rn);
                }
                catch (Exception e){
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 2:  for(i = 0;i < ob.drd.length; i++){
                        if(ob.drd[i] == null){
                            System.out.print(i+11+",");
                        }
                    }
                    System.out.print("\nEnter the room number that you want to select: ");
                    try{
                        rn=sc.nextInt();
                        rn=rn-11;
                        if(ob.drd[rn] != null)
                            throw new NotAvailable();
                        custDetail(ch, rn);
                    }
                    catch (Exception e){
                        System.out.println("Invalid Option");
                        return;
                    }
                    break;
            case 3:   for(i = 0;i < ob.srl.length; i++){
                            if(ob.srl[i] == null){
                                System.out.print(i+31+",");
                            }
                        }
                    System.out.print("\nEnter the room number that you want to select: ");
                    try{
                        rn=sc.nextInt();
                        rn=rn-31;
                        if(ob.srl[rn] != null)
                            throw new NotAvailable();
                        custDetail(ch, rn);
                    }
                    catch (Exception e){
                        System.out.println("Invalid Option");
                        return;
                    }
                    break;
            case 4: for(i = 0;i < ob.srd.length; i++){
                        if(ob.srd[i] == null){
                            System.out.print(i+41+",");
                        }
                    }
                    System.out.print("\nEnter the room number that you want to select: ");
                    try{
                        rn=sc.nextInt();
                        rn=rn-41;
                        if(ob.srd[rn] != null)
                            throw new NotAvailable();
                        custDetail(ch, rn);
                    }
                    catch (Exception e){
                        System.out.println("Invalid Option");
                        return;
                    }
                    break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Room Booked");
    }

    static void features(int ch)
    {
        switch (ch) {
            case 1:System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:5000 ");
                break;
            case 2:System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3500  ");
                break;
            case 3:System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2000  ");
                break;
            case 4:System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
    }

    static void availability(int ch)
    {
        int j,count=0;
        switch (ch) {
            case 1:
                for(j=0;j<10;j++)
                {
                    if(ob.drl[j]==null)
                        count++;
                }
                break;
            case 2:
                for(j=0;j<ob.drd.length;j++)
                {
                    if(ob.drd[j]==null)
                        count++;
                }
                break;
            case 3:
                for(j=0;j<ob.srl.length;j++)
                {
                    if(ob.srl[j]==null)
                        count++;
                }
                break;
            case 4:
                for(j=0;j<ob.srd.length;j++)
                {
                    if(ob.srd[j]==null)
                        count++;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Number of rooms available : "+count);
    }

    static void bill(int rn, int ch){
        double amount=0;
        String[] list={"Sandwich","Pasta","Noodles","Coke"};
        System.out.println("\n*******");
        System.out.println(" Bill:-");
        System.out.println("*******");

        switch (ch){
            case 1: amount += 5000;
                    System.out.println("Room Charges: " + 5000);
                    System.out.println("\n===============");
                    System.out.println("Food Charges:- ");
                    System.out.println("===============");
                    System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food bi: ob.drl[rn].food)
                    {
                        amount += bi.getPrice();
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[bi.getItem_no()-1],bi.getQuantity(),bi.getPrice() );
                    }
                    break;
            case 2: amount+=3500;
                    System.out.println("Room Charge - "+3500);
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                    System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food bi:ob.drd[rn].food)
                    {
                        amount+= bi.getPrice();
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[bi.getItem_no() -1], bi.getQuantity(), bi.getPrice());
                    }
                    break;
            case 3: amount+=2000;
                    System.out.println("Room Charge - "+2000);
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                    System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food bi:ob.srl[rn].food)
                    {
                        amount+= bi.getPrice();
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[bi.getItem_no() -1], bi.getQuantity(), bi.getPrice());
                    }
                    break;
            case 4: amount+=1200;
                    System.out.println("Room Charge - "+1200);
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                    System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food bi:ob.srd[rn].food)
                    {
                        amount+= bi.getPrice();
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[bi.getItem_no() -1], bi.getQuantity(), bi.getPrice());
                    }
                    break;
            default:
                    System.out.println("Not valid");
                    break;
        }
        System.out.println("\nTotal Amount- "+amount);
    }

    static void order(int rn, int ch){
        int i, q;
        char wish;
        try{
            System.out.println("\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.100\n2.Pasta\t\tRs.130\n3.Noodles\tRs.150\n4.Coke\t\tRs.60\n");
            do {
                System.out.print("Enter your choice- ");
                i=sc.nextInt();
                System.out.print("Quantity- ");
                q = sc.nextInt();
                switch (ch){
                    case 1: ob.drl[rn].food.add(new Food(i, q));
                            if(i > 4 || q <= 0)
                                ob.drl[rn].food.remove(ob.drl[rn].food.size() - 1);
                            break;
                    case 2: ob.drd[rn].food.add(new Food(i, q));
                            if(i > 4 || q <= 0)
                                ob.drd[rn].food.remove(ob.drd[rn].food.size() - 1);
                            break;
                    case 3: ob.srl[rn].food.add(new Food(i, q));
                            if(i > 4 || q <= 0)
                                ob.srl[rn].food.remove(ob.srl[rn].food.size() - 1);
                            break;
                    case 4: ob.srd[rn].food.add(new Food(i, q));
                            if(i > 4 || q <= 0)
                                ob.srd[rn].food.remove(ob.srd[rn].food.size() - 1);
                            break;
                }
                System.out.println("Do you want to order anything else ? (y/n)");
                wish=sc.next().charAt(0);
            }while (wish == 'y' || wish == 'Y');

            System.out.println("Do you want to see the bill ? (y/n)");
            wish = sc.next().charAt(0);
            if(wish == 'y' || wish == 'Y'){
                bill(rn, ch);
            }
        }
        catch (NullPointerException e){
            System.out.println("\nRoom not booked");
        }
        catch (Exception e){
            System.out.println("Cannot be done");
        }
    }

    static void deallocate(int rn, int i){
        char w;
        switch (i){
            case 1: if(ob.drl[rn] != null)
                        System.out.println("This room is used by "+ ob.drl[rn].getName());
                    else{
                        System.out.println("Room is already empty!!");
                        return;
                    }
                    System.out.println("Do you want to checkout ?(y/n)");
                    w=sc.next().charAt(0);
                    if(w=='y' || w == 'Y'){
                        bill(rn, i);
                        ob.drl[rn] =null;
                        System.out.println("Room Deallocated succesfully");
                    }
                    break;

            case 2: if(ob.drd[rn] != null)
                        System.out.println("This room is used by "+ ob.drd[rn].getName());
                    else{
                        System.out.println("Room is already empty!!");
                        return;
                    }
                    System.out.println("Do you want to checkout ?(y/n)");
                    w=sc.next().charAt(0);
                    if(w=='y' || w == 'Y'){
                        bill(rn, i);
                        ob.drd[rn] =null;
                        System.out.println("Room Deallocated succesfully");
                    }
                    break;

            case 3: if(ob.srl[rn] != null)
                        System.out.println("This room is used by "+ ob.srl[rn].getName());
                    else{
                        System.out.println("Room is already empty!!");
                        return;
                    }
                    System.out.println("Do you want to checkout ?(y/n)");
                    w=sc.next().charAt(0);
                    if(w=='y' || w == 'Y'){
                        bill(rn, i);
                        ob.srl[rn] =null;
                        System.out.println("Room Deallocated succesfully");
                    }
                    break;

            case 4: if(ob.srd[rn] != null)
                        System.out.println("This room is used by "+ ob.srd[rn].getName());
                    else{
                        System.out.println("Room is already empty!!");
                        return;
                    }
                    System.out.println("Do you want to checkout ?(y/n)");
                    w=sc.next().charAt(0);
                    if(w=='y' || w == 'Y'){
                        bill(rn, i);
                        ob.srd[rn] =null;
                        System.out.println("Room Deallocated succesfully");
                    }
                    break;
            default:
                System.out.println("\nEnter valid option : ");
                break;
        }


    }
}

class write implements Runnable{

    holder hotel_ob;
    write(holder hotel_ob){
        this.hotel_ob = hotel_ob;
    }
    @Override
    public void run() {
        try{
            FileOutputStream fout=new FileOutputStream("backup.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fout);
            oos.writeObject(hotel_ob);
        }
        catch(Exception e)
        {
            System.out.println("Error in writing "+e);
        }
    }
}

public class Hotel_Management_System{
    public static void main(String[] args) {
        try{
            File f = new File("backup.txt");
            if(f.exists())
            {
                FileInputStream fin=new FileInputStream(f);
                ObjectInputStream ois=new ObjectInputStream(fin);
                Hotel.ob=(holder)ois.readObject();
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to our Hotel.");
            int ch,ch2, rn;
            char wish;
            x:
            do{
                System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Checkout\n6.Exit\n");
                ch = sc.nextInt();
                switch (ch){
                    case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
                            ch2 = sc.nextInt();
                            Hotel.features(ch2);
                            break;

                    case 2: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                            ch2 = sc.nextInt();
                            Hotel.availability(ch2);
                            break;

                    case 3: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
                            ch2 = sc.nextInt();
                            Hotel.bookroom(ch2);
                            break;

                    case 4: System.out.println("Room Number: ");
                            rn = sc.nextInt();
                            if(rn > 60)
                                System.out.println("Room doesn't exist");
                            else if(rn > 40)
                                Hotel.order(rn - 41, 4);
                            else if(rn > 30)
                                Hotel.order(rn - 31, 3);
                            else if(rn > 10)
                                Hotel.order(rn - 11, 2);
                            else if(rn>0)
                                Hotel.order(rn - 1,1);
                            else
                                System.out.println("Room doesn't exist");
                            break;
                    case 5: System.out.println("Room Number: ");
                            rn = sc.nextInt();
                            if(rn > 60)
                                System.out.println("Room doesn't exist");
                            else if(rn > 40)
                                Hotel.deallocate(rn - 41, 4);
                            else if(rn > 30)
                                Hotel.deallocate(rn - 31, 3);
                            else if(rn > 10)
                                Hotel.deallocate(rn - 11, 2);
                            else if(rn>0)
                                Hotel.deallocate(rn - 1,1);
                            else
                                System.out.println("Room doesn't exist");
                            break;

                    case 6: break x;
                }
                System.out.println("\nContinue : (y/n)");
                wish=sc.next().charAt(0);
                if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
                {
                    System.out.println("Invalid Option");
                    System.out.println("\nContinue : (y/n)");
                    wish=sc.next().charAt(0);
                }

            }while(wish=='y'||wish=='Y');
            new FileOutputStream("backup.txt").close();
            Thread t=new Thread(new write(Hotel.ob));
            t.start();
        }
        catch (Exception e){
            System.out.println("Not a valid input");
        }
        finally {
            System.out.println("Thank You for visiting us! :) :) ");
        }
    }
}