
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int controle, numero;
        controle = leia.nextInt();

        for (int i = 0; i < controle; i++) {
            numero = leia.nextInt();
            if (numero < 0 && numero % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            }else if (numero < 0 && numero % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            }else if (numero > 0 && numero % 2 == 0) {
                System.out.println("EVEN POSITIVE");
            }else if (numero > 0 && numero % 2 != 0) {
                System.out.println("ODD POSITIVE");
            }else {
                System.out.println("NULL");
            }
        }
    }
}
