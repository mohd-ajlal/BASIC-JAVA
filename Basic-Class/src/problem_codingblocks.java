public class problem_codingblocks {
    public static void main(String[] args) {
        int n = 22;
        int fs = fsum(n);
        int ns = nsum(n);
        if(fs == ns){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        
    }

    static int nsum(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }

    static int fsum(int n){
        int sum = 0;
        int i = 2;
        while(n!=1){
            while(n%i==0){
                n= n/i;
                sum += nsum(i);
            }
            i++;
        }
        return sum;
    }
}
