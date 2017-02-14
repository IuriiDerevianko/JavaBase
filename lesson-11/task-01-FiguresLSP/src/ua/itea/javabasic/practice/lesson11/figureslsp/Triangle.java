package ua.itea.javabasic.practice.lesson11.figureslsp;
class Triangle extends Shape {
    private int a, b, c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void print() {
        System.out.println(getColor()+ " triangle AxBxC: " + a + "x" + b + "x" + c + " px;");
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getArea(){
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
    @Override
    public void build() {
        int max = a;
        int gipoFirst = b;
        int gipoSecond = c;
        if(max < b) {
            max = b;
            gipoFirst = a;
            gipoSecond = c;
        }
        if(max < c) {
            max = c;
            gipoFirst = a;
            gipoSecond = b;
        }
        double p = ((a + b + c) / 2);
        double h = (2 * (Math.sqrt(p * (p - a) * (p - b) * (p - c))) / max);
        double catFirst =  Math.sqrt(Math.pow(gipoFirst, 2) - Math.pow(h, 2));
        double catSecond = Math.sqrt(Math.pow(gipoSecond, 2) - Math.pow(h, 2));


        String[][] figure = new String[(int)h][max];
        for (int i = 0; i < (int)h ; i++) {
            for (int j = 0; j < max ; j++) {
                figure[i][j] = " *";
            }
        }

        double stepFirst = catFirst / h;
        double catFirstTemp = catFirst;
        for (int i = 0; i < (int)h; i++) {
            for (int j = 0; j < (catFirstTemp-1); j++) {
                figure[i][j] = "  ";
            }
            catFirstTemp-=stepFirst;
        }

        double stepSecond = catSecond / h;
        double catSecondTemp = max - catSecond;
        for (int i = 0; i < (int)h; i++) {
            for (int j = (max - 1); j > catSecondTemp; j--) {
                figure[i][j] = "  ";
            }
            catSecondTemp+=stepSecond;
        }

        for (int i = 0; i < (int)h ; i++) {
            for (int j = 0; j < max ; j++) {
                System.out.print(figure[i][j]);
            }
            System.out.println();
        }
    }
}
