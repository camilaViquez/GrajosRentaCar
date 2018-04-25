/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leonardo
 */
public class Alquiler {
    private String idAuto;
    private String idCliente;

    public Alquiler() {

    }

    public String getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(String idAuto) {
        this.idAuto = idAuto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Alquiler(String idAuto, String idCliente) {
        this.idAuto = idAuto;
        this.idCliente = idCliente;
    }
    
    
    
}
