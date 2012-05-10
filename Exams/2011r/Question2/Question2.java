import java.io.RandomAccessFile;
import java.io.IOException;

class Question2 {
    public static void main(String[] args) {
        try {
            RandomAccessFile books = new RandomAccessFile("books.dat","r");
            String maxtitle="";
            int maxprice=0;
            while(books.getFilePointer() < books.length()) {
                String title=books.readUTF();
                int price = books.readInt();
                if(price>maxprice) {
                    maxtitle=title;
                    maxprice=price;
                }
            }
            books.close();
            System.out.println(maxtitle);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}