/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.conexion;


import java.sql.Connection;


public interface GenericConnectionInterface {

    
    public Connection newConnection() ;        

    
    public void disposeConnection();
    
}
    