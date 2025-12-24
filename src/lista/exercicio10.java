package lista;

public class exercicio10 {
    public static void main(String[] args) {

        final String USUARIO_DE_ACESSO = "admin";
        final String SENHA_DE_ACESSO = "1234";

        String usuarioLogin = "admin";
        String senhaLogin = "1234";

        if(usuarioLogin.equals(USUARIO_DE_ACESSO) && senhaLogin.equals(SENHA_DE_ACESSO)){
            System.out.println("Login bem-sucedido");
        }else{
            System.out.println("Credenciais inválidas");
        }
    }
}
