import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

class Question2 {
    public static void main(String[] args) {
        try {
            Scanner accounts = new Scanner(new File("accounts.txt"));
            PrintWriter output = new PrintWriter(new File("overdrawn.txt"));
            int total=0;
            while(accounts.hasNext()) {
                int amount = accounts.nextInt();
                String name = accounts.nextLine();
                if(amount<0) {
                    output.println(Math.abs(amount) + " " + name);
                    total=total+Math.abs(amount);
                }
            }
            output.print("Total overdrawn: " + total);
            accounts.close();
            output.close();

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}