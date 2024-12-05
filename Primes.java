public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean prime[] = new boolean[n + 1];
        int p=2, count =0;
        for(int i=0; i<=n;i++){
            prime[i] = true;
        }
        while (p * p <= n) {
            if (prime[p] == true) {
                int mult = p * p;
                while (mult <= n) {
                    prime[mult] = false;
                    mult = mult + p;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        for(int j=2; j<=n; j++){
            if(prime[j] == true){
                System.out.println(j);
                count++;
            }
        }
        int percent = (int)((double)count / (double)(n) * 100.0);
        System.out.println("There are " + count + " primes between 2 and " + n + 
                            " (" + percent + "% are primes)");
       
    }
}