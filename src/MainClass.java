import java.util.Scanner;
import java.text.MessageFormat;
public class MainClass {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner reader= new Scanner(System.in);
        MathMethods math= new MathMethods();
        
        String []alternatives= new String[8];
        alternatives[0]= "1. Addera";
        alternatives[1]= "2. Subtrahera";
        alternatives[2]= "3. Division";
        alternatives[3]= "4. Modulus";
        alternatives[4]= "5. Multiplikation";
        alternatives[5]= "6. Större än";
        alternatives[6]= "7. Mindre än";
        alternatives[7]= "8. Avsluta program";
        System.out.println("Välj ett alternativ:\n");

        while (true) {
            for (int i = 0; i < alternatives.length; i++) {
                System.out.println(alternatives[i]);
            }
            int chosenAlternative = reader.nextInt();

            if (chosenAlternative==8) {
                System.out.println("Avslutat");
                break;
            }


            if (chosenAlternative == 1) {
                a = reader.nextDouble();
                b = reader.nextDouble();
                math.addition(a,b);
            } else if (chosenAlternative == 2) {
                a = reader.nextDouble();
                b = reader.nextDouble();
                math.subtraction(a, b);
            } else if (chosenAlternative == 3) {
                a = reader.nextDouble();
                b = reader.nextDouble();
                math.division(a, b);
            } else if (chosenAlternative == 4) {
                a = reader.nextDouble();
                b = reader.nextDouble();
                math.modulus(a, b);
            } else if (chosenAlternative == 5) {
                a = reader.nextDouble();
                b = reader.nextDouble();
                math.multiplication(a, b);
            } else if (chosenAlternative == 6) {
                a = reader.nextDouble();
                b = reader.nextDouble();
                math.greaterThan(a, b);
            } else if (chosenAlternative == 7) {
                a = reader.nextDouble();
                b = reader.nextDouble();
                math.smallerThan(a, b);
            }
        }

    }
}



