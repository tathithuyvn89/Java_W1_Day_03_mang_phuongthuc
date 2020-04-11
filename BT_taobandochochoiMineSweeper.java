package Java_W1_Day_03_mang_phuongthuc;

public class BT_taobandochochoiMineSweeper {
    public static void main(String[] args) {
     String [][] map ={
             {"*",".","*",".","."},
             {"*",".",".","*","."},
             {".","*",".",".","."},
             {"*",".","*",".","."},
             {".",".","*",".","."}
     };
     final int MAP_HEIGHT = map.length;
     final int MAP_WIDTH= map[0].length;
     String [][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];
     for (int yOrdinate =0; yOrdinate<MAP_HEIGHT;yOrdinate++){
         for (int xOrdinate=0;xOrdinate<map[0].length;xOrdinate++){
             String currentCell = map[yOrdinate][xOrdinate];
             if (currentCell.equals("*")){
                 mapReport[yOrdinate][xOrdinate]="*";
             } else {
                 final int[][] NEIGHBOUR_ORDINATE ={
                         {yOrdinate-1,xOrdinate-1},{yOrdinate-1,xOrdinate},{yOrdinate-1,xOrdinate+1},
                         {yOrdinate,xOrdinate-1},{yOrdinate,xOrdinate+1},
                         {yOrdinate+1,xOrdinate-1},{yOrdinate+1,xOrdinate},{yOrdinate+1,xOrdinate+1}
                 };
                 int minesAround =0;
                 for (int i=0;i<NEIGHBOUR_ORDINATE.length;i++){
                     int [] neightbourOrdinate = NEIGHBOUR_ORDINATE[i];
                     int xOrdinateOfNeighbour= neightbourOrdinate[1];
                     int yOrdinateOfNeighbour = neightbourOrdinate[0];
                     //Nhung ma lang gieng nam ngoai o ban do
                     boolean isOutOFMapNeighbour=xOrdinateOfNeighbour<0
                             ||xOrdinateOfNeighbour==MAP_WIDTH
                             ||yOrdinateOfNeighbour<0
                             ||yOrdinateOfNeighbour==MAP_HEIGHT;
                     if (isOutOFMapNeighbour)  continue;
                     boolean isMineOwnerNeighbour =map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
                     if (isMineOwnerNeighbour) minesAround++;
                 }
                 mapReport[yOrdinate][xOrdinate]=String.valueOf(minesAround);

             }
         }
     }
     for (int yOrdinate=0;yOrdinate<MAP_HEIGHT;yOrdinate++){
         for (int xOrdinate =0;xOrdinate<MAP_WIDTH;xOrdinate++){
             String currentCellReport = mapReport[yOrdinate][xOrdinate];
             System.out.print(currentCellReport);
         }
         System.out.println();
     }

    }
}
