/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Clases.Fijas;

import finallogica.Clases.Director;

/**
 *
 * @author gerso
 */
public class TrabajoDeGrado {
    private String nombre;
    private enum tipo_trabajo{PRÁCTICA, INVESTIGACIÓN, DIPLOMADO}
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
    
    
    
    
    
    
}
