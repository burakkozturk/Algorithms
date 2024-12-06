class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder output = new StringBuilder();
        int i = 0;
        while(i< word1.length() || i < word2.length()){
            if(i<word1.length()){
                output.append(word1.charAt(i));
            }
            if(i<word2.length()){
                output.append(word2.charAt(i));
            }
            i++;
        }

        return output.toString();
    }
}