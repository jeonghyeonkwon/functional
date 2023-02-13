# 평가와 일급

## 평가

- 코드가 계산되어 값을 만드는 것
  - 쉽게 말해 console.log(코드)로 했을 때 출력 되는 것

## 일급

- 값으로 다룰 수 있다
- 변수에 담을 수 있다
- 함수의 인자(파라미터)로 사용될 수 있다.
- 함수의 결과(리턴)로 사용될 수 있다.

## 일급 함수

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

## 고차함수

- 함수를 인자로 받는 함수

```javascript
const apply1 = (f) => f(1);

const add2 = (a) => a + 2;

console.log(apply1(add2));
// (a => a+2) => (a => a+2)(1)
```

```javascript
const times = (fn, num) => {
  let i = -1;
  while (++i < num) fn(i);
};
```

- 리턴을 함수로 보내는 함수 (클로저를 만들어 리턴하는 함수)
  - 클로저 : 계속 함수를 기억함

```js
const addMaker = (a) => (b) => a + b;
const add10 = addMaker(10);

log(add10);
// b => a + b
```
