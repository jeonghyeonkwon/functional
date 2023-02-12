## ES6에서 리스트 순회

```javascript
const arr = [1, 2, 3, 4, 5];

// 기존

for (let i = 0; arr.length; i++) {
  console.log(arr[i]);
}

//es6
for (const a of arr) {
  console.log(a);
}
```

## Array, Set, Map

- Symbol.iterator과 연관되어 있음
  - arr[Symbole.iterator],... 해보면 됨

```javascript
// array

const arr = [1, 2, 3];
for (const a of arr) console.log(a);

// set

const set = new Set([1, 2, 3, 4]);
for (const b of set) console.log(b);

// map

const map = new Map([
  ["a", 1],
  ["b", 2],
  ["c", 3],
]);
for (const c of map) console.log(map);
```

## 이터러블/이터레이터 프로토콜

- 이터러블
  - 이터레이터를 리턴하는 [Symbol.iterator]()를 가지고 있음
- 이터레이터
  - {value,done} 객체를 리턴하는 next()를 가진 값
- 그래서 for ... of, 전개 연산자등과 함께 동작하도록 사용할 수 있음

### 이터러블 만들기

```javascript
const iterable = {
  [Symbol.iterator]() {
    let i = 3;
    return {
      next() {
        return i == 0 ? { done: true } : { value: i--, done: false };
      },
      [Symbol.iterator]() {
        return this;
      },
    };
  },
};

let iterator = iterable[Symbol.iterator]();

console.log(iterator.next());
console.log(iterator.next());
console.log(iterator.next());
console.log(iterator.next());

for (const a of iterable) console.log(a);

for (const a of iterator) console.log(a);
```

## 전개 연산자

```javascript
console.clear();

const a = [1, 2];

log([...a, ...arr, ...set, ...map.values()]);
```
