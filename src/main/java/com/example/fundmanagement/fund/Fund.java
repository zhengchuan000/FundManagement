package com.example.fundmanagement.fund;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funds")
public class Fund {
    @Id
    private Integer fund_id;

    private String name;

    private Integer fund_manager_employee_id;

    public Fund() {
    }

    public Fund(String name, Integer fund_manager_employee_id) {
        this.name = name;
        this.fund_manager_employee_id = fund_manager_employee_id;
    }

    public Integer getFund_id() {
        return fund_id;
    }

    public void setFund_id(Integer fund_id) {
        this.fund_id = fund_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFund_manager_employee_id() {
        return fund_manager_employee_id;
    }

    public void setFund_manager_employee_id(Integer fund_manager_employee_id) {
        this.fund_manager_employee_id = fund_manager_employee_id;
    }
}
