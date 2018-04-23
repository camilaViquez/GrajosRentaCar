package gajosrentacar;
import vista.VistaLogIn;
import vista.VistaRegistro;
import controlador.Controlador;
import modelo.BaseDatosUsuarios;
import modelo.Usuario;
import vista.VistaAdministrador;
import vista.VistaCrearCliente;
import vista.VistaCajero;

public class GajosRentACar {

    public static void main(String[] args) {
        VistaLogIn vistaLogIn = new VistaLogIn ();
        VistaRegistro vistaRegistro = new VistaRegistro();
        VistaAdministrador vistaAdministrador = new VistaAdministrador();
        VistaCrearCliente vistaCrearCliente = new VistaCrearCliente();
        VistaCajero vistaCajero = new VistaCajero();
        
        
        /*String nombre = "Carlos";
        String usr = "cCalderon";
        String contrasena = "123";
        String tipo = "Admonostrador";
*/
        Usuario usuario = new Usuario();
        
   
        //LLamar a ventana LogIn
        Controlador crlt = new Controlador(usuario, vistaLogIn, vistaRegistro, vistaAdministrador, vistaCrearCliente, vistaCajero);
        crlt.inialitacion();
        vistaLogIn.setVisible(true);
    }
    
}
