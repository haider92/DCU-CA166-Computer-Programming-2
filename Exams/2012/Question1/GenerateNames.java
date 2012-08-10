import java.io.*;

class GenerateNames {
    public static void main(String[] args) {
        try {
            String[] names = {"Sligo","Dublin","London","Paris","Madrid","Boston"};
            RandomAccessFile f = new RandomAccessFile("names.dat","rw");
            for(String name : names) f.writeUTF(name);
            f.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}