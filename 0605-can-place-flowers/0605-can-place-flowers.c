bool canPlaceFlowers(int* flower, int f, int n) {
    int num=0,count=0;
    for(int i=0;i<f;i++){
        int num1=(i==f-1)?0:flower[i+1];
        if((num==0 && flower[i]==0 && num1==0)){
            count++;
            flower[i]=1;
        }
        num=flower[i];
    }
    return count>=n;
}