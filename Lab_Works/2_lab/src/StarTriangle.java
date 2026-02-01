public class StarTriangle {
    private int width;
    public StarTriangle(int width){
        this.width = width;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i = 1; i <= width; i++){
            for(int j = 0; j < i; j++){
                s.append("[*]");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
