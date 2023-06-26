package trabalho_pratico.src;

public abstract class Recurso {
    private int ID;
    private String url_recurso;
    private static int prox_ID = 1;

    public abstract boolean validaUrlRecurso();

    public int getProxID() {
        return prox_ID;
    }

    public int getIDRecurso() {
        return this.ID;
    }

    public String getUrlRecurso() {
        return this.url_recurso;
    }
}
