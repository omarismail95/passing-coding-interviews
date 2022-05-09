package com.omi.coding.arrays;

import org.springframework.stereotype.Service;

/**
 * Binary Search Service Class.
 *
 * @author Omar Ismail
 * @since 5/9/2022
 */
@Service
public class BinarySearch {


    /**
     * Binary Search (Iterative Solution )
     *
     * @param nums   sorted array of numbers
     * @param target the target number we want to search for
     * @return the index if we found the target or -1 if not
     */
    public static int binarySearchIterativeSolution(int[] nums, int target) {

        //************************************************************************************************
        //*The time complexity of this solution is logarithmic, O(log \space n)
        //O(log n)
        //.*
        //*The space complexity of this solution is constant, O(1)
        //O(1)
        //.*
        //************************************************************************************************

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }
        }

        return -1;
    }


    /**
     * Binary Search (Recursive Solution )
     *
     * @param nums   sorted array of numbers
     * @param target the target number we want to search for
     * @return the index if we found the target or -1 if not
     */
    public static int binarySearchRecursiveSolution(int[] nums, int target) {


        return binarySearchRec(nums, target, 0, nums.length - 1);
    }

    private static int binarySearchRec(int[] nums, int target, int low, int high) {

        //************************************************************************************************
        //*The time complexity of this solution is logarithmic, O(log \space n)
        //O(log n)
        //.*
        //*The space complexity of this solution is logarithmic, O(log \space n)
        //O(log n)
        // because the recursive approach consumes memory on the stack.*
        //************************************************************************************************

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            return binarySearchRec(nums, target, low, mid - 1);
        } else {
            return binarySearchRec(nums, target, mid + 1, high);
        }
    }
}
