package com.takeo;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i=0; i<groceryList.size(); i++) {
            System.out.println( (i+1) + ". " + groceryList.get(i));
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findGroceryItem(currentItem);
        if (position >=0) {
            modifyGroceryList(position, newItem);
        }
    }

    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findGroceryItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public int findGroceryItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if (position < 0) {
            return -1;
        }
        return position;
    }
}

