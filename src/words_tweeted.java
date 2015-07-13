import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeMap;


public class words_tweeted {
	public static void main(String[] args) throws IOException{
	//get input file directory and output file directory
	String input = args[0];
	String output = args[1];
		
	//read file by line with BufferdReader
	File fileIn = new File(input);
        BufferedReader reader = new BufferedReader(new FileReader(fileIn));
        String tweet = null;
        
        //build up a TreeMap to store the words and number of times the word has been tweeted
        TreeMap<String, Integer> data = new TreeMap<String, Integer>();
        
        while ((tweet = reader.readLine()) != null) {
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
    	}
        reader.close();
		
        //write words and number of times the word has been tweeted 
    	File fileOut = new File(output);
    	FileWriter fw = new FileWriter(fileOut.getAbsoluteFile());
    	BufferedWriter bw = new BufferedWriter(fw);
    	
        Iterator<String> it = data.keySet().iterator();      
        while(it.hasNext()){
        	String key = it.next();	
            String content = key;
            for(int i=0; i<35-key.length(); i++){
            	content += " ";	
            }
            content += data.get(key)+"\n";
            bw.write(content);	   
		}
        bw.close();
        return;
	}
}


