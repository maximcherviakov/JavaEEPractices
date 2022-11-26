public class Bank {
    public static final int MAXIMUM_INC = 20000;
    private int account;

    public Bank(int account) {
        this.account = account;
    }
    synchronized public void inc() {
        for (; account < MAXIMUM_INC; account += 2) {
            System.out.println("Increase: " + account);
        }
    }

    synchronized public void dec() {
        for (; account > 1; account--) {
            System.out.println("Decrease: " + account);
        }
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }
}