package lista;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        System.out.print(">");
        double raio = scanner.nextInt();
        double area = Math.PI*raio*raio;

        System.out.print("A área do círculo " + area);
    }
}
