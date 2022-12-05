import java.util.Objects;

public class Main {


    public static void main(String[] args) {
        String[] fruits = new String[8];
        fruits[0] = "Яблоко";
        fruits[1] = "Ананас";
        fruits[2] = "Груша";
        fruits[3] = "Яблоко";
        fruits[4] = "Гранат";
        fruits[5] = "Дыня";
        fruits[6] = "Ананас";
        fruits[7] = "Банан";

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; j < fruits.length; j++) {
                if (Objects.equals(fruits[i], fruits[j])) {
                    fruits[i] = null;
                }
            }
            if (fruits[i] != null) {
                System.out.println(fruits[i]);
            }
        }
    }
    }