boolean containsCloseNums(int[] nums, int k) {

    HashMap<Integer, Integer> last_index = new HashMap<Integer,Integer>();
    
    if(k == 0)
        return false;
    
    for(int i = 0; i < nums.length; i++)
    {
        if(last_index.containsKey(nums[i]))
        {
            if(i - (last_index.get(nums[i])) <= k)
                return true;
        }
        

        last_index.put(nums[i], i);        
    }
    
    return false;
}
