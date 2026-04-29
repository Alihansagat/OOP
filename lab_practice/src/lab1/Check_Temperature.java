import lab1.Temperature;

class temp {
    public static void main(String[] args){
        Temperature temp = new Temperature();
        System.out.println(temp.getScale());
        System.out.println(temp.getCelsius());

        Temperature temp2 = new Temperature(100, 'C');
        System.out.println(temp2.getScale());
        System.out.println(temp2.getCelsius());
        System.out.println(temp2.getFahrenheit());
        temp2.setScale('C');
        temp2.setValue(-5);
        System.out.println(temp2.getScale());
        System.out.println(temp2.getFahrenheit());

        Temperature temp3 = new Temperature('F');
        System.out.println(temp3.getScale());
        System.out.println(temp3.getCelsius());

        Temperature temp4 = new Temperature(45);
        System.out.println(temp4.getScale());
        System.out.println(temp4.getCelsius());
        temp4.setBoth(35, 'F');
        System.out.println(temp4.getScale());
        System.out.println(temp4.getCelsius());


    }
}