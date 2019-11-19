/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jmirror;

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
            System.out.println("SMTP service thread running");
            startServer(Const.PORT_SMTP);
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 