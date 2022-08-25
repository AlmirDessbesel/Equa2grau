
import java.util.*;

public class Equa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.print("Entre com o valor de A ");
        a = entrada.nextDouble();
        System.out.print("Entre com o valor de B ");
        b = entrada.nextDouble();
        System.out.print("Entre com o valor de C ");
        c = entrada.nextDouble();
        delta = b * b - 4 * a * c;
        if (delta >= 0) {


            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println(" x1 = " + x1);
            System.out.println(" x2 = " + x2);

        }else {
            System.out.println("nao e possivel calcular");
         }
        }
    }

