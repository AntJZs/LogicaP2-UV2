/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Clases;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author lpagc
 */
public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;
    private enum tipo_documento{CEDULA_CIUDADANIA,TARJETA_IDENTIDAD}; // Añadir los necesarios
    tipo_documento tipo_documento;
    private int numero_documento;
    private int numero_telefono;
    // Asignar Facultad
    // Asignar programa académico
    public enum estado_matricula{ACTIVO,INACTIVO}; // Importante para graduarse...
    estado_matricula estado_matricula;
    
    public enum estado_graduacion{EGRESADO,PENDIENTE,NO_EGRESADO,GRADUADO}
    estado_graduacion estado_graduacion;
    /* |-Esto va a ser el enum de estado, el cual va a ser la fuente de los estados
       de graduación, y lo que la plataforma del estudiante nos permitirá hacer.
    
    NOTA: En el producto requiere que sea Egresado, no graduado, pero acá se va
          a hacer como egresado-pendiente.
    
    Esta verifica la relación entre estudiante y graduado, así que Graduado hereda
    de Estudiante
    */
    private boolean sesion;
    // Verifica que el usuario tiene una sesión abierta.
            
    
    public Estudiante(String nombre, String apellido, tipo_documento tipo_documento, int numero_documento, int numero_telefono, estado_matricula estado_matricula, estado_graduacion estado_graduacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.numero_telefono = numero_telefono;
        this.estado_matricula = estado_matricula;
        this.estado_graduacion = estado_graduacion;
        this.codigo = id(""+numero_documento); // Not a bug, a feature
        System.out.println(this.codigo);
    }
    
    // Función del toString: Ser una lista la cual se pueda mostrar en una tabla.
    // String...

    public List<String> tableString() {
        List<String> estudiante = new ArrayList<>();
        estudiante.add(""+codigo);
        estudiante.add(""+nombre);
        estudiante.add(""+apellido);
        estudiante.add(""+numero_documento);
        estudiante.add(""+numero_telefono);
        estudiante.add(""+estado_matricula);
        estudiante.add(""+estado_graduacion);
        return estudiante;
    }
    
    
    
    
    public static int id(String numero) {
        System.out.println("Generando ID...");
        return Math.abs(numero.hashCode()/1024); //Lo más aleatorio que conozco para hacer IDs
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public int getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public estado_matricula getEstado_matricula() {
        return estado_matricula;
    }

    public void setEstado_matricula(estado_matricula estado_matricula) {
        this.estado_matricula = estado_matricula;
    }

    public estado_graduacion getEstado_graduacion() {
        return estado_graduacion;
    }

    public void setEstado_graduacion(estado_graduacion estado_graduacion) {
        this.estado_graduacion = estado_graduacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isSesion() {
        return sesion;
    }

    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }    

    public tipo_documento getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(tipo_documento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }
    
    
    public String[] toTableString() {
        String[] lista = {String.valueOf(this.codigo), this.getNombre(), this.getApellido(), String.valueOf(this.getTipo_documento()), String.valueOf(this.getNumero_documento()),
        String.valueOf(this.getNumero_telefono()), String.valueOf(this.getEstado_matricula()), String.valueOf(this.getEstado_graduacion())};
        return lista;
    }
    
}
