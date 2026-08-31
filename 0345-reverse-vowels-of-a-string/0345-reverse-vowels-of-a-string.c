char* reverseVowels(char* s) {
    int i=0,len=0,k=0;
    while(s[i]!='\0'){   
        len++;
        i++;
    }
    char c[len];
    int index[len];
    i=0;
    while(s[i]!='\0'){
        char ch=tolower(s[i]);
        if(ch=='a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u'){
            index[k]=i;
            c[k++]=s[i];
        }
        i++;
    }
    for(int i=0;i<k;i++){
        s[index[i]]=c[k-1-i];
    }
    return s;
}