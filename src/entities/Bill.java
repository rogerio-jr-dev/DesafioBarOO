package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public Bill() {
    }

    //Covert artistic
    public double cover() {
        if (feeding() > 30.0) {
            return 0.00;
        } else {
            return 4.00;
        }
    }

    //Consumo
    public double feeding() {
        return (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00);
    }

    //Ticket
    public double ticket() {
        if (gender == 'F') {
            return 8.00;
        } else {
            return 10.00;
        }
    }

    public double total() {
        return feeding() + cover() + ticket();
    }

}
