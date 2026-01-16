class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        boolean a = false;
        int num = 0, num1 = 0, num2 = 0;

        List<List<Integer>> list = new ArrayList<>();

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
                        if (!alreadyExists(list, num, num1, num2)) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(num);
                            temp.add(num1);
                            temp.add(num2);
                            list.add(temp);
                        }
                        a = true;
                        break;    
                    }
                }
            }
        }
        return list;

    }
    private boolean alreadyExists(List<List<Integer>> list, int a, int b, int c) {

        int[] temp = new int[]{a, b, c};
        Arrays.sort(temp);   

        for (List<Integer> arr : list) {

            if (arr.size() == 3) {
                int[] copy = new int[]{
                    arr.get(0),
                    arr.get(1),
                    arr.get(2)
                };

                Arrays.sort(copy);

                if (copy[0] == temp[0] &&
                    copy[1] == temp[1] &&
                    copy[2] == temp[2]) {
                    return true;   // duplicate found
                }
            }
        }
        return false;
    }
    

}
