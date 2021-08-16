package com.example.fundmanagement.securities;

import com.example.fundmanagement.positions.Positions;
import com.fasterxml.jackson.annotation.JsonIdentityReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="securities")
public class Security {

    @Id
    private Integer security_id;

    private String symbol;

    @OneToMany(mappedBy = "securityInPosition",cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JsonIdentityReference(alwaysAsId = true)
    private List<Positions> positions;

    //constructors
    public Security(Integer security_id, String symbol,List<Positions> positions) {
        this.security_id = security_id;
        this.symbol = symbol;
        this.positions = positions;
    }

    public List<Positions> getPositions() {
        return positions;
    }

    public void setPositions(List<Positions> positions) {
        this.positions = positions;
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
