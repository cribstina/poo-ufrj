package trabalho_pratico.src;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostFoto implements Postavel {
    private int qtde_fotos;
    private ArrayList<Foto> fotos = new ArrayList<>();
    private String localizacao;
    private LocalDateTime data_postagem;
    private Comentario lista_comentarios[];

    public PostFoto() {
        // todo
    }

    public boolean adicionaFoto(Foto foto) {
        try {
            this.fotos.add(foto);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro! Argumento inválido.");
            return false;
        }
    }

    public boolean removeFoto() {
        // todo
    }

    public boolean posta() {
        // todo
    }

    public boolean comenta() {
        // todo
    }

}
