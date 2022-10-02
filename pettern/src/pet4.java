public class pet4 {
    public static void main(String[] args) {
        int[][] num = new int[5][5];
        int i,j,k=0;
        for(i=0;i<=4;i++){
            for(j=0;j<=4;j++){
               num[i][j] = k;
            }
               k++;
        }
        for(i=0;i<=4;i++){
            for(j=0;j<=i;j++){
                System.out.print(" "+num[i][j]);
            }
            System.out.print("\n");
        }
    }
    
}