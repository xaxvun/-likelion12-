public class DollarAccount extends BankAccount{
    //오버로딩 => 부모 클래스에서 상속받은 메서드에서 파라미터를 변경
    //새로운 메서드 정의!
    void inquiry(double currencyRate) {}; //송금용도, 달러 환율을 추가하여 재정의 함(조회할때 달러를 원화로 바꿔주기 위함)
    //부모클레스의 메소드는 의미상 동일함

    //오버라이딩 => 부모 클래스에서 상속받은 메서드의 내용 변경
    //자식 클래스의 상황에 맞게
    public void deposit() { //BankAccout의 내용을 쓰지 않고 DollarAccount 내용에서 다시 바꿈


    }
}