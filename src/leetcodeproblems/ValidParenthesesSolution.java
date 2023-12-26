package leetcodeproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParenthesesSolution {
    public boolean isValid(String s) {
        Map<Character, Character> m = new HashMap<>();
        m.put('(', ')');
        m.put('{', '}');
        m.put('[', ']');
        List<Character> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (m.containsKey(c)) {
                l.add(c);
            } else {
                if (l.isEmpty() || m.get(l.get(l.size() - 1)) != c) {
                    return false;
                } else {
                    l.remove(l.size() - 1);
                }
            }
        }
        return l.isEmpty();
    }
}
