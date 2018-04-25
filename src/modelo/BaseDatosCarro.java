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
public class BaseDatosCarro {
    private ArrayList<Automovil> autos = new ArrayList();
    private static BaseDatosCarro dbcarro;
    
    //Contructor privado

    private BaseDatosCarro(Automovil auto) {
        this.autos.add(auto);
    }
    
    public static BaseDatosCarro getSingletonInstance(Automovil auto){
        if(dbcarro == null){
            dbcarro = new BaseDatosCarro(auto);
            
        }else{
            dbcarro.autos.add(auto);
        }
        return dbcarro;
        
    }

    public ArrayList<Automovil> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Automovil> autos) {
        this.autos = autos;
    }

    public static BaseDatosCarro getDbcarro() {
        return dbcarro;
    }

    public static void setDbcarro(BaseDatosCarro dbcarro) {
        BaseDatosCarro.dbcarro = dbcarro;
    }
   public String toString() {
        return "BaseDatosUsuarios{" + "usuarios=" + autos + '}';
    }


}
