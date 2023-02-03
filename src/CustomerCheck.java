
import java.util.ArrayList;

public class CustomerCheck
{
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check)
    {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices()
    {
        /* to be implemented in part (a) */
        double totalPrice = 0;
        for (int i =0; i < check.size();i++){
            totalPrice += (check.get(i)).getPrice();
        }
        return totalPrice;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies()
    {
        /* to be implemented in part (b) */
        for (int i =0; i < check.size(); i++){
            if (check.get(i).isDailySpecial() || totalPrices() < 40 ){
                return false;
            }
        }
        return true;
    }


    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck()
    {
        /* to be implemented in part (c) */
        int customers = 0;
        double finalPrice = totalPrices();
        for (int i = 0; i < check.size(); i++){
            if (check.get(i).isEntree()){
                customers++;
            }
        }

        if (couponApplies()){
            finalPrice = finalPrice * 0.75;
        }

        if (customers >= 6){
            finalPrice  += totalPrices() * 0.20;
        }
        return finalPrice;

    }
}
