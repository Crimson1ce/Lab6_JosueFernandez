package lab6;

public class Cancion {
    private String nombre;
    private int puntiacion;
    private int añoPublicacion;
    private String artista;
    private String album;

    public Cancion(String nombre, int puntiacion, int añoPublicacion, String artista, String album) {
        this.nombre = nombre;
        this.puntiacion = puntiacion;
        this.añoPublicacion = añoPublicacion;
        this.artista = artista;
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntiacion() {
        return puntiacion;
    }

    public void setPuntiacion(int puntiacion) {
        this.puntiacion = puntiacion;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
