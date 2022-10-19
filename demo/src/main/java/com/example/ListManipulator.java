package hw4;

/**
 * exercise 1
 * ListManipulator.java
 *  @author vuaivantrinhsjgmail.com
 *This homework’s objective is to review 
 *and understand the unit on Java collections and how to
 *use them in your Java application.
 */
 import java.util.*;

public class ListManipulator {
	

    
	/**Accepts an array list of integers and sorts it
	in ascending or descending order. Make sure
	to account for cases with duplicate values.
	The method returns the sorted list*/
	
     public ArrayList<Integer> sort(ArrayList<Integer> myLst,Boolean ascending){
        if (ascending){
            Collections.sort(myLst); //use collections
        }
        else{
            Collections.sort(myLst,Collections.reverseOrder());
        }
        return myLst;
    }

    /** Accept an array list of integers and swamps
     positions of the largest and the smallest
     elements. If multiple values representing
     largest/smallest elements are present then
     pick the first position. The method returns
     the modified list
     */
    public static  ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst){
		int min = myLst.indexOf(Collections.min(myLst));
		int max = myLst.indexOf(Collections.max(myLst));

    	
        Collections.swap(myLst, min, max);
        return myLst;
        
    }
    /**Accepts an array list of integers, creates a
    table of unique values and the number of
    times each value occurs, sorts this table, and
    outputs it to command line
    */
     void table(ArrayList<Integer> myLst){
        TreeMap <Integer,Integer> treeMap = new TreeMap<Integer, Integer>();

        //Traverse ArrayList and create  structure.
        for (int i = 0; i < myLst.size(); i++){
            if (treeMap.containsKey(myLst.get(i))){
                treeMap.put(myLst.get(i), treeMap.get(myLst.get(i)) +1);
            }
            else{
                treeMap.put(myLst.get(i),1);
            }
        }

        for (Map.Entry<Integer, Integer> e : treeMap.entrySet())
            System.out.println("Element: "+e.getKey()
                + "| occurrs: "+e.getValue() + "Times");
    }
}
