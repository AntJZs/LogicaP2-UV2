/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finallogica.Clases;

/**
 *
 * @author gerso
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private enum tipo_documento{CEDULA_CIUDADANIA,TARJETA_IDENTIDAD}; // Añadir los necesarios
    private int numero_documento;
    private int numero_telefono;
    // Asignar Facultad
    // Asignar programa académico
    private enum estado_matricula{ACTIVO,INACTIVO}; // Importante para graduarse...
    
    
    private enum estado_graduacion{EGRESADO,PENDIENTE,NO_EGRESADO,GRADUADO}
    /* |-Esto va a ser el enum de estado, el cual va a ser la fuente de los estados
       de graduación, y lo que la plataforma del estudiante nos permitirá hacer.
    
    NOTA: En el producto requiere que sea Egresado, no graduado, pero acá se va
          a hacer como egresado-pendiente.
    
    Esta verifica la relación entre estudiante y graduado, así que Graduado hereda
    de Estudiante
    */
    private int codigo;
    private boolean sesion;
            
}
