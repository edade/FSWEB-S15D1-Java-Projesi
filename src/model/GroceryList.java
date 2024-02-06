package model;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {
    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }
    public void addItems(String items){
        String[] splitItems = splitItems(items);
        for(String item : splitItems){
            String trimmedItem = item.trim();
            if(checkItemIsInList(trimmedItem)){
                System.out.println("eleman zaten listede var");
            }else{
                this.items.add(trimmedItem);
                sortItems();
            }

        }
    }
    public  void removeItems(String items){
        String[] splitItems = splitItems(items);
        for(String item : splitItems){
            String trimmedItem = item.trim();
            if(!checkItemIsInList(trimmedItem)){
                System.out.println("eleman listede zaten yok");
            }else{
                this.items.remove(trimmedItem);
                sortItems();
            }
        }
    }


    private void sortItems() {
        Collections.sort(items);
    }

    private boolean checkItemIsInList(String trimmedItem) {
    return items.contains(trimmedItem);
    }

    private String[] splitItems(String items) {
        return items.split(",");
    }

    public void printSorted(){
        System.out.println("Grocery List: ");
        this.items.forEach(item -> System.out.println(item));
    }
}

