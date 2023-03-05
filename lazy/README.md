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


// L.range - 지연 로딩 내부에서 필요한 값이 있을때만 실행
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
