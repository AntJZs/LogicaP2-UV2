/*
 * 
 */
package finallogica.Modelo;

import finallogica.Clases.Estudiante;
import finallogica.Interfaz.ClasePrincipal;
import finallogica.Interfaz.IngresoDirectivo;
import finallogica.Interfaz.IngresoEstudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author AntJZ
 */
public class InicioSesion {
    public static Integer iniciarUsuario(String usuario, String codigo) {
         int IdSesion; // Esta va a ser la sesión que tendremos en el programa, que va a ser el indice del array
        if ((codigo).equals(""+ClasePrincipal.directivo.getCodigo())) {
            IngresoDirectivo instanciaDirectivo = new IngresoDirectivo();
            instanciaDirectivo.setVisible(true);
            return 0;
            // Entra a la interfaz de directivo, no entra en un ID.            
        } else {
        for (Estudiante e : ClasePrincipal.estudiante) {
            if ((codigo).equals(String.valueOf(e.getCodigo()))) {
                IdSesion = ClasePrincipal.estudiante.indexOf(e);
                IngresoEstudiante instanciaEstudiante = new IngresoEstudiante();
                instanciaEstudiante.setVisible(true);
                return IdSesion;
                // Entra a la interfaz de estudiante
            }
            else {
                JOptionPane.showMessageDialog(null, "El usuario y la contraseña son incorrectos, por favor intente de nuevo", "Datos incorrectos", JOptionPane.ERROR_MESSAGE);
                // Se le notifica que el usuario y el código son incorrectos.
            }
        }
        return -1;
    }
}   
    
}
