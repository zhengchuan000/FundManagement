package com.example.fundmanagement.securities;

import javax.persistence.*;

@Entity
@Table(name="securities")
public class Security {

    @Id
    private Integer security_id;

    private String symbol;

    //constructors
    public Security(Integer security_id, String symbol) {
        this.security_id = security_id;
        this.symbol = symbol;
    }
    public Security(){}

    public Integer getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(Integer security_id) {
        this.security_id = security_id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Security{" +
                "security_id=" + security_id +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
