#1 셀프넘버
def d(n):
    result = n + sum(list(map(int,str(n))))
    return result

nonSelfNum = set()

# 생성자 찾아서 다 집합에 넣음
for i in range(1, 10_001):
    dValue = d(i)
    nonSelfNum.add(dValue)

for j in range(1,10_001):
    if j not in nonSelfNum:
        print(j)