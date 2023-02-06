# 평가와 일급

## 평가

- 코드가 계산되어 값을 만드는 것
  - 쉽게 말해 console.log(코드)로 했을 때 출력 되는 것

## 일급

- 값으로 다룰 수 있다
- 변수에 담을 수 있다
- 함수의 인자(파라미터)로 사용될 수 있다.
- 함수의 결과(리턴)로 사용될 수 있다.

# 일급 함수

- 함수를 값으로 다룰 수 있다
- 조합성과 추상화의 도구

```javascript
const add5 = (a) => a + 5;
console.log(add5); // a => a + 5
console.log(add5(5)); // 10

const f1 = () => () => 1;
console.log(f1()); // () => 1

const f2 = f1();
console.log(f2); // () => 1
log(f2()); // 1
```
