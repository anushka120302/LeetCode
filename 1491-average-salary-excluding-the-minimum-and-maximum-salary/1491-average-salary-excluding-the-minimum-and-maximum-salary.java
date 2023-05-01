class Solution 
{
    public double average(int[] salary) 
    {
        Arrays.sort(salary);
        double sum = salary[0]+salary[salary.length-1];
        double total=0;
        for(int i =0;i<salary.length;i++)
        {
            total+=salary[i];
        }
        total = total-sum;
        return total/(salary.length-2);
    }
}