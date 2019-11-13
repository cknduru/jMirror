/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jmirror;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tux
 */
public class NetworkBase extends Thread
{
    ServerSocket server;
    
    public void startServer(Integer port)
    {
        try 
        {
            System.out.println("-> launching on port ");
            server = new ServerSocket(port);
        } catch (IOException ex)
        {
            Logger.getLogger(NetworkBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void run() 
    { 
        // dummy
    } 
} 
