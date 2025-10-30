import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i=0;
        //i 초기화
        while(i<arr.length){
          //for문의 경우, 반복 루프들 돌며 i가 증가하기 때문에 while문이 적절할 것
            if(stk.isEmpty()){
                //arraylist는 null이 아님
                stk.add(arr[i]);
                i++;
            }
            else if(stk.get(stk.size()-1)<arr[i]){
                    stk.add(arr[i]);
                    i++;
                    
            }
            else{
                stk.remove(stk.size()-1);
                    //arraylist delete 메서드 없음
                    //i는 증가하지 않음
                    //Java21 이후부터 removeLast() 추가되었음
            }
        }
            
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
      //list 배열 변환하기 위해
    }
}

/*
pulbic Stack<Integer> solution(int[] arr){
  Stack<Integer> stack=new Stack<>();
  int i=0;
  while(i<arr.length){
    if(stack.empty()||stack.peek()<arr[i]){
      stack.push(arr[i]); //끝에 추가
      i++;
    } else if(stack.peek()>=arr[i]) //마지막 보기
        stack.pop(); //마지막 제거
  }
  return stack;
  }
}
*/
