
package Evidence;

public class MultidimentionalArray {
    public static void main(String[] args) {
        int arr[][] = {{4, 2, 3},{2, 6, 5},{7, 4, 6}};
        int m = 0;
        for (int i = 0; i <arr.length; i++)
        {
        for(int j = 0; j<arr[i].length; j++){
        for (int k = j+1; k<arr[i].length; k++){
        if(arr[i][j]>arr[i][k]){
        m = arr[i][j];
        arr[i][j]= arr[i][k];
        arr[i][k]= m;
        }
        }
            System.out.println(arr[i][j] + " ");
        }
            System.out.println();
        }
    }
    
}
