public class SavingAccount extends BankAccount implements Withdrawable{ //extends : 이전 부모 클래스로 부터 상속 받기

    boolean isOverdraft; //마이너스통장인가?

    void transfer() {}; //계좌를 송금하는 용도인가?
    public void withdraw() {
        System.out.println("Withdraw");
    };
}