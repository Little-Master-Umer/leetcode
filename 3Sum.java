class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        boolean a = false;
        int num = 0, num1 = 0, num2 = 0;

        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
          //  System.out.println("num: " +num);

            for (int j = 0; j < nums.length; j++) {
                if(j==i){
                    continue;
                }

                num1 = nums[j];
               // System.out.println("num1: "+num1);
                int tot = num + num1;
               // System.out.println("tot: "+tot);
                

                for (int k = 0; k < nums.length; k++) {
                    if(k==i || k==j){
                        continue;
                    }
                    num2 = nums[k];
                   // System.out.println("num2: "+num2);
                    int tot2=tot + num2;
                    //System.out.println("tot2: "+tot2);

                    if (tot2 == 0) {
                        list.add(new int[]{num, num1, num2});
                        a = true;
                        break;    
                    }
                }
            }
        }
        // ===== PRINT ARRAYLIST =====
        System.out.println("ArrayList contents:");
        for (int[] arr : list) {
            System.out.print("[ ");
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println("]");
        }
        // ===========================
        return new ArrayList<>();
    }
}
