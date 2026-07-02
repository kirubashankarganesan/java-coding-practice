package number;

public class perfect_square {
    public static void main(String[] args) {
        int st=20;
        int end=100;

        int i=1;
        while(i*i<=end){
            int sq=i*i;
            if(sq>=st){
                System.out.print(sq+" ");
            }
            i++;
        }

    }
}


// 25 36 49 64 81 100

// for(int i=1;i<=10;i++){
//     int sq=i*i;
//     if(sq>=st&&sq<=end){
//         System.out.print(sq+" ");
//     }
// }