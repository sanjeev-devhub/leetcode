class Solution {
     public int passwordStrength(String password) {
        int score = 0;
        Set<Character> set = new HashSet<>();
        for (Character c : password.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                if (Character.isAlphabetic(c)) {
                    if (c >= 'A' && c <= 'Z') {
                        score += 2;
                    } else {
                        score += 1;
                    }

                } else if (Character.isDigit(c)) {
                    score += 3;
                } else {
                    score += 5;
                }
            }
        }
        return score;

    }
}