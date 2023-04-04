class Sum{
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a + b;
        System.out.println("sum = " + c);
        evenSum(6);
        
        
    }
    static void evenSum(int j){
        for (int i = 0; i < j; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}