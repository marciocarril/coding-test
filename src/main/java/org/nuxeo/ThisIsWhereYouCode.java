package org.nuxeo;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;


/**
 * This is where you have to code.
 * 
 * See javadoc and associated unit tests to understand what is expected
 * 
 * @author tiry
 *
 */
public class ThisIsWhereYouCode {

    /**
     * input will be a string, but it may not have a file extension. return the file
     * extension (with no period) if it has one, otherwise null
     * 
     * @param filename
     * @return null if input is null or filename has no extension and the
     *         extension without the period otherwise
     */
    public String getFileNameExtension(String filename) {
        if(filename==null || filename.lastIndexOf(".")==-1){return null;}
    	String ext = filename.substring(filename.lastIndexOf(".")+1);
        return ext;
    }

    /**
     * return the longest string contained inside the input array
     * 
     * @param array input Array of values
     * @return null if input is null and the longest string otherwise
     */
    public String getLongestString(Object[] array) {
    	String longest = "";
        for (int i=0; i<array.length; i++){
        	if (array[i] instanceof Object[]) {
        		String longstr = getLongestString((Object[]) array[i]);
        		if (longstr != null && longstr.length() > longest.length()){
        			longest = longstr;
        		}
        	} else if (array[i] instanceof String) {
        		if (array[i] != null && ((String)array[i]).length() > longest.length()){
        			longest = (String) array[i];
        		}
        	}
        		
        }
        return longest;
    }

    /**
     * Returns true is both arrays contains the same values
     * 
     * @param array1 first Array to test
     * @param array2 second Array to test
     * @return true if both arrays contains the same values
     */
    public boolean areArraysEquals(String[] array1, String[] array2) {
        if ((array1 == null && array2 != null) || (array1 != null && array2 == null)){
        	return false;
        } else if (array1 == null && array2 == null) {
        	return true;
        } else if (array1.length != array2.length) {
        	return false;
        } else {
        	for (int i=0; i<array1.length; i++){
        		if (!array1[i].equals(array2[i])){
        			return false;
        		}
        	}
        }
        return true;
    }

    /**
     * Compress the input string with a very dummy algorithm : repeated letters
     * are replaced by {n}{letter} where n is the number of repetition and
     * {letter} is the letter. n must be superior to 1 (otherwise, simply output
     * the letter)
     * 
     * @param input the input string that can only contains letters
     * @return the compressed String or null if the input is null
     */
    public String getCompressedString(String input) {
    	//"3a2bc", null, "ab3c"
    	String ret = "";
    	Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
    	for (int i=0; i<input.length(); i++){
    		hash.put(input.substring(i, i), hash.get(input.substring(i, i))+1);
    	}
    	Enumeration e = hash.keys();
    	while(e.hasMoreElements()){
    		Object k = e.nextElement();
    		Integer i = hash.get(k);
    		ret += i.toString()+k;
    	}
        return null;
    }

    /**
     * Sort the input array of string based on lexicographic order of the
     * corresponding compressed string
     * 
     * @param array the Array to sort
     * @return the sorted array
     */
    public String[] getSortedArray(String[] array) {
        // XXX implement me !
        return null;
    }

}
