import javax.swing.*;

class NewGUI extends JFrame{
    public JTextField hasil;
    JLabel lnama = new JLabel("Nama : ");
    JLabel ljekel = new JLabel("Jenis Kelamin : ");
    JLabel lhobby = new JLabel("Hobby : ");
    JTextField fnama = new JTextField();
    public NewGUI(String nama, String jenKel, String hoby){
            setTitle("Hasil Data Formulir");
            setDefaultCloseOperation(3);
            setSize(440,400);
            JLabel n = new JLabel(nama);
            JLabel j = new JLabel(jenKel);
            JLabel h = new JLabel(hoby);

            add(lnama);
            add(ljekel);
            add(lhobby);
            add(n);
            add(j);
            add(h);

            setLayout(null);
            lnama.setBounds(10,10,120,25);
            n.setBounds(130,10,220,25);
            ljekel.setBounds(10, 40,120,25);
            j.setBounds(130,40,220,25);
            lhobby.setBounds(10,70,120,25);
            h.setBounds(130,70,220,25);

            setVisible(true);
    }
}
