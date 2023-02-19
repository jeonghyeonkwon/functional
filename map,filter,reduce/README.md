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
```
