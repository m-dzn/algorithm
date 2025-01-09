/* Input
 * a: a개의 빈 병 당
 * b: b개의 새 콜라 교환
 * n: 처음 가져간 빈 병의 개수
 */

function solution(
    a,
    b,
    n
) {
    let emptyBottleCount = n;
    
    let answer = 0;
    
    /* Process : 처리 */
    
    // 1단계: 교환비를 구한다
    const exchangeRatio = b / a
    
    // 2단계: "a <= 바꿔먹을 빈병"(종료 조건) 이 될 때까지 반복한다
    while (a <= emptyBottleCount) {        
        // 2-1: 새로 받은 콜라 개수를 구한다
        const newCokes = Math.floor(emptyBottleCount / a) * b;
        
        // 2-2: 교환하지 못하고 남은 빈 병 개수를 구한다
        const remains = emptyBottleCount % a;
        
        // 2-2: 새로 받은 콜라의 누적 개수를 기록한다
        answer += newCokes;
        
        // 2-3: 새로 받은 콜라를 다 마셔 빈 병으로 만든다
        emptyBottleCount = newCokes;
        
        // 2-4: 새 빈 병과 교환하지 못해 남은 빈 병의 개수를 더한다
        emptyBottleCount += remains;
    }
    
    return answer;
}

/* Output
 * answer: 받을 수 있는 콜라의 병 수
 */