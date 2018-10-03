
package EvidenceThree;

public class Febonakkii {
    public static void main(String[] args) {
        int a, b, c;
        for(a=0, b=1, c=0; c<=50; a=b, b=c, c=a+b){
            System.out.println(c + " ");
        }
    }
    
}
