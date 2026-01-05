package lista;

public class exercicio10 {
    public static void main(String[] args) {

        final String usuarioDeAcesso = "admin";
        final String senhaDeAcesso = "1234";

        String usuarioDeLogin = "admin";
        String senhaDeLogin = "1234";

        if(usuarioDeLogin.equals(usuarioDeAcesso) && senhaDeLogin.equals(senhaDeAcesso)){
            System.out.println("Login bem-sucedido");
        }else{
            System.out.println("Credenciais inválidas");
        }
    }
}
