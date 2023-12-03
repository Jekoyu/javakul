package AOB;

import java.util.Random;

public class Helper {
        public static void print(int i,String a){
            if (i == 0) {
                System.out.println(a);
            }else if (i == 1){
                System.out.print(a);
            }
        };

    public static String getRandom() {
        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder randomText = new StringBuilder(4);

        for (int i = 0; i < 4; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            randomText.append(randomChar);
        }

        return randomText.toString();
    }

}
