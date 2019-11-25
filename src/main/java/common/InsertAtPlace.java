package common;

public class InsertAtPlace {

    public static void main(String[] args) {

        int [] inputs = {1,2,3,4,6};
        int target = 5;

       int actual = findPlaceToInsert(inputs,target);
       if( 4 != actual){
            System.out.printf("Hey Its incorrect {}".format(""+actual));
        }
    }

    /**
     * Input : list of integers, int target value
     * Output : index in an array
     *
     * @return
     */
    public static int findPlaceToInsert(int [] input, int target){
        //false cases
        if(input == null){
            return 0;
        } else if(target < input[0] ){
            return 0;
        }else{
            for(int i = 0 ; i <  input.length -1 ; i ++){
                if(target > input[i] && target < input[i+1]){
                    return i+1;
                }
            }
        }
        return 0;
    }
}
