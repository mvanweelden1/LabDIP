package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author Mark Van Weelden
 */
public class Startup {
    
    public static void main(String[] args) {
        
        
        FoodServiceTipCalculator tip1 = new FoodServiceTipCalculator(FoodServiceTipCalculator.ServiceQuality.GOOD, 102.00);
        BaggageServiceTipCalculator tip2 = new BaggageServiceTipCalculator(BaggageServiceTipCalculator.ServiceQuality.FAIR, 5);
        BaggageServiceTipCalculator tip3 = new BaggageServiceTipCalculator(BaggageServiceTipCalculator.ServiceQuality.POOR, 1);
        
        TipStrategy[] tips = {tip1, tip2, tip3};
        
        TipService tipService = new TipService();
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
          for(int i=0; i < tips.length; i++) {
            System.out.println("Tip " + (i+1) + " = " +
            nf.format(tipService.getTipAmount(tips[i])));
        }
        
        
        
        
        
        
    }

}
