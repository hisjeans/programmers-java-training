class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer=0; 

        //boolean answer = false; 조건 결과 boolean으로 저장

        if(ineq.equals(">")&&eq.equals("=")){ //문자열은 .equals()로 비교해야
            answer=n>=m? 1:0;

            //answer = n >= m;

            
        }
        else if(ineq.equals("<")&&eq.equals("=")){
            answer=n<=m? 1:0;
            
        }
        else if(ineq.equals(">")&&eq.equals("!")){
            answer=n>m? 1:0;
            
        }
        else{
            answer=n<m? 1:0;
        }

        return answer;
        
        //return answer ? 1 : 0; boolean->int 변환


/* 두 개의 Integer를 받아 Boolean 반환
Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b, 함수 저장
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0; 
        ">=" 키로 함수 찾고 찾은 함수에 n, m을 적용
*/


//return (">".equals(ineq) ? n > m : n < m) || ("=".equals(eq) ? n == m : false) ? 1 : 0; 삼항연산자 ">" 부등호 판단-> "=" 등호 판단-> 결과 반환
    
    }
}
