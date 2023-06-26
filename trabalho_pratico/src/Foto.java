package trabalho_pratico.src;

public class Foto extends Recurso {
    private int resolucao;

    private String[] extensoes_validas = { ".jpg", ".png", ".bmp" };

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
