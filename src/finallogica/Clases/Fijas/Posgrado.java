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
 *  TableModelRequirements
 *      [0]     [1]     [2]       [3]
 *      Codigo, Nombre, Facultad, TipoPosgrado
 * 
 */
public class Posgrado extends Carrera {
    public enum tipo {MAESTRIA, ESPECIALIZACION}
    tipo tipo_posgrado;

    public Posgrado(int codigo, String nombre, tipo tipo_posgrado, facultades facultades) {
        super(codigo, nombre, facultades);
        this.tipo_posgrado = tipo_posgrado;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

    public tipo getTipo_posgrado() {
        return tipo_posgrado;
    }

    public void setTipo_posgrado(tipo tipo_posgrado) {
        this.tipo_posgrado = tipo_posgrado;
    }

    public String[] toTableString() {
        String[] lista = {String.valueOf(this.codigo), this.getNombre(), String.valueOf(this.getFacultades()), String.valueOf(this.getTipo_posgrado())};
        return lista;
    }
    public boolean isPosgrado(int codigo){ 
        return (this.codigo == codigo);
    }

}
