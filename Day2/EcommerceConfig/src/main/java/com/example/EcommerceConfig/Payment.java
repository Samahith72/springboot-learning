package com.example.EcommerceConfig;

import org.springframework.stereotype.Component;

@Component 
public class Payment {

    private final PaymentConfiguration paymentConfiguration;

    public Payment(PaymentConfiguration paymentConfiguration){
        this.paymentConfiguration = paymentConfiguration;
    }

    public void displayPayment(){
        System.out.println("=========Payment Details========");
        System.out.println("Currency: "+ paymentConfiguration.getCurrency());
        System.out.println("Payment Gateway: "+ paymentConfiguration.getGateway());
        System.out.println("Maximum Payment Retries: "+ paymentConfiguration.getMaxRetries());
        System.out.println("Payment Enabled: " +paymentConfiguration.isEnabled());
    }

}
