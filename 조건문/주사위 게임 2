//주사위 게임 2

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        //int count=1; 단계별 카운트

        if (a==b&&b==c) answer=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c); 
        //자바는 a==b==c 연쇄 비교 지원X, (a==b)==c로 해석돼 boolean과 int 비교 시도하므로 컴파일 에러
        //가장 구체적
        //count++; 세 개 모두 같으면 count=3

        else if(a==b||b==c||a==c) answer=(a+b+c)*(a*a+b*b+c*c);
        //중간, 첫 번째 조건이 false이므로 자동으로 "모두 같음" 제외
        //count++; if문, 두 개 이상 같으면 count=2

        else answer=a+b+c;
        //나머지

        return answer;
        /*
        count=1:모두 다름, count=2:두 개 같음, count=3:세 개 모두 같음
        for(int i=1;i<=count;i++){
            answer*=(pow(a,i)+pow(b,i)+pow(c,i));
          }
        */

        /*
        Set<Integer> numbers=Stream.of(a,b,c).collect(Collectors.toSet()); 중복 자동 제거
        return (a+b+c)*
          (numbers.size()<3? a*a+b*b+c*c:1)* 
          (numbers.size()<2? a*a*a+b*b*b+c*c*c:1);
        numbers.size()==3이면 모두 다름(중복 없음)
        numbers.size()==2이면 두 개 같음(하나 중복)
        numbers.size()==1이면 세 개 모두 같음(모두 중복)
        */

        /*
        return a==b&&b==c? (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c) :
        a==b||b==c||c==a?
          (a+b+c)*(a*a+b*b+c*c) :
          a+b+c;
        조건1? 값1:(조건2? 값2:값3)
        (모두 같음)? 세제곱공식:(
          (두 개 같음)? 제곱공식:합공식
        )
        */
        
    }
}
