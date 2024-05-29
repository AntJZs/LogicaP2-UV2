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
 *      [0]     [1]     [2]     
 *      Codigo, Nombre, Facultad
 * 
 * 
 */
public class Pregrado extends Carrera {
    private String nombre;

    public Pregrado(int codigo, String nombre, facultades facultades) {
        super(codigo, nombre, facultades);
        this.nombre = nombre;
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
    
   
    public String[] toTableString() {
        String[] lista = {String.valueOf(this.codigo), this.getNombre(), String.valueOf(this.getFacultades())};
        return lista;
    }
    
        public boolean isPregrado(int codigo){ 
        return this.codigo == codigo;
    }
    
}
    
