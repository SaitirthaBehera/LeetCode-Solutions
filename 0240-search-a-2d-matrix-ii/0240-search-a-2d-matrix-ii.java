class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return false;
        }
        for(int i=0;i<matrix.length;i++){
            int low=0;
            int high=matrix[0].length-1;
             while(low<=high){
                int mid=low+(high-low)/2;
                int midVal=matrix[i][mid];
                if(midVal==target){
                    return true;
                }
                else if(midVal<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
             }
        }
        return false;
        
    }
}