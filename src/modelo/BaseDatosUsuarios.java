
package modelo;
import java.util.ArrayList;
import modelo.Usuario;


public class BaseDatosUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList();
    
    
    public BaseDatosUsuarios() {
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "BaseDatosUsuarios{" + "usuarios=" + usuarios + '}';
    }
       
}
