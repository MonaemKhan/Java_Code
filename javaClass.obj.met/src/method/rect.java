package method;

public class rect {

    int length = 10, width = 10;

    void getdata(int x, int y) {
        length = x;
        width = y;
    }

    rect(int x, int y) {
        length = x;
        width = y;
    }

    rect() {
    }

    rect(int x) {
        length = x;
    }

    int result() {
        return length * width;
    }
}
