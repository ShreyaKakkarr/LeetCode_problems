class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list= new ArrayList<>();
        int carry=0, digitSum=0;
        int i= num.length-1;
        while(i>=0 || k >0 || carry >0){
            digitSum=carry;
            if(i>=0) digitSum += num[i--];
            if(k>0) digitSum += k%10;
            list.add(digitSum%10);
            k=k/10;
            carry= digitSum/10;
        }
        Collections.reverse(list);
        return list;
    }
}
