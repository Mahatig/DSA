/*https://leetcode.com/problems/majority-element/*/
public class MajorityElement
{
    public static void main(String[] args)
    {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};
        int candidate=0;
        int count=0;
        for(int n:nums)
        {
            if(count==0)
            {
                candidate=n;
                count=1;
            }
            else if(n==candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count=0;
        for(int n:nums)
        {
            if(n==candidate)
            {
                count++;
            }
        }
        if(count>nums.length/2)
        {
            System.out.println("the majority element is "+candidate);
        }
        else
        {
            System.out.println("majority element not found");
        }
    }
}
