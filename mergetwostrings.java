class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1= word1.length();
        int l2=word2.length();
        int minlength= Math.min(l1,l2);
        int maxlength= Math.max(l1,l2);
        String finalword="";
        for(int i=0;i<minlength;i++)
        {  
            char ch= word1.charAt(i);
            char sh= word2.charAt(i);
           finalword= finalword+ch+sh ;
        }
        if(minlength==l1)
        {   
            String s= word2.substring(minlength);
            finalword= finalword+ s;
        }
        else
        {
          String s= word1.substring(minlength);
            finalword= finalword+ s;
        }
        return finalword;
    }
}
