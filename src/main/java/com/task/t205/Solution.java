package com.task.t205;

import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        var maps = new HashMap<Character, Character>();
        var mapt = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            char symbolS = s.charAt(i);
            char symbolT = t.charAt(i);
            if (maps.containsKey(symbolS)) {
                if (maps.get(symbolS) != symbolT) {
                    return false;
                }
            } else if (mapt.containsKey(symbolT)) {
                if (mapt.get(symbolT) != symbolS) {
                    return false;
                }
            }
            maps.put(symbolS, symbolT);
            mapt.put(symbolT, symbolS);
        }
        return true;
    }
}
