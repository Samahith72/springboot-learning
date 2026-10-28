package com.example.SecurityConfig;

import com.example.SecurityConfig.SecurityConfigApplication;
import org.springframework.stereotype.Component;

@Component 
public class SecurityManager {
    private final SessionProperties sessionProperties;
    private final SecurityProperties securityProperties;

    public SecurityManager(SessionProperties sessionProperties, SecurityProperties securityProperties){
        this.sessionProperties = sessionProperties;
        this.securityProperties = securityProperties;
    }

    public void displaySecurityReport(){
        System.out.println("========== SECURITY CONFIGURATION========");
        System.out.println("Application: "+ securityProperties.getAppName());
        System.out.println("Maximum Login Attempts: "+ securityProperties.getMaxLoginAttempts());
        System.out.println("MFA Enabled: "+securityProperties.isMfaEnabled());
        System.out.println("Minimum Password Length: "+ securityProperties.getPasswordMinLength());
        System.out.println();
        System.out.println();
        System.out.println("========== SESSION CONFIGURATION========");
        System.out.println("Session Timeout: "+ sessionProperties.getTimeoutMinutes());
        System.out.println("Concurrent Sessions: "+sessionProperties.getConcurrentSessions());
        System.out.println("Secure Cookie: "+ sessionProperties.isSecureCookie());
        System.out.println();
        System.out.println();
    }

    public void validateConfiguration(){
        System.out.println("============= SECURITY VALIDATION==============");
        if(securityProperties.isMfaEnabled()){
            System.out.println("MFA Status: Enabled");
        }
        if(securityProperties.getMaxLoginAttempts() > 0 && securityProperties.getPasswordMinLength() > 11){
            System.out.println("Authentication Policy: Acceptable");
        }else{
            System.out.println("Authentication Policy: Needs Review");
        }

        if(sessionProperties.getTimeoutMinutes() <= 30){
            System.out.println("Session Policy:  Acceptable");
        }else{
            System.out.println("Session Policy : Needs Review");
        }
        if(sessionProperties.isSecureCookie()){
            System.out.println("Cookie Security: Enabled");
        }
    }


}
