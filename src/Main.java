import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        //COMPLETE ME!
        for (int i = 1; i < nums.size()- 1; i++){
            int curr = nums.get(i);
            int next = nums.get(i + 1);
            System.out.println(nums.get(i -1));
            nums.set(i -1, curr + next);

        }

        System.out.println(nums);

    }
}
