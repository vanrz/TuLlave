/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tullave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class Controlador implements ActionListener{
    Vista miVista;
    Modelo miModelo;
    Controlador(Vista miVista,Modelo miModelo ){
        this.miVista=miVista;
        this.miModelo=miModelo;
    }
            
            
            
            
    @Override
    public void actionPerformed(ActionEvent ae) {
        Modelo.saldo((int)(Math.random()*5000));
        
            
    }
    
    
}
