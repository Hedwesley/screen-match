package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String message;
    public ErroDeConversaoDeAnoException(String menssage) {
        this.message = menssage;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
