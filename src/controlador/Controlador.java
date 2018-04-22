/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Usuario;
import modelo.BaseDatosUsuarios;
import vista.VistaLogIn;
import vista.VistaRegistro;

/**
 *
 * @author camil
 */
public class Controlador implements ActionListener {
    private Usuario usuario = new Usuario();
    private VistaLogIn vistaLogIn = new VistaLogIn();
    private VistaRegistro vistaRegistro = new VistaRegistro();
    //public ArrayList<Usuario> uList = new ArrayList();

    
    
    

    public Controlador(Usuario usuario, VistaLogIn vistaLogIn, VistaRegistro vistaRegistro) {
        this.usuario = usuario;
        this.vistaLogIn = vistaLogIn;
        this.vistaRegistro = vistaRegistro;

    }
    
    //FUncion para inicializar la ventana principal
    public void inialitacion(){
        vistaLogIn.setTitle("Gajo Rent A Car");
        vistaLogIn.setLocationRelativeTo(null);
        this.btnAction();
    }
    
    
    
    
    public void btnAction(){
        //Boton registro usuario
        this.vistaLogIn.btn_registrar.addActionListener(new ActionListener(){
            @Override
            //Abrir ventana registro
            public void actionPerformed(ActionEvent e) {
                vistaRegistro.setTitle("Registro de usuario");
                vistaRegistro.setLocationRelativeTo(null);
                vistaLogIn.invalidate();
                vistaRegistro.isValidateRoot();
                vistaLogIn.setVisible(false);
                vistaRegistro.setVisible(true);
            }
            
        });
        //registara nuevo usuario
        this.vistaRegistro.btn_registrar.addActionListener(new ActionListener(){
            //ArrayList<Usuario> uList = new ArrayList();
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = vistaRegistro.txt_nombre.getText().toString();
                String usuario = vistaRegistro.txt_usuario.getText().toString();
                String contrasena = vistaRegistro.txt_contrasena.getText().toString();
                String tipo = vistaRegistro.jComboBox1.getSelectedItem().toString();
                //Crear nuevo usuario
                ArrayList<Usuario> uList = new ArrayList();
                Usuario usr = new Usuario(nombre, usuario, contrasena,tipo);
                uList.add(usr);
                BaseDatosUsuarios bd = BaseDatosUsuarios.getSingletonInstance(usr);

                for (int i = 0; i < bd.getUsuarios().size(); i++) {
                    System.out.println(bd.getUsuarios().toString());
   
                    }

         
            }
          
        });

        
    }

   
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
