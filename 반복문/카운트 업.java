//카운트 업
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
//0~7행 
        for(int i=0;i<=end_num-start_num;i++)
            answer[i]=start_num+i;
        
        return answer;
    }
}
//return IntStream.rangeClosed(start,end).toArray(); rangeClosed:start~end(closed range) 끝 포함 != range 끝 제외, stream->int[] 배열 변환 

//복잡한 로직->명시적 반복문, 단순 변환 or 생성->StreamAPI
//ex1. 짝수만 IntStream.rangeClosed(1,10).filter(x->x%2==0).toArray() 
//ex2. 제곱  IntStream.rangeClosed(1,5).map(x->x*x).toArray()
//ex3. 역순 IntStream.rangeClosed(1,5).map(x->6-x).toArray() or IntStream.iterate(5,x->x>=1,x->x-1).toArray() : iterate(시작값, 계속조건, 다음값계산)
