// 상호 평가
class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        
        int[] sum = new int[scores.length]; // 합 저장
        double[] avg = new double[scores.length]; // 평균 저장
        
        for(int i=0; i<scores.length; i++) {
            int max = scores[0][i], min = scores[0][i];
            for(int j=0; j<scores[i].length; j++) {
                sum[i] += scores[j][i];
                max = Math.max(max, scores[j][i]);
                min = Math.min(min, scores[j][i]);
            }
            //System.out.println(i + " - sum : " + sum[i] + ", max : " + max + ", min : " + min);                   
            int student = scores.length; // 학생 수 저장
            
            // 자신의 점수가 최대/최소인지 확인
            if(scores[i][i] == max || scores[i][i] == min) {
                int count = 0;
                // 유일한지 확인
                for(int k=0; k<scores[i].length; k++) {
                    if(scores[i][i] == scores[k][i]) {
                        count++;
                    }
                }
                if(count == 1) { // 유일할 경우 제외
                    student--;
                    sum[i] -= scores[i][i];
                }
            }
            
            avg[i] = sum[i] / (double)student;
            
            // 학점 계산
            if(avg[i] >= 90) {
                answer += 'A';
            } else if(avg[i] >= 80) {
                answer += 'B';
            } else if(avg[i] >= 70) {
                answer += 'C';
            } else if(avg[i] >= 50) {
                answer += 'D';
            } else {
                answer += 'F';
            }
            
        }
        
        return answer;
    }
}
