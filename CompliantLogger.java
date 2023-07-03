import javax.swing.JOptionPane;

public class CompliantLogger {
        public static void main(String[] args) {
            // Variables for product, date, complaint, complaint count, and user's response
            String product, date, complaint, response;
            int complaintCount = 0;

            // Print column headings before the loop
            System.out.printf("%-25s %-10s %s\n", "Product", "Date", "Complaint");

            // Use a do-while loop to handle multiple complaints
            do {
                // Ask the user for product, date, and complaint using JOptionPane
                product = JOptionPane.showInputDialog(null, "Enter the product:");
                date = JOptionPane.showInputDialog(null, "Enter the date (MM/DD/YY):");
                complaint = JOptionPane.showInputDialog(null, "Enter the complaint:");

                // Display the details using printf()
                System.out.printf("%-25s %-10s %s\n", product, date, complaint);

                // Increment complaint count
                complaintCount++;

                // Ask the user if there are more complaints using JOptionPane
                response = JOptionPane.showInputDialog(null, "Are there more complaints? (Y/N)").toUpperCase();
            } while (response.equals("Y"));

            // Print the total number of complaints
            System.out.println("Total number of complaints logged: " + complaintCount);
        }
    }






























