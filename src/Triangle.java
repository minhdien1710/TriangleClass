public class Triangle extends Shape {
    private float side1 = 1;
    private float side2 = 1;
    private float side3 = 1;

    public Triangle() {
    }

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, float side1, float side2, float side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }
    public float getPerimeter(){
        return side1+side2+side3;
    }
    public double getArea(){
        float p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    @Override
    public String toString(){
        return "tam giac mau " +this.getColor() + " voi kich thuoc "+ side1 +","+side2+","+side3 + " co chu vi la "+ getPerimeter()
                + "va dien tich la " + getArea();
    }
}
