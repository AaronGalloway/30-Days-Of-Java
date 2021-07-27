import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
    
    public static void main(String[] args) {
        //English to Spanish dictionary
        Map<String,String> englSpanDictionary = new HashMap<String,String>();
        //Putting things inside of the dictionary
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
        //Retrieve things from the dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        //Print out all keys
        System.out.println(englSpanDictionary.keySet());
        // Print out all values
        System.out.println(englSpanDictionary.values());
        //Print out the size of the dictionary
        System.out.println(englSpanDictionary.size());

        System.out.println();
        System.out.println();

        //Shopping List
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        //Putting things inside of the dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Sprite", false);
        shoppingList.put("Eggs", Boolean.FALSE);
        //Retrieve Items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sprite"));
        //Remove Items
        shoppingList.remove("Eggs");
        //Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());
        //Replace Values
        shoppingList.replace("Bread", true, false);
        //Clear Dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
    }
}
