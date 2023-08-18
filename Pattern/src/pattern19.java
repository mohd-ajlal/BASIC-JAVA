// n = 7 // rows is always odd.
//             1 
//         2 1   1 2 
//     3 2 1       1 2 3 
// 4 3 2 1           1 2 3 4 
//     3 2 1       1 2 3 
//         2 1   1 2 
//             1 
public class pattern19 {
    public static void main(String[] args) {
        int n = 7;
        int nst = 1;
        int nsp = n / 2;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            int cval = val;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cval + "\t");
                if (cst <= nst / 2) {
                    cval--;
                } else {
                    cval++;
                }
            }
            System.out.println();
            if (i <= n / 2) {
                nst += 2;
                nsp--;
                val++;
            } else {
                nst -= 2;
                nsp++;
                val--;
            }
        }
    }
}
