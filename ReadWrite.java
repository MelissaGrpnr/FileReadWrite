import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) {
		
		String filePath ="C:\\Users\\username\\Desktop\\e.txt";
		String writePath= "C:\\Users\\username\\Desktop\\Yeni Metin Belgesi.txt";
	
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
			BufferedWriter writer = new BufferedWriter(new FileWriter(writePath))) {
			String row;
			
			
			while((row= reader.readLine()) != null){
			
				writer.write(row);
				writer.newLine();
			}
		} 
		
		catch (IOException e) {
			System.out.println("dosya okunamadý" + e.getMessage());
		}
		

	}
}


