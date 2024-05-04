/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Clases;

/**
 *
 * @author gerso
 */
public class Director {
    private String nombre;
    private int numeroDirector = 0;

    
    public Director(String nombre) {
        this.nombre = nombre;
        
    }

    public void setNumeroDirector(int numeroDirector) {
        this.numeroDirector = numeroDirector;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDirector() {
        return numeroDirector;
    }
    

    
}

