import java.io.*;
public class omuraisu {
	//TO DO while文のモジュール化
	public static void main(String[] args) {
		String str = null;
		String[] input;
		int id = 1;//idは1から始める
		try {
			BufferedReader br_filename = new BufferedReader(new InputStreamReader(System.in));
			input = br_filename.readLine().split(" ");
			BufferedReader br_file = new BufferedReader(new FileReader(new File(input[0])));
			if(input.length > 1) {
				while((str = br_file.readLine()) != null) {
					if(id == Integer.parseInt(input[1])) {
						System.out.println(id + ":" + str);
						break;
					}
					id++;
				}
			}else {
				while((str = br_file.readLine()) != null) {
					System.out.println(id + ":" + str);
					id++;
				}
			}
		}catch(IOException e) {
			System.err.println(e);
		}
	}
}
