class BankAccount{

  private var balance : BigDecimal = 0

  def deposit(amount : BigDecimal) = balance += amount
  def withdraw(amount : BigDecimal) = balance -= amount

  def getBalance = balance

}

val bankAccount = new BankAccount
bankAccount.deposit(123)
bankAccount.withdraw(20)
bankAccount.getBalance


