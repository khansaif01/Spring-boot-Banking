package com.example.saif.utils;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class CreateAccountInput {

    @NotBlank(message = "Bank name is mandatory")
    private String bankName;

    @NotBlank(message = "Owner name is mandatory")
    private String ownerName;

    @NotBlank(message = "Currency is mandatory")
    private String currency;
    
    public CreateAccountInput() {}

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "CreateAccountInput{" +
                "bankName='" + bankName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                 ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateAccountInput that = (CreateAccountInput) o;
        return Objects.equals(bankName, that.bankName) &&
                Objects.equals(ownerName, that.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, ownerName);
    }
}
