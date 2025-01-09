// Input : 빈 병의 개수
function solution(
    a,
    b,
    n
) {
    // 1단계: 교환비를 구한다
    const exchangeRatio = b / a
    
    // a개 미만의 병은 버린다
    
    let emptyBottleCount = n;
    
    
    /* 데이터셋 1번 (1/2) */
    // 바꿔먹을 빈병 -> 새로 받은 병    빈 병

    // 1차: 20    ->     10
    // 2차: 10    ->     5
    // 3차: 5     ->     2         + 1
    // 4차: 3     ->     1         + 1
    // 5차: 2     ->     1
    
    // 2단계: "a <= 바꿔먹을 빈병"(종료 조건) 이 될 때까지 반복한다
    let answer = 0;
    
    while (a <= emptyBottleCount) {
        const input = emptyBottleCount;
        
        // 새로 받은 병을 구한다
        const newCokes = Math.floor(emptyBottleCount / a) * b;
        const remains = emptyBottleCount % a;
        
        // 새로 받은 병을 더해준다
        answer += newCokes;
        
        // 그리고 새로 받은 콜라를 다 마신다
        emptyBottleCount = newCokes;
        
        // 절사해버린 빈 병을 더해준다
        emptyBottleCount += remains;
    }
    
    // Output : 받을 수 있는 콜라의 병 수
    return answer;
}