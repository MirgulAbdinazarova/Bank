package zadacha3;

public class LimitException extends Exception{
    private String message;
    private double remainingAmount;

    public LimitException(String message,double remainingAmount){
       this.message=message;
       this.remainingAmount=remainingAmount;
    }

    public double getRemainingAmount(){
        System.out.println(message);
        return remainingAmount;
    }


}
