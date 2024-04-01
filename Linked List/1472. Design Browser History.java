class DoubleLL{
    String urlName;
    DoubleLL next;
    DoubleLL prev;

    DoubleLL(String urlName){
        this.urlName = urlName;
        next = null;
        prev = null;
    }
}

class BrowserHistory {

    DoubleLL starting, start;
    int count = 0;

    public BrowserHistory(String homepage) {
        starting = new DoubleLL(homepage);
        start = starting;
        starting.prev = null;
        count++;
    }
    
    public void visit(String url) {
        starting.next = null;
        DoubleLL newUrl = new DoubleLL(url);
        newUrl.prev = starting;
        starting.next = newUrl;
        starting = starting.next;
        
        // DoubleLL temp = start;
        // while(temp != null){
        //     System.out.println(temp.urlName +" Url To be insert: " + url);
        //     temp = temp.next;
        // }
    }
    
    public String back(int steps) {
        DoubleLL tempStore = starting;
        while(starting.prev != null && steps-- > 0){
            starting = starting.prev;
        }
                
        return starting.urlName;

    }
    
    public String forward(int steps) {
        
        DoubleLL tempStore = starting;
        while(starting.next != null && steps-- > 0){
            starting = starting.next;
        }       

        return starting.urlName;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
