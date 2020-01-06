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
class ServiceSMTP extends NetworkBase
{ 
    public void run() 
    { 
        try
        {
            startServer(ServiceType.SMTP, Const.PORT_SMTP);
            PrintWriter out = new PrintWriter(super.out.getOutputStream(), true);
            out.write(Const.SMTP_STRING_MS_EXCHANGE);
            Main.updateConsole("Sent SMTP spoof to " + super.out.getInetAddress() + "");
            out.close();
        } 
        catch (Exception e) 
        { 
            // Throwing an exception
            System.out.println ("Exception is caught"); 
        } 
    } 
} 