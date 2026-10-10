class Solution {
    public List<List<Integer>> groupThePeople(int[] group) {
        List<List<Integer>> l=new ArrayList<>();
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<group.length;i++){
            int g=group[i];
            if(!hm.containsKey(group[i])){
                hm.put(group[i],new ArrayList<>());
            }
            List<Integer> list=hm.get(g);
            list.add(i);
            if(list.size()==g){
                l.add(list);
                hm.remove(g);
            }           
        }
        return l;
    }
}