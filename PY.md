# 인풋

```
#1. 값 두 개를 입력받아 변수 a와 b에 저장 (띄어쓰기 구분)
a, b = input().split() #문자열로
a, b = map(int, input().split()) #정수형으로
a, b = map(float, input().split()) #실수형으로

#2. 1차원 배열 입력받기 = 정수형 리스트로 저장
num_list = list(map(int, input().split())) #입력 : 1 2 3 /출력 : [1, 2, 3]

#3. 문자열 여러줄 입력받기
s_list = [input() for _ in range(n)] #예시로 n에 3넣어 3줄 입력받기(엔터로 구분)

#4. 한 문자열(숫자ex.12345) 받아서 한 글자씩 나누어 더하기
s = input()
for i in range(len(s)):
	sum += int(s[i])  #문자열은 슬라이싱 가능!! + 문자열 형변환

#5. 띄어쓰기 없이 정수 여러개 입력받아 2차원 배열로 저장하기
two_d = [list(map(int, input())) for _ in range(n)] #예시는 4줄 입력받음

#6. 열은 띄어쓰기로 행은 엔터로 구분하여 입력받아 2차원 배열 저장하기
t_d = [list(map(int, input().split())) for _ in range(n)]#예시는 4줄. 4.-와 결과는 같다.
```

# 인풋 1

```
n = int(input())
data = list(map(int, input().split()))

print(n)
print(data)
```

(input은 입력되는 모든 것을 문자열로 취급한다.)

# 인풋 2 : Readline

```
import sys
data = sys.stdin.readline().rstrip()
print(data)

score = 85
result = "Success" if score >= 80 else "fail"

print(result)
```

# for 문 1

for 변수 in 리스트:
실행할 소스코드
변수가 리스트를 차례대로 방문함

```
array = [1, 2, 3, 4, 5]

for x in array:
print(x)
```

# for 문 2

```
result = 0

for i in range(1,31): #1부터 30까지 i가 증가하면서 for문 아래를 실행한다.
result += i

print(result)
```

# for 문 3 : continue

continue 아래 코드는 진행하지 않고,
다음 인덱스로 가서 For문을 진행한다.

# for 문 4 : break

반복문을 탈출한다.

# 함수 : global 키워드

```
a = 0

def func():
global a # 함수 내에서 전역변수를 사용하려면, global을 써야한다.
a += 1

for i in range(10):
func()

print(a)
```

# 함수 : 여러개의 반환 값

```
def operator(a,b):
add_var = a + b
subtract_var = a - b
multiply_var = a \* b
divide_var = a / b
return add_var, subtract_var, multiply_var, divide_var # 패킹

a, b, c, d = operator(7, 3) # 언패킹
print(a, b, c, d)
```

# 함수 : 람다 표현식

```
list1 = [1, 2, 3, 4, 5]
list2 = [6, 7, 8, 9, 10]

result = map(lambda a, b: a + b, list1, list2) #한번쓰고 마는 함수, 간단한 함수 등을 한줄로 사용가능.

print(list(result))
```

# 내장 함수 : 자주 사용되는 내장 함수

```
// sum()
// min(), max()
// eval()
// sorted(), sorted(,reverse=True)

ex)
array = [('홍길동', 35), ('이순신', 75), ('아무개', 50)]
result = sorted(array, key=lambda x: x[1], reverse=True)
print(result)

결과 : [('이순신', 75), ('아무개', 50), ('홍길동', 35)]

```

# 순열과 조합

## 순열

```
from itertools import permutations

data = ['A', 'B', 'C']

result = list(permutations(data, 3))
print(result)
```

## 조합

```
from itertools import combinations

data = ['A', 'B', 'C']

result = list(combinations(data, 2))
print(result)
```

## 중복순열, 중복조합

```
from itertools import product

data = ['A', 'B', 'C']

result = list(product(data, repeat=2))
print(result)
```

```
from itertools import combinations_with_replacement

data = ['A', 'B', 'C']

result = list(combinations_with_replacement(data, 2))
print(result)
```

## Counter

몇번 등장했는지 세는 기능

```
from collections import Counter

counter = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])

print(counter['blue'])
print(counter['green'])
print(dict(counter)) // counter 세서 Dict로 변환
```

## math 라이브러리 (gcd() : 최대공약수)

```
import math

// 최소 공배수 (LCM)를 구하는 함수
def lcm(a, b):
    return a * b // math.gcd(a, b)
```
