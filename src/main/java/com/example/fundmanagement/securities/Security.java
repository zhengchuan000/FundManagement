package com.example.fundmanagement.securities;

import javax.persistence.*;

@Entity
@Table
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scr_id;

    private String description;

    //constructors
    public Security(Integer scr_id, String description) {
        this.scr_id = scr_id;
        this.description = description;
    }
    public Security(){}

    //setters and getters
    public void setId(int id) {
        this.scr_id = id;
    }

    public Integer get_id() {
        return scr_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Security{" +
                "scr_id=" + scr_id +
                ", description='" + description + '\'' +
                '}';
    }
}
