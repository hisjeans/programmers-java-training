import java.util.ArrayList;
import java.util.List; //list, arraylist java.util 패키지에 있기 때문, import java.util.*; util 패키지 전체 import할 수 있음
class Solution {
    public int[] solution(int n) {
        List<Integer> answer=new ArrayList<>(); //배열 크기 모를 때 사용하기 적합
        answer.add(n); //초기값 추가
        while(n!=1){ //1이 될 때까지 반복
            if(n%2==0) {
                n=n/2;
                answer.add(n);
            }
            else {
                n=3*n+1;
                answer.add(n);
            }
          //answer.add(n);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
      /* 
      int[] answer=new int[answer.size()];
      for(int i=0;i<answer.length;i++) answer[i]=answer.get(i);
      return answer
      */
    }
}

/*
import ajva.util.stream.IntStream;

class Solution{
  public int[] solution(int n){
    return IntStream.concat(
      IntStream.iterate(n, i->i>1, i->i%2==0? i/2:i*3+1), //n에서 시작해 i>1인 동안 반복 짝수일 때 i/2 홀수일 때 i*3+1 계산(초기값, 계속조건, 다음값 계산)
      IntStream.of(1))
      .toArray();
  }
}
