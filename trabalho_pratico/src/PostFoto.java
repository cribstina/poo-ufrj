package trabalho_pratico.src;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class PostFoto implements Postavel {
    private int qtde_fotos; // armazena quantas fotos compõem a postagem
    private ArrayList<Foto> fotos = new ArrayList<>(); // lista que contém os objetos da classe Foto
    private String localizacao; // local onde foi tirada a foto
    private LocalDateTime data_postagem; // data de publicação da postagem
    private ArrayList<Comentario> lista_comentarios = new ArrayList<>(); // armazena todos os comentários feitos na
                                                                         // postagem
    private int qtde_fixados; // armazena a qtde de comentários fixados

    public PostFoto() {
        // todo
    }

    public boolean adicionaFoto(Foto foto) {
        /*
         * recebe uma Foto como parâmetro, adiciona ela na lista fotos e aumenta a
         * qtde_fotos da postagem
         */
        try {
            this.fotos.add(foto);
            this.qtde_fotos += 1;
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro! Argumento inválido.");
            return false;
        }
    }

    public boolean removeFoto(Foto foto) {
        /*
         * recebe como parâmetro uma Foto e a remove da lista. Caso seja removido,
         * diminui também a qtde_fotos
         */
        try {
            this.fotos.remove(foto);
            this.qtde_fotos -= 1;
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro! Argumento inválido.");
            return false;
        }
    }

    public boolean posta() {
        /*
         * verifica se a postagem tem pelo menos uma foto e no máximo 10 fotos
         * associadas a ela e atualiza a data_postagem para a atual caso positivo. Caso
         * a validação não dê certo, a função retorna em estado de erro.
         */

        if (this.qtde_fotos > 0 && this.qtde_fotos < 11) {
            this.data_postagem = LocalDateTime.now();
            return true;
        } else {
            throw new RuntimeException("Erro! A postagem deve ter no mínimo 1 e no máximo 10 fotos.");
        }

    }

    public boolean comenta() {
        /*
         * cria um comentário com a data de hoje, a mensagem do usuário e o tamanho da
         * mensagem. Esse comentário criado é armazenado na lista_comentarios do objeto.
         */

        Comentario comentario = new Comentario();
        Scanner sc = new Scanner(System.in);
        String texto;

        try {
            System.out.println("Digite o texto para o seu comentário.");
            texto = sc.nextLine();

            comentario.setData(LocalDateTime.now());
            comentario.setTexto(texto);
            this.lista_comentarios.add(comentario);
            return true;

        } catch (IllegalArgumentException e) {
            System.out.println("Erro!");
            return false;
        }
    }

}
