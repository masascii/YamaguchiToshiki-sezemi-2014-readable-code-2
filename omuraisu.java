import java.io.*;
public class omuraisu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		try {
			BufferedReader br_filename = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br_file = new BufferedReader(new FileReader(new File(br_filename.readLine())));
			
			while((str = br_file.readLine()) != null) {
				System.out.println(str);
			}
			
		}catch(IOException e) {
			System.err.println(e);
		}
		
	}

}
