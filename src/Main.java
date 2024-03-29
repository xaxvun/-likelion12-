import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 175, 75));
        students.add(new Student("이서경", 180, 78));
        students.add(new Student("이영희", 155, 49));
        students.add(new Student("김멋사", 182, 82));

        float maxBMI = 0;
        int index = -1;

        for (int i=0; i<students.size(); i++){
            if (students.get(i).getBMI()>maxBMI){
                maxBMI = students.get(i).getBMI();
                index=i;
            }
        }
        if (index != -1){
            students.remove(index);
        }

        for (Student student : students){
            student.printIntro();
            student.say();
        }


    }
}
