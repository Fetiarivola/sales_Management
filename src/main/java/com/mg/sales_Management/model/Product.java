package com.mg.sales_Management.model;

public class Product {
    private Long id;
    private String designation;
    private double prixUnitaire;

    public Product(int id, String designation, double prixUnitaire) {
        this.id = (long) id;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
    }

    public String getDesignation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDesignation'");
    }

    public Long getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public double getPrixUnitaire() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrixUnitaire'");
    }

    public static Object stream() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stream'");
    }

}
