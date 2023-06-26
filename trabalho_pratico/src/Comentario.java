package trabalho_pratico.src;

import java.time.LocalDateTime;

public class Comentario {
    private LocalDateTime data;
    private boolean fixado;
    private int tamanho;
    private String texto;

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean getFixado(boolean fixado) {
        return this.fixado;
    }

    public void setFixado(boolean fixado) {
        this.fixado = fixado;
    };
}