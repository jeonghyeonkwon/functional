## range

```javascript
const range = (l) => {
  let i = -1;
  let res = [];
  while (++i < l) {
    res.push(i);
  }
  return res;
};

console.log(range(5))//[0,1,2,3,4]
console.log(range(2))//[0,1]


// L.range - 지연 로딩 내부에서 필요한 값이 있을때만 실행 (성능 상 효율적이다)
const L = {};
L.range = function*(l)=>{
    let i = -1;
    while(++i<l){
        yield i;
    }
}
let list = L.range(4);
log(list);
log(reduce(add,list))

```

## take

```javascript
const take = (l, iter) => {
  let res = [];
  for (const a of iter) {
    res.push(a);
    if (res.length === l) return res;
  }
  return res;
};

console.log(take(5, range(100)));

console.log(take(5, L.range(Infinity)));
```

## L.map

```javascript

L.map = function*(f,iter){
  for(const a of iter) yield f(a)
}

let it = L.map(a=>a+10,[1,2,3])

console.log(it.next())
console.log(it.next())
console.log(it.next())

// or
[...it]

```

## L.filter

```javascript
L.filter = function* (f, iter) {
  for (const a of iter) if (f(a)) yield a;
};

let it = L.filter((a) => a % (2)[(1, 2, 3, 4, 5, 6)]);
console.log(it.next());
console.log(it.next());
console.log(it.next());
console.log(it.next());
console.log(it.next());
```
