class Solution {

    List<String>ans=new ArrayList<>();
    HashMap<String,Boolean>mp=new HashMap<>();

    void count(char[] s,int index){

    if(index==s.length){
    String temp=new String(s);  
    if(!mp.containsKey(temp)){
        ans.add(temp);
        mp.put(temp,true);
    }
    return;
    }

    String temp=new String(s);
    if(!mp.containsKey(temp))
    count(s,index+1);
    s[index]=Character.toUpperCase(s[index]);
    temp=new String(s);
    if(!mp.containsKey(temp))
    count(s,index+1);
    s[index]=Character.toLowerCase(s[index]);
    }
    public List<String> letterCasePermutation(String s) {
    s=s.toLowerCase();
    char[]store=s.toCharArray()
    count(store,0);
    return ans;

    }
}
