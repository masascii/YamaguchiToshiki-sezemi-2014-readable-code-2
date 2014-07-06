import java.io.*;
public class omuraisu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br_filename = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br_file = new BufferedReader(new FileReader(new File(br_filename.readLine())));
		
			System.out.println(br_file.readLine());
		}catch(IOException e) {
			System.err.println(e);
		}
		
	}

}
