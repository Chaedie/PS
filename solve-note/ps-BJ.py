#1 셀프넘버
# def d(n):
#     result = n + sum(list(map(int,str(n))))
#     return result

# nonSelfNum = set()

# # 생성자 찾아서 다 집합에 넣음
# for i in range(1, 10_001):
#     dValue = d(i)
#     nonSelfNum.add(dValue)

# for j in range(1,10_001):
#     if j not in nonSelfNum:
#         print(j)

# list = list(input().split())
# print(len(list))

# list = input()


#! 1181. 단어 정렬 (실버 5)
#*내 코드
# 인풋받기
n = int(input())
input_str = [input() for _ in range(n)]

#중복제거
new_input_str = []
for string in input_str:
    if string not in new_input_str:
        new_input_str.append(string)

N = 50

arr_result = [[] for _ in range(N+1)]

# 길이가 같은 애들 끼리 배열에 넣는다. arr[length][count]
for string in new_input_str:
    arr_result[len(string)].append(string)
# 각 배열을 sort 한뒤 arr_result에 append 한다.
for i in range(1, N+1):
    arr_result[i].sort()

for arr in arr_result:
    for i in range(len(arr)):
        print(arr[i])

#* 다른 사람 코드 (rlafbf222 님)
import sys

N = int(input())
words = []
for i in range(N):
    word = sys.stdin.readline().split()
    words.append(word[0])
words = set(words)
words = list(words)

words.sort(key = lambda x: (len(x), x))


for t in words:
    print(t)

#! 2751번 : 수 정렬하기 2 (Class2 에센셜)

#* input() 사용 코드
n = int(input())
nums = []
for _ in range(n):
    nums.append((int(input())))

nums.sort()

for num in nums:
    print(num)

#* ReadLine 사용 코드
import sys

n = int(input())
nums = []
for _ in range(n):
    num = int(sys.stdin.readline())
    nums.append(num)

nums.sort()

for num in nums:
    print(num)

#! 2562번 최댓값
#* 내 코드 
import sys
nums =[]
for _ in range(9):
    nums.append(sys.stdin.readline())

maxnum = 0
maxnum_index = 0
for i in range(len(nums)):
    if nums(i) > maxnum:
        maxnum = nums(i)
        maxnum_index = i
        
print(maxnum)
print(maxnum_index)

#* list.index() 사용 - 개선코드
import sys
nums =[]
for _ in range(9):
    nums.append(sys.stdin.readline())

print(max(nums))
print(nums.index(max(nums)))

#! 2739번 구구단
n = int(input())

for i in range(1,10):
    print(f"{n} * {i} = {n * i}")
#! 2741 N찍기
n = int(input())
for i in range(n):
    print(i + 1)
    
#! 2742 기찍N
n = int(input())
for i in range(n,0,-1):
    print(i)

#! 2577 숫자의 개수
a = int(input())
b = int(input())
c = int(input())

nums = str((a * b * c))

for i in range(10):
    print(nums.count(str(i)))
    
#! 11720 숫자의 합
n = int(input())
nums = list(map(int,input()))

print(sum(nums))
