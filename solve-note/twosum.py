
#! 엄청 헤맨 코드
# import sys
# sys.setrecursionlimit(2000)

# class Solution:    
#     def twoSum(self, nums: List[int], target: int) -> List[int]:
#         nums.sort()
#         result = None
        
#         #!이 binary Search 부분에서 return 없이 했음
#         def binarySearch(lt, rt, index):
#             mid = (lt + rt) // 2
#             if nums[mid] == target - nums[index]:
#                 result = [index, mid]
#             elif lt >= rt:
#                 return None
#             elif  nums[mid] < target - nums[index]:
#                 binarySearch(mid + 1,rt, index)
#             elif  nums[mid] > target - nums[index]:
#                 binarySearch(lt ,mid - 1, index)  

#         for i in range(len(nums)):
#             binarySearch(i + 1, len(nums) - 1, i) 
#             if result is None:
#                 continue
#             return result

#! 원인해결  - 재귀함수는 Return으로 꺼내줘야한다. 근데 정렬안되는 문제라 답아니었음 ㅋㅋ
def twoSum(nums, target):
    nums.sort()
    result = None
    #!이 binary Search 부분에서 return 없이 했음
    def binarySearch(lt, rt, index):
        mid = (lt + rt) // 2
        if nums[mid] == target - nums[index]:
            return [index, mid]
        elif lt >= rt:
            return None
        elif  nums[mid] < target - nums[index]:
            return binarySearch(mid + 1,rt, index)
        elif  nums[mid] > target - nums[index]:
            return binarySearch(lt ,mid - 1, index)  
            

    for i in range(len(nums)):
        result = binarySearch(i + 1, len(nums) - 1, i) 
        if result is None:
            continue
        return result

print(twoSum([2,7,11,15], 9))
print(twoSum([3,2,4], 6))


