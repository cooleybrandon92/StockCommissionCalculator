import javax.swing.JOptionPane;

/**
   This program demonstrates using dialogs with 
   JOptionPane.
*/

public class amountpaidforstocks{
   public static void main(String[] args)
   {
      String inputString;             // For reading input
      String name;                   // The user's name
      int stocksbought;              // The number of stocks bought
      double priceforstocks;        // price for stocks
      double commission;            // commission for stocks
      double totalcostforstocks;    // total cost for stocks
      
      // Get the user's name.
      name = JOptionPane.showInputDialog("What is " +
                                         "your name? ");
      
      // get amount of stocks purchased.
      inputString =
        JOptionPane.showInputDialog("How many " +
                             "stocks did you buy? ");

      // Convert the input to an int.
      stocksbought = Integer.parseInt(inputString);
      
      // Get the price per stock.
      inputString =
         JOptionPane.showInputDialog("What is your " +
                                   "price per stock? ");
                                   
       // Convert the input to a double.
      priceforstocks = Double.parseDouble(inputString);
     
      
      // Calculate cost for stocks.
      priceforstocks = (priceforstocks * stocksbought);
      
      // Display the results.
      JOptionPane.showMessageDialog(null, "Hello " + 
                    name + ". cost for stocks is $" +
                    priceforstocks);
                     
      // Get the commission cost.
      inputString =
         JOptionPane.showInputDialog("What is your " +
                                   "commission cost? ");
                             

      // Convert the input to a double.
      commission = Double.parseDouble(inputString);
      
      // Calculate cost of commission.
      commission = (priceforstocks * 0.02);
      
      
      // Display the results.
      JOptionPane.showMessageDialog(null, "Hello " + 
                    name + ". commission is $" +
                    commission + priceforstocks);
                
                    
     // Convert the input to a double.
      totalcostforstocks = Double.parseDouble(inputString);

      // Calculate total cost for stocks.
      totalcostforstocks = priceforstocks + commission;
      
      // Display the results.
      JOptionPane.showMessageDialog(null, "Hello " + 
                    name + ". total cost for stocks is $" +
                    totalcostforstocks + commission);



      // End the program.
      System.exit(0);
   }
}
