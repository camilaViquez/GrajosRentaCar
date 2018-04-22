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
        Usuario usuario = new Usuario();
        BaseDatosUsuarios bdUsuario = new BaseDatosUsuarios();
   
        //LLamar a ventana LogIn
        Controlador crlt = new Controlador(usuario, vistaLogIn, vistaRegistro,bdUsuario);
        crlt.inialitacion();
        vistaLogIn.setVisible(true);
    }
    
}
