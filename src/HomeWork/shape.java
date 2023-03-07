package HomeWork;

public  abstract class shape {
    double d1, d2;

    shape (double d1,double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    abstract  void calculateArea ();

    void setColor () {

    }
}
