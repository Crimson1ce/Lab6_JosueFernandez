package lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    
    private String nombre;
    private ArrayList<Cancion> canciones = new ArrayList<>();

    public Playlist(String nombre) {
        this.nombre = nombre;
    }
    
    public Playlist(File archivo){
        this.nombre = archivo.getName();
        cargarArchivo(archivo.getPath());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void escribirArchivo(String path) {
        
        File archivo = new File(path);
        
        try {
            FileWriter fw = new FileWriter(archivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (Cancion can : canciones) {
                
                bw.write(can.getNombre()+"|");
                bw.write(can.getPuntuacion()+"|");
                bw.write(can.getAñoPublicacion()+"|");
                bw.write(can.getArtista()+"|");
                bw.write(can.getAlbum()+"\n");
            
            }
            
            bw.flush();
            
            bw.close();
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargarArchivo(String path) {
        
        File archivo = new File(path);
        
        if (archivo.exists()) {
            
            try {
                Scanner sc = new Scanner(archivo);
                
                canciones.clear();
                int i=0;
                while(sc.hasNextLine()){
                    
                    String line = sc.nextLine();
                    String[] palabras = line.split("\\|");
                    
                    
                    canciones.add(
                            new Cancion(
                                    palabras[0],
                                    Integer.parseInt(palabras[1]),
                                    Integer.parseInt(palabras[2]),
                                    palabras[3],
                                    palabras[4]
                            )
                    );
                    
                }
                
                sc.close();
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
        
    }
}
