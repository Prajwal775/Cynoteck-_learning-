public class TwoDArray {
    public static void main(String[] args) {
        int grid[][]={{1,2,3},
                {4,5},
                {8,9}};

        for(int i=0;i< grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                System.out.print(grid[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
