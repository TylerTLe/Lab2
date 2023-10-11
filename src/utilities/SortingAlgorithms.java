package utilities;
import java.util.Scanner;

// Exercise 3
	public class SortingAlgorithms {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int[] arr = {5, 2, 8, 3, 1, 6, 9, 7, 4, 15, 22, 11, 89};
			System.out.println("Before sorting: " + arrayToString(arr));
			System.out.println("1. Bubble Sort");
			System.out.println("2. Quick Sort");
			System.out.println("3. Insertion Sort");
			System.out.println("4. Selection Sort");
			System.out.println("Choose a sorting algorithm:");
			int choice = input.nextInt();
			switch (choice) {
				case 1:
					bubbleSort(arr);
					break;
				case 2:
					quickSort(arr, 0, arr.length - 1);
					break;
				case 3:
					insertionSort(arr);
					break;
				case 4:
					selectionSort(arr);
					break;
				default:
					System.out.println("Invalid choice.");
					break;
			}
			System.out.println("After sorting: " + arrayToString(arr));
		}

		public static void bubbleSort(int[] arr) {
			int n = arr.length;
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < n - i - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		}

		public static void quickSort(int[] arr, int low, int high) {
			if (low < high) {
				int pi = partition(arr, low, high);
				quickSort(arr, low, pi - 1);
				quickSort(arr, pi + 1, high);
			}
		}

		public static int partition(int[] arr, int low, int high) {
			int pivot = arr[high];
			int i = low - 1;
			for (int j = low; j < high; j++) {
				if (arr[j] < pivot) {
					i++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			int temp = arr[i + 1];
			arr[i + 1] = arr[high];
			arr[high] = temp;
			return i + 1;
		}

		public static void insertionSort(int[] arr) {
			int n = arr.length;
			for (int i = 1; i < n; i++) {
				int key = arr[i];
				int j = i - 1;
				while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j--;
				}
				arr[j + 1] = key;
			}
		}

		public static void selectionSort(int[] arr) {
			int n = arr.length;
			for (int i = 0; i < n - 1; i++) {
				int minIndex = i;
				for (int j = i + 1; j < n; j++) {
					if (arr[j] < arr[minIndex]) {
						minIndex = j;
					}
				}
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}

		public static String arrayToString(int[] arr) {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
				if (i < arr.length - 1) {
					sb.append(", ");
				}
			}
			sb.append("]");
			return sb.toString();
		}
	}

