//수열과 구간 쿼리

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // arr 배열을 직접 수정하거나, 복사본을 만들어 사용
        // 여기서는 arr을 직접 수정하는 방식 사용
        
        // 각 query를 순서대로 처리
        for(int k = 0; k < queries.length; k++) {
        //for(int[] query : queries)
            int i = queries[k][0];  // 첫 번째 인덱스 int i=query[0];
            int j = queries[k][1];  // 두 번째 인덱스 int j=query[1];
            
            // arr[i]와 arr[j]의 값을 교환
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        return arr;  // 수정된 배열 반환
    }
}    
