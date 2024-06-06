/*
 * 
 */
package finallogica.Modelo;

import finallogica.Clases.Estudiante;
import finallogica.Clases.Graduando;
import finallogica.Interfaz.ClasePrincipal;
import finallogica.Interfaz.Inicio;
import javax.swing.JOptionPane;

/**
 *
 * @author AntJZ
 */
public class SolicitudGrados {
    public static boolean SolicitarGrados(int IdSesion) {
        if((ClasePrincipal.estudiante.get(IdSesion).getEstado_graduacion() == Estudiante.estado_graduacion.EGRESADO) &&
           (ClasePrincipal.estudiante.get(IdSesion).getEstado_matricula() == Estudiante.estado_matricula.ACTIVO)) {
            // Si es estudiante egresado y es activo, se genera una nueva solicitud.
            // Los datos del graduando, se almacenan en graduando y se genera una nueva solicitud si es posible.
            ClasePrincipal.graduando.add(new Graduando(ClasePrincipal.estudiante.get(IdSesion)));
            ClasePrincipal.estudiante.get(IdSesion).setEstado_graduacion(Estudiante.estado_graduacion.PENDIENTE);
            return true;
        } else if (ClasePrincipal.estudiante.get(IdSesion).getEstado_graduacion() == (Estudiante.estado_graduacion.PENDIENTE)) {
            JOptionPane.showMessageDialog(null, "Ya está en proceso una solicitud. Por favor espera hasta que sea revisada.", "Ya solicitado.", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "No se han cumplido los prerequisitos.", "Solicitud no realizada", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
