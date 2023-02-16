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
```
