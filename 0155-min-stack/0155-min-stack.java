class MinStack {

    Stack<Long> s;
    Long minElement=Long.MAX_VALUE;
    
    
    public MinStack() {
        s= new Stack<Long>();
    }
    
    public void push(int value) 
    {
        Long val =Long.valueOf(value);
        if(s.isEmpty())
        {
            minElement=val;
            s.push((long)val);
            return;
        }
        else if(val<minElement)
        {
            s.push(2*val-minElement);
            minElement =val;
        }
        else
            s.push((long)val);
    }
    
    public void pop() {
        if(s.isEmpty())
            return;
        
        long t=s.pop();
       
        if(t<=minElement)
        {
            minElement=2*minElement-t;
            return;
        }
         
    }
    
    public int top() {
        Long val =s.peek();
        if(s.isEmpty())
            return Integer.MIN_VALUE;
        
        if(s.peek()<minElement)
           return minElement.intValue();
        else
        {
             long t= s.peek();
            return (int)t;
        }
    }
    
    public int getMin() {
       
        return minElement.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */