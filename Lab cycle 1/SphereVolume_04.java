class SphereVolume_04{
    public static void main(String args[]){
        double radius = Double.parseDouble(args[0]);
        double volume = (4/3) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume of sphere is: " + volume);
    }
}