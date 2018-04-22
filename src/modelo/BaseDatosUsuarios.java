
package modelo;
import java.util.ArrayList;
import modelo.Usuario;

//Implementacion de singleton para la base de datos de los usuarios.
public class BaseDatosUsuarios {
    private ArrayList<Usuario> usuarios = new ArrayList();
    private static BaseDatosUsuarios dbUsuario;
    
    //Contructor privado

    private BaseDatosUsuarios(Usuario usr) {
        this.usuarios.add(usr);
    }
    
    public static BaseDatosUsuarios getSingletonInstance(Usuario usr){
        if(dbUsuario == null){
            dbUsuario = new BaseDatosUsuarios(usr);
            
        }else{
            dbUsuario.usuarios.add(usr);
        }
        return dbUsuario;
        
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public static BaseDatosUsuarios getDbUsuario() {
        return dbUsuario;
    }

    public static void setDbUsuario(BaseDatosUsuarios dbUsuario) {
        BaseDatosUsuarios.dbUsuario = dbUsuario;
    }
    

    //To string
    @Override
    public String toString() {
        return "BaseDatosUsuarios{" + "usuarios=" + usuarios + '}';
    }
       
}
