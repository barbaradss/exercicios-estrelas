package lista;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número");
        System.out.print(">");
        int numero = scanner.nextInt();

        if (numero == 0){
            System.out.print("O número é zero");
        } else if (numero>0 && numero % 2 == 0) {
            System.out.print("O número é par");
        }else if (numero > 0 && numero % 2 != 0) {
            System.out.print("O número é impar");
        }else{
            System.out.print("O número é negativo");
        }
    }
}
