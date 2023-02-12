## 제너레이터와 이터레이터

### 제너레이터

- 제너레이터는 이터레이터이자 이터러블을 생성하는 함수

```javascript

function * gen(){
    yield 1;
    yield 2;
    if (false) yield 3;
    return 100;
}
let iter = gen();
console.log(iter[Symbol.iterator]()=iter);
console.log(iter.next())//{value:1,done:false}
console.log(iter.next())//{value:2,done:false}
console.log(iter.next())//{value:100,done:true}

for(const a of iter) console.log(a);
//3과 100은 출력 안됨

```
