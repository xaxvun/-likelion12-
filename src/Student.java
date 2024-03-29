public class Student extends Person{ //Person 부모 클레스 상속
    private String name; //이름


    public Student(String name, float cm, float kg){
        super(cm, kg);
        this.name = name;
    }
    public void printIntro(){
        System.out.println(name+"의 키는 "+getCm()+"cm 이고, 몸무게는 "+getKg()+"이므로 BMI 수치는 "+getBMI()+"입니다.");
    }
    @Override
    public void say(){
        System.out.println("안녕");
    }

    @Override
    public float getCm() {
        return super.getCm(); //부모클레스에서 private 멤버 접근
    }

    @Override
    public float getKg() {
        return super.getKg();//부모클레스에서 private 멤버 접근
    }

    @Override
    public float getBMI() {
        return super.getBMI();//부모클레스에서 public 함수 접근
    }
}
