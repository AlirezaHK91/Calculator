import java.text.MessageFormat;
import java.util.Scanner;

public class MathMethods {
    Scanner reader= new Scanner(System.in);

    void addition (double a, double b){
        System.out.println(MessageFormat.format("{0} + {1} = {2}",a,b, (a+b))+"\n");
    }
    void subtraction(double a, double b){
        System.out.println( MessageFormat.format("{0} - {1} = {2}",a,b, (a-b))+"\n");
    }
    void division(double a, double b){
        System.out.println( MessageFormat.format("{0} / {1} = {2}",a,b, (a/b))+"\n");
    }
    void modulus(double a, double b){
        System.out.println( MessageFormat.format("{0} % {1} = {2}",a,b, (a%b))+"\n");
    }
    void multiplication(double a, double b){
        System.out.println( MessageFormat.format("{0} * {1} = {2}",a,b, (a*b))+"\n");
    }
    void greaterThan(double a, double b){
        if (a>b){
            System.out.println( MessageFormat.format("{0} > {1}",a,b, (a>b))+"\n");
        }else {
            System.out.println(a+ " är inte större än "+ b);
        }

    }
    void smallerThan(double a, double b){
        if (a<b){
            System.out.println( MessageFormat.format("{0} < {1}",a,b, (a<b))+"\n");
        }else {
            System.out.println(a+" är inte mindre än "+ b);
        }

    }


}
