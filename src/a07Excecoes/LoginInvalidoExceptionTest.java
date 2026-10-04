package a07Excecoes;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String username = "Luffy";
        String senha = "12345";
        System.out.println("Usuário: ");
        String usernameEntrada = sc.nextLine();
        System.out.println("Senha: ");
        String senhaEntrada = sc.nextLine();
        if (!username.equals(usernameEntrada) || !senha.equals(senhaEntrada)) {
            throw new LoginInvalidoException("Usuário ou senha inválido");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
