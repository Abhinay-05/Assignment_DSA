class StockSpanner {

    List<Integer> list;

    public StockSpanner() {
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        int len = list.size();
        int count = 0;
        for(int i = len-1 ; i >= 0 ; i--){
            if(list.get(i) > price){
                break;
            }
            count++;
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */