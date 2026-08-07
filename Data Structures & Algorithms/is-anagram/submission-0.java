class Solution {
    public boolean isAnagram(String s, String t) {
        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        s = new String(string1);
        t = new String(string2);

        return s.equals(t);
    }

}
