package Inheritance;

public class TestShape extends Shape {
	public static void main(String[] args) {
		
		Shape s[] = new Shape[3];
        s[0]= new Rectangle();
        s[1] = new Circle();
        s[2] = new Triangle();
        Shape s2 = new Shape();
        Shape s3 = new Shape();
    Rectangle r=(Rectangle) s[0];
    r.setLength(56);
    r.setWidth(99);
    Circle c = (Circle)s[1];
    c.setRadius(20);
    Triangle t = (Triangle)s[2];
    t.setBase(10);
    t.setHeight(20);
    
    
    double totalArea = 0 ;
	for (int i = 0; i < s.length; i++) {
		totalArea +=s[i].area();
		}
	
		
			System.out.println(totalArea);

	}
	}

	
		 
			
		


