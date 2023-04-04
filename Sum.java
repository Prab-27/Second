class Sum{
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = a + b;
        System.out.println("sum = " + c);
        OddSum(6);
        
        
    }
    static void OddSum(int j){
        int s = 0;
        for (int i = 0; i < j; i++) {
            if (i % 2 != 0) {
                s = s + i;
                System.out.println(i + "  sum = "+ s);

            }
        }
    }
}