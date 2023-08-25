package co.edu.uniquindio.progdos;

import java.util.List;
/*
 * NOTAS DE CLASE:
 * 
 * "Alt + Shift + F" le da formato al codigo
 * 
 * Para generar metodos de clase (Constructor, get y set, hashSet y equals, toString)
 * Puede dar clic derecho en la clase y luego en la opcion "Source Action", aqui podra 
 * generar dichos metodos.
 */
public class ServidorWeb {
    private int id;
    private String nombre;
    private String dirIp;
    private String espacioMegaBits;
    private List<Aplicacion> lstAplicaciones;

    /**
     * Metodo Contructor 
     */
    public ServidorWeb() {
    }

    public ServidorWeb(int id, String nombre, String dirIp, String espacioMegaBits, List<Aplicacion> lstAplicaciones) {
        this.id = id;
        this.nombre = nombre;
        this.dirIp = dirIp;
        this.espacioMegaBits = espacioMegaBits;
        this.lstAplicaciones = lstAplicaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirIp() {
        return dirIp;
    }

    public void setDirIp(String dirIp) {
        this.dirIp = dirIp;
    }

    public String getEspacioMegaBits() {
        return espacioMegaBits;
    }

    public void setEspacioMegaBits(String espacioMegaBits) {
        this.espacioMegaBits = espacioMegaBits;
    }

    public List<Aplicacion> getLstAplicaciones() {
        return lstAplicaciones;
    }

    public void setLstAplicaciones(List<Aplicacion> lstAplicaciones) {
        this.lstAplicaciones = lstAplicaciones;
    }

    public void mostrarPagina(String ruta){
        //TODO
    }

    public long calcularEspacioLibre(){
        return 0l;
    }
}
