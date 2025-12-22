package lista;

public class exercicio03 {
    public static void main(String[] args) {
        int inteiro = 6;
        double duplo;

        duplo = inteiro;

        double valorDouble = 2.25;
        int valorInt = (int) valorDouble;

        System.out.println("Valor do int original: " + inteiro);
        System.out.println("Valor do double após conversão implícita: " + duplo);
        System.out.println("Valor do double original: " + valorDouble);
        System.out.println("Valor do int após casting explícito: " + valorInt);
    }
}
