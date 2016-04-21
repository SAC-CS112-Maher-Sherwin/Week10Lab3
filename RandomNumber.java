package week10labs;

public class RandomNumber {
    private int max;    
   
    public RandomNumber (int high){
        max = high;
    }
    
    public int GetANumber (){
        int r = 1 + (int) (Math.random() * max);  
        return r; 
    }
    
}