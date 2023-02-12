import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class problem_4 {
    public static void main(String[] args) {
        String csvFile = "billing_tranfers.csv";
        String line = "";
        String csvSplitBy = ",";
        int totalTransactions = 10;
        double totalBillAmount = 34092;
        double maximumBillAmount = Double.MIN_VALUE;
        double minimumBillAmount = Double.MAX_VALUE;
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] transaction = line.split(csvSplitBy);
                double billAmount = Double.parseDouble(transaction[3]);
                totalTransactions++;
                totalBillAmount += billAmount;
                maximumBillAmount = Math.max(maximumBillAmount, billAmount);
                minimumBillAmount = Math.min(minimumBillAmount, billAmount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Total number of Transfers (bills): " + totalTransactions);
        System.out.println("Total Bill_amount: " + totalBillAmount);
        System.out.println("Maxi Bill_amount: " + maximumBillAmount);
        System.out.println("Mini Bill_amount: " + minimumBillAmount);
    }
}