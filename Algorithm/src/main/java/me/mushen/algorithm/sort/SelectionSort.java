package me.mushen.algorithm.sort;

/**
 * @Desc 选择排序
 * 每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。
 * @Author Remilia
 * @Create 2018-04-02
 */
public class SelectionSort {

    private int[] items;

    public SelectionSort(int[] items) {
        this.items = items;
    }

    public void sort() {
        if(items == null || items.length == 0) {
            return;
        }

        System.out.print("Before Sort: ");
        printItems();

        for(int i = 0; i < items.length; i++) {
            System.out.print("第" + (i + 1) + "次 Before:");
            printItems();
            int maxIndex = i;
            for(int j = i + 1; j < items.length; j++) {
                if(items[maxIndex] < items[j]) {
                    maxIndex = j;
                }
            }
            if(maxIndex != i) {
                int maxItem = items[maxIndex];
                items[maxIndex] = items[i];
                items[i] = maxItem;
            }
            System.out.print("第" + (i + 1) + "次 After:");
            printItems();
        }

        System.out.print("After Sort: ");
        printItems();
    }

    private void printItems() {
        for(int index = 0; index < items.length; index++) {
            if(index == 0) {
                System.out.print("[" + items[index]);
            }else {
                System.out.print(items[index]);
            }
            if(index != items.length - 1) {
                System.out.print(", ");
            }else {
                System.out.println("]");
            }
        }
    }

    public static void main(String[] args){
        new SelectionSort(new int[]{5, 12, 22, 38, 0, 9}).sort();

        new SelectionSort(new int[]{}).sort();

        new SelectionSort(new int[]{1, 1, 2, 2, 3, 3}).sort();
    }



}
