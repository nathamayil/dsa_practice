/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.*/
  
//Solution:
class Solution {
public int romanToInt(String s) {

    int answer = 0;
	
    //map | char:int
    Map<Character, Integer> map = new HashMap<Character,Integer>();
    map.put('M', 1000);
    map.put('D', 500);
    map.put('C', 100);
    map.put('L', 50);
    map.put('X', 10);
    map.put('V', 5);
    map.put('I', 1);
    
    //special instances map| str:int
    Map<String, Integer> sMap = new HashMap<String,Integer>();
    sMap.put("IV", 4);
    sMap.put("IX", 9);
    sMap.put("XL", 40);
    sMap.put("XC", 90);
    sMap.put("CD", 400);
    sMap.put("CM", 900);
    
    //loop through string
    int i = 0;
    while(i < s.length() - 1){
        //check if 2 character string starting from i is in special instances
        if(sMap.containsKey(s.substring(i, i + 2))){
            answer = answer + sMap.get(s.substring(i, i + 2));
            i += 2;
        } else {
            //else, add current letter int value to answer
            answer = answer + map.get(s.charAt(i));
            i++;
        }
    }
    
    //if theres one character left to evaluate in string
    if (i < s.length()){
        answer = answer + map.get(s.charAt(i));
    }
    
    return answer;
}
}
  
