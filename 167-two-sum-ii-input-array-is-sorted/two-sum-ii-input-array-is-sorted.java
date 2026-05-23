class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0,j=arr.length-1;
        int sum=0;
        while(i<j)
        {
                sum=arr[i]+arr[j];
                if(sum==target)
                return new int[]{i+1,j+1};

                if(sum>target )
                j--;
                else
                i++;
        }
        return new int[]{};
        
    }
}