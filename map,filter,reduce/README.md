## Map

```javascript
const products = [
  { name: "반팔티", price: 15000 },
  { name: "긴팔티", price: 20000 },
  { name: "핸드폰케이스", price: 15000 },
  { name: "후드티", price: 30000 },
  { name: "바지", price: 25000 },
];

const fMap = (fn, iter) => {
  let res = [];
  for (const a of iter) {
    res.push(fn(a));
  }
  return res;
};

console.log(fMap((p) => p.name, products));
console.log(fMap((p) => p.price, products));

//querySelectorAll에는 map 함수가 없음
console.log(document.querySelectorAll("*").map((el) => el));

// 만든 map으로 순회가능(document.querySelectorAll("*")에는 Symbol.iterator가 있기 따문에
console.log(fMap((el) => el.nodeName, document.querySelectorAll("*")));

//generator도 map 가능
function* gen() {
  yield 2;
  yield 3;
  yield 4;
}
console.log(fMap((a) => a * a, gen()));

// 자료구조 map도 가능
let m = new Map();
m.put("a", 10);
m.put("b", 20);

console.log(new Map(fMap(([key, value]) => [key, value * 2], m)));
```

## Filter

```javascript
const fFilter = (f, iter) => {
  let res = [];

  for (const a of iter) {
    if (f(a)) res.push(a);
  }
  return res;
};

const products = [
  { name: "반팔티", price: 15000 },
  { name: "긴팔티", price: 20000 },
  { name: "핸드폰케이스", price: 15000 },
  { name: "후드티", price: 30000 },
  { name: "바지", price: 25000 },
];

console.log(...fFilter((p) => p.price < 20000, products));

console.log(fFilter((n) => n % 2, [1, 2, 3, 4]));

console.log(
  fFilter(
    (n) => n % 2,
    (function* () {
      yield 1;
      yield 2;
      yield 3;
      yield 4;
      yield 5;
    })()
  )
);
```
