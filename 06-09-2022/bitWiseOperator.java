package ZohoGraduationSchool;

public class bitWiseOperator {
    public static void main(String[] args) {
        //Right shift signed
        System.out.println("10>>2= "+(10>>2));
        System.out.println("-10>>2= "+(-10>>2));
        System.out.println("5>>1= "+(5>>1));
        System.out.println("-5>>2= "+(-5>>1));

        //Left shift signed
        System.out.println("10<<2= "+(10<<2));
        System.out.println("-10<<2= "+(-10<<2));
        System.out.println("5<<1= "+(5<<1));
        System.out.println("-5<<2= "+(-5<<1));

        //unsigned shift
        System.out.println("10>>>2= "+(10>>>2));
        System.out.println("-10>>>2= "+(-10>>>2));
        System.out.println("5>>>1= "+(5>>>1));
        System.out.println("-5>>>2= "+(-5>>>1));

    }
}
