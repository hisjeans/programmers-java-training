//수 조작하기 2
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        //StringBuilder answer=new StringBuilder(); answer.append("w"); 기존 버퍼에 추가, String 방식보다 효율적 
        for(int i=1;i<numLog.length;i++){
        //i=0일 때 numLog[-1] 오류
            int diff=numLog[i]-numLog[i-1];
            switch(diff){
                case 1 : answer+="w"; break;
                //answer[i]="w" : String은 배열이 아니기 때문에 인덱스로 할당할 수 없음=>문자열 연결
                case -1 : answer+="s"; break;
                //break 없으면 다음 case도 실행
                case 10 : answer+="d"; break;
                case -10 : answer+="a"; break;
            }
        }
        return answer;
    }
}
