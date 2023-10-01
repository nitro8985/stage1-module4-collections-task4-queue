package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> resultDeque = new ArrayDeque<>();

        resultDeque.add(Objects.requireNonNull(firstQueue.poll()));
        resultDeque.add(Objects.requireNonNull(firstQueue.poll()));
        resultDeque.add(Objects.requireNonNull(secondQueue.poll()));
        resultDeque.add(Objects.requireNonNull(secondQueue.poll()));

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(resultDeque.pollLast());
            resultDeque.add(Objects.requireNonNull(firstQueue.poll()));
            resultDeque.add(Objects.requireNonNull(firstQueue.poll()));

            secondQueue.add(resultDeque.pollLast());
            resultDeque.add(Objects.requireNonNull(secondQueue.poll()));
            resultDeque.add(Objects.requireNonNull(secondQueue.poll()));
        }
        return resultDeque;
    }
}
