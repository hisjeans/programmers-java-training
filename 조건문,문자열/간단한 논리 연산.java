class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        if((x1==true||x2==true)&&(x3==true||x4==true)){
            return answer;
        }
        else {
            answer=false;
            return answer;
        }

    }
}

/*
boolean answer=(x1||x2)&&(x3||x4);
return answer;
*/

/*
boolean answer=false;
int t=0;
int f=0;
boolean[] isit={x1,x2,x3,x4};
for(int i=0;i<isit.length;i+=2){
  boolean current=isit[i]; //0,2번 인덱스
  boolean next=isit[i+1]; //1,3번 인덱스
  if(current||next) t++; //or 결과 true
  else if(!current&&!next) f++; //or 결과 false
}
//System.out.println(t+""+f);
if(t>f) return true;
return answer;
}
