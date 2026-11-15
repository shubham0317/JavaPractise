package com.quickhire.model;

public class HeapCheck {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        long initialHeap = runtime.totalMemory();
        long maxHeap = runtime.maxMemory();
        long freeHeap = runtime.freeMemory();

        System.out.println("Currently Allocated Heap: "
                + initialHeap / (1024 * 1024) + " MB");

        System.out.println("Maximum Heap: "
                + maxHeap / (1024 * 1024) + " MB");

        System.out.println("Free Heap: "
                + freeHeap / (1024 * 1024) + " MB");
    }
}
