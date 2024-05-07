/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Clases;

/**
 *
 * @author lpagc
 * 
 *  Atributos:
 *      nombre  - Nombre del directivo, necesario para inicioSesion
 *      codigo  - Codigo del directivo, necesario para inicioSesion
 *      sesion  - Dice si la sesión de un directivo está activa,
 *                igual que en Estudiante
 * 
 */
public class Directivo {
    private String nombre;
    private int codigo = 604802;
    private boolean sesion = false;

    public Directivo(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSesion() {
        return sesion;
    }

    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }

    public int getCodigo() {
        return codigo;
    }
    
    
}
