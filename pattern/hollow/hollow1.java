package pattern.hollow;

// indexes
// first row: i=1
// last row:  i=n
// first col: j=1
// last col:  j=n
// middle row or col: n/2+1
// major diagonal: i==j
// left diagonal: i+j==n+1

public class hollow1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1||j==1||i==n||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
}

// * * * * *   
// *       *   
// *       *   
// *       *   
// * * * * * 