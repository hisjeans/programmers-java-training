//문자 리스트를 문자열로 변환하기

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
            //문자열:메소드 호출-괄호 필요, 배열:필드 접근-괄호 불필요
        }
        return answer;
//return String.join("",arr); 모든 요소 구분 없이 연결
//String.join(구분자, 배열 or 컬렉션) 배열이나 컬렉션의 요소들을 하나의 문자열로 연결
    }
}
