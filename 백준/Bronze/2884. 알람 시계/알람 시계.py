h, m = map(int,input().split())
target = (h * 60) + m - 45
target_h = target // 60
target_m = target % 60

if target_h < 0 :
    target_h += 24
    
print(target_h, target_m)