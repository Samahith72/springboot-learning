package com.example.SecurityConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component 
@ConfigurationProperties (prefix = "session")
public class SessionProperties {

    private int timeoutMinutes;
    private int concurrentSessions;
    private boolean secureCookie;
    public int getTimeoutMinutes() {
        return timeoutMinutes;
    }
    public int getConcurrentSessions() {
        return concurrentSessions;
    }
    public boolean isSecureCookie() {
        return secureCookie;
    }
    public void setTimeoutMinutes(int timeoutMinutes) {
        this.timeoutMinutes = timeoutMinutes;
    }
    public void setConcurrentSessions(int concurrentSessions) {
        this.concurrentSessions = concurrentSessions;
    }
    public void setSecureCookie(boolean secureCookie) {
        this.secureCookie = secureCookie;
    }
    
    

    

}
