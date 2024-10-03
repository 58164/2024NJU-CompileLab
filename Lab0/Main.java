import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
public class Main
{    
    public static void main(String[] args){
		try (BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in))) {
			String filePath = args[0];
			try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
				String line;
				while ((line = fileReader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
}
