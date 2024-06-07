/*
 * 
 */
package finallogica.Modelo;

import finallogica.Clases.Estudiante;
import finallogica.Interfaz.ClasePrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author AntJZ
 */
public class InicioSesion {
    public static Integer iniciarUsuario(String usuario, String codigo) {
         int IdSesion; // Esta va a ser la sesión que tendremos en el programa, que va a ser el indice del array
        if ((codigo).equals(String.valueOf(ClasePrincipal.directivo.getCodigo())) && (usuario).equalsIgnoreCase(ClasePrincipal.directivo.getNombre())) {
            return -2;
            // Entra a la interfaz de directivo, no entra en un ID.            
        } else {
        for (Estudiante e : ClasePrincipal.estudiante) {
            if ((codigo).equals(String.valueOf(e.getCodigo())) && (usuario.equalsIgnoreCase(e.getNombre()))) {
                IdSesion = ClasePrincipal.estudiante.indexOf(e);
                return IdSesion;
                // Entra a la interfaz de estudiante
            }
            
        }
                JOptionPane.showMessageDialog(null, "El usuario y la contraseña son incorrectos, por favor intente de nuevo", "Datos incorrectos", JOptionPane.ERROR_MESSAGE);
                // Se le notifica que el usuario y el código son incorrectos.
        return -1;
    }
}   
    
}
