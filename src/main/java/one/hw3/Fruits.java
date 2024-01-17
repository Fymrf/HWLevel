package one.hw3;

public class Fruits {
    public void workWithFruits() {
        Box<Apples> appleBox1 = new Box<>();
        Box<Apples> appleBox2 = new Box<>();
        Box<Oranges> orangeBox1 = new Box<>();
        Box<Oranges> orangeBox2 = new Box<>();

        System.out.println("Добавление в каждую корзину по одному фрукту...");
        appleBox1.add(new Apples());
        appleBox2.add(new Apples());
        orangeBox1.add(new Oranges());
        orangeBox2.add(new Oranges());

        System.out.println("appleBox1==appleBox2? : "+appleBox1.compare(appleBox2));
        System.out.println("orangeBox1==orangeBox2? : "+orangeBox1.compare(orangeBox2));
        System.out.println("appleBox1==orangeBox1? : "+appleBox1.compare(orangeBox1));

        System.out.println("Перенос яблока из 1й корзины во 2ю");
        appleBox1.moveTo(appleBox2);
        System.out.println("Перенос апельсина из 1й корзины во 2ю");
        orangeBox1.moveTo(orangeBox2);

        System.out.println("Weight of appleBox1: "+appleBox1.getWeight());
        System.out.println("Weight of appleBox2: "+appleBox2.getWeight());
        System.out.println("Weight of orangeBox1: "+orangeBox1.getWeight());
        System.out.println("Weight of orangeBox2: "+orangeBox2.getWeight());
    }

}
