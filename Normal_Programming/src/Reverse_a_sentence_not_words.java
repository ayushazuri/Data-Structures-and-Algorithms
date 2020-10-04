/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Reverse_a_sentence_not_words {

    public static void main (String[] args) {
        //code

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        while(n > 0){
            String s=sc.nextLine();
            s=s.replace(".", " ");
            String a[] = s.split(" ");
            //String str = null;
            for(int i = a.length - 1; i > 0  ; i--){
                System.out.print(a[i]+".");
            }


            System.out.print(a[0]);
            System.out.println();
            n--;
        }

    }
}