package me.erudev.ch01._0004;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 猫狗队列
 *
 * @author pengfei.zhao
 * @date 2020/12/5 16:43
 */
public class CatDogQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private int count;

    public CatDogQueue() {
        dogQ = new LinkedList<>();
        catQ = new LinkedList<>();
        count = 0;
    }

    public void add(Pet pet) {
        if ("dog".equals(pet.getType())) {
            dogQ.add(new PetEnterQueue(pet, count++));
        } else if ("cat".equals(pet.getType())) {
            catQ.add(new PetEnterQueue(pet, count++));
        } else {
            throw new RuntimeException(pet.getType() + "is not allow");
        }
    }

    public Pet pollAll() {
        if (!dogQ.isEmpty() && !catQ.isEmpty()) {
            if (dogQ.peek().getCount() < catQ.peek().getCount()) {
                return dogQ.poll().getPet();
            } else {
                return catQ.poll().getPet();
            }
        } else if (!dogQ.isEmpty()) {
            return dogQ.poll().getPet();
        } else if (!catQ.isEmpty()) {
            return catQ.poll().getPet();
        } else {
            throw new RuntimeException("err, queue is empty");
        }
    }

    public Dog pollDog() {
        if (dogQ.isEmpty()) {
            throw new RuntimeException("dog queue is empty");
        }
        return (Dog) dogQ.poll().getPet();
    }

    public Cat pollCat() {
        if (catQ.isEmpty()) {
            throw new RuntimeException("dog queue is empty");
        }
        return (Cat) catQ.poll().getPet();
    }

    public boolean isEmpty() {
        return dogQ.isEmpty() && catQ.isEmpty();
    }

    public boolean isDogEmpty() {
        return dogQ.isEmpty();
    }

    public boolean isCatEmpty() {
        return catQ.isEmpty();
    }
}
