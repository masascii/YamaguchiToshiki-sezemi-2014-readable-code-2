import java.io.*;
public class omuraisu {

	public static void main(String[] args) {
		String str = null;
		int id = 1;//idは1から始める
		try {
			BufferedReader br_filename = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br_file = new BufferedReader(new FileReader(new File(br_filename.readLine())));
			
			while((str = br_file.readLine()) != null) {
				System.out.println(id + ":" + str);
				id++;
			}
			
		}catch(IOException e) {
			System.err.println(e);
		}
		
	}

}
