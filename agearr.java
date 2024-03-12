public class agearr {
  public static void main(String[] args) {
    int[][] age = {{22,19},{45,78,46}};

    for(int i=0; i<age.length ; i++){
      for(int j=0; j<i; j++){
        System.out.println(age[i][j]);
      }
    }
  }
}
