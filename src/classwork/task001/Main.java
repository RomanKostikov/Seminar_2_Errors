package classwork.task001;

public class Main {
    public static void main(String[] args) {
        try{
            myInput(5);
            int test = 10/0;
        }catch (MyException e){
            System.out.println("Ошибка: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void myInput(int value) throws MyException{
        if (value < 0) {
            throw new MyException("Значение не может быть отрицательным");
        }
        System.out.println("Обработка значения: " + value);

    }
}

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}