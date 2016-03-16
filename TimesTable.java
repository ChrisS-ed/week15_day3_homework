public class TimesTable {

  public static void main(String[] args)
  {
    int[][] table = new int[9][9];
    System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%n"," ","1","2","3","4","5","6","7","8","9");

    for (int x = 0 ; x < 9 ; x++)
    {
      System.out.printf("%-5s", String.valueOf(x+1));
      for (int y = 0 ; y < 9 ; y++)
      {
        table[x][y] = (x+1) * (y+1);
        String numberString = String.valueOf(table[x][y]);
        System.out.printf("%-5s", (x+1) * (y+1));
      }
      System.out.println();
    }

  }
}