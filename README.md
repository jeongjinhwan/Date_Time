## localDate.now() 사용 시의 유의점.
LocalDate안의 now 내용을 보면 아래와 같은 내용이 있다.
```java
/**
 * Obtains the current date from the system clock in the default time-zone.
 * <p>
 * This will query the {@link Clock#systemDefaultZone() system clock} in the default
 * time-zone to obtain the current date.
 * <p>
 * Using this method will prevent the ability to use an alternate clock for testing
 * because the clock is hard-coded.
 *
 * @return the current date using the system clock and default time-zone, not null
 */
public static LocalDate now() {
    return now(Clock.systemDefaultZone());
}
```
Clock.systemDefaultZone() 값이 하드코딩 되어 있어 서버에서 설정 된 기본 시간대의 값을 가지고, 일자로 변경 합니다.

서버에 설정 된 시간대로 그대로 사용한다면, now를 사용하여도 무방하지만, 그게 아니라면 시간대 설정이 필요 합니다.

## 시간과 일자에 대한 참고 사항
- 1년은 365일, 시간은 365 x 24로 계산 되지만,
- 실제로는 365.2422일 시간으로는 365.2422 x 24,
- 눈에 보이는 것과 다르게 약간의 차이가 존재 합니다.

## 달력 참고 wiki
- [율리우스력](https://ko.wikipedia.org/wiki/%EC%9C%A8%EB%A6%AC%EC%9A%B0%EC%8A%A4%EB%A0%A5)
- [그레고리력](https://ko.wikipedia.org/wiki/%EA%B7%B8%EB%A0%88%EA%B3%A0%EB%A6%AC%EB%A0%A5)
