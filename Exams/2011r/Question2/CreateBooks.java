import java.io.RandomAccessFile;
import java.io.IOException;

class CreateBooks {
    public static void main(String[] args) {
        try {
            RandomAccessFile books = new RandomAccessFile("books.dat","rw");

            books.writeUTF("The Great Gatsby");
            books.writeInt(1120);

            books.writeUTF("The Price");
            books.writeInt(550);

            books.writeUTF("The Great Gatsby");
            books.writeInt(1120);

            books.writeUTF("Sluaghterhouse-Five");
            books.writeInt(1520);

            books.writeUTF("1984");
            books.writeInt(240);

            books.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}