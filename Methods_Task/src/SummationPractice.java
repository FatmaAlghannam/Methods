import java.util.List;
import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args)  {
        ArrayList<Integer>
        numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(20);

        int sum = calculateSum(numbersList);
        System.out.println("Sum of the #:"+ sum);
    }
        public static int calculateSum(ArrayList<Integer>numbers){

int sum = 0;
for (int num: numbers){
sum+= num;
}
return sum ;


}

        }

        
    

