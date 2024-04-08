class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circlesand=0;
        int sqrsand=0;

        for(int choice: students)
        {
            if(choice==0)
            {
                circlesand++;
            }
            else
            {
                sqrsand++;
            }
        }
        for(int sandwich:sandwiches)
        {
            if(sandwich==0 && circlesand==0)
            return sqrsand;
            if(sandwich==1 && sqrsand==0)
            return circlesand;
            if(sandwich==0)
            circlesand--;
            if(sandwich==1 )
            sqrsand--;
            
        }
        return 0;
    }
}