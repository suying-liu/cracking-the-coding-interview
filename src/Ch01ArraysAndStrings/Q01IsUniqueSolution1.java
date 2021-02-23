package Ch01ArraysAndStrings;

public class Q01IsUniqueSolution1 {
    public static boolean isUnique(String str) {
        if (str.length() > 256) return false;

        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) return false;
            charSet[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "apple", "yes", "round"};
        for (String word : words) {
            System.out.println(word + ": " + isUnique(word));
        }
    }
}

// Time: O(n)
// Space: O(1)
