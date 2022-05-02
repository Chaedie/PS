n = int(input())

for _ in range(n):
    streak = 0
    sum = 0
    str = input()
    # print(str)
    for OX in str:
        if OX == "O":
            streak += 1
        else :
            streak = 0
        sum += streak
    print(sum)