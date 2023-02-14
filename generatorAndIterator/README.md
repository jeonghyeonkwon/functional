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

#### 홀수 제네레이터 만들기

- 방법 1

```javascript
function* odd(num) {
  for (let i = 0; i < num; i++) {
    if (i % 2 === 1) yield i;
  }
}

let iter = odd(10);
console.log(iter.next());
console.log(iter.next());
console.log(iter.next());
console.log(iter.next());
console.log(iter.next());
console.log(iter.next());
console.log(iter.next());
```

- 방법2

```javascript
function *infinity(i=0){
    while(true) yield i++;
}

function *limit(l,iter){
    for(const a of iter){
        yield a;
        if (a===l) return;
    }
}
function *odds(l){
    for(const of limit(l,infinity(1))){
        if ( a % 2 ) yield a;
    }
}

let iter2 = odds(10);
for( const a of odds(40)) console.log(a);
```

## 구조 분해

```javascript
console.log(...odds(10));
console.log([...odds(10), ...odds(20)]);

const [head, ...tail] = odds(5);
console.log(head);
console.log(tail);

const [a, b, ...rest] = odds(10);
console.log(a);
console.log(b);
console.log(rest);
```
