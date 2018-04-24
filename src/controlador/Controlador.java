/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.BaseDatosUsuarios;
import vista.VistaLogIn;
import vista.VistaRegistro;
import vista.VistaAdministrador;
import vista.VistaCrearCliente;
import vista.VistaCajero;

/**
 *
 * @author camil
 */
public class Controlador implements ActionListener {
    private Usuario usuario = new Usuario();
    private VistaLogIn vistaLogIn = new VistaLogIn();
    private VistaRegistro vistaRegistro = new VistaRegistro();
    private VistaAdministrador vistaAdministrador = new VistaAdministrador();
    private VistaCrearCliente vistaCrearCliente = new VistaCrearCliente();
    private VistaCajero vistaCajero = new VistaCajero();
    //public ArrayList<Usuario> uList = new ArrayList();

    
    
    

    public Controlador(Usuario usuario, VistaLogIn vistaLogIn, VistaRegistro vistaRegistro, VistaAdministrador vistaAdministrador, VistaCrearCliente vistaCrearCliente, VistaCajero vistaCajero) {
        this.usuario = usuario;
        this.vistaLogIn = vistaLogIn;
        this.vistaRegistro = vistaRegistro;
        this.vistaAdministrador = vistaAdministrador;
        this.vistaCrearCliente = vistaCrearCliente;
        this.vistaCajero = vistaCajero;

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
        //volver a logIn
        this.vistaRegistro.btn_volver.addActionListener(new ActionListener(){
            @Override
            //Abrir ventana logIn
            public void actionPerformed(ActionEvent e) {
                vistaLogIn.setTitle("Log in");
                vistaLogIn.setLocationRelativeTo(null);
                vistaRegistro.invalidate();
                vistaLogIn.isValidateRoot();
                vistaRegistro.setVisible(false);
                vistaLogIn.setVisible(true);
            }
            
        });
        //registar nuevo usuario
        this.vistaRegistro.btn_registrar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               try{
                String nombre = vistaRegistro.txt_nombre.getText().toString();
                String apellido1 = vistaRegistro.txt_apellido1.getText().toString();
                String apellido2 = vistaRegistro.txt_apellido2.getText().toString();
                String correo = vistaRegistro.txt_correo.getText().toString();
                String usuario = vistaRegistro.txt_usuario.getText().toString();
                String contrasena = vistaRegistro.txt_contrasena.getText().toString();
                String tipo = vistaRegistro.jComboBox1.getSelectedItem().toString();
                //Crear nuevo usuario
                ArrayList<Usuario> uList = new ArrayList();
                Usuario usr = new Usuario(nombre,apellido1,apellido2,correo, usuario, contrasena,tipo);
                uList.add(usr);
                BaseDatosUsuarios bd = BaseDatosUsuarios.getSingletonInstance(usr);

                for (int i = 0; i < bd.getUsuarios().size(); i++) {
                    System.out.println(bd.getUsuarios().toString());
   
                    }
         
            }catch(Exception ex){
                    JOptionPane.showMessageDialog(vistaRegistro, "Error verifique los datos ingresados");
              }
            } 
          
        });
        
        //Boton iniciar sesion
        this.vistaLogIn.btn_iniciarSesion.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = vistaLogIn.txt_usuario.getText().toString();
                String contrasena = vistaLogIn.txt_contrasena.getText().toString();
                
                BaseDatosUsuarios db = BaseDatosUsuarios.getDbUsuario();
                ArrayList<Usuario> listaUsr = new ArrayList();
                listaUsr = db.getUsuarios();
                System.out.println("lista: "+listaUsr.toString());
                
               // usuario valido
                for(Usuario u: listaUsr){
                    //Validar administrador
                        if(contrasena.equals(u.getContrasena())){
                            System.out.println("tipo: "+u.getTipo());
                            if(u.getTipo().toString()== "Administrador"){
                                mostrarVistaAdministrador();
                                
                            }else{
                                if(u.getTipo().equals("Cajero")){
                                    mostrarVistaCajero();
                                }
                            }
                            
                        
                            
                        }
                    
                }
                
            }
            
            
        });
        
       

        
    }
    //Mostrar ventana del administrados
    public void mostrarVistaAdministrador(){
        //Mostrar ventana nueva ocultar anterior
        vistaAdministrador.setTitle("sesion Administrador");
        vistaAdministrador.setLocationRelativeTo(null);
        vistaLogIn.invalidate();
        vistaAdministrador.isValidateRoot();
        vistaLogIn.setVisible(false);
        vistaAdministrador.setVisible(true);
        
        // volver a ventana log in
        vistaAdministrador.btn_volver.addActionListener(new ActionListener(){
            @Override
            //Abrir ventana logIn
            public void actionPerformed(ActionEvent e) {
                vistaLogIn.setTitle("Log in");
                vistaLogIn.setLocationRelativeTo(null);
                vistaAdministrador.invalidate();
                vistaLogIn.isValidateRoot();
                vistaAdministrador.setVisible(false);
                vistaLogIn.setVisible(true);
            }
            
        });
        
        //variables de ventana
        
        }
    
    
    public void mostrarVistaCajero(){
        //Abrir ventana cajero
        vistaCajero.setTitle("Sesion Cajero");
        vistaCajero.setLocationRelativeTo(null);
        vistaLogIn.invalidate();
        vistaCajero.isValidateRoot();
        vistaLogIn.setVisible(false);
        vistaCajero.setVisible(true);
        
        //boton volver al logIn
         vistaCajero.btn_volver.addActionListener(new ActionListener(){
            @Override
            //Abrir ventana logIn
            public void actionPerformed(ActionEvent e) {
                vistaLogIn.setTitle("Log in");
                vistaLogIn.setLocationRelativeTo(null);
                vistaCajero.invalidate();
                vistaLogIn.isValidateRoot();
                vistaCajero.setVisible(false);
                vistaLogIn.setVisible(true);
                
            }
            
        });
         
         
         
         //Boton crear cliente
          this.vistaCajero.btn_crearCliente.addActionListener(new ActionListener(){
            @Override
            //Abrir ventana crearCliente
            public void actionPerformed(ActionEvent e) {
                vistaCrearCliente.setTitle("Crear Cliente");
                vistaCrearCliente.setLocationRelativeTo(null);
                vistaCajero.invalidate();
                vistaCrearCliente.isValidateRoot();
                vistaCajero.setVisible(false);
                vistaCrearCliente.setVisible(true);
            }
            
        });
          //Boton volver vista cajero
          this.vistaCrearCliente.btn_volver.addActionListener(new ActionListener(){
            @Override
            //Abrir ventana crearCliente
            public void actionPerformed(ActionEvent e) {
                vistaCajero.setTitle("Sesion cajero");
                vistaCajero.setLocationRelativeTo(null);
                vistaCrearCliente.invalidate();
                vistaCajero.isValidateRoot();
                vistaCrearCliente.setVisible(false);
                vistaCajero.setVisible(true);
            }
            
        });
         
          //Registrara nuevo cliente
            //variables para registrar cliente
            
            this.vistaCrearCliente.btn_registrar.addActionListener(new ActionListener(){
            @Override
            //Abrir ventana crearCliente
            public void actionPerformed(ActionEvent e) {
                try{
                    String nombre = vistaCrearCliente.txt_nombre.getText().toString();
                    String apellido1 = vistaCrearCliente.txt_apellido1.getText().toString();
                    String apellido2 = vistaCrearCliente.txt_apellido2.getText().toString();
                    String correo = vistaCrearCliente.txt_correo.getText().toString();
                    String usuario = vistaCrearCliente.txt_usuario.getText().toString();
                    String contrasena = vistaCrearCliente.txt_contrasena.getText().toString();

                    //Agregar cliente a base de datos
                    //Crear nuevo usuario
                        ArrayList<Usuario> uList = new ArrayList();
                        Usuario usr = new Usuario(nombre,apellido1,apellido2,correo, usuario, contrasena,"cliente");
                        uList.add(usr);
                        BaseDatosUsuarios bd = BaseDatosUsuarios.getSingletonInstance(usr);

                        for (int i = 0; i < bd.getUsuarios().size(); i++) {
                            System.out.println(bd.getUsuarios().toString());

                            }

                }catch(Exception ex){
                            JOptionPane.showMessageDialog(vistaCrearCliente, "Error verifique los datos ingresados");
                }
                
            }
            
        });
        

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
