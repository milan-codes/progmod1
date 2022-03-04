package lecture4.newnumbers;

import java.util.ArrayList;
import java.util.Random;

public class NewNumbersMain {

    public static void main(String[] args) {
    }

    static int[] generateArray(boolean random) {
        int[] arr = {1, 2, 3, 4, 5};
        if (random) {
            Random rnd = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(100) - 50;
            }
        }
        return arr;
    }

    static int[][] generateTwoDimensionalArray(boolean random) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        if (random) {
            Random rnd = new Random();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = rnd.nextInt(100) - 50;
                }
            }
        }
        return arr;
    }

    static ArrayList<Integer> generateList(boolean random, int length) {
        ArrayList<Integer> list = new ArrayList<>();
        if (random) {
            Random rnd = new Random();
            for (int i = 0; i < length; i++) {
                list.add(rnd.nextInt());
            }
        } else {
            for (int i = 0; i < length; i++) {
                list.add(i + 1);
            }
        }
        return list;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    private static void print2dArray(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }

    private static void printList(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    static ArrayList<Integer> selectEvenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> subset = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                subset.add(i);
            }
        }
        return subset;
    }

    static ArrayList<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> inters = new ArrayList<>();
        for (int i : list1) {
            if (list2.contains(i)) {
                inters.add(i);
            }
        }
        return inters;
    }

    private static void separateEvenAndOdds(ArrayList<Integer> list) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        printList(even);
        printList(odd);
    }

    static int numberOfOdds(ArrayList<Integer> list) {
        int counter = 0;
        for (int i : list) {
            if (i % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    static boolean contains(ArrayList<Integer> list, int target) {
        for (int i : list) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

    static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    static int indexOf(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i : list2) {
            if (!list1.contains(i)) {
                list1.add(i);
            }
        }
        return list1;
    }
}
