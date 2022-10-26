import groovy.transform.ToString

@ToString
public class Conta{

    BigDecimal balance = 0.0
    String type

    BigDecimal deposito (BigDecimal amount){
        balance += amount
    }

    BigDecimal withdraw(BigDecimal amount){
        balanve -=amount

    }

    BigDecimal plus (Conta conta){
        this.balance + conta.balance
    }

}



