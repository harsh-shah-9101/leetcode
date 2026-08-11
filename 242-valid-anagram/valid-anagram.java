class Solution {
    public boolean isAnagram(String s, String t) {
        

        if(s.length()!=t.length()){
            return false;
        }else{
            char[] charS=s.toCharArray();
            
            char[] charT=t.toCharArray();
            Arrays.sort(charS);
            Arrays.sort(charT);

            String s1 = new String(charS);
            String t1 = new String(charT);

            if(s1.equals(t1)){
                return true;
            }else{
                return false;
            }
        }
    }
}