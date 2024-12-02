public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean prime[] = new boolean[n + 1];
        for(int i=0; i<n;i++){
            prime[i] = true;
        }
        int p=2;
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
        int count = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for(int j=2; j<n; j++){
            if(prime[j] == true){
                System.out.println(j);
                count++;
            }
        }
        int percent = (int)((double)count / (double)(n) * 100.0);
        //int percent = (int)(((double) count / (n)) * 100);
        System.out.println("There are " + count + " primes between 2 and " + n + 
        " (" + percent + "% are primes)");
       
    }
}