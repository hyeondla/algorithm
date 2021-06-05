// 두개 이하로 다른 비트
class Solution {
    public long[] solution(long[] numbers) {
        
        long[] answer = new long[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            String bin = "0" + Long.toBinaryString(numbers[i]);
            StringBuilder strbin = new StringBuilder(bin);
            int zero = strbin.lastIndexOf("0");
            
            if(zero == strbin.length() - 1){ //끝자리가 0
                strbin.setCharAt(zero, '1');
            } else if(strbin.charAt(zero+1) == '1') { //자리바꾸기
                strbin.setCharAt(zero, '1');
                strbin.setCharAt(zero + 1, '0');
            } else { //1로 바꾸기
                strbin.setCharAt(zero, '1');
            }
          
            String str = strbin.toString();
            answer[i] = Long.parseLong(str, 2);
        }
        
        return answer;
    }
}
