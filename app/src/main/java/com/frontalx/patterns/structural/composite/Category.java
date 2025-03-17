package com.frontalx.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Category implements CatalogComponent {

    private String name;
    private List<CatalogComponent> components = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void add(CatalogComponent component) {
        components.add(component);
    }

    public void remove(CatalogComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Category: " + name);
        for (CatalogComponent component : components) {
            component.showDetails();
        }
    }
}
