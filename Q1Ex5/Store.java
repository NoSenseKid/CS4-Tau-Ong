package q1ex5;
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
   
    this.name = name;
    this.earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    int size = itemList.size();
    if (index < size){
       Item i = itemList.get(index);
       double cost = i.getCost();
       earnings += cost;
       System.out.printf("Profit made: %f \n", cost);
    }
    else{
       System.out.printf("there are only %d items in the store \n", size);
    }

  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    
    boolean found = false;
    for (int j=0; j < itemList.size(); j++){
        Item i = itemList.get(j);
        String searchName = i.getName();
        double cost = i.getCost();
        
        if (searchName.equals(name)){
            earnings += cost;
            System.out.printf("Profit made: %f \n", cost);
            found = true;
            break;
        }  
    }
    if (!found){
        System.out.println("The store doesn't sell what you are looking for.");            
    }
    
    
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if (itemList.contains(i)){
        double cost = i.getCost();
        earnings += cost;
    }
    else{
        System.out.println("The store doesn't sell what you are looking for.");            
    }
    
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
    
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.println("Type: ");
    for (int j=0; j < itemList.size(); j++){
        Item i = itemList.get(j);
        String t = i.getType();
        if (t.equals(type)){
            System.out.println(i.getName());
            
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.println("Cheap: ");
    for (int j=0; j < itemList.size(); j++){
        Item i = itemList.get(j);
        double c = i.getCost();
        if (c <= maxCost){
            System.out.println(i.getName());
        }
    }
   
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.println("Expensive: ");
    for (int j=0; j < itemList.size(); j++){
        Item i = itemList.get(j);
        double c = i.getCost();
        if (c >= minCost){
            System.out.println(i.getName());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (int j=0; j < storeList.size(); j++){
        Store s = storeList.get(j);
        
        String name = s.getName();
        System.out.println(name);
        
        double profit = s.getEarnings();  
        System.out.println(profit);
    }
}

}
