
static void main(String[] args) {

    Conta checkin = new Conta(type:"chekin")
    checkin.deposito(100.0)

    Conta salvar = new Conta(type:"salve")
    salvar.deposito(50.0)

    println checkin
    println salvar

    BigDecimal total = checkin + salvar

    println total


}