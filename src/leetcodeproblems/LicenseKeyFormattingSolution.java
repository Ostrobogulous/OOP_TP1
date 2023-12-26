package leetcodeproblems;

public class LicenseKeyFormattingSolution {
    public String licenseKeyFormatting(String s, int k) {
        String keys = "";
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                keys += Character.toUpperCase(s.charAt(i));
            }
        }
        int firstGroup = keys.length() % k;
        for (int i = 0; i < firstGroup; i++) {
            answer += keys.charAt(i);
        }
        if (firstGroup != 0 && k < keys.length()) {
            answer += '-';
        }
        int count = 0;
        for (int i = firstGroup; i < keys.length(); i++) {
            if (count == k) {
                answer += '-';
                count = 0;
            }
            answer += keys.charAt(i);
            count++;
        }
        return answer;

    }
}
