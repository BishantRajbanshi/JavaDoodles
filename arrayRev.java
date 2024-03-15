public class arrayRev {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        
        System.out.print("Here is a original array: ");
        OrginalArr(num);

        System.out.print("\nHere is a rev array: ");
        RevArr(num);

    }
    public static void OrginalArr(int[] num) {
        for(int i : num){
            System.out.print(i +" ");
        }
    }
    public static void RevArr(int[] num) {
        for (int i = num.length -1 ; i>=0 ; i--){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}



