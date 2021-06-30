package javaexample14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaExample14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
         
        in.useDelimiter("[&=]"); // You must use: import java.util.regex.Pattern;
                                 // for defining the delimiter pattern & or =
        
        String str1, str2, str3, str4;
        System.out.print("Give me four strings seperated by & or = \nand finish with & or =. \nThen, press enter: ");
        str1 = in.next();
        str2 = in.next();
        str3 = in.next();
        str4 = in.next();
        
        in.close();
        
        System.out.println("The first string is: " + str1);
        System.out.println("The second string is: " + str2);
        System.out.println("The first string is: " + str3);
        System.out.println("The first string is: " + str4);
    }

}
