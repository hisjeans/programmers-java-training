//문자열 겹쳐쓰기

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

        /*
        String org = my_string.substring(0, s);
        String aft = my_string.substring(s + overwrite_string.length());
        return org + overwrite_string + aft;
        */

        char[] answer=my_string.toCharArray();
        //char[] overwrite_answer=overwirte_string.toCharArray();
        for(int i=0;i<overwrite_string.length();i++){
            answer[s+i]=overwrite_string.charAt(i);
            //answer[s+i]=overwrite_answer[i];

        }
        return new String(answer);
        //return String.valueOf(answer);

    }
}
