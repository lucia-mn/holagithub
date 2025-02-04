package Ejemplos;

import java.util.ArrayList;

public class ProductList {

    private ArrayList<String> productosList = new ArrayList<String>();

    public void addProduct(String item) {
        productosList.add(item);
    }

    public void printProductList() {
        System.out.println("Tenemos "  + productosList.size() + " elementos en el arrayList");
        for(int i = 0; i < productosList.size(); i++) {
            System.out.println(productosList.get(i));
        }
    }

    public void modifyProductItem(int index, String newItem) {
        productosList.set(index, newItem);
    }

    public void removeProductItem(int index) {
        String item = productosList.get(index);
        productosList.remove(item);
    }

    public boolean existsItem(String searchItem) {
        return productosList.contains(searchItem);
    }

    public String findItem(String searchItem) {
        int index = productosList.indexOf(searchItem);
        if (index >= 0) {
            return productosList.get(index);
        }
        return null;
    }
}
