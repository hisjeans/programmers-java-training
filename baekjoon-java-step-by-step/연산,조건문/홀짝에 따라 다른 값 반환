
class Solution {
    public int solution(int n) {
        int answer = 0;

        /*
        for(int i = n; i >= 0; i -= 2)
                answer += (n % 2 == 0) ? i * i : i; n이 짝수이면 i의 제곱을 answer에 더하고 홀수이면 i 자체를 answer에 더함
        */

        if(n%2==0){
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    answer+=i*i;
                    
                }
            }
        }
        else{
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                    answer+=i;
                }
            }
        }

        /*
        if (n % 2 == 1) {
            return (n + 1) * (n + 1) / 2 / 2; 홀수 n일 때 홀수의 합 공식 
        } else {
            return 4 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 6;   짝수 n일 때 짝수 제곱의 합 공식 
        }
        */
        
        return answer;
        
    }
}
