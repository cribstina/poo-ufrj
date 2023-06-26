package trabalho_pratico.src;

public abstract class PostavelFactory {
    public static Postavel getPostavel(String tipo) throws Exception {
        Postavel postavel_indicado;
        if (tipo.equals("POSTFOTO")) {
            PostFoto postFoto = new PostFoto();
            postavel_indicado = postFoto;
        } else if (tipo.equals("POSTVIDEO")) {
            PostVideo postVideo = new PostVideo();
            postavel_indicado = postVideo;
        } else {
            throw new IllegalArgumentException("Tipo de postável inválido.");
        }

        return postavel_indicado;
    }
}
