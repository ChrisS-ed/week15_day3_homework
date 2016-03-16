public class TimesTable {

  public static void main(String[] args)
  {
    int[][] table = new int[9][9];
    String[] multiples = new String[9];
    //multiples[0] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%n"," ","1","2","3","4","5","6","7","8","9");

    for (int x = 0 ; x < 9 ; x++)
    {
      for (int y = 0 ; y < 9 ; y++)
      {
        table[x][y] = (x+1) * (y+1);
        String numberString = String.valueOf(table[x][y]);
        //System.out.println(table[x][y]);
      }
    }

    for (int y = 0 ; y < 9 ; y++)
    {
      
        
        //String numberString = String.valueOf(table[x][y]);
        //System.out.println(table[x][y]);
      //System.out.println(table[x][y]);
      System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%n",y+1,"1","2","3","4","5","6","7","8","9");

    }

  }
}