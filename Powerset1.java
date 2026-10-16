public class powerset1{
    public static void main(String[] args) {
        String s ="abc";
        subset("",s,0);
    }
    private static void subset(String ans, String s, int idx){
        if (idx == s.length()){
            System.out.println(ans+" ");
            return;
        }
        char ch= s.charAt(idx);
        subset (ans+ch, s, idx+1); //pick
        subset (ans,s,idx+1); // skip 
    }
}
/* List<String>list = new ArrayList<>();
subset("",s,0,list);
soutln(list);
}
private static void subset (String ans, String s, int idx, List<String>list){
if(idx == s.length()){
if (ans.length()!=0) list.add(ans);
return;}
}
char ch = s.charAt(idx);
subset(ans+ch, idx+1, list); //pick
subset(ans, s, idx-1, list); // skip

 */
