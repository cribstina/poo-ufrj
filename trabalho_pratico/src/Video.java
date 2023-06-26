package trabalho_pratico.src;

public class Video extends Recurso {
    private int frame_rate;
    private int duracao;

    private String[] extensoes_validas = { ".mp4", ".mov", ".wmv" };

    public boolean validaUrlRecurso() {
        String url = getUrlRecurso();
        for (String s : extensoes_validas) {
            if (url.endsWith(s)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
