import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();

        for (int i = 0; i + 10 <= s.length(); i++) {
            String sub = s.substring(i, i + 10);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
            if (map.get(sub) == 2) res.add(sub); // only add once
        }
        return res;
    }
}