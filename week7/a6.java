package week7;

public class a6 {
    public static void main(String[] args) {
        int x=1;
        System.out.println("Before the call,x is"+x);
        increment(x);
        System.out.println("After the call,x is"+x);
    }
    public static void increment(int n) {
        n++;
        System.out.println("n inside method call is"+n);
    }
}
