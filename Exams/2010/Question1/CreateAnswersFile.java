import java.io.RandomAccessFile;
import java.io.IOException;

class CreateAnswersFile {
    public static void main(String[] args) {
        try {
            RandomAccessFile answers = new RandomAccessFile("answers.dat","rw");
            int count = 0;
            double total=0;
            while(count<20) {
                double number = Math.random()*100;
                total=total+number;
                answers.writeDouble(number);
                count++;
            }
            System.out.println("Average should be " + total/count);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}