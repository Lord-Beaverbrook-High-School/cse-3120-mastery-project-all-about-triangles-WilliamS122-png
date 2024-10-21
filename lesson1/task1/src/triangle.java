public class triangle{
  //put your task here
    private double a;
    private double b;
    private double c;
    private double perim;
    public triangle (){
        this.a = 3;
        this.b = 4;
        this.c = 5;
        this.perim = a + b + c;
    }
    public triangle(double a, double b, double c){
        //I hate these if statements for comparisons and if your readigng this comment then i was too lazy to make it a method
        if (a>b && a>c){
            this.c = a;
            if(b>c){
                this.a=b;
                this.b=c;
            }
            else{
                this.a=c;
                this.b=b;
            }
        }
        else if (b>a && b > c){
            this.c=b;
            if(a>c){
                this.a=a;
                this.b=c;
            }
            else{
                this.a=c;
                this.b=a;
            }
        }
        else if (c>b && c>a){
            this.c = c;
            if(a>b){
                this.a=a;
                this.b=b;
            }
            else{
                this.a=b;
                this.b=a;
            }
        }

        this.perim = a + b + c;
    }
    //accesors
    public double getMedium(){
        return a;
    }
    public double getSmall(){
        return b;
    }
    public double getLarge(){
        return c;
    }
    //setter for the sides
    public void setSmall(double small){
        b=small;
    }
    public void setMedium(double medium){
        a=medium;
    }
    public void setLarge(double large){
        b=large;
    }

    //Acessor for perimeter
    public double perimeter(){
        return perim;
    }
    public double area(){
        double p = perimeter()/2;
        double area =Math.sqrt( p*((p - a)*(p-b)*(p-c)));
        return area;
    }
    public boolean isTriangle(){
        if(a+b>c){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isRightTriangle(){
        if ((a*a+b*b)%0.1 ==(c*c)%0.1){
            return true;
        }
        else{
            return true;
        }
    }
    public void displayTriangle(){
        System.out.println("Smallest side "+b);
        System.out.println("Medium side "+a);
        System.out.println("Largest side "+c);
    }
}