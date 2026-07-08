class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
      List<Integer> ans = new ArrayList<>();
      for(int i = num.length - 1; i >= 0; i--){
        int sum = num[i] + (k%10);
        k = k / 10;
        if(sum >= 10){
            k++;
            sum -= 10;
        }
        ans.add(sum);
    }
    while(k>0){
        ans.add(k%10);
        k = k / 10;
    }
    Collections.reverse(ans);
    return ans;
    }
}