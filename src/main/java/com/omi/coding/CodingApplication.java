package com.omi.coding;

import com.omi.coding.arrays.BinarySearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingApplication {

    @Autowired
    static
    BinarySearch binarySearch;

    public static void main(String[] args) {
        SpringApplication.run(CodingApplication.class, args);

        int[] nums = new int[]{1, 3, 9, 10, 12};
        int target = 12;

        // The first solution ( Iterative solution )
        int index = binarySearch.binarySearchIterativeSolution(nums, target);

        System.out.printf(index != -1 ? "The target founded on index >>> " + index
                : "Not founded on the given array");

        // The second solution ( Recursive )
        int indexByRecursion = binarySearch.binarySearchRecursiveSolution(nums, target);

        System.out.printf(index != -1 ? "The target founded on index (Recursively) >>> " + indexByRecursion
                : "Not founded on the given array");

    }
}
