package trabalho_pratico.src;

import java.time.LocalDateTime;

public class PostVideo implements Postavel {
    private Video video;
    private LocalDateTime data_postagem;
    private Comentario lista_comentarios[]; // TODO

    public PostVideo() {
        this.data_postagem = LocalDateTime.now();
        // TODO
    }

    public boolean adicionaVideo() {
        // todo
    }

    public boolean posta() {
        // todo

    }

    public boolean comenta() {
        // todo
    }

}
