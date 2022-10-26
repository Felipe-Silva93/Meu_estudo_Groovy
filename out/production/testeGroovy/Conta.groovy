class Conta{

    BigDecimal balance = 0.0
    String type
    BigDecimal deposito (BigDecimal amont){
        balance += amont
    }

    BigDecimal withdraw()
}