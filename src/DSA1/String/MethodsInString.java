package DSA1.String;

import java.util.Arrays;

public class MethodsInString {
    public static void main(String[] args) {
        String name="Gyana Sahoo";
        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.toUpperCase());//it will create a new instance of string then store the uppercase value
        System.out.println(name);// As Strings are Immutable It will not change
        System.out.println(name.indexOf('n'));
//        System.out.println("   Maa     ".strip());
//        System.out.println("   Maa     ".trim());
        String ex="Virat Rohit Sanju Gill";
        System.out.println(Arrays.toString(ex.split(" ")));
    }
}
