import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;


public class median_unique {

	public static void main(String[] args) throws IOException {
		//get input file directory and output file directory
		String input = args[0];
		String output = args[1];
		//String input = "/Users/CaoChengxin/Documents/tweet_input/tweets.txt";
		//String output = "/Users/CaoChengxin/Documents/tweet_output/ft2.txt";
		//read file by line with BufferdReader		
		File fileIn = new File(input);
		BufferedReader reader = new BufferedReader(new FileReader(fileIn));
	    String tweet = null;
	    
	    ArrayList<Integer> uniqueWordsNum = new ArrayList<Integer>();
		ArrayList<Double> medianUnique = new ArrayList<Double>();
	            
	    while ((tweet = reader.readLine()) != null) {
	    	TreeMap<String, Integer> data = new TreeMap<String, Integer>();         
	    	String reg = " +";
        	String[] arr = tweet.split(reg);
        	
        	for(int i=0; i<arr.length; i++){
        		if(data.containsKey(arr[i])){
					data.put(arr[i], data.get(arr[i])+1);
				}
				else{
					data.put(arr[i], 1);
				}
        	}

	        //count the number of unique words in each tweet
	        int count = 0;
	        Iterator<String> it = data.keySet().iterator();      
	        while(it.hasNext()){
	        	String key = it.next();
	        	count++;
	        }
	        uniqueWordsNum.add(count);
	        //calculate the median of unique words
	        double sum = 0;
	        for(int i=0; i<uniqueWordsNum.size(); i++){
	        	sum += uniqueWordsNum.get(i);
	        }
	        double median = sum/uniqueWordsNum.size();
	        medianUnique.add(median);
	           		        		        
	    }
	    reader.close();
		
	    //write the median of unique words into output file
    	File fileOut = new File(output);
    	FileWriter fw = new FileWriter(fileOut.getAbsoluteFile());
    	BufferedWriter bw = new BufferedWriter(fw);    	
        for(int i=0; i<medianUnique.size(); i++){	
            String content = medianUnique.get(i).toString() + '\n';
            bw.write(content);	   
		}
        bw.close();
        return;
	}
}

