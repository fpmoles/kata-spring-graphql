package com.frankmoley.kata.firearmsgraphhql.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MODELS")
public class Model {
    @Id
    @Column(name="SKU")
    private String sku;
    @ManyToOne
    @JoinColumn(name="MANUFACTURER_ID", nullable = false, updatable = false)
    private Manufacturer manufacturer;
    @Column(name="FAMILY")
    private String family;
    @Column(name="MODEL")
    private String model;
    @Column(name="CATEGORY")
    private String category;
    @Column(name="CALIBER")
    private String caliber;
    @Column(name="CAPACITY")
    private int capacity;
    @Column(name="BARREL_LENGTH")
    private int barrelLength;
    @Column(name="EXTERNAL_SAFETY")
    private boolean externalSafety;
    @Column(name="OPTICS_READY")
    private boolean opticsReady;
    @Column(name="SIGHTS")
    private String sights;
    @Column(name="COLOR")
    private String color;

    public String getSku() {
        return sku;
    }

    public void setSku(String id) {
        this.sku = id;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCaliber() {
        return caliber;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBarrelLength() {
        return barrelLength;
    }

    public void setBarrelLength(int barrelLength) {
        this.barrelLength = barrelLength;
    }

    public boolean isExternalSafety() {
        return externalSafety;
    }

    public void setExternalSafety(boolean externalSafety) {
        this.externalSafety = externalSafety;
    }

    public boolean isOpticsReady() {
        return opticsReady;
    }

    public void setOpticsReady(boolean opticsReady) {
        this.opticsReady = opticsReady;
    }

    public String getSights() {
        return sights;
    }

    public void setSights(String sights) {
        this.sights = sights;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
