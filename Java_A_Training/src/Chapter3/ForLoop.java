package Chapter3;

public class ForLoop {
    public static void main(String[] args) {

        for(int x = 1; x <= 4; x++){
            System.out.println(x + " - Tuesday");
        }

        System.out.println("*************************************");

        for(int x = 5; x < 8; x++){
            System.out.println("iLab Training");
        }
        System.out.println("*************************************");
        for(int a = 1, b = 5; a <= 5 && b <= 8; a++, b++){
            System.out.println("a - " + a + "\tb - " + b);
        }
        System.out.println("*************************************");
        int num = 10;
        for(int c = 10; c > 0; c--){
            System.out.print(c + "\t");
        }
    }
}
