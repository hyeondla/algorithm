// 부족한 금액 계산하기
class Solution {            
    public long solution(int price, int money, int count) {
        long answer = 0L;
        
        for(int i=1; i<=count; i++) {
            answer += price * i;
        }
        
        answer -= money;
        
        return (answer > 0 ? answer : 0);
    }
}
