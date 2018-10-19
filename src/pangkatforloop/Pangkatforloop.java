package pangkatforloop;
import javax.swing.JOptionPane;
public class Pangkatforloop
{
    public static void main(String[] args)
    {
    int hasil = 1;
    String st1 = "";
    String st2 = "";
    
    st1 = JOptionPane.showInputDialog("Masukkan angka");
    int angka = Integer.valueOf(st1).intValue();
    
    st2 = JOptionPane.showInputDialog("Masukkan pangkat");
    int pangkat = Integer.valueOf(st2).intValue();
    
    for(int i=1;i<=pangkat;i++){
    hasil=hasil*angka;
    }

    String st3 = angka + " pangkat " + pangkat + " = " + hasil;
    JOptionPane.showMessageDialog(null, st3);
    }
}  