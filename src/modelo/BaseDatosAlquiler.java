/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class BaseDatosAlquiler {
    private ArrayList<Alquiler> alquileres = new ArrayList();
    private static BaseDatosAlquiler dbalquiler;
    
    public static BaseDatosAlquiler getSingletonInstance(Alquiler alq) {
         if(dbalquiler == null){
            dbalquiler = new BaseDatosAlquiler(alq);
            
        }else{
            dbalquiler.alquileres.add(alq);
        }
        return dbalquiler;
        
    }
    
    //Contructor privado

    private BaseDatosAlquiler(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }
    


    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public static BaseDatosAlquiler getDbalquiler() {
        return dbalquiler;
    }

    public static void setDbalquiler(BaseDatosAlquiler dbalquiler) {
        BaseDatosAlquiler.dbalquiler = dbalquiler;
    }
    
    
    
}
