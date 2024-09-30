package day_8;

class CalShape implements Shape{
    private int shape;
    private String typeShape;
    private float vertical;
    private float horizontal;
    private float diagonal;
    private float radius;
    private float luas;
    private float keliling;

    public void CalShape(){
    }

    @Override
    public float calLuas(){
        switch(shape) {
            case 1 -> luas = vertical * horizontal;
            case 2 -> luas =  vertical * horizontal;
            case 3 -> luas = vertical * horizontal / 2;
            case 4 -> luas = vertical * horizontal / 2;
            case 5 -> luas =  22 * radius * radius / 7;
            case 6 -> luas =  vertical * horizontal;
            default -> {
                System.out.println("Set Type Shape");;
            }
        }
        return luas;
    }

    @Override
    public float calKeliling() {
        switch (shape) {
            case 1 -> keliling = vertical * 4;
            case 2 -> keliling =  (vertical + horizontal) * 2;
            case 3 -> keliling = (float) (vertical + horizontal +  diagonal);
            case 4 -> keliling = (float) (horizontal +  2 * diagonal);
            case 5 -> keliling =  22 * 2 * radius / 7;
            case 6 -> keliling =  (horizontal + diagonal) * 2;
            default -> {
                System.out.println("Set Type Shape");
            }
        }
        return keliling;
    }
    public String getTypeShape() {
        switch (shape) {
            case 1 -> typeShape = "Persegi";
            case 2 -> typeShape = "Persegi Panjang";
            case 3 -> typeShape = "Segitiga Siku-siku";
            case 4 -> typeShape = "Segitiga Sama kaki";
            case 5 -> typeShape = "Lingkaran";
            case 6 -> typeShape = "Jajar Genjang";
            default -> {System.out.println("Set Type Shape");}
        }
        return typeShape;
    }

    public void setTypeShape(int shape) {
        this.shape = shape;
    }

    public float getVertical() {
        return vertical;
    }

    public void setVertical(float vertical) {
        this.vertical = vertical;
    }

    public float getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(float horizontal) {
        this.horizontal = horizontal;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}
