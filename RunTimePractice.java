import java.util.HashMap;

public class RunTimePractice {
    
    public static int findNumberOfRepetitions(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }
    // Brute force solution
    public static int[] findNumberOfRepetitionsv1(String s, char[] c) {
        int[] sums = new int[c.length]; // 1 time
        for (int i = 0 ; i < s.length(); i++) { // 1 time, length of string + 1, set number of times
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    sums[j] = sums[j] + 1;
                }
            }
        }
        return sums;
    }

    public static int[] findNumberOfRepetitionsv2(String s, char[] c) {
        // Optimal time: 0(n+m)
        int[] sums = new int[c.length]; // 1 time
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }

        for (int j = 0; j < c.length; j++) {
            int sum;
            if (!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }

        return sums;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(findNumberOfRepetitions("abcadasgiashdgsiangpiangwpaoewapoyweapnpghoinapoieapiyapiaepwiygnhepwaiynhapiygnhjewpaojepaojygpaoejyapoejypoyjahgpoaj", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");

        char[] a = {'a', 'b'};

        startTime = System.currentTimeMillis();
        System.out.println(findNumberOfRepetitionsv1("abcadasgiashdgsiangpiangwpaoewapoyweapnpghoinapoieapiyapiaepwiygnhepwaiynhapiygnhjewpaojepaojygpaoejyapoejypoyjahgpoaj", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");

        startTime = System.currentTimeMillis();
        System.out.println(findNumberOfRepetitionsv2("abcadasgiashdgsiangpiangwpaoewapoyweapnpghoinapoieapiyapiaepwiygnhepwaiynhapiygnhjewpaojepaojygpaoejyapoejypoyjahgpoaj", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: " + duration + "ms");
    }
}
