/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Clases;

import finallogica.Clases.Fijas.TrabajoDeGrado;
import java.util.Date;

/**
 *
 * @author lpagc
 *  Esta clase equivale a la segunda parte de la graduación
 *  que es la solicitud, la cual necesita estos datos.
 * 
 *  Estudiante --> Graduando
 *  
 *  Extiende a estudiante, pero no necesariamente.
 *  
 *  Aquí se utiliza date, para las fechas, investigar un poco.
 *  
 *  Atributos:
 *  Deudas
 *  (double)    deudas_biblioteca   
 *  (double)    mora_universidad    
 *  (double)    deudas_universidad  
 *  (Trabajo)   trabajo_grado
 *  (double)    deudas_academicas
 *  (String)    certificado_ingles
 *  (int)       saber_pro
 * 
 * 
 * 
 */
public class Graduando {
    Estudiante estudiante;
    private double deudas_biblioteca = 0;
    // [] - Trabajo de grado
    private TrabajoDeGrado trabajo_grado;
    
    private double mora_universidad;
    private double deudas_universidad;
    private double deudas_academicas = 0;
    private String certificado_ingles;
    private Date fecha_finalizacion;
    // Investigar: Implementación de las fechas
    private int saber_pro;

    public Graduando(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

     
    
    
    
}
