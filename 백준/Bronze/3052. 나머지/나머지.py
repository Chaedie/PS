nums = []
for i in range(10):
    num = int(input())
    # print(num)
    # print(i)
    nums.append(num % 42)
    # print(nums)

# print(nums)
nums_set = set(nums)
# print(nums_set)
print(len(nums_set))