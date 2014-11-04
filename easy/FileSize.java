import java.io.File;
import java.io.IOException;


public class FileSize {

	public static void main(String[] args) throws IOException {
		System.out.println(new File(args[0]).length());
	}
}
