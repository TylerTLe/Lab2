package utilities;

import java.util.Arrays;
import java.util.Comparator;

import comparableVsComparator.Student;

// Exercise 2
public final class Sorts{
    public static int binarySearch(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void sortByName(Student[] arr) {
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }
    
    public static void sortByAge(Student[] arr) {
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
    }
}
