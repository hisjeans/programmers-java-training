//마지막 두 원소

class Solution {
    public int[] solution(int[] num_list) {
        
        int len=num_list.length;
        int[] answer = new int[len+1]; 
        //int[] answer={}; 빈 배열로 초기화->answer[alen-1]접근하면 answer가 빈 배열이므로 인덱스 오류 발생, 새로운 원소 추가할 공간 없음
        int alen=answer.length;
        
        for(int i=0;i<len;i++){
            answer[i]=num_list[i];
            //num_list의 모든 원소 새 배열에 복사해야 함
        }
        answer[alen-1]=num_list[len-1]>num_list[len-2]? num_list[len-1]-num_list[len-2]:num_list[len-1]*2;
        //삼항 연산자 : 직접 대입 연산 수행 x
        return answer;
    }
}
