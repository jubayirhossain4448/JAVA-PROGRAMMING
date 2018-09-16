
public class RandomNumberEx {
    public static void main(String[] args) {
        int singleDigitNumber = (int) (Math.random()* 10);
        System.out.println("Single Digit Number: " + singleDigitNumber);
    
        int twoDigitNumber = (int) (Math.random()* 100);
        System.out.println("Two Digit Number: " + twoDigitNumber);
        
        int threeDigitNumber = (int) (Math.random()* 1000);
        System.out.println("Three Digit Number: " + threeDigitNumber);
       
    }
    
    
}
