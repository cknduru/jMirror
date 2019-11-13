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
    public static void launchService(ServiceType serviceType)
    {
        if(serviceType == serviceType.SMTP)
        {
            System.out.println("smtp");
        } else if(serviceType == serviceType.FTP)
        {
            System.out.println("ftp");
        }
        else
        {
            System.out.println("unrecognized service type");
        }
    }
    
}
