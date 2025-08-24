//대소문자 바꿔서 출력하기

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        
        for(int i=0;i<str.length();i++){
            char tok=str.charAt(i);
                    if(Character.isUpperCase(tok))
                        System.out.print(Character.toLowerCase(tok));
            //System.out.print((char)(tok+32));
            else if(Character.isLowerCase(tok))
                System.out.print(Character.toUpperCase(tok)); 
            //System.out.print((char)(tok-32));
        }

    }
}


/*
for(Character c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                //stack.push(Character.toLowerCase(c));
                answer += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                //stack.push(Character.toUpperCase(c));
                answer += Character.toUpperCase(c);
            }
        } 
        System.out.println(answer);
    }
}
*/
