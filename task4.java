public class task4 {
    public static void main(String[] args) {
        int arrayNum [] = {33,20,18,19,10,4,7,16};
        int sum = 0;
        for(int i = 0; i < arrayNum.length; i++) {
            if(arrayNum[i]%2 != 0) {
                sum+= arrayNum[i];
            }
         
    }
    System.out.println(sum);   
    }
}
