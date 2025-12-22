package lista;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor 'a': ");
        int a = scanner.nextInt();
        System.out.print("Insira o valor 'b': ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Novo valor int a: " +a);
        System.out.println("Novo valor int b:" +b);
    }
}
