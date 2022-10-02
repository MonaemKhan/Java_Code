public class pet3 {
    public static void main(String[] args) {
        char[][] num = new char[5][5];
        int i,j;
        for(i=0;i<=4;i++){
            for(j=0;j<=4;j++){
               num[i][j] = '$';
            }
        }
        for(i=0;i<=4;i++){
            for(j=0;j<=4;j++){
                if(i>j)
                    System.out.print(" ");
                else
                    System.out.print(num[i][j]);
            }
            System.out.print("\n");
        }
    }
    
}
