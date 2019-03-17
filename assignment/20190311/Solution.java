public class Solution {
    public static int solution(int[][] board, int[] nums) {
        // 1단계. 각 빙고칸에는 각 하나의 숫자만 저장되어 있다.
        // 그래서 숫자와 자리 Pos(x, y)를 Map 에 저장한다.
        Map<Integer, int[]> map = new HashMap<>();
        for(int k=0;k<board.length;k++){
            for(int l=0;l<board[k].length;l++){
                map.put(board[k][l], new int[] { k, l });
            }
        }

        // 2단계. 열과 행, 대각선 별로 불려진 숫자의 Pos 로 카운팅할 배열과 변수를 준비한다.
        // Row 는 행, Col 은 열, Cross 는 대각선이다. (왼쪽 위 -> 오른쪽 아래, 왼쪽 아래 -> 오른쪽 위)
        int[] row = new int[board.length];
        int[] col = new int[board.length];

        int leftCross = 0;
        int rightCross = 0;

        // 3단계. 불려진 숫자를 통하여 Pos 를 불러온다.
        // HashMap 을 사용하면 시간 복잡도는 O(1) 로 나온다.
        for(int k=0;k<nums.length;k++){
            int[] vtx = map.get(nums[k]);
            
            // Pos 에 해당 되는 행과 열을 1씩 더해준다.
            row[vtx[0]] += 1;
            col[vtx[1]] += 1;

            // 왼쪽 아래 -> 오른쪽 위 대각선은 행, 열의 수치가 서로 반전되어 있다. (0, 4), (1, 3), (2, 2), (3, 1), (4, 0) => (0, n - 1), (1, n - 2) ... (n, 1)
            if(vtx[1] == (board.length - 1) - vtx[0]) {
                rightCross += 1;
            }

            // 왼쪽 위 -> 오른쪽 아래 대각선은 행, 열의 수치가 똑같다. (0,0), (1,1), (2,2) ... (n-1, n-1)
            if(vtx[0] == vtx[1]) {
                leftCross += 1;
            }
        }

        // 4단계. 위에서 사용한 변수로 빙고의 줄을 계산한다.
        int answer = 0;

        // 각각 카운팅 된 개수에서 빙고 판의 크기를 나누면 줄의 수이다.
        answer += leftCross / board.length;
        answer += rightCross / board.length;

        for(int k=0;k<row.length;k++){
            answer += row[k] / board.length;
            answer += col[k] / board.length;
        }

        // 최종 반환.
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(new int[][] {
            { 11, 13, 15, 16 }, 
            { 12, 1, 4, 3 }, 
            { 10, 2, 7, 8 }, 
            { 5, 14, 6, 9 }
        }, new int[] { 14, 3, 2, 4, 13, 1, 16, 11, 5, 15 }));
        System.out.println(solution(new int[][] {
            { 6, 15, 17, 14, 23 },
            { 5, 12, 16, 13, 25 },
            { 21, 4, 2, 1, 22 },
            { 10, 20, 3, 18, 8 },
            { 11, 9, 19, 24, 7 }
        }, new int[] { 15, 7, 2, 25, 9, 16, 12, 18, 5, 4, 10, 13, 20 }));
    }
}