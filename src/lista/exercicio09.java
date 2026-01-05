package lista;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        System.out.println("Digite uma senha: ");
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();

        int criterios = 0;

        if(senha.length() >= 8){
            criterios++;
        }
        if (senha.matches(".*[A-Z].*")){
            criterios++;
        }
        if (senha.matches(".*[a-z].*")){
            criterios++;
        }
        if (senha.matches(".*[0-9].*")) {
            criterios++;
        }

        if (senha.matches(".*[!@#$%].*")) {
            criterios++;
        }

        // Gostei do uso do switch/case, mas...
        // e se fosse adicionado um sexto critério?
        // a senha seria fraca? Essa é a melhor ordenação das classificações?
        String classificacao = switch (criterios) {
            case 4, 5 -> "Forte";
            case 3, 2 -> "Média";
            default -> "Fraca";
        };
        System.out.println("Senha: " + senha);
        System.out.println("Classificação: " + classificacao);

    }
}
