class Solution {
   public String multiply(String num1, String num2) {
    char[] str1 = num1.toCharArray();
    char[] str2 = num2.toCharArray();
    if (str1[0] == '0' || str2[0] == '0') return "0";
    int[] d = new int[str1.length + str2.length];//digits
    for (int j = str2.length - 1; j >= 0; j--){//str2
        for (int i = str1.length - 1; i >= 0; i--){//str1
            int n = (str1[i] - '0') * (str2[j] - '0');
            // for each i,j, its multiplication contributes to d[i + j + 1] and d[i + j]
            d[i + j] += n / 10;//carry
            d[i + j + 1] += n % 10;//current digit
        }
    }
    for (int i = d.length - 1; i >= 1; i--){
        //rearrange the output
        d[i - 1] += d[i] / 10;//carry
        d[i] = d[i] % 10 + '0';//current digit
    }
    d[0] += '0';//don't forget the first digit
    int start = d[0] == '0'? 1 : 0;
    return new String(d, start, d.length - start);
}
}