class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int rW = row + 2;   // Width of a row in parents[] array.        
        int parents[] = new int[(col + 2) * (row + 2)]; // Flip the grid on the diagonal.
        int neighbours[] = {-rW-1, -rW, -rW+1, -1, 1, rW-1, rW, rW+1};
        int lastRow = col * rW, firstRow = 2 * rW - 1;
        
        for (int cellsIdx = 0; ; cellsIdx++) {
            int cell = cells[cellsIdx][1] * rW + cells[cellsIdx][0], parent = cell;
            parents[cell] = cell;
            for(int n : neighbours)
                if(parents[cell + n] != 0) {
                    int oldPar = findParent(parents, cell + n);
                    if (parent != oldPar)
                        if (parent <= firstRow) 
                            if (oldPar >= lastRow) return cellsIdx;
                            else parents[oldPar] = parent;
                        else if (parent >= lastRow) 
                            if (oldPar <= firstRow) return cellsIdx;
                            else parents[oldPar] = parent;
                        else parent = parents[parent] = oldPar;
                }                
        }
    }
    
    private int findParent(int parents[], int cel) {
        return parents[cel] == cel? cel: (parents[cel] = findParent(parents, parents[cel]));
    }
}