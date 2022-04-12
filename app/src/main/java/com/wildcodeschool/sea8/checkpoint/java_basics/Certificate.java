package com.wildcodeschool.sea8.checkpoint.java_basics;

import java.time.LocalDate;

public class Certificate implements IExpireable {

    // Date to when this certificate is valid
    private LocalDate validTo;
    // Subject of the certificate and issuer of the certificate
    private String subject, issuer;

    public Certificate(String subject, String issuer, LocalDate validTo) {
        this.subject = subject;
        this.issuer = issuer;
        this.validTo = validTo;
    }

    public Certificate(String subject, String issuer, long validityPeriodInDays) {
        this.subject = subject;
        this.issuer = issuer;
        this.validTo = LocalDate.now().plusDays(validityPeriodInDays);
    }

    public void renew(long daysValidFromNow) {
        // TODO: renew certificate

// vom Test herleiten:
        // assertFalse(testCertificate.isExpired(), String.format("%s should have been renewed for 30 days from now.", testCertificate.toString()));
        // assertEquals(LocalDate.now().plusDays(30), testCertificate.expiryDate(), "Expiry date does not match expected date.");


    }

    @Override
    public boolean isExpired() {
        // TODO: Provide the neccessary check here
        



        return false;
    }

    @Override
    public LocalDate expiryDate() {
        // TODO: Return the expiration date
        return null;
    }

    @Override
    public String toString() {
        return String.format("Certificate [Subject: \"%s\", Issuer: \"%s\", Valid Until: \"%s\"]", subject, issuer, validTo.toString());
    }
    
}
