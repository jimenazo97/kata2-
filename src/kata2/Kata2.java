/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;
import java.util.*;
/**
 *
 * @author andresjimenez
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] data = {1,1,1,0,1,2,1,0,3};
        Map<Integer, Integer> myMap = new HashMap<>();
          
        for (int i = 0; i < data.length; i++) {
            if(myMap.containsKey(data[i])){
                myMap.put(data[i], myMap.get(data[i]) + 1);
            } else {
                 myMap.put(data[i], 1);
            }
            for (int key : data) {
             myMap.put(key, myMap.containsKey(key) ?
             myMap.get(key) + 1 : 1);
            }
        
        
            for (int key : myMap.keySet()){
              System.out.println(key + " ==> " + myMap.get(key) + " veces");
            }
        }  
    } 
    
    
}
