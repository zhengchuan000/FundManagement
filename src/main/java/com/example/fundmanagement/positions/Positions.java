package com.example.fundmanagement.positions;


import com.example.fundmanagement.securities.Security;
import com.fasterxml.jackson.annotation.JsonIdentityReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "positions")
public class Positions {
    @Id
    private Integer position_id;
    private Integer quantity;
    private LocalDate date_purchased;
    private Integer funds_fund_id;
    private Integer funds_fund_manager_employee_id;

    @ManyToOne(optional = false,cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name="securities_security_id",insertable=false ,updatable=false)
    @JsonIdentityReference(alwaysAsId = true)
    private Security securityInPosition;

    public Positions() {
    }


    public Positions(Integer position_id, Security securityInPosition, Integer quantity, LocalDate date_purchased, Integer funds_fund_id, Integer funds_fund_manager_employee_id) {
        this.position_id = position_id;
        this.quantity = quantity;
        this.date_purchased = date_purchased;
        this.funds_fund_id = funds_fund_id;
        this.funds_fund_manager_employee_id = funds_fund_manager_employee_id;
        this.securityInPosition = securityInPosition;
    }


    public Integer getPosition_id() {
        return position_id;
    }

    public void setPosition_id(Integer position_id) {
        this.position_id = position_id;
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

    public void setDate_purchased(LocalDate date_purchased) {
        this.date_purchased = date_purchased;
    }

    public Integer getFunds_fund_id() {
        return funds_fund_id;
    }

    public void setFunds_fund_id(Integer funds_fund_id) {
        this.funds_fund_id = funds_fund_id;
    }

    public Integer getFunds_fund_manager_employee_id() {
        return funds_fund_manager_employee_id;
    }

    public void setFunds_fund_manager_employee_id(Integer funds_fund_manager_employee_id) {
        this.funds_fund_manager_employee_id = funds_fund_manager_employee_id;
    }

    public Security getSecurityInPosition() {
        return securityInPosition;
    }

    public void setSecurityInPosition(Security securityInPosition) {
        this.securityInPosition = securityInPosition;
    }

    @Override
    public String toString() {
        return "Positions{" +
                "position_id=" + position_id +
                ", quantity=" + quantity +
                ", date_purchased=" + date_purchased +
                ", funds_fund_id=" + funds_fund_id +
                ", funds_fund_manager_employee_id=" + funds_fund_manager_employee_id +
                ", securityInPosition=" + securityInPosition +
                '}';
    }
}
