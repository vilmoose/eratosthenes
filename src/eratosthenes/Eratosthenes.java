/*
 *Vilmos Feher
 *eratosthenes.java
 *27/02/2019
 */

package eratosthenes;

import java.util.ArrayList;

/**
 *
 * @author vifeh1685
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean numbers[] = new boolean[1000];
    int i;
    
    for(i = 1; i<1000; i++){
    numbers[i] = true;
    }
        for(int x =2; x<numbers.length; x++){
        
            if(numbers [x-1] == true){
            
              }
            
            for(int y = x * x; y <= numbers.length; y +=x){
                numbers[y-1] = false;
            }
            for(int z=1 ;z <10; z++){
            
            System.out.println(x);
            }
        }
    


//Mr kaune method
//    int i; 
//    boolean prime[] = new boolean[1000];
//    for(i = 0; i<=1000; i++){
//    prime[i] = true;
//         }
//    
//    int nextPrime = 2;
//    while(nextPrime<Math.sqrt(1000)){
//        for(i= nextPrime; i<1000; i+=nextPrime){
//            prime[i]=false;    
//         }
//        do{
//            nextPrime++;
//        }
//        while(prime(nextPrime) != true){
//        }
//      
//    }     
//  }
    }   
}
