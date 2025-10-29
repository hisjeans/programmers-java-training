//이어 붙인 수
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
      //문자열 이어붙이기 : StringBuilder 또는 String 사용

        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2!=0) sb1.append(num_list[i]);

            else sb2.append(num_list[i]);
          //자바의 삼항연산자는 반드시 값으로 평가되어야 하고, 단순히 메서드 호출만 하는 식으로 쓸 수 없음 ->if문 사용
        }
        answer=Integer.parseInt(sb1.toString())+Integer.parseInt(sb2.toString());
      //문자열->정수 변환
        return answer;
    } 
}

/*
for(int num:num_list){
  if(num%2==0){ 기존 수 뒤에 한 자리 추가
    even*=10;
    even+=num;
  } else {
    odd*=10;
    odd+=num;
  }
}

for(int num:num_list){
  (num%2==0? even:odd).append(num);
}
return Integer.parseInt(even.toString())+Integer.parseInt(odd.toString());
*/
