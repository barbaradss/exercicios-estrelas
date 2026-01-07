package lista;

public class exercicio04 {
    public static void main(String[] args) {

        char letraMinuscula = 'f';

        char letraMaiuscula = (char)(letraMinuscula - 32);
        boolean ehVogal = letraMaiuscula == 'A' || letraMaiuscula == 'E' || letraMaiuscula == 'I' ||
                letraMaiuscula == 'O' || letraMaiuscula == 'U';
        // Outras opções
        // boolean ehVogal = "AEIOU".contains(String.valueOf(letraMaiuscula));
        // boolean ehVogal = String.valueOf(letraMaiuscula).matches("^[AEIOU]$");

        System.out.println("Letra minúscula: " + letraMinuscula);
        System.out.println("Letra maiúscula: " + letraMaiuscula);
        System.out.println("É vogal? " + ehVogal);

    }
}
