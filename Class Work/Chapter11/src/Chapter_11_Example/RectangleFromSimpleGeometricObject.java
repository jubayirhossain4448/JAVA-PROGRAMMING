
package Chapter_11_Example;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject() {
    }

    public RectangleFromSimpleGeometricObject(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    /** Return width */
    public double getWidth(){
    return width;
    }
    /** Set a new width */
    public void setWidth (double width){
    this.width = width;
    }
    /** Return height */
    public double getHeight(){
    this.height = height;
       }
    
    /** Set a new height */
    public void setHeight(){
    this.height = height;
    }
    
    /** Return area */
    public double getArea(){
    return width * height;
    }
    
    /** Return perimeter */
    public double getPerimeter(){
    return 2 * (width + height);
    }
}
