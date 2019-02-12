# CODE GANG

성공회대학교 소프트웨어공학과 알고리즘, 자료구조 스터디를 위한 Organization 입니다.

이 스터디 그룹은 알고리즘 개념을 따로 가르치는 그룹이 아니라 자신이 알고리즘 저지를 풀이한 이후에 공부하기 좋은 개념을 공유하기 위한 비공식 스터디 그룹입니다.

또한 Git 을 이용해서 자신이 풀이한 소스 코드를 스터디 맴버들과 서로 공유하여 협업에서 많이 쓰이는 Git 과 친숙해지는 기회를 가지기 위한 저장소이기도 합니다.

## Study Planning

스터디 일정은 3월 개강 부터 결정하겠습니다.

그리고 스터디 그룹 규칙은 다수결의 원칙으로 조정하겠습니다.

스터디 주기는 오프라인 미팅 1~2 주에 1번으로 생각 중입니다.

참고로 스터디에서 사용할 언어는 Java 나 Python 입니다.

## Members

- [강인성](https://github.com/tails5555)
  
- 김영호

- [박병조](https://github.com/ParkByeongJo)

- [용동중](https://github.com/anpiso)

- 이원일

## Reference Site

- 백준 알고리즘
  - https://www.acmicpc.net/
  - 초보자는 단계 별로 풀어보기 문제 코너를 이용하는 것을 추천.

- 삼성 SW Expert
  - https://swexpertacademy.com/main/main.do
  - D1 ~ D4 단계까지의 문제를 풀어보는 것을 추천.

- Programmers Algorithm
  - https://programmers.co.kr/learn/challenges?tab=practice_kit
  - 마찬가지로 백준과 삼성 SW Expert 를 좀 풀어보고 난 후에 풀어보는 것을 추천.

- Hacker Rank Interview Kit
  - https://www.hackerrank.com/interview/interview-preparation-kit
  - Medium 난이도 까지만 풀어보는 것을 추천. 그 이상은 작성자도 어려워서 못 풀었음.
  - 여기에 있는 문제는 처음에 풀면 어려워서 백준과 삼성 SW Expert 를 좀 풀어보고 난 후에 풀어보는 것을 추천.

## Site Solution

**Java 로 알고리즘 풀이하는 방법**

```java
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // BufferedReader, BufferedWriter 를 사용하면 IOException 을 throw 해야 합니다!
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // 개행 단위의 int 값 받기
        String str = s.next(); // 개행 단위의 String 값 받기

        // 알고리즘 풀이할 때 이를 더 사용하는 것을 추천합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // BufferedReader 를 사용하여 배열 만들기
        int size = Integer.parseInt(br.readLine()); // int 값 받기
        int[] arr = new int[size];
        int idx = 0;

        // 각 배열에 넣을 값을 공백으로 구분하여 StringTokenizer 를 이용해 잘라냅니다.
        // 10 20 30 을 각각 10, 20, 30 으로. 이는 전부 문자열로 되어 있어 파싱하고 저장해야 합니다.
        st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            arr[idx++] = Integer.parseInt(st.nextToken());
        }

        System.out.printf("%d\n", N);
        System.out.printf("%s\n", str);

        System.out.println(Arrays.toString(arr)); // 배열에 어느 값이 있는지 테스팅하기 위한 문장입니다.
    }
}
```

이는 어느 알고리즘 사이트에서든 동일합니다. 입/출력은 `main` 함수 안에서 이뤄지게끔 디자인하면 됩니다.

그리고 자바로 제출하면 다른 언어보다 입/출력 시간이 2배로 걸려서 `BufferedReader` 를 사용하는 것을 권장합니다.

그리고 Java 는 Eclipse 를 사용하면 패키지를 찾는 것이 어렵기 때문에 학교 계정 하나 파서 IntelliJ 로 진행하는 것이 좋습니다. 학생 계정으로 다운로드 받으면 1년 무료입니다.

1. 백준 알고리즘

단계 별 문제 풀이 메뉴는 문제 -> 단계 별로 풀어보기 를 이용하면 됩니다.

백준 문제를 Java 로 제출하기 위해선 아래와 같이 `public` 클래스 이름을 `Main` 로 지정하고 제출해야 합니다.

제출 이후에는 채점 진행을 하는데 문법에 오류가 있으면 컴파일 에러를 발생하고, 문장을 돌면서 NullException 등의 오류는 런타임 에러를 발생하고, 오답인 경우에는 틀렸습니다, 정답이지만 제한 시간을 넘으면 시간 초과로 나옵니다.

그리고 채점 이후에 수정 버튼을 눌러 잘 못 된 부분을 첨삭하시면 됩니다.

2. 삼성 SW Expert 알고리즘

`public` 클래스를 `Solution` 으로 지정하고 제출해야 합니다.

백준과 시스템은 똑같지만, Input 와 Output 에 여러분이 생각하는 정답에 대하여 입력 받고 실행해볼 수 있습니다.

그리고 단계 별 문제 풀이를 진행하려면 code -> problem 메뉴에 들어가서 우측 상단부에 검색란에 Difficulty 를 이용하시면 됩니다.

언어에 대한 한계가 일부 존재하니 풀이할 때 참고 바랍니다.

3. Programmers 알고리즘

여기서는 클래스 안에 `solution` 메소드가 있는데 `static` 타입은 테스트 전용으로만 사용하시고, 제출할 때는 그냥 `solution` 메소드로 제출하셔야 됩니다.

참고로 이 저지는 문제 풀이에 대한 정답 확인 뿐만 아니라 복잡도 및 성능 테스트도 추가 점수로 반영합니다. (일부 문제 기준.)

언어에 대한 한계가 일부 존재하니 풀이할 때 참고 바랍니다.

## Recruiting

현재 모집 계획은 따로 없습니다. 이 점 양해 부탁드립니다.