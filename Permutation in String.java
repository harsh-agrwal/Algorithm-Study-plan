class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }
        int p1 = 0;
        int p2 = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s1.length(); i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i), 1);
            }
        }
        // we now know the size of the window 
        HashMap<Character, Integer> map2 = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0 ; i < s1.length(); i++){
            list.add(s2.charAt(i));
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i), map2.get(s2.charAt(i))+1);
            }
            else{
                map2.put(s2.charAt(i), 1);
            }
        }
        if(map2.equals(map)){
            return true;
        }
        for(int i = s1.length(); i < s2.length(); i++){
            char ch = list.get(0);
            list.remove(0);
            list.add(s2.charAt(i));
            map2.put(ch, map2.get(ch)-1);
            if(map2.get(ch) == 0){
                map2.remove(ch);
            }
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i), map2.get(s2.charAt(i))+1);
            }
            else{
                map2.put(s2.charAt(i), 1);
            }
            if(map2.equals(map)){
                return true;
            }
        }
        return false;
    }
}
