package pattern.character;

public class ch6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                if(i%2!=0){
                    System.out.print("0 ");
                }else{
                    System.out.print("Z ");
                }
            }
            System.out.println();
        }
    }
}

// 0 0 0 0 0 
//   Z Z Z Z 
//     0 0 0 
//       Z Z 
//         0 