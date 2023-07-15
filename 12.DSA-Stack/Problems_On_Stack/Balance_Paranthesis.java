package Problems_On_Stack;

import java.util.Stack;

class Balance_Paranthesis {
    public static void main(String[] args) {

        String str1 = "({[]})";
        System.out.println(isBalanced(str1));

        String str2 = "({[]}";
        System.out.println(isBalanced(str2));
    }

    static boolean matching(char a, char b) {
        return ((a == '(' && b ==')') ||
                (a == '{' && b =='}') ||
                (a == '[' && b ==']') 
                );
    }


    static boolean isBalanced(String str){

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                st.push(str.charAt(i));
            }

            else {

                if(st.isEmpty() == true){
                    return false;
                }

                else if((matching(st.peek(), str.charAt(i))) == false) {
                    return false;
                }

                else{
                    st.pop();
                }
            }
        }
        
        return (st.isEmpty() == true);
    }
}
