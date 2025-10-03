//수열과 구간 쿼리 2

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
//쿼리 3개 
        for(int queryIdx=0;queryIdx<queries.length;queryIdx++){
            int[] query=queries[queryIdx];
//오답:queries.length 전체 쿼리의 개수, query는 개별 쿼리 하나 항상 크기 3, 개별 배열 인덱스 항상 0,1,2 고정, 2차원 배열에서 배열.length는 외부 배열의 크기, 개별 원소 접근은 해당 원소 인덱스 사용
            int s=query[0];
            int e=query[1];
            int k=query[2];
            int min=Integer.MAX_VALUE;
            //초기값 아직 안 찾음
            for(int i=s;i<=e;i++){

                if(arr[i]>k&&arr[i]<min)
                    min=arr[i];
           
            }
//i는 arr 배열 순회하는 인덱스, answer는 쿼리 개수만큼만 공간 있음 최소값은 하나씩 확인하며 누적해야 함(초기화->순회하며 비교/갱신->최종결과)
            if(min==Integer.MAX_VALUE) answer[queryIdx]=-1;
            else answer[queryIdx]=min;
            
        
        }
             
        return answer;
    }
}

/*
int[] answer = {};
        return IntStream.range(0, queries.length) 모든 쿼리 순회
                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1]) 쿼리 인덱스 q에 대해 쿼리 시작 인덱스부터 끝 인덱스까지 범위에 해당하는 배열 인덱스 스트림 생성
                        .map(i -> arr[i]) 배열 인덱스 실제 배열 값으로 변환(매핑)
                        .filter(i -> i > queries[q][2]) k 값 보다 큰 원소만 남김
                        .min().orElse(-1) 필터링된 원소 가운데 최솟값 발견 만일 조건 만족하는 원소가 하나도 없다면 이는 최솟값이 없는 것으로 즉 결과가 비어 있으면 -1 반환
                ).toArray(); 최종 결과 스트림 정수 배열로 변환하여 반환
*/

/*
    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1); 초기값을 조건에 맞게 -1로 모두 채움

        for (int idx = 0; idx < queries.length; idx++) { 
            int[] query = queries[idx];
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (k < arr[i]) { 
                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                    //조건 만족하는 경우 값 업데이트 아직 큰 값을 찾지 못했으므로 현재 arr[i] 최초 후보로 저장
                    
                }
            }

        }
*/
