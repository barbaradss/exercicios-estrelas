package lista;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso/Math.pow(altura, 2);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.5 && imc <= 24.9 ){
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Acima do peso");
        }else{
            System.out.println("Obesidade");
        }
    }
}
