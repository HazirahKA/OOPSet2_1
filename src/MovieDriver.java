import javax.swing.*;

public class MovieDriver {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        Movie conjuring = new Movie();
        Movie avengers = new Movie();

        conjuring.setName("The Conjuring");
        conjuring.setGenre("Horror");

        avengers.setName("Avengers Endgame");
        avengers.setGenre("Action");

        movie1.setGenre("Horror");
        movie1.setAudienceNumber(100000);
        movie1.setName("Annabelle Creation");


        JOptionPane.showMessageDialog(null,"Title: " + conjuring.getName() + "\nGenre: " + conjuring.getGenre());
        JOptionPane.showMessageDialog(null,"Title: " + avengers.getName()+ "\nGenre: " + avengers.getGenre());
        JOptionPane.showMessageDialog(null,"Title: " + movie1.getName()+ "\nGenre: " + movie1.getGenre());
    }
}
