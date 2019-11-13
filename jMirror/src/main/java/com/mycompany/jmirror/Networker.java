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
    public static void launchService(ServiceType service, boolean isChecked)
    {
        if(service == ServiceType.UNKNOWN)
        {
            System.out.println("Bad service %s".format(service+""));
        }
        else if(service == ServiceType.SMTP && isChecked)
        {
            //SMTP
            System.out.print(Const.LAUNCH_SERVICE_MSG);
            System.out.println(service.name());
            ServiceSMTP s = new ServiceSMTP();
            s.start();
        } else if(service == ServiceType.FTP && isChecked)
        {
            //FTP
            System.out.print(Const.LAUNCH_SERVICE_MSG);
            System.out.println(service.name());
            ServiceFTP s = new ServiceFTP();
            s.start();
        }
    }   
}
