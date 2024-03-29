public class Person {
    private float cm; //키
    private float kg; //몸무게

    public Person(float cm, float kg){
        this.cm = cm;
        this.kg = kg;
    }

    public float getBMI() { //BMI 구하는 함수
        float cmIsMeter = cm/100; //cm를 m로 변환
        return kg / (cmIsMeter*cmIsMeter); //BMI 계산
    };

    public void say() {//울음소리 출력
        System.out.println("응애");
    };

    public float getCm() {
        return cm;
    }

    public float getKg() {
        return kg;
    }
}
