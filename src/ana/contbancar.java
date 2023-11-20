package ana;

public class contbancar {
    private int amount,withdrawamount;
    public contbancar(int amount){
        this.amount=amount;
    }
    public int getdeposit(int amount){
        return this.amount+amount;
    }
    public int getwithdraw(int amount,withdrawamount){
        if(this.amount<withdrawamount) {
            System.out.println('operatiunea nu poate fi executata');
        }
    }
    public int getbalance(int amount){
        return amount;
    }
}
