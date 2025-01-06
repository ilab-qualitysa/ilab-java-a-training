package Chapter2;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int age = 25;

        System.out.println("=============INCREMENT=============" );
        System.out.println("Original age is " + age);
        System.out.println("Pre Increment age is " + ++age);
        System.out.println("Post Increment age is " + age++);
        System.out.println("PostIncrement age is " + age++);

        age = 25;
        System.out.println("=============DECREMENT=============" );
        System.out.println("Original age is " + age);
        System.out.println("Pre Increment age is " + --age);
        System.out.println("Post Increment age is " + age--);
        System.out.println("PostIncrement age is " + age--);
    }
}
