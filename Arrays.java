class Arrays{
    public static void main(String[] args){
        int[][] a = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                a[i][j] = (int)(Math.random()*100);
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
}
