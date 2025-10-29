//원소들의 곱과 합

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum=0;
        //덧셈 0에서 시작해 더해나감
        int product=1;
        //곱셈 1에서 시작해서 곱해나감, 곱셈에서 초기값이 0이면 결과 또한 항상 0이 됨
        for(int i=0;i<num_list.length;i++){
        //for(int i:num_list) 모든 원소를 순차적으로 접근할 때 

            sum+=num_list[i];
            //sum+=i;
            //배열의 length는 속성 문자열의 length는 메서드 리스트의 length는 메서드, 변수 선언과 동시에 += 불가능

            product*=num_list[i];
            //product*=i;
        }
        return product<sum*sum? 1:0;
        //곱<합의 제곱 이면 1, 아니면 0
        //answer=Math.pow(sum,2)>mult? 1:0; 성능상 sum*sum이 더 빠름

        /*
        return (Arrays.stream(numList).reduce((acc,i)->acc*i).getAsInt() 곱 계산
                  <Math.pow(Arrays.stream(numList).sum(),2))? 1:0; 합의 제곱 계산
        */
    }
}
