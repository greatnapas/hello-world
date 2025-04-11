public class xYzAbC {
  public static void main(String[] args){
    int[] bCdEf = {23, 5, 67, 89, 12};
    sortMe(bCdEf);
    for (int i = 0; i < bCdEf.length; i++) {
      System.out.println(bCdEf[i]);
    }
  }

  public static void sortMe(int[] qRsTu){
    for(int aBcDe = 0; aBcDe < qRsTu.length; aBcDe++){
      for(int fGhIj = 0; fGhIj < qRsTu.length; fGhIj++){
        if(qRsTu[fGhIj] > qRsTu[fGhIj + 1]){
          int temp = qRsTu[fGhIj];
          qRsTu[fGhIj] = qRsTu[fGhIj + 1];
          qRsTu[fGhIj + 1] = temp;
        }
      }
    }
  }
}
