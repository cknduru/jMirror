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
public class Networker 
{
    public static void launchService(ServiceType service)
    {
        if(service == ServiceType.UNKNOWN)
        {
            Main.updateConsole("bad service %s".format(service+""));
            return;
        }        
        else if(service == ServiceType.SMTP)
        {
            //SMTP
            ServiceSMTP s = new ServiceSMTP();
            s.start();
        } else if(service == ServiceType.FTP)
        {
            //FTP
            ServiceFTP s = new ServiceFTP();
            s.start();
        }
        
    }   
}
