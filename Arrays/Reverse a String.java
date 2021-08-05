// Link: https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

class Reverse
{
    // Complete the function
    // str: input string
    public static String swap(String s,int l,int h)
    {
        StringBuilder sb=new StringBuilder(s);
        sb.setCharAt(l,s.charAt(h));
        sb.setCharAt(h,s.charAt(l));
        return sb.toString();
    }
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int low=0,high=str.length()-1;
        while(low<high)
        {
            str=swap(str,low,high);
            low++;
            high--;
        }
        return str;
    }
}
