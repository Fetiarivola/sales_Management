package com.mg.sales_Management.dto;

public class ProductDTO {
    private long id;
    private String designation;
    private double prixUnitaire;

    public ProductDTO(Long id, String designation, double prixUnitaire) {
        this.id = id;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;

    }

}
