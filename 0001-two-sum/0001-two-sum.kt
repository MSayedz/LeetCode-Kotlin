class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

    for (i in nums.indices) {
        val complement = target - nums[i]

        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }

        map[nums[i]] = i
    }

    return intArrayOf()
        // val map = mutableMapOf<Int, Int>()
        // for ((index, num) in nums.withIndex()) {
        //     val complement = target - num
        //     map[complement]?.let { complementIndex ->
        //         return intArrayOf(index, complementIndex)
        //     }
        //     map.putIfAbsent(num, index)
        // }
        // return intArrayOf()
    }
}