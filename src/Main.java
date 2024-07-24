import entities.Rettangolo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rettangolo r = new Rettangolo(2, 4);
        Rettangolo.stampaRettangolo(r);

        Rettangolo r1 = new Rettangolo(5, 8);
        Rettangolo r2 = new Rettangolo(3, 6);
        Rettangolo.stampaDueRettangoli(r1, r2);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }
}