class diagonalsum1572 {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i==j)
                {
                    sum=sum+mat[i][j];   //primary
                }
                else if(i+j==mat.length-1)  ///secondary
                {
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
      
    }
}