package com.example.fundmanagement.positions;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "positions")
public class Positions {
    @Id
    private Integer position_id;

    //@ManyToOne()
    private String security_name;
    private Integer quantity;
    private LocalDate date_purchased;
    private Integer funds_fund_id;
    private Integer funds_fund_manager_employee_id;
    private Integer securities_security_id;

    public Positions() {
    }

    public Positions(Integer position_id, String security_name, Integer quantity, LocalDate date_purchased, Integer funds_fund_id,Integer funds_fund_manager_employee_id,Integer securities_security_id) {
        this.position_id = position_id;
        this.security_name = security_name;
        this.quantity = quantity;
        this.date_purchased = date_purchased;
        this.funds_fund_id = funds_fund_id;
        this.funds_fund_manager_employee_id = funds_fund_manager_employee_id;
        this.securities_security_id = securities_security_id;
    }

    public Integer getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Integer positionId) {
        this.position_id = positionId;
    }

    public String getSecurity_name() {
        return security_name;
    }

    public void setSecurity_name(String securityName) {
        this.security_name = securityName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate_purchased() {
        return date_purchased;
    }

    public void setDate_purchased(LocalDate datePurchased) {
        this.date_purchased = datePurchased;
    }

    public Integer getFunds_fund_id() {
        return funds_fund_id;
    }

    public void setFunds_fund_id(Integer fundId) {
        this.funds_fund_id = fundId;
    }

    public Integer getFunds_fund_manager_employee_id() {
        return funds_fund_manager_employee_id;
    }

    public void setFunds_fund_manager_employee_id(Integer funds_fund_manager_employee_id) {
        this.funds_fund_manager_employee_id = funds_fund_manager_employee_id;
    }

    public Integer getSecurities_security_id() {
        return securities_security_id;
    }

    public void setSecurities_security_id(Integer securities_security_id) {
        this.securities_security_id = securities_security_id;
    }

    @Override
    public String toString() {
        return "Positions{" +
                "position_id=" + position_id +
                ", security_name='" + security_name + '\'' +
                ", quantity=" + quantity +
                ", date_purchased=" + date_purchased +
                ", funds_fund_id=" + funds_fund_id +
                ", funds_fund_manager_employee_id=" + funds_fund_manager_employee_id +
                ", securities_security_id=" + securities_security_id +
                '}';
    }
}
