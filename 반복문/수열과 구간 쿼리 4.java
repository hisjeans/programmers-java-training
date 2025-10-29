//수열과 구간 쿼리 4


class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        //s<=i<=e= all i if (i>k%==0) arr[i]+1
        for(int idx=0;idx<queries.length;idx++){
            int[] query=queries[idx];
            int s=query[0], e=query[1], k=query[2];
            for(int i=s;i<=e;i++){
                if(i%k==0) arr[i]+=1;
            }
        } return arr;
    }
    
}

/* 
for(int i=0;i<queries.length;i++){
  for(int j=queries[i][0];j<=queries[i][1];j++){ 쿼리 지정 범위 s~e까지 인덱스 확인
    if(j%queries[i][2]==0) arr[j]+=1; j가 k의 배수가 맞는지 확인
  }
}
return arr;
