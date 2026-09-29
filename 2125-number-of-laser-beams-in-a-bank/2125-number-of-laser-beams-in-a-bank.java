class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(char ch:bank[i].toCharArray()){
                if(ch=='1')
                    count++;
            }
            if(count==0)
                res[i]=-1;
            else
                res[i]=count;
        }
        int sum=0;
        int prev=0;
        for(int i=0;i<n;i++){
            if(res[i]!=-1){
                if(prev!=0)
                    sum+=prev*res[i];
            prev=res[i];
            }
        }
        return sum;
    }
}