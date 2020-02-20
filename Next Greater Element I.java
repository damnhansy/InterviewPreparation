class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<nums2.length;i++){
            
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                
                hash.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            
            nums1[i] = hash.getOrDefault(nums1[i],-1);
        }
         return nums1;
    }
}
