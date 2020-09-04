import java.io.*;
   
public class CountWordFile   
{
    public static void main(String[] args) throws Exception {  
        String line = null;  
        int count = 0;
        
        FileReader file = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(file);
		StringBuilder sb = new StringBuilder();
		
		String ls = System.getProperty("line.separator");
		PrintWriter out = new PrintWriter("output.txt");
        
        while((line = br.readLine()) != null) {  
			sb.append(line);
			sb.append(ls);
        }  
		sb.deleteCharAt(sb.length() - 1);
		br.close();
		
		String content = sb.toString();
		
		String requiredContent = content.replaceAll("\\P{L}", " ");
		String newContent = requiredContent.replaceAll("( +)"," ").trim();
		
		System.out.println(newContent);
		
		String words[] = newContent.split(" ");
		count = count + words.length;
		
		out.println(count);
		out.close();
    }  
}  


