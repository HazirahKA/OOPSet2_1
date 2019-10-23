public class SavingAccount extends Account implements Taxable {
    private double taxRate;
    private final String TYPE="Savings";

    public SavingAccount(double taxRate) {
        super();
        this.taxRate = taxRate;
    }

    public SavingAccount(Person accHolder, int accNum, double balance, double taxRate) {
        super(accHolder, accNum, balance);
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }


    @Override
    public double calcTax() {

        double taxamount=balance*taxRate/100;

        return 0;
    }

    @Override
    public String toString() {
        return "Account Type: "+ TYPE+super.toString()+
                "\ntaxRate: " + taxRate +"\n";
    }
}
