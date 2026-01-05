package lista;

public class exercicio12 {
    public static void main(String[] args) {
        String entrada = " 10 +   4 ";

        // Formata o calculo, removendo espaços desnecessários (deixa o codigo mais robusto)
        String[] partes = entrada.trim().replaceAll("\\s+", " ").split(" ");

        int valorEsquerdo = Integer.parseInt(partes[0]);
        int valorDireito = Integer.parseInt(partes[2]);

        char operador = partes[1].charAt(0);

        switch(operador){
            case '+':
                System.out.println(valorEsquerdo + valorDireito);
                break;
            case '-':
                System.out.println(valorEsquerdo - valorDireito);
                break;
            case '*':
                System.out.println(valorEsquerdo * valorDireito);
                break;
            case '/':
                System.out.println(valorEsquerdo / valorDireito);
                break;
            case '%':
                System.out.println(valorEsquerdo % valorDireito);
                break;
            default:
                System.out.println("Valor inválido");
        }
    }

}
