/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mvoctavianojr
 */
public class UnorderedSearching {

    public static void main(String[] args) {
        hashMap();
    }

    /**
    1. Hashtable is synchronized, whereas HashMap is not. 
        This makes HashMap better for non-threaded applications, 
        as unsynchronized Objects typically perform better than synchronized ones.
    
    2. Hashtable does not allow null keys or values.  
    HashMap allows one null key and any number of null values.*
     */
    public static void hashTable() {

        // Create a hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Zara", new Double(3434.34));
        balance.put("Mahnaz", new Double(123.22));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", new Double(-19.08));

        // Show all balances in hash table.
        names = balance.keys();

        while (names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Deposit 1,000 into Zara's account
        bal = ((Double) balance.get("Zara")).doubleValue();
        balance.put("Zara", new Double(bal + 1000));
        System.out.println("Zara's new balance: " + balance.get("Zara"));
    }

    /**
     * *no guarantees as to the order of the map. It is similar to the
     * Hashtable class except that it is unsynchronized and permits nulls(null
     * values and null key).
     */
    public static void hashMap() {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        /* Display content using Iterator*/
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        /* Get values based on key*/
        String var = hmap.get(2);
        System.out.println("Value at index 2 is: " + var);

        /* Remove values based on key*/
        hmap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry) iterator2.next();
            System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

    }


    /*
    * NOTE: You could simplify and say that a HashTable is the underlying data structure 
       and the HashMap may be utilizing a HashTable.
     */
}
