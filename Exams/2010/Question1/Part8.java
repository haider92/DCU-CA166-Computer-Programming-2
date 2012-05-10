import java.io.IOException;
import java.io.EOFException;
import java.io.DataInputStream;
import java.io.FileInputStream;

class Part8 {
    public static void main(String[] args) {
        double total = 0.0;
        int count = 0;
        try {
            DataInputStream in = new DataInputStream(new FileInputStream("answers.dat"));
            while(true) {
                double number = in.readDouble();
                count++;
                total=total+number;
            }
        } catch(EOFException e) {
            System.out.print("Average - " + total/count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

