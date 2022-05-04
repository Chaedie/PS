n, x = map(int,input().split())
a = list(map(int,input().split()))

# result = []
# print(n,x)
# print(a)

for num in a:
    if num < x:
        # result.append(num)
        print(num, end=" ")