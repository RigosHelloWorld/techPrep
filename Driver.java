import java.util.HashMap;
import java.util.Map;

public class Driver {

        public static int number = 6;

        public static void main(String[] args) {
                System.out.println(canConstruct("aa", "aab"));
        }

        private static boolean canConstruct(String ransomNote, String magazine) {
                if (ransomNote.length() == 0)
                        return false;

                Map<Character, Integer> map = new HashMap<>();

                for (char c : magazine.toCharArray()) {
                        map.put(c, map.getOrDefault(c, 0) + 1);
                }
                for (char c : ransomNote.toCharArray()) {
                        if (map.isEmpty() || !map.containsKey(c))
                                return false;

                        map.put(c, map.get(c) - 1);

                        if (map.get(c) < 0)
                                return false;
                }

                return true;
        }

        // assuming we only have character a-z

        private static boolean conConstruc2(String ransomNote, String magazine) {
                if (ransomNote.length() == 0 || magazine.length() < ransomNote.length())
                        return false;

                int[] letters = new int[26];

                for(char c : magazine.toCharArray()) {
                        int value = c - 'a';
                        letters[value]++;
                }

                for(char c : ransomNote.toCharArray()) {
                        int value = c - 'a';

                        if(--letters[value] < 0) return false;
                }

                return true;
        }
}
