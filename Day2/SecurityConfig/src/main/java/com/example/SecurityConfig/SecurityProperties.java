package com.example.SecurityConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component 
@ConfigurationProperties (prefix = "security")
public class SecurityProperties {

    private String appName;
    private int maxLoginAttempts;
    private boolean mfaEnabled;
    private int passwordMinLength;
    public String getAppName() {
        return appName;
    }
    public int getMaxLoginAttempts() {
        return maxLoginAttempts;
    }
    public boolean isMfaEnabled() {
        return mfaEnabled;
    }
    public int getPasswordMinLength() {
        return passwordMinLength;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public void setMaxLoginAttempts(int maxLoginAttempts) {
        this.maxLoginAttempts = maxLoginAttempts;
    }
    public void setMfaEnabled(boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
    }
    public void setPasswordMinLength(int passwordMinLength) {
        this.passwordMinLength = passwordMinLength;
    }
    
    

    
}
