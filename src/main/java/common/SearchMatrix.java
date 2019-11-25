package common;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length==0 || matrix[0].length ==0){
            return false;
        }

        int r = matrix.length;
        int c = matrix[0].length;

        int start = 0;
        int end = (r * c) - 1;

        while(start < end){
            int mid = (start + end )/2;
            int midX = mid/c;
            int midY= mid % c;

            if(matrix[midX][midY]==target){
                return true;
            }
            if(matrix[midX][midY]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;

    }
}
