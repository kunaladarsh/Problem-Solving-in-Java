/* Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and 
upper cases, more than once.

Example 1:
Input: s = "hello"
Output: "holle"

Example 2:
Input: s = "leetcode"
Output: "leotcede"
 
Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
*/

class Solution {
    public String reverseVowels(String s) {

    char[] ch = s.toCharArray();
    int n = ch.length;
    int i=0;
    int j=n-1;
    while(i<=j){
    char c = ch[i];
    if(c == 'a'||c == 'A'  || c=='e'||c == 'E' || c=='i'||c == 'I' || c=='o'||c == 'O' || c== 'u'||c == 'U'){
       while(i<=j){
                char c1 = ch[j];
                if(c1 == 'a'||c1 == 'A'  || c1=='e'||c1 == 'E' || c1=='i'||c1 == 'I' || c1=='o'||c1 == 'O' || c1== 'u'||c1 == 'U'){
                    ch[j] = c;
                    ch[i] = c1;
                    j--;
                    break;
                }
            j--;
        }
    }
    i++;
    }

    StringBuilder ans = new StringBuilder();
    for(int i1=0; i1<n; i1++){
        ans.append(ch[i1]);
    }
      return ans.toString();  
    }
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    System.out.println(reverseVowels(s1));
}
}


