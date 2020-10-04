import java.util.*;
import java.util.Collections;
import java.util.LinkedList;

public class array_list_ex
{
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
//        al.add("Ayush");
//        al.add("Sanskriti");
//        al.add("Oshin");
//        al.add("Pratik");
//        al.add("Piyush");
//        System.out.println(al);
//        System.out.println(al.size());
//        System.out.println("At second we have " +al.get(2));
//        al.set(2,"Sakshi");
//        System.out.println("Now At second we have " +al.get(2));
//        System.out.println(al.size());
//        System.out.println(al);
//
//        ArrayList<String> toRemove = new ArrayList<>();
//        toRemove.add("Oshin");
//        toRemove.add("Sanskriti");
//
//        al.removeAll(toRemove);
//        System.out.println(al);
//        System.out.println(al.size());
//
//        al.addAll(toRemove);
//        System.out.println(al);
//        System.out.println(al.size());
//        System.out.println("Does it Contain Ayush " +al.contains("Ayush"));
//        System.out.println("Does it Contain Harsh " +al.contains("Harsh"));
//
//        Collections.sort(al);
//        System.out.println("Sorted list is : \n " +al);
//        Collections.reverse(al);
//        System.out.println("Reversed list is : \n " +al);
//
//        String s[] = new String[al.size()];
//        al.toArray(s);
//        for(String i: al)
//        {
//            System.out.println(i);
//        }
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(11);
        al1.add(22);
        al1.add(33);
        al1.add(44);
        Integer[] a = new Integer[al1.size()];
        a=al1.toArray(a);
        //a=al1.toArray(new Integer[al1.size()])
        System.out.println(a[1]);
        int c=0;
        for(int i=0;i<a.length - 1; i++)
        {

            System.out.println(a[i] + " " + a[i+1]);
        }
        System.out.println(c);

        al1 = new ArrayList<>(Arrays.asList(a));

                al1.add(55);
        System.out.println(al1);
    }


}
