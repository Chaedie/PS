# PS

This Repository is for problem solve

Roadmap is Below

0. Baekjoon PS everyday
1. Wednesday is PS day
   1. Study algorithm Lecture
   2. Leetcode PS on Wednesday

---

- [Python 문법](#python---)
  - [입력](#--)
  - [출력](#--)
  - [연산자](#---)
  - [for 문](#for--)
  - [문자](#--)
  - [리스트](#---)
  - [2차원 리스트](#2------)
  - [함수](#--)
  - [람다 함수(람다 표현식)](#-------------)

<small><i><a href='http://ecotrust-canada.github.io/markdown-toc/'>Table of contents generated with markdown-toc</a></i></small>

## Python 문법

### 입력

```py
a = input()
a, b = input().split()
numa, numb = map(int, input().split())
nums = list(map(int, input().split())
```

### 출력

```py
print(f"#{i} YES")
```

### 연산자

```py
a/b
a%b
a//b
a\*b
a\*\*b : a의 b제곱

True, False, Not True, and, or
==, != , is, is not, += , #(++ 안됨)

if all(60>x for x in a):    #(a에있는 x값이 전부 조건을 만족하면(for and))
if any(60>x for x in a):    #(조건이 1번이라도 참이면 (for or))
```

### if 문

```py
python에서 Null Check는 None으로 한다.
if foo is None:

```

### for 문

```py
a = range(1,5) -> [1,2,3,4,5]
for i in range(10): print(i)
for i in range(10, 0, -1): print(i)
```

```py
for i in range(3):
    if i == 4:
        print("끝")
        break
else:                   # For문이 break 를 만나지 못하면 else가 실행된다.
    print(-1)
```

### 문자

```py
String
str.find(i)
str.upper()
str.lower()
str.isupper()
str.islower()
str.len()
str[:::]
ord(char) : 아스키코드 출력
chr(ord(char)) : 아스키에 대응하는 char을 출력
```

### 리스트

```py
li = []
li1 = [1,2,3]
li2 = list(range(4,7))
li1 + li2 : [1,2,3,4,5,6]

li = [0]*10
li = [ 0 for _ in range(10)]
li = [ i*i for i in range(10)]

li.append(1)
li.insert(3, 7)
li.pop() : 마지막인덱스 빠짐
li.pop(3) : 3번째가 빠짐
li.remove(4) : 4라는 값을 찾아서 제거
li.index(5) : 5라는 값의 인덱스 출력

len(li)
sum(li)
max(li)
min(li)

import random as r
r.shuffle(li)
li.sort()
li.sort(reverse = True)
li.clear()

li[:3] : li[0], li[1], li[2]
li[1:3] : li[1], li[2]

for i in range(len(li)):
for x in li:
for x in enumerate(li): : x에 (index, value) tuple 로 대응
for index, value in enumerate(li):

# tuple과 list의 차이점 : 다 같은데, tuple은 값 변경이 안됨
```

### 2차원 리스트

```py
li = [0]*3         #: 1차원 리스트 0으로 초기화
li = [[0]*3]       #for \_ in range(3) : 2차원 리스트 0으로 3행 초기화

for x in li: : 각 행 출력
for y in li: : 각 행의 각 원소 출력
```

- List - 기초, 시퀀스 연산 : https://andamiro25.tistory.com/90
- List - Extended Slices [::] https://blog.wonkyunglee.io/3

### 함수

```python
def add(a, b):
    c = a + b
    print(c)

add(3, 2)
```

```py
def add(a, b):
    c = a + b
    return c

result = add(3, 2)
print(result)
```

```py
def add(a, b):
    c = a + b
    d = a - b
    return c, d         # return as tuple

print(add(3,2))         # (5, 1)
```

```py
def isPrime(x):             # 소수니?
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

nums = [12, 13, 7, 9, 19]
for num in nums:
    if isPrime(num):
        print(y, end=" ")


```

### 람다 함수(람다 표현식)

```py
def plus_one(x):
    return x+1

print(plus_one(1))

```

```py
plus_two = lambda x : x + 2
print(plus_two(1))
```

```py
def plus_one(x):
    return x+1

a = [1,2,3]
print(list(map(plus_one, a)))
print(list(map(lambda x : x + 1, a)))

```

## 알고리즘에서의 문법

### 재귀함수 Recursion limit

```py
파이썬3의 recursion limit == 1000으로 셋팅되어 있다고 한다.
아래 코드로 limit 변경이 가능하다.
import sys
sys.setrecursionlimit(2500)
```

```py
위 재귀함수 limit 설정으로 해결되는 문제도 있겠지만,
나의 경우 제때 return 함수() 형태로 하지 않고,
그냥 함수()로 함수를 실행해서 문제가 되었다.

+ 로 인풋 nums[] 에 target이 없는 경우에 "예외처리"를 요구하는 경우도 있는데,
이를 무시하고, 값을 찾을때까지 재귀함수를 돌려서 뎁스가 limit에 닿은 경우도 있었다.
```

```py
Leetcode binarysearch 기본 문제 풀이에 사용한 함수
예외처리 부분이 없어서 limit에 닿았었다.
def binarySearch(nums, target, lt, rt):
    mid = (lt + rt) // 2

    if lt >= rt:
        if nums[lt] < target:
            return lt+1
        if nums[lt] > target:
            return lt
    if nums[mid] == target:
        return mid
    if nums[mid] < target:
        return Solution.binarySearch(nums, target, mid + 1, rt)
    if nums[mid] > target:
        return Solution.binarySearch(nums, target, lt, mid - 1)
```
