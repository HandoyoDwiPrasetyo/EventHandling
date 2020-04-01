import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ObjectForm{
    public static void main(String[] args) {
        new GForm();
    }
}
class GForm extends JFrame implements ItemListener, ActionListener {
    private JTextField teksJenisKelamin;
    private JPanel panel;
    private JRadioButton rbtn1;
    private JRadioButton rbtn2;
    private String status[] = {" ", " Sepak Bola", " Berenang", " Basket"};
    private JTextField teksHobby;
    private JComboBox cbStatus;
    private JLabel lbl;
    private JButton btnSave;
    private JButton btnHapus;
    private JButton btnHasil;


    final JTextField fNama = new JTextField(10);

    JLabel lNama = new JLabel("Nama : ");
    JLabel lJenisKelamin = new JLabel("Jenis Kelamin : ");
    JLabel lHobby = new JLabel("Hobby : ");

    public GForm(){
        setTitle("== Formulir Kombinasi GUI dengan Event ==");
        setDefaultCloseOperation(3);
        setSize(440,400);
        panel = new JPanel(new FlowLayout());
        teksJenisKelamin = new JTextField(" - Pilih Jenis Kelamin");
        rbtn1 = new JRadioButton("Laki-laki");
        rbtn2 = new JRadioButton("Perempuan");

        teksHobby = new JTextField(" - Pilih Hobby");
        cbStatus = new JComboBox(status);
        cbStatus.addItemListener(this);

        lbl = new JLabel("  status : none");
        btnSave = new JButton("Save");
        btnHapus = new JButton("Hapus");
        btnHasil = new JButton("Return");
        btnSave.addActionListener(this);
        btnHapus.addActionListener(this);
        btnHasil.addActionListener(this);

        setLayout(null);
        add(lNama);
        add(fNama);
        add(lJenisKelamin);
        add(lHobby);

        ButtonGroup group = new ButtonGroup();
        group.add(rbtn1);
        group.add(rbtn2);
        rbtn1.addItemListener(this);
        rbtn2.addItemListener(this);


        add(teksJenisKelamin);
        add(panel);
        panel.add(rbtn1);
        panel.add(rbtn2);

        add(teksHobby);
        add(cbStatus);

        add(lbl);
        add(btnSave);
        add(btnHapus);
        add(btnHasil);

        lNama.setBounds(10, 10,120,25);
        fNama.setBounds(130, 10, 270, 25);
        lJenisKelamin.setBounds(10,40,120,25);
        teksJenisKelamin.setBounds(130,40,270,25);
        panel.setBounds(130, 60, 200,30);
        lHobby.setBounds(10,90,120,25);
        teksHobby.setBounds(130,90,270,25);
        cbStatus.setBounds(130,120,200,30);
        lbl.setBounds(10,160, 390, 45);
        btnSave.setBounds(30,210,110,30);
        btnHapus.setBounds(150,210,110,30);
        btnHasil.setBounds(270,210,110,30);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent event){
        if(event.getSource()==rbtn1){
            if(event.getStateChange()==ItemEvent.SELECTED)
                teksJenisKelamin.setText("  Laki-laki");
        }
        if(event.getSource()==rbtn2){
            if(event.getStateChange()==ItemEvent.SELECTED)
                teksJenisKelamin.setText("  Perempuan");
        }

        if(event.getStateChange() == ItemEvent.SELECTED) {
            if (cbStatus.getSelectedIndex() == 0)
                teksHobby.setText(" - Pilih Hobby");
            if (cbStatus.getSelectedIndex() == 1)
                teksHobby.setText("  Sepak Bola ");
            if (cbStatus.getSelectedIndex() == 2)
                teksHobby.setText("  Berenang   ");
            if(cbStatus.getSelectedIndex() == 3)
                teksHobby.setText("  Basket  ");
        }
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnSave){
            lbl.setText("  status : Tersimpan");
        }
        if (e.getSource() == btnHapus){
            lbl.setText("  status : Kosong");
        }
        if (e.getSource() == btnHasil){
            String nama = fNama.getText();
            String jenKel = teksJenisKelamin.getText();
            String hoby = teksHobby.getText();
            new NewGUI(nama,jenKel,hoby).setVisible(true);
        }
    }
}

