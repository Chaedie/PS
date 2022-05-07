def binarySearch(lt, rt):
    mid = (lt + rt) // 2
    if lt > rt:
        return print(0)
    if nums[mid] == target:
        return print(1)
    if nums[mid] < target:
        return binarySearch(mid + 1, rt)
    if nums[mid] > target:
        return binarySearch(lt, mid - 1)
    return print(0)

n = int(input())
nums = list(map(int, input().split()))
nums.sort()

m = int(input())
targets = list(map(int, input().split()))

for target in targets:
    binarySearch(0, len(nums) - 1)
    