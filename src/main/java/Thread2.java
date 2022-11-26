public class Thread2 extends Thread {
    private Bank bank;

    public Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            while (bank.getAccount() > 1) {
                bank.setAccount(bank.getAccount() - 1);
                System.out.println("Decrease: " + bank.getAccount());
            }
        }
    }
}