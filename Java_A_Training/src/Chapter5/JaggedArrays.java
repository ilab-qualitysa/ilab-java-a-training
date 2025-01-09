package Chapter5;

public class JaggedArrays {
    public static void main(String[] args) {
        String[][] arrHobbies = new String[3][];
        String[] arSports = {"Golf", "Tennis", "Soccer"};
        arrHobbies[0] = arSports;
        arrHobbies[1] = new String[]{"Hiking", "Reading"};
        arrHobbies[2] = new String[4];

        arrHobbies[2][0] = "Chess";
        arrHobbies[2][1] = "Soccer";
        arrHobbies[2][2] = "Netball";
        arrHobbies[2][3] = "Hiking";

        for(int i = 0; i < arrHobbies.length; i++){
            for (int j = 0;j <arrHobbies[i].length; j++){
                System.out.print(arrHobbies[i][j] + "\t\t");
            }
            System.out.println();
        }

    }
}
