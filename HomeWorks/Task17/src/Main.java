
public class Main {
    static int arr[] = new int[11];

    static void merge (int start, int end) {
        int helpArray[] = new int[end - start];

        // все коменты это отладка
        // System.out.print("helpArr: ");
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = arr[start + i];
            // System.out.print(helpArray[i] + " ");
        }
        // System.out.println();

        int current = start;
        int mid = (helpArray.length + 1) / 2;
        int i = 0, j = mid;
        // System.out.println(i + " " + mid + " " + helpArray.length);
        while (current < end) {
            if (i <  mid && j < helpArray.length) {
                if (helpArray[i] < helpArray[j]) {
                    arr[current] = helpArray[i++];
                } else {
                    arr[current] = helpArray[j++];
                }
            } else {
                if (i == mid) {
                    arr[current] = helpArray[j++];
                }
                else {
                    arr[current] = helpArray[i++];
                }
            }
            current++;
        }

//        System.out.print("arr: ");
//        for (int k = 0; k < arr.length; k++) {
//            System.out.print(arr[k] + " ");
//        }
//        System.out.println();
    }

    static void sort(int start, int end) {
        if (start < end - 1) {
            sort(start, start + ((end - start) + 1) / 2);
            sort(start + ((end - start) + 1) / 2, end);
        }
        merge(start, end);
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sort(0, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
