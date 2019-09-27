/**
 * The expense class is responsible for maintaing expense (financial)
 * information and for performing performing operations on this data.
 * 
 * The Expense class has 3 fields: 1. amount the net quantity of money expended
 * 2. taxed the quantity of money expended due to taxes 2. payTo the entity that
 * received the money 3. date the date the the transaction occured
 * 
 * The Expense class responds to the following messages: 1. computeTaxAmount(tax
 * percentage) returns the dollar amount taxed based 2. addTax(tax percentage)
 * adds tax the the net amount based
 * 
 * @author Reece Younger
 * @since 2019-09-26
 */
public class Expense {

    private double baseAmount = 0;
    private double taxedAmount = 0;
    private double netAmount = 0;
    private String payTo = "";
    private String transactionDate = "";

    /**
     * Returns a string stating the details of this expense.
     * @return formatted expense string
     */
    public String details() {
        final String expenseDetails = "Paid $" + this.netAmount + 
            " to the order of " + this.payTo + " on " + this.transactionDate;
        return expenseDetails;
    }

    /**
     * Returns an expense object that represents payment information to another
     * entity.
     * @param amount paid amount
     * @param taxed dollar amount taxed
     * @param payTo entity receiving payment
     * @param date date of transaction
     */
    public Expense(double amount, double taxed, String payTo, String date) {
        this.baseAmount = amount;
        this.taxedAmount = taxed;
        this.netAmount = this.baseAmount + this.taxedAmount;
        this.payTo = payTo;
        this.transactionDate = date;
    }

    /**
     * Returns the baseAmount paid in taxes given the tax rate as a percentage.
     * @param taxPercentage
     * @return double dollar baseAmount taxed
     */
    public double computeTaxAmount(double taxPercentage) {
        final double taxRate = taxPercentage / 100;
        final double taxedAmount = taxRate * this.baseAmount;
        return taxedAmount;
    }

    /**
     * Adds a dollar tax amount to the net expense given a tax percentage.
     * Readjusts the tax amount by first removing the previous tax amount
     * from the net amount.
     * @param double taxPercentage tax rate as a percentage.
     */
    public void addTax(double taxPercentage) {
        final double taxedAmount = computeTaxAmount(taxPercentage);
        this.netAmount -= this.taxedAmount;
        this.taxedAmount = taxedAmount;
        this.netAmount += taxedAmount;
    }
}