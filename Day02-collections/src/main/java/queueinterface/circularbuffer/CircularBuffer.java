package queueinterface.circularbuffer;

class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void add(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity;
        }
    }

    public int[] getBufferContents() {
        int[] contents = new int[size];
        for (int i = 0; i < size; i++) {
            contents[i] = buffer[(head + i) % capacity];
        }
        return contents;
    }
}
