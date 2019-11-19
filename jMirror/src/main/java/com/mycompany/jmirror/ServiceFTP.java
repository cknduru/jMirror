/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jmirror;

import java.io.PrintWriter;

/**
 *
 * @author tux
 */
class ServiceFTP extends NetworkBase
{ 
    public void run() 
    { 
        try
        {
            Main.m.updateConsole("FTP service thread running");
            startServer(Const.PORT_FTP);
            PrintWriter out = new PrintWriter(super.out.getOutputStream(), true);
            out.write(Const.FTP_HOMER);
            Main.m.updateConsole("Sent FTP spoof to " + super.out.getInetAddress() + "");
            out.close();
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 