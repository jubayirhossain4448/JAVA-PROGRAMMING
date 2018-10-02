package InterfaceThirteenEight;

import java.math.*;


public class SortComparableObject {

    public static void main(String[] args) {

        String[] cities = {"Dhaka", "Khulna", "Chittagong", "Sylhet"};
        java.util.Arrays.sort(cities);
        for (String city : cities){
        System.out.println(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("23232310929223992"),
            new BigInteger("432232323239292"),
            new BigInteger("54623239292")};
java.util.Arrays.sort(hugeNumbers);
for(BigInteger number: hugeNumbers)
            System.out.println(number + "");
    }
}
