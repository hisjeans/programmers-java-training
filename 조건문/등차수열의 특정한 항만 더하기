//등차수열의 특정한 항만 더하기

//import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0;i<included.length;i++){ //i는 등차수열 값이 아님 배열 인덱스는 0~(0 based), 등차수열 항 번호는 1항~(1-based)
            if(included[i]==true){ //included[i]는 (i+1)항 의미
                answer+=a+i*d; //실제 등차수열 값((i+1)항)을 더함
            }
        }
        return answer;
        //return IntStream.range(0,included.length).map(idx->included[idx]? a+(idx*d):0).sum();
        //'included[i]' 는 boolean 자체가 이미 true/false 값, 0~배열 길이-1까지 stream생성, 'included[idx]' 가 true이면 등차수열 값 'a+(idx*d)' 더함 false이면 0 '.sum()' 합계 반환
    }
}
