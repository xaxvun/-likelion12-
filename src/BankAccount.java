public class BankAccount {//맴버변수와 메서드 구현
    //멤버변수 구현 (정적인 데이터)
    //private => 동일한 클래스에서만 조회가능
    private int bankCode;//은행 지점 코드
    private int accountNo; //계좌번호
    private String owner; //계좌 소유자 (예금주)
    private int balance; //잔액
    private boolean isDormant; /*휴먼 계좌 확인 true or false => 앞에 is라고 표현함*/
    private int password;//비밀번호

    // 메소드(기능, 함수)(동적인 데이터)
    public void inquiry() {}; //계좌 조회
    public void deposit() {}; //계쫘 입금
    public void withdraw() {}; //출금
    public void heldInDormant() {};// 휴먼계좌 조회
    public void changePassword(int password){
        this.password = password;
    }


    //생성자
    //클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치해야 한다.
    //new 연산자와 함께 사용해야 한다 (참조형 데이터 다룰때 사용되었었음)
    BankAccount(){

    }

    BankAccount( //생성자 함수 생성
            //생성에 필요한 정보는 생성자 함수 소괄호 안에 넣어야함
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            int password,
            boolean isDormant
    ) { //데이터를 할당해서 실제로 의미있는 값을 가진 인스턴스를 만들기 위한 역할
        this.bankCode = bankCode;
        // this.클레스에 정의된 맴버변수 = 사용자, 프로그램으로 부터 입력받은 값 (동일한 뜻 아님)
        //this == 인스턴스 자기 자신을 가리키는 특수한 변수 (this라 하면 클레스에 정의된 맴버변수가 뜸
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.password = password;
        this.isDormant = isDormant;


    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
