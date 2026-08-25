class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int arr1[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
            if(nums[i]<pivot)
                arr1[k++]=nums[i];
        for(int i=0;i<n;i++)
            if(nums[i]==pivot)
                arr1[k++]=nums[i];
        for(int i=0;i<n;i++)
            if(nums[i]>pivot)
                arr1[k++]=nums[i];
        return arr1;
    }
}