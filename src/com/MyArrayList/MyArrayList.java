package com.MyArrayList;

/**
 * Created by marcin on 25.05.2017.
 */
public class MyArrayList {
    private com.MyArrayList.MyArrayItem firstItem;
    private com.MyArrayList.MyArrayItem lastItem;
    private int size;

    public void add(Object data) {
        com.MyArrayList.MyArrayItem item = new com.MyArrayList.MyArrayItem(data);

        if(this.firstItem == null) {
            this.firstItem = item;
            this.lastItem = item;

        } else {
            this.lastItem.setNext(item);
            this.lastItem = item;
        }

        this.size++;
    }


    public Object get(int index) {
        if(this.firstItem == null) {
            return null;
        } else {
            com.MyArrayList.MyArrayItem current = this.firstItem;
            int i = 0;

            do {
                if(i == index) {
                    return current.getData();
                } else {
                    i++;
                    current = current.getNext();
                }
            } while(current != null);

            return null;
        }
    }


    public int getSize() {
        return this.size;
    }
}
