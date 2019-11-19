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
public class Const
{
    /* strings */
    public static final String INIT_MSG = "-> jMirror launched\n";
    public static final String LAUNCH_SERVICE_MSG = "-> deploying mirror for service";
    
    /* service strings */
    public static final String FTP_HOMER = "220 Homer Ftp Server\r\n";
    public static final String SMTP_MS = "+OK Microsoft Exchange Server 2007 POP3 service ready\r\n";
    
    /* ports */
    public static final Integer PORT_FTP = 2000;
    public static final Integer PORT_SMTP = 2001;
}
