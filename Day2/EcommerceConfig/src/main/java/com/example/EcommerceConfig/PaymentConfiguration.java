package com.example.EcommerceConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component 
@ConfigurationProperties (prefix = "payment")
public class PaymentConfiguration {

    private String currency;
    private String gateway;
    private int maxRetries;
    private boolean isEnabled;
    
    
    public String getCurrency() {
        return currency;
    }
    public String getGateway() {
        return gateway;
    }
    public int getMaxRetries() {
        return maxRetries;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }
    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }
    public boolean isEnabled() {
        return isEnabled;
    }
    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }
    

    

}
