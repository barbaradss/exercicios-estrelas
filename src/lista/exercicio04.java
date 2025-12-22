package lista;

public class exercicio04 {
    public static void main(String[] args) {

        char letraMinuscula = 'f';

        char letraMaiuscula = (char)(letraMinuscula - 32);
        boolean ehVogal = false;

        System.out.println("Letra minúscula: " + letraMinuscula);
        System.out.println("Letra maiúscula: " + letraMaiuscula);
        System.out.println("É vogal? " + ehVogal);

    }
}
