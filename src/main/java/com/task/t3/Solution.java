package com.task.t3;


import java.util.HashMap;
import java.util.Map;

// Longest Substring Without Repeating Characters
public class Solution {
    public int lengthOfLongestSubstring(String s) {
//        Set<Character> set = new HashSet<>();
//        int maxLength = 0;
//        int left = 0;
//        for(int right= 0 ; right < s.length(); right++){
//            if(!set.contains(s.charAt(right))){
//                set.add(s.charAt(right));
//                maxLength = Math.max(maxLength, right - left + 1);
//
//            }else{
//                while(s.charAt(left) != s.charAt(right)){
//                    set.remove(s.charAt(left));
//                    left++;
//                }
//                set.remove(s.charAt(left));
//                left++;
//                set.add(s.charAt(right));
//            }
//        }
//        return maxLength;
        int max = 0;
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (!map.containsKey(symbol)) {
                counter++;
                map.put(symbol, i);
            } else {
                i = map.get(symbol);
                counter = 0;
                map.clear();
            }
            if (counter > max) {
                max = counter;
            }
        }

        return max;
    }
}
