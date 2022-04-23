package Array.ImportantAlgorithm.MooreVotingAlgorithm;
class MajorityElementProblem{
    public static void main(String[] args) {
        int nums[] ={3,2,3};
        majorityElement(nums);
    }
    public static int majorityElement(int[] nums) {
        int majority_element = nums[0];
        int count =0;
        for (int i =0 ; i<nums.length ;i++){
            if (nums[i]==majority_element){
                count++;
            }else{
                count--;
                if(count<0){
                    count=0;
                    majority_element=nums[i];
                }
            }
        }

        return majority_element;
    }
}