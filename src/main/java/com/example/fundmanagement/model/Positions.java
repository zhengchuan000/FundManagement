package com.example.fundmanagement.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer positionsId;

    //@ManyToOne()
    private String securityName;
    private Integer quantity;
    private LocalDate datePurchased;
    private Integer fundId;

    public Positions() {
    }

    public Positions(Integer positionsId, String securityName, Integer quantity, LocalDate datePurchased, Integer fundId) {
        this.positionsId = positionsId;
        this.securityName = securityName;
        this.quantity = quantity;
        this.datePurchased = datePurchased;
        this.fundId = fundId;
    }

    public Integer getPositionsId() {
        return positionsId;
    }

    public void setPositionsId(Integer positionId) {
        this.positionsId = positionId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(LocalDate datePurchased) {
        this.datePurchased = datePurchased;
    }

    public Integer getFundId() {
        return fundId;
    }

    public void setFundId(Integer fundId) {
        this.fundId = fundId;
    }

    @Override
    public String toString() {
        return "Positions{" +
                "positionId=" + positionsId +
                ", securityName='" + securityName + '\'' +
                ", quantity=" + quantity +
                ", datePurchased=" + datePurchased +
                ", fundId=" + fundId +
                '}';
    }
}
