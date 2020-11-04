package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(35000,"Toyota","Supra");
        Vehicle v2 = new Vehicle(10000,"Skoda","Fabia");
        Car c1 = new Car(75000,"Ford","Mustang","FastBack");
        Car c2 = new Car(150000,"Mitsubishi","Lancer","Sedan");
        Motorcycle m1 = new Motorcycle(25000,"Honda","CBR 1000","Lancuch");
        Motorcycle m2 = new Motorcycle(1500,"Java","250","Lancuch");

        Product[] pojazdy = new Product[6];
        pojazdy[0] = v1;
        pojazdy[1] = v2;
        pojazdy[2] = c1;
        pojazdy[3] = c2;
        pojazdy[4] = m1;
        pojazdy[5] = m2;
        for(int i=0;i<6;i++)
        {
            System.out.println("Marka: " + ((Vehicle)pojazdy[i]).getBrand() + ", Model: "+((Vehicle)pojazdy[i]).getModel() + ", Cena: " + ((Vehicle)pojazdy[i]).price + ", Cena promocyjna: " + ((Vehicle)pojazdy[i]).calculateBargainPrice());
        }
    }
}
