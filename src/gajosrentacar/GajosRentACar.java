package gajosrentacar;
import vista.VistaLogIn;
import vista.VistaRegistro;
import controlador.Controlador;
import modelo.Alquiler;
import modelo.Automovil;
import modelo.BaseDatosUsuarios;
import modelo.Usuario;
import vista.VistaAdministrador;
import vista.VistaAlquiler;
import vista.VistaCrearCliente;
import vista.VistaCajero;
import vista.VistaAuditor;
import vista.VistaAutomovil;

public class GajosRentACar {

    public static void main(String[] args) {
        VistaLogIn vistaLogIn = new VistaLogIn ();
        VistaRegistro vistaRegistro = new VistaRegistro();
        VistaAdministrador vistaAdministrador = new VistaAdministrador();
        VistaCrearCliente vistaCrearCliente = new VistaCrearCliente();
        VistaCajero vistaCajero = new VistaCajero();
        VistaAuditor vistaAuditor = new VistaAuditor();
        VistaAutomovil vistaAuto = new VistaAutomovil();
        VistaAlquiler vistaAlquiler = new VistaAlquiler();
        /*String nombre = "Carlos";
        String usr = "cCalderon";
        String contrasena = "123";
        String tipo = "Admonostrador";
*/
        Usuario usuario = new Usuario();
        Automovil auto = new Automovil();
        Alquiler alqui= new Alquiler();
        //LLamar a ventana LogIn
        Controlador crlt = new Controlador(usuario, auto,alqui,vistaLogIn, vistaRegistro, vistaAdministrador, vistaCrearCliente, vistaCajero, vistaAuditor,vistaAuto,vistaAlquiler);
        crlt.inialitacion();
        vistaLogIn.setVisible(true);
    }
    
}
