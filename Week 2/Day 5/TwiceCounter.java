/*
Coding Platform: Geeksforgeeks
Link: https://practice.geeksforgeeks.org/problems/twice-counter4236/1
*/
class Solution
{
    public int countWords(String list[], int n)
    {
        // code here 
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : list){
            if(!map.containsKey(s))
                map.put(s,1);
            else
                map.put(s,map.get(s)+1);
        }
        int c = 0;
        for (Map.Entry entry : map.entrySet()){
            if(((int)entry.getValue()) == 2)
                c++;
        }
        return c;
    }