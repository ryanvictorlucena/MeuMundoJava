package a07Excecoes;

public class LoginInvalidoException extends Exception {
    
    public LoginInvalidoException() {
        super("Login inválido!");
    }

    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}
