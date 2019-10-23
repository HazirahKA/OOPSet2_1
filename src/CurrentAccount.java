public class CurrentAccount extends Account {
    private boolean checkBook;
    private final String TYPE="Current";

    public CurrentAccount(boolean checkBook) {
        this.checkBook = checkBook;
    }

    public CurrentAccount() {
        this(new Person(),0,0,false);
    }

    public CurrentAccount(Person accHolder, int accNum, double balance, boolean checkBook) {
        super(accHolder, accNum, balance);
        this.checkBook = checkBook;
    }

    public boolean isCheckBook() {
        return checkBook;
    }

    public void setCheckBook(boolean checkBook) {
        this.checkBook = checkBook;
    }

    @Override
    public String toString() {
        return "\nAccount Type: " + TYPE+super.toString()+
                "\ncheckBook: " + isCheckBook();
    }
}
