public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        int[] ans = findErrorNums(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
