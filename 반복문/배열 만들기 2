import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
    ArrayList<Integer> list=new ArrayList<>();
        for(int i=l;i<=r;i++){
        //원본 i를 건드리지 않고 tmp 검사
                int tmp=i;
                boolean isValid=true;
                while(tmp>0){
                    if((tmp%10)!=0&&(tmp%10)!=5){
                        isValid=false;
                        break;
                    }
                    tmp=tmp/10;
                }
                
                if(isValid) list.add(i);
        }

    if(list.isEmpty()) return new int[]{-1};

        return list.stream().mapToInt(i->i).toArray();   
    }
}

/* 이진수는 0,1로만 이루어짐 이진수를 숫자로 읽어 *5->0과 5로만 이루어진 숫자 
i=1->1(이진수)*5=5
i=2->10(이진수)*5=50
i=3->11(이진수)*5=55
i=4->100(이진수)*5=500
I=5->101(이진수)*5=505
-2^6=64, 즉 6비트까지 
for(int i=1;i<64;i++){
 int num=Integer.parseInt(Integer.toBinaryString(i))*5;
    if(l<=num&&num<=r) 
      list.add(num);
}
*/

/* l~r까지 스트림 생성, 조건에 맞는 것만 필터링
int[] answer=IntStream.rangeClosed(l,r).filter(i->{
  while(i>0){
    if(i%5!=0) return false; 각 자릿수가 5의 배수가 아니면 false
    i/=10; 다음 자릿수로 이동
  }
  return true;
}}.toArray();
