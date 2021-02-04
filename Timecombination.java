import java.util.Arrays;
import java.util.HashMap;

public class Timecombination {
	   
	    public static void main(String args[]) 
	    {
	    	 int arr[] = { 9,1,9,7}; 
	    	 System.out.println(getMaxTime(arr)); 	         
	       
	    }
	    
	    static HashMap<Integer, Integer> getFrequencyMap(int arr[]) 
	    { 
	        HashMap<Integer, Integer> hashMap = new HashMap<>(); 
	        for (int i = 0; i < arr.length; i++) { 
	            if (hashMap.containsKey(arr[i])) { 
	                hashMap.put(arr[i], hashMap.get(arr[i]) + 1); 
	            } 
	            else { 
	                hashMap.put(arr[i], 1); 
	            } 
	        } 
	        return hashMap; 
	    }
	    
	    static boolean hasDigit(HashMap<Integer, Integer> hashMap, int digit) 
	    { 
	  
	        // If map contains the digit 
	        if (hashMap.containsKey(digit) && hashMap.get(digit) > 0) { 
	  
	            // Decrement the frequency of the digit by 1 
	            hashMap.put(digit, hashMap.get(digit) - 1); 
	  
	            // True here indicates that the digit was found in the map 
	            return true; 
	        } 
	  
	        // Digit not found 
	        return false; 
	    } 
	    
	    static String getMaxTime(int arr[]) 
	    { 
	        HashMap<Integer, Integer> hashMap = getFrequencyMap(arr); 
	        String time = ""; 
	        for(int i=2;i>=0;i--)
	        {
	        	if(hasDigit(hashMap,i)) {
	        		time+=i;
	        		break;	        		
	        	}
	        }
	        for(int i=3;i>=0;i--)
	        {
	        	if(hasDigit(hashMap,i)) {
	        		time+=i;
	        		break;	        		
	        	}
	        }
	        for(int i=5;i>=0;i--)
	        {
	        	if(hasDigit(hashMap,i)) {
	        		time+=":"+i;
	        		break;	        		
	        	}
	        }
	        for(int i=9;i>=0;i--)
	        {
	        	if(hasDigit(hashMap,i)) {
	        		time+=i;
	        		break;	        		
	        	}
	        }
	        if(time.length()<=4)
	        {
	        	return "wrong";
	        }
	        return time; 
	    } 
	  
	    
	   
	    } 
	  
	