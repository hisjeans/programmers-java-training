//더 크게 합치기

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA=Integer.toString(a);
        String strB=Integer.toString(b);
        String ab=strA+strB;
        String ba=strB+strA;
        
        /*
        int aI=Integer.parseInt(""+a+b); 빈 문자열로 시작해 정수 연결
        int bI=Integer.parseInt(""+b+a);
        answer=aI>bI?aI:bI; if-else의 간단한 방법
        */
        
        int v1=Integer.parseInt(ab);
        int v2=Integer.parseInt(ba);
        if(v1>v2) answer=v1;
        else answer=v2;

        //return Math.max(Integer.parseInt(a+""+b),Integer.parseInt(b+""+a)); 빈 문자열과 연결하면 자동으로 문자열 연결이 됨.

        return answer;
    }
}
