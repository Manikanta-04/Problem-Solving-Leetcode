class Solution {
    public static void print_divisors(int n) {
        // code here
                List<Integer> largeDivisors = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i != n / i) {
                    largeDivisors.add(n / i);
                }
            }
        }
        
        // print large divisors in reverse order
        for(int i = largeDivisors.size() - 1; i >= 0; i--) {
            System.out.print(largeDivisors.get(i) + " ");
        }

    }
}
