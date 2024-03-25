import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(3);
        try{
            int a = 10;
            int b = 0;
            int c = a/b;
        }catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException 에러발생");

        }catch(IllegalArgumentException iae){
            System.out.println("IllegalAccessException 에러발생");

        }catch(Exception e){
            System.out.println("Exception 발생");
        }
        finally{
            System.out.println("finally");
        }

    }

}

