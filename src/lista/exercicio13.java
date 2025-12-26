package lista;

public class exercicio13 {
    public static void main(String[] args) {
        int valorMonetarioTotal = 8;

        int notaDe100 = valorMonetarioTotal / 100;
        valorMonetarioTotal = valorMonetarioTotal % 100;

        int notaDe50 = valorMonetarioTotal / 50;
        valorMonetarioTotal = valorMonetarioTotal % 50;

        int notaDe20 = valorMonetarioTotal / 20;
        valorMonetarioTotal = valorMonetarioTotal % 20;

        int notaDe10 = valorMonetarioTotal / 10;
        valorMonetarioTotal = valorMonetarioTotal % 10;

        int notaDe5 = valorMonetarioTotal / 5;
        valorMonetarioTotal = valorMonetarioTotal % 5;

        int notaDe2 = valorMonetarioTotal / 2;
        valorMonetarioTotal = valorMonetarioTotal % 2;

        int notaDe1 = valorMonetarioTotal;

        System.out.println("Quantidade de notas:");
        System.out.println("Notas de 100: " + notaDe100);
        System.out.println("Notas de 50: " + notaDe50);
        System.out.println("Notas de 20: " + notaDe20);
        System.out.println("Notas de 10: " + notaDe10);
        System.out.println("Notas de 5: " + notaDe5);
        System.out.println("Notas de 2: " + notaDe2);
        System.out.println("Notas de 1: " + notaDe1);
    }
}
