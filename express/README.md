# 표현력 높이기

## go

```javascript
const log = console.log();
const go = (...args) => reduce((a, f) => f(a), args);

go(
  0,
  (a) => a + 1,
  (a) => a + 10,
  (a) => a + 100,
  log
);
```

## pipe

```javascript
const pipe =
  (f, ...fn) =>
  (...as) =>
    go(f(...as), ...fn);

const pi = pipe(
  (a, b) => a + b,
  (a) => a + 10,
  (a) => a + 100
);
console.log(f(0, 1));
//밑에 것이랑 같음
go(
  add(0, 1),
  (a) => a + 10,
  (a) => a + 100,
  console.log()
);
```

## go로 읽기 좋은 코드 만들기

```javascript
console.log(
  reduce(
    add,
    map(
      (p) => p.price,
      filter((p) => p.price < 20000, products)
    )
  )
);
// 이것을 go로 사용하면
go(
  products,
  (products) => filter((p) => p.price < 20000, products),
  (products) => map((p) => p.price, products),
  (prices) => reduce(add, prices),
  console.log
);
```

## Curry

```javascript
const curry =
  (f) =>
  (a, ..._) =>
    _.length ? f(a, ..._) : (..._) => f(a, ..._);

const mult = curry((a, b) => a * b);
console.log(mult(3)(2)); // 6

const mult3 = mult(3);
console.log(mult3(10)); // 30
console.log(mult3(5)); // 15
console.log(mult3(3)); // 9
```

## 함수 조합으로 함수 만들기

```javascript
const total_price = pipe(map((p) => p.price, reduce(add)));

const base_total_price = (predi) => pipe(filter(predi), total_price);
go(
  products,
  base_total_price((p) => p.price < 20000),
  console.log
);
go(
  products,
  base_total_price((p) => p.price >= 20000),
  console.log
);
```
