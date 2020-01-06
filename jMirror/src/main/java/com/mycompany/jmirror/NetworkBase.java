/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jmirror;

import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tux
 */
public class NetworkBase extends Thread
{
    Socket out;
    
    public void startServer(ServiceType service, Integer port) throws Exception, BindException
    {
        try 
        {
            String running_msg = String.format("Running %s service on port %d", service.name(), port);
            Main.updateConsole(running_msg);
            out = new ServerSocket(port).accept();
        } catch (BindException ex)
        {
            // report exception in UI and throw it to alert service which has
            // inherited from us
            Main.updateConsole(String.format("Address %s is already in use", port));
            throw new BindException();
        } catch (Exception ex)
        {
            Logger.getLogger(NetworkBase.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception();
        }
    }
  
    public void run() 
    { 
        // dummy
    } 
} 
