nums = list(map(int,input().split(" ")))

# print(nums)
sum = 0
test = 0
for num in nums:
    sum += num * num
    # print(sum)
test = sum % 10

print(test)