public class Thread1 extends Thread {
    private Bank bank;

    public Thread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            while (bank.getAccount() <= Bank.MAXIMUM_INC) {
                bank.setAccount(bank.getAccount() + 2);
                System.out.println("Increase: " + bank.getAccount());
            }
        }
    }
}