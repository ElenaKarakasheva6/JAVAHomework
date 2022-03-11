package mypac;

public class AbsoluteValue {
    public static void main(String[] args){
        int a = -147;
        int b = 15;
        int c = 0;
        int d = 18;
        String format = "\t";
        System.out.print("Your numbers are: \n");
        System.out.println(a + format + b + format + c + format + d);
        int newA = 147;
        System.out.print("\n");
        System.out.print("Your new numbers are: \n");
        System.out.println(newA + format + b + format + c + format + d);
    }
}
