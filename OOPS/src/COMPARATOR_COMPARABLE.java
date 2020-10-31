
import org.w3c.dom.css.CSSStyleDeclaration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class COMPARATOR_COMPARABLE {
    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<>();
        al.add(new student("Ayush", 58));
        al.add(new student("Oshin", 61));
        al.add(new student("Sanskriti", 59));
        al.add(new student("Pradhuman", 59));
        al.add(new student("Pratik", 41));
        al.add(new student("Ayush", 60));

//        ## By using comparable in the student class, where student class implements Comparable<student>
//        Collections.sort(al);

//        ##1
//        Collections.sort(al, new SortByNameThenMarks());

//        ##2
//        Collections.sort(al, new Comparator<student>() {
//            @Override
//            public int compare(student o1, student o2) {
//                if(o1.name.equals(o2.name))
//                    return o1.marks - o2.marks;
//                else
//                    return o1.name.compareTo(o2.name);
//            }
//        });

//      ##3
        Collections.sort(al, (o1, o2) -> o1.name.compareTo(o2.name));


        al.forEach(System.out::println);
    }
}

//      ##1
//class SortByNameThenMarks implements Comparator<student>{
//
//    @Override
//    public int compare(student o1, student o2) {
//        if(o1.name.equals(o2.name))
//            return o1.marks - o2.marks;
//        else
//            return o1.name.compareTo(o2.name);
//    }
//}