package Chapter3;

public class LoopTerminationTechniques {
    public static void main(String[] args) {
        for(int i = 1; i <= 15; i++){
            if(i == 4) break; //exit
            if(i % 3 == 0)continue; //skip iteration
            System.out.print(i + "\t");
        }
    }
}
