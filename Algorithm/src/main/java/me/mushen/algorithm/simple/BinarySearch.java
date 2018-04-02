package me.mushen.algorithm.simple;

/**
 * @Desc 二分查找
 * 1. 仅当列表是有序的时候
 * 2. 时间复杂度O(log n)
 * @Author Remilia
 * @Create 2018-03-22
 */
public class BinarySearch {
    // 查询的数据列表
    private int[] items;
    // 目标数据
    private int target;

    public BinarySearch(int[] items, int target) {
        this.items = items;
        this.target = target;
    }

    /*
     * 返回目标数据(target)在数据列表(items)中的索引
     * 不存在则返回-1
     */
    public int binarySearch() {
        if(items == null || items.length == 0) {
            return -1;
        }
        int start = 0;
        int end = items.length - 1;

        int targetIndex = 0;
        boolean isFind = false;

        int times = 0;
        while (start <= end) {
            System.out.println("times: " + (++times));

            targetIndex = (end + start) / 2; // 取中间数
            if(target < items[targetIndex]) {
                end = targetIndex - 1;
            }else if(target > items[targetIndex]) {
                start = targetIndex + 1;
            }else {
                isFind = true;
            }
            if(isFind) {
                break;
            }
        }

        return isFind ? targetIndex : -1;
    }

    public static void main(String[] args){
        int[] items = new int[] {1, 3, 5, 7, 9};

        // 5
        System.out.println(new BinarySearch(items, 5).binarySearch());
        // -100
        System.out.println(new BinarySearch(items, -100).binarySearch());
        // 1
        System.out.println(new BinarySearch(items, 1).binarySearch());
        // 3
        System.out.println(new BinarySearch(items, 3).binarySearch());
    }
}
