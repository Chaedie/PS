#* <이것이 취업을 위한 코테다> 예제 풀이

#! 1. 그리디
#* 1.1. 거스름돈
from turtle import Turtle


n = 1260
count = 0

array = [500, 100, 50, 10]

for coin in array:
    count += n // coin
    n %= coin

print(count)
#* 1.2. N이 1이 될때까지 나누기 or -1


#* 1.3. 곱하기 혹은 더하기

data = input()
result = int(data[0])

for i in range(1, len(data)):
    num = int(data[i])
    if num <= 1 or result <= 1:
        result += num
    else:
        result *= num

print(result)

#* 1.4. 모험가 길드

n = int(input())
data = list(map(int, input().split()))
data.sort()

result = 0 # 총 그룹의 수
count = 0 # 현재 그룹에 포함된 모험가의 수

for i in data: #공포도를 낮은 것부터 하나씩 확인하며
    count += 1 #현재 그룹에 해당 모험가 포함시키기
    if count >= i:


#! 2 구현
#* 2.1 상하좌우 맵 이동
mapSize = int(input())
moves = input().split()
x, y = 1, 1

# L R U D 에 따른 이동 방향
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move_types = ["L", "R", "U", "D"]

# 이동 계획을 하나씩 확인하기
for  move in moves:
    # 이동 후 좌표 구하기
    if i in range(len(move_types)):
        if move == move_typesp[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    # 공간을 벗어나는 경우 무시
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
    # 이동 수행
    x, y = nx , ny

print(x, y)

#* 2.2. 시각에 3포함 갯수 세는 문제
hour = int(input())

count = 0
for h in range(hour + 1):
    for m in range(60):
        for s in range(60):
            # 3 포함이면 카운트 증가
            if "3" in str(h) + str(m) = str(s): #! if 좋은 사용 예제
                count += 1
    
print(count)

#* 2.3. 왕실의 나이트
#현재 나이트 위치 입력받기
input_data = input()
row = int(input_data[1])
column = int(ord(input_data[0])) - int(ord("a")) + 1 # 유니코드 return 함수 == ord()

#나이트가 이동할 수 있는 8가지 방향 정의
steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

# 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
result = 0
for step in steps:
    # 이동하고자 하는 위치 확인
    next_row = row + step[0]
    next_column = column + step[1]
    #해당 위치로 이동이 가능하다면 카운트 증가
    if next_row >= 1 and next_row <= 8 and next_column >= 1 and next_column <= 8:
        result +=1

print(result)

#! 3. DFS / BFS
#* 3.1. DFS (Depth - First Search) 깊이 우선 탐색 (스택 또는 재귀함수 이용)
#* 1. 탐색 시작 노드를 스택에 삽입하고 방문 처리 함
#* 2. 스택 최상단 노드에 방문하지 않은 인접 노드가 하나라도 있으면
#*  그 노드를 스택에 넣고 방문 처리. 
#*  방문하지 않은 인접 노드가 없으면 최상단 노드를 꺼냄
#*  3. 더 이상 2번의 과정을 수행할수 없을 때까지 반복

# DFS 메서드 정의
def dfs(graph, v, visited):
    # 현재 노드 방문 처리
    visited[v] = True
    print(v, end=' ')
    # 현재 노드와 연결된 다른 노드를 재귀적으로 방문
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

# 각 노드가 연결된 정보를 표현 (2차원 리스트)
graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

# 각 노드가 방문된 정보를 표현 (1차원 리스트)
visited = [False] * 9

# 정의된 DFS 함수 호출
dfs(graph, 1, visited)


#* 3.2. BFS (Breadth - First Search) 너비 우선 탐색 (Queue 이용 ) (최단거리로도 이용됨)
#* 1. 탐색 시작 노드를 큐에 넣고 방문 처리
#* 2. 큐에서 노드 꺼내 해당 노드 인접 노드 중 
#*     방문하지 않은 노드를 모두 큐에 삽입, 방문처리
#* 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복

from collections import deque

# BFS 메서드 정의
def bfs(graph, start, visited):
    # 큐(Queue) 구현을 위해 deque 라이브러리 사용
    queue = deque([start])
    # 현재 노드를 방문 처리
    visited[start] = True
    # 큐가 빌 때까지 반복
    while queue:
        # 큐에서 하나의 원소를 뽑아 출력하기
        v = queue.popleft()
        print(v, end=' ')
        # 아직 방문하지 않은 인접한 원소들을 큐에 삽입
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

# 각 노드가 연결된 정보를 표현 (2차원 리스트)
graph = [
    [],
    [2, 3, 8],
    [1, 7],
    [1, 4, 5],
    [3, 5],
    [3, 4],
    [7],
    [2, 6, 8],
    [1, 7]
]

# 각 노드가 방문된 정보를 표현 (1차원 리스트)
visited = [false] * 9

bfs(graph, 1, visited)

#* 3.1.1 음료수 얼려먹기

# DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
def dfs(x, y):
    # 주어진 범위를 벗어나는 경우에는 즉시 종료
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False
    # 현재 노드를 아직 방문하지 않았다면
    if graph[x][y] == 0:
        graph[x][y] = 1
        dfs(x - 1, y)
        dfs(x + 1, y)
        dfs(x, y + 1)
        dfs(x, y - 1)
        return True
    return False

# N, M을 공백을 기준으로 구분하여 입력 받기
n, m = map(int, input().split())

# 2차원 리스트의 맵 정보 입력 받기
graph = []
for i in range(n):
    graph.append(list(map(int,input())))

# 모든 노드(위치)에 대하여 음료수 채우기
result = 0
for i in range(n):
    for j in range(m):
        # 현재 위치에서 DFS 수행
        if dfs(i, j) == True:
            result+=1

print(result)