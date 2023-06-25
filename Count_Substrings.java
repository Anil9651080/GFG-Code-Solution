public class Count_Substrings {
    int countSubstr (String S)
    {
         int strOne = 0;
         for(int i=0;i<S.length();i++){
             if(S.charAt(i)=='1'){
                 strOne++;
             }
         }
         return (strOne*(strOne+1))/2-strOne;
    }F
}
