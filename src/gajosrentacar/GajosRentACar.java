package gajosrentacar;
import vista.VistaLogIn;
import vista.VistaRegistro;
import controlador.Controlador;
import modelo.BaseDatosUsuarios;
import modelo.Usuario;

public class GajosRentACar {

    public static void main(String[] args) {
        VistaLogIn vistaLogIn = new VistaLogIn ();
        VistaRegistro vistaRegistro = new VistaRegistro();
        
        /*String nombre = "Carlos";
        String usr = "cCalderon";
        String contrasena = "123";
        String tipo = "Admonostrador";
*/
        Usuario usuario = new Usuario();
        
   
        //LLamar a ventana LogIn
        Controlador crlt = new Controlador(usuario, vistaLogIn, vistaRegistro);
        crlt.inialitacion();
        vistaLogIn.setVisible(true);
    }
    
}
