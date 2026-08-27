class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer>hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();

        int n=A.length;
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            hs1.add(A[i]);
            hs2.add(B[i]);
            int count=0;
            for(int x:hs1)
                if(hs2.contains(x)){
                    count++;
                }
            arr[i]=count;
        }
        return arr;
    }
}