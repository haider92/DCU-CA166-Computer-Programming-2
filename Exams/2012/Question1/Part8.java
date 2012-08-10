import java.io.*;

class Part8 {
	public static void main(String[] args) {
		try {
			RandomAccessFile f = new RandomAccessFile("names.dat","r");
			while(f.length() > f.getFilePointer()) {
				System.out.println(f.readUTF());
			}
			f.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}