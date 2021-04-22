import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainClassButton {

    private static Utils utils = new Utils();

    public static void main(String[] args) {

        ArrayList<UeClass> arrayListUeClass = utils.generateArray();

        initialiseFenetre(arrayListUeClass);
    }

    private static void initialiseFenetre(ArrayList<UeClass> arrayListUeClass) {

        JFrame fenetre = new JFrame("TP 01 - GRP MEYER, SANTAMARIA, GAUDARD");

        fenetre.setSize(550,700);
        fenetre.setLayout(null);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);

        initialiseButton(fenetre, arrayListUeClass);
    }

    private static void initialiseButton(JFrame fenetre, ArrayList<UeClass> arrayListUeClass) {

        JButton transactionUnButton = new JButton("Transaction 1");
        JButton transactionDeuxButton = new JButton("Transaction 2");
        JButton transactionTroisButton = new JButton("Transaction 3");

        JTextArea jTextArea = initialiseTextArea(fenetre);

        transactionUnButton.setBounds(50,75,120,30);
        transactionDeuxButton.setBounds(200,75,120,30);
        transactionTroisButton.setBounds(350,75,120,30);

        fenetre.add(transactionUnButton);
        fenetre.add(transactionDeuxButton);
        fenetre.add(transactionTroisButton);
        fenetre.add(jTextArea);

        transactionUnButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextArea.append("------- TRAITEMENT UN -------- \n");
                arrayListUeClass.forEach(new UeClass.TraitementUn());
            }
        });

        transactionDeuxButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextArea.append("------- TRAITEMENT DEUX -------- \n");
                arrayListUeClass.forEach(new UeClass.TraitementDeux());
            }
        });

        transactionTroisButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextArea.append("------- TRAITEMENT TROIS -------- \n");
                arrayListUeClass.forEach(new UeClass.TraitementTrois());
            }
        });
    }

    private static JTextArea initialiseTextArea(JFrame fenetre) {

        JTextArea jTextArea = new JTextArea();

        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jTextArea.setBounds(50,150,420,400);

        return jTextArea;
    }
}
