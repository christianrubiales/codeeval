import java.io.IOException;
import java.nio.ByteOrder;


public class Endianness {

	public static void main(String[] a) throws IOException {
		if (ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN)) {
		  System.out.println("BigEndian");
		} else {
		  System.out.println("LittleEndian");
		}
	}
}
