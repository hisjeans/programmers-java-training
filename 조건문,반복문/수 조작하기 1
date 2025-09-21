class Solution {
    public int solution(int n, String control) {
        for(int i=0;i<control.length();i++){
            //length() 메서드 호출
            if(control.charAt(i)=='w') n++;
            //문자와 문자열 ==로 비교, String은 charAt(i)로 접근해야 함, 문자에서 작은따옴표를 사용
            else if(control.charAt(i)=='s') n--;
            else if(control.charAt(i)=='d') n+=10;
            else n-=10;
        }
        return n;
    }
}


/* switch문 사용
switch(control.charAt(i)) {
  case 'w' : n++; break; ...
*/

/*
return control.chars().reduce(n, (acc, c) -> acc + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10));
control.chars() : String->IntStream 변환, "wsa"->[199,115,97] 각 문자의 ASCII 값
reduce(초기값, (누적값, 현재값) -> 새로운 누적값) 초기값 n(매개변수) 누적값 acc(accumulator) 현재값 c(current character의 ASCII값)
*/
