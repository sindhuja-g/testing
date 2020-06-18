package streams;

import java.util.Arrays; 
import java.util.IntSummaryStatistics; 
import java.util.List;
 import java.util.stream.Collectors;
 public class lam
{ 
private static final int List = 0;

public static void main(String args[])
 {
 List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
 long count = strList.stream() .filter(x -> x.isEmpty()) .count();
 System.out.printf("List %s has %d empty strings %n", strList, count);
  long num = strList.stream() .filter(x -> x.length()> 3) .count();
 System.out.printf("List %s has %d strings of length more than 3 %n", strList, num); 
 count = strList.stream() .filter(x -> x.startsWith("a")) .count();
 System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count); 
List<String> filtered = strList.stream() .filter(x -> !x.isEmpty()) .collect(Collectors.toList()); 
System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);  
filtered = strList.stream() .filter(x -> x.length()> 2) .collect(Collectors.toList());
 System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered); 
 List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", "));
 System.out.println(G7Countries);
 List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
List<Integer> distinct = numbers.stream() .map( i -> i*i).distinct() .collect(Collectors.toList()); 
System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct); 
List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics(); 
System.out.println("Highest prime number in List : " + stats.getMax()); 
System.out.println("Lowest prime number in List : " + stats.getMin());
 System.out.println("Sum of all prime numbers : " + stats.getSum());
 System.out.println("Average of all prime numbers : " + stats.getAverage()); 
 
 List<String> vect = Arrays.asList("geekf", "geeks","or", "keeg", "abc", "bc"); 

 if( checkPalindromePair(vect) == true) 
     System.out.println("Yes it is palindrome"); 
 else
     System.out.println("No");  
}
static boolean isPalindrome(String str) 
{ 
    int len = str.length(); 
   
    // compare each character from starting 
    // with its corresponding character from last 
    for (int i = 0; i < len/2; i++ ) 
        if (str.charAt(i) != str.charAt(len-i-1)) 
            return false; 
   
    return true; 
} 
   
// Function to check if a palindrome pair exists 
static boolean checkPalindromePair(List<String> vect) 
{ 
    // Consider each pair one by one 
    for (int i = 0; i< vect.size()-1; i++) 
    { 
        for (int j = i+1; j< vect.size() ; j++) 
        { 
            String check_str = ""; 
   
            // concatenate both strings 
            check_str = check_str + vect.get(i) + vect.get(j); 
   
            // check if the concatenated string is 
            // palindrome 
            if (isPalindrome(check_str)) 
                return true; 

            check_str = vect.get(j) + vect.get(i); 
   
            // check if the concatenated string is 
            // palindrome 
            if (isPalindrome(check_str)) 
                return true; 
        } 
    } 
    return false; 
} 


   
 } 


