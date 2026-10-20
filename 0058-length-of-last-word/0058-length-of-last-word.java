class Solution {
    public int lengthOfLastWord(String s) {

        String[] splited = s.split(" ");
        return splited[splited.length - 1].length();

    }
}