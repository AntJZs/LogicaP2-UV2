/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Clases;

import finallogica.Clases.Fijas.TrabajoDeGrado;

/**
 *
 * @author lpagc
 *  Esta clase equivale a la segunda parte de la graduación
 *  que es la solicitud, la cual necesita estos datos.
 *  
 *  Extiende a estudiante, pero no necesariamente.
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
 */
public class Graduando {
    private double deudas_biblioteca = 0;
    // [] - Trabajo de grado
    private double mora_universidad;
    private double deudas_universidad;
    
    private TrabajoDeGrado trabajo_grado;
    private double deudas_academicas = 0;
    private String certificado_ingles;
    // Investigar: Implementación de las fechas
    private int saber_pro;
    
    
}
