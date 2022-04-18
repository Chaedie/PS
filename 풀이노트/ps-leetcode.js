//! 704. Binary Search
// /**
//  * @param {number[]} nums
//  * @param {number} target
//  * @return {number}
//  */

// var nums = [-1, 0, 3, 5, 9, 12];
// var target = 2;

// var search = function (nums, target) {
//   for (let i = 0; i < nums.length; i++) {
//     if (nums[i] == target) {
//       return i;
//     }
//   }
//   return -1;
// };
// console.log(search(nums, target));
// //

//! 35. Search Insert Position
// /**
//  * @param {number[]} nums
//  * @param {number} target
//  * @return {number}
//  */
//var isntThere = false;
// var searchInsert = function (nums, target) {
//   for (let i = 0; i < nums.length; i++) {
//     if (nums[i] == target) {
//       return i;
//     } else if (nums[i] > target) {
//       return i;
//     }
//   }
//   return nums.length;
// };

//! 9. Palindrome Number
// /**
//  * @param {number} x
//  * @return {boolean}
//  */
//  var isPalindrome = function(x) {
//     //x.length
//     var bCheckFalse = false;
//     var str = String(x);
//     const strarr = str.split('');
//     var intarr = new Array();
//     var intarrMirror = new Array();

//     for (let i = 0; i < strarr.length; i++) {
//       intarr[i] = parseInt(strarr[i]);
//     }
//     for (let i = 0; i < strarr.length; i++) {
//       intarrMirror[i] = intarr[intarr.length - i - 1]
//     }
//     for (let i = 0; i < intarr.length; i++) {
//       if (intarrMirror[i] == intarr[i]) {
//         bCheckFalse = true
//       } else {
//         return false
//       }
//     }
//     console.log(str);
//     console.log(strarr);
//     console.log(intarr);
//     console.log(intarrMirror);
//     console.log(strarr.length);

//     return bCheckFalse;
//   };

//   console.log(isPalindrome(1001));
//   console.log(isPalindrome(121));
//   console.log(isPalindrome(1111144444));
//   console.log(isPalindrome(1000021));

//! 278. First Bad Version
/**
 * Definition for isBadVersion()
 *
 * @param {integer} version number
 * @return {boolean} whether the version is bad
 * isBadVersion = function(version) {
 *     ...
 * };
 */

/**
 * @param {function} isBadVersion()
 * @return {function}
 */
var solution = function (isBadVersion) {
  /**
   * @param {integer} n Total versions
   * @return {integer} The first bad version
   */
  return function (n) {};
};
