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
    private boolean deudas_biblioteca;
    // [] - Trabajo de grado
    private TrabajoDeGrado trabajo_grado;
    
    private boolean mora_universidad;
    private boolean deudas_universidad;
    private boolean deudas_academicas;
    private String certificado_ingles;
    private Date fecha_finalizacion;
    // Investigar: Implementación de las fechas
    private boolean saber_pro;
    private Date fecha_graduacion;
    private boolean promedio_final;

    public Graduando(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    // Implementar funciones interactivas.
    
    
}
