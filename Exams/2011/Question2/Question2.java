import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;


class Question2 {
    public static void main(String[] args) {
        try {
            Scanner flightsFile = new Scanner(new File("flights.txt"));
            PrintWriter cheap = new PrintWriter(new File("cheap.txt"));
            int totalPrice=0,entries=0;
            while(flightsFile.hasNextLine()) {
                String flightNumber = flightsFile.next();
                String destination = flightsFile.next();
                int price = flightsFile.nextInt();
                totalPrice=totalPrice+price;
                entries++;
                if((price/100) < 150) {
                    cheap.println(flightNumber + " " + destination);
                }
            }
            cheap.close();
            flightsFile.close();
            System.out.println(totalPrice/entries + " is the average");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}