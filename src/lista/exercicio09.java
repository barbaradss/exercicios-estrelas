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

        String classificacao;

        switch (criterios){
            case 4:
            case 5:
                classificacao = "Forte";
                break;
            case 3:
            case 2:
                classificacao = "Média";
                break;
            default:
                classificacao = "Fraca";
        }
        System.out.println("Senha: " + senha);
        System.out.println("Classificação: " + classificacao);

    }
}
