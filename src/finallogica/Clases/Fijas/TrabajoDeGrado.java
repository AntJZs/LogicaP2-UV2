/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Clases.Fijas;

import finallogica.Clases.Director;

/**
 *
 * @author lpagc
 * 
 *  TableModelRequirements
 *      [0]     [1]          [2]             [3]
 *      Nombre, TipoTrabajo, NombreDirector, Categoría
 */
public class TrabajoDeGrado {
    private String nombre;
    private enum tipo_trabajo{PRÁCTICA, INVESTIGACION, DIPLOMADO}
    tipo_trabajo tipo_trabajo;
    private Director director;
    private enum categoria{A, B, C, D}
    categoria categoria;

    // Para pregrado
    public TrabajoDeGrado(String nombre, tipo_trabajo tipo_trabajo) {
        this.nombre = nombre;
        this.tipo_trabajo = tipo_trabajo;
    }
    // Para posgrado
    public TrabajoDeGrado(String nombre, tipo_trabajo tipo_trabajo, Director director) {
        this.nombre = nombre;
        this.tipo_trabajo = tipo_trabajo;
        this.director = director;
    }

    // Para maestría
    public TrabajoDeGrado(String nombre, tipo_trabajo tipo_trabajo, Director director, categoria categoria) {
        this.nombre = nombre;
        this.tipo_trabajo = tipo_trabajo;
        this.director = director;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipo_trabajo getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(tipo_trabajo tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }
    
    
    public String[] toTableString() {
        String[] lista = {this.getNombre(), String.valueOf(this.getTipo_trabajo()), this.getDirector().getNombre(), String.valueOf(this.getCategoria())};
        return lista;
    }
    
    
    
    
}
