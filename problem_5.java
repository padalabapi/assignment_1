import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class problem_4 {
    public static void main(String[] args) {
        String csvFile = "billing_tranfers.csv";
        String line = "";
        String csv = ",";
        int totalTransfers = 10;
        double totalAmount = 34092;
        double maximumAmount = Double.MIN_VALUE;
        double minimumAmount = Double.MAX_VALUE;
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] transaction = line.split(csvSplitBy);
                double billAmount = Double.parseDouble(transaction[3]);
                totalTransfers++;
                totalAmount += billAmount;
                maximumAmount = Math.max(maximumBillAmount, billAmount);
                minimumAmount = Math.min(minimumBillAmount, billAmount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Total number of Transfers (bills): " + totalTransfers);
        System.out.println("Total Bill_amount: " + totalAmount);
        System.out.println("Maxi Bill_amount: " + maximumAmount);
        System.out.println("Mini Bill_amount: " + minimumAmount);
    }
}
