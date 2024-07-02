public class Formato {
    private String dimension;
    private int preciodimension;
    private String formatoSeleccionado;

    public Formato(String dimension, int preciodimension) {
        this.dimension = dimension;
        this.preciodimension = preciodimension;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public int getPreciodimension() {
        return preciodimension;
    }

    public void setPreciodimension(int preciodimension) {
        this.preciodimension = preciodimension;
    }

    public String getFormatoSeleccionado() {
        return formatoSeleccionado;
    }

    public void setFormatoSeleccionado(String formatoSeleccionado) {
        this.formatoSeleccionado = formatoSeleccionado;
    }
}
