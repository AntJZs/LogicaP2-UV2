/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Clases.Fijas;

import finallogica.Clases.Carrera;

/**
 *
 * @author lpagc
 *  
 * 
 * 
 */
public class Posgrado extends Carrera {
    private String nombre;

    public Object[] toTableString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public enum tipo {MAESTRIA, ESPECIALIZACION}
    tipo tipo_posgrado;

    public Posgrado(int codigo, String nombre, tipo tipo_posgrado, facultades facultades) {
        super(codigo, facultades);
        this.nombre = nombre;
        this.tipo_posgrado = tipo_posgrado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipo getTipo_posgrado() {
        return tipo_posgrado;
    }

    public void setTipo_posgrado(tipo tipo_posgrado) {
        this.tipo_posgrado = tipo_posgrado;
    }

    
    
}
