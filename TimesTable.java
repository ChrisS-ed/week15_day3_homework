public class TimesTable {

  public static void main(String[] args)
  {
    int[][] table = new int[9][9];
    String[] multiples = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%n"," ","1","2","3","4","5","6","7","8","9");

    for (int y = 0 ; y < 9 ; y++)
    {
      for (int x = 0 ; x < 9 ; x++)
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
      System.out.printf("%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%n", y+1, multiples[0], multiples[1], multiples[2], multiples[3], multiples[4], multiples[5], multiples[6], multiples[7], multiples[8]);

    }

  }
}