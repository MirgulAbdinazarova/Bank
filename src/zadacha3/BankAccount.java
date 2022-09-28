package zadacha3;

public class BankAccount {
    private double amount;

    public double getAmount() {
        System.out.println("Vash shet:");
        return amount;
    }

    public void deposit(double sum) throws LimitException {

        try {
            if (sum > 60000) {
                throw new LimitException("60000 den  chon", amount);
//            throw new LimitException("Bolshe cumma", amount);
            } else if (amount+sum>60000) {
                throw new LimitException("Bolshe 60000 polojit nelzya",amount);
            } else  {
               amount += sum;
            }
        } catch (LimitException e) {
            e.getRemainingAmount();
        }
    }

    public void withDraw(int sum) throws LimitException {
        try {
            if (sum > 55000) {
                throw new LimitException("55000 kop alsa bolboit", sum);

        } else if (amount<sum) {
                throw new LimitException("Shetto akcha az",amount);
            }else {
                amount-=sum;
            }
        } catch (LimitException e) {
            e.getRemainingAmount();

        }
    }
}

