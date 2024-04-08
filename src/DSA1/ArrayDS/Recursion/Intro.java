package DSA1.ArrayDS.Recursion;

public class Intro {
    public static void main(String[] args) {
//        message();
//        Print 1 to 5
        printnum(1);
    }
    static void message(){
        System.out.println("Hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }
    static void printnum(int n){
        // Base Condition
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //Recursive Call
        printnum(n+1);
    }

}
