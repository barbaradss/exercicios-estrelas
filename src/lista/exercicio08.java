package lista;

public class exercicio08 {
    public static void main(String[] args) {
        double p1 = 0.50;
        double p2 = 0.00;
        double p3 = 1.00;

        double media = (p1+p2+p3)/3;

        if (media >= 7.0){
            System.out.println("Aprovado");
        }else if (media < 7.0 && media >= 5.0){
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
