import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class calculator extends Container {
    private JPanel calculator;
    private JTextField txtInput;
    private JButton btnAbout;
    private JButton btnTujuh;
    private JButton btnBersikansemua;
    private JButton btnDelapan;
    private JButton btnBersihkan;
    private JButton btnJumlah;
    private JButton btnSembilan;
    private JButton btnBagi;
    private JButton btnEmpat;
    private JButton btnSatu;
    private JButton btnKali;
    private JButton btnEnam;
    private JButton btnKurang;
    private JButton btnTiga;
    private JButton btnLima;
    private JButton btnDua;
    private JButton btnNol;
    private JButton btnTambah;
    private JTextArea txtHasil;
    private JPanel panelApp;

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char operasi;

    private void getOperator(String btnText){
        operasi = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(txtInput.getText());
        txtInput.setText("");
    }

    public calculator() {
        btnNol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0 = txtInput.getText()+ btnNol.getText();
                txtInput.setText(btn0);
            }
        });
        btnSatu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1 = txtInput.getText()+ btnSatu.getText();
                txtInput.setText(btn1);
            }
        });
        btnDua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2 = txtInput.getText()+ btnDua.getText();
                txtInput.setText(btn2);
            }
        });
        btnTiga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3 = txtInput.getText()+ btnTiga.getText();
                txtInput.setText(btn3);
            }
        });
        btnEmpat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4 = txtInput.getText()+ btnEmpat.getText();
                txtInput.setText(btn4);
            }
        });
        btnLima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5 = txtInput.getText()+ btnLima.getText();
                txtInput.setText(btn5);
            }
        });
        btnEnam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6 = txtInput.getText()+ btnEnam.getText();
                txtInput.setText(btn6);
            }
        });
        btnTujuh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7 = txtInput.getText()+ btnTujuh.getText();
                txtInput.setText(btn7);
            }
        });
        btnDelapan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8 = txtInput.getText()+ btnDelapan.getText();
                txtInput.setText(btn8);
            }
        });
        btnSembilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9 = txtInput.getText()+ btnSembilan.getText();
                txtInput.setText(btn9);
            }
        });
        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnTambah.getText();
                getOperator(button_text);
            }
        });
        btnKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnKurang.getText();
                getOperator(button_text);
            }
        });
        btnKali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnKali.getText();
                getOperator(button_text);
            }
        });
        btnBagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnBagi.getText();
                getOperator(button_text);
            }
        });
        btnJumlah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operasi) {
                    case '+':
                        total2 = total1 + Double.parseDouble(txtInput.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(txtInput.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(txtInput.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(txtInput.getText());
                        break;
                }
                txtHasil.setText(Double.toString(total2));
                total1 = 0;
            }
        });

        btnBersikansemua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                txtInput.setText("");
                txtHasil.setText("");
            }
        });
        btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtHasil.setText("Ini Calculator Saya :p");
                txtInput.setText("Ini Calculator Saya :p");
            }
        });
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().panelApp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
};

//Nama : Rizki Firnanda Saputra
//Kelas : 7C
//Nim : 18083000119