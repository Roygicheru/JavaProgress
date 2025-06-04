package OOP;

// import com.sun.tools.javac.Main;

public class OopOne {
    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    public void oopConcepts(){

        int num1 = 25;
        int num2 = 15;

        // create an object of Main
        OopOne obj = new OopOne();
        // calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);

    }
}
