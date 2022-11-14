package Assignment4;
//Q4. WAP to count the number of consonants, vowels, special characters in a String.
public class CountVowelsConsonents {    
    public static void main(String[] args) {    
                
        int vCount = 0, cCount = 0, sCount = 0;;    
               
        String str = "This is a really simple sentence";        
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {       
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {       
                vCount++;    
            }       
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {         
                cCount++;    
            }else {
            	sCount++;
            }
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);  
        System.out.println("Number of Special Characters: "+sCount);
    }    
}  

