
public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "cebhdegwywtfg";
        
        System.out.println("Duplicate characters are:");

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (str.indexOf(currentChar) < i) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(currentChar + " : " + count);
            }
        }
    }
}
