class fact {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        int factor = 1;
        if(n==0 && n==1){
            return 1;
        }
        else{
            for(int i=n;i>=1;i--){
                factor = factor * i;
            }
            return factor;
        }
    }
    public static void main(String[] args) {
        int a = 5;
        fact obj = new fact();
        int result = obj.factorial(a);
        System.out.println(result);

    }
    
}
