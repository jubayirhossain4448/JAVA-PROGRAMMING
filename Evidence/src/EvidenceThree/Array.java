package EvidenceThree;
public class Array {
    public static void main(String[] args) {
        int [] arr = {4, 8, 5, 1, 7};
        int sum = 0;
        for(int i : arr){
        sum += i;
            System.out.println(i + "");
        }
        System.out.println("Sum: " + sum);
    }
    
}
