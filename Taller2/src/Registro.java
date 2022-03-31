import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Registro {

    private JRadioButton carroRadioButton;
    private JRadioButton motoRadioButton;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtPlaca;
    private JButton totalAPagarButton;
    private JLabel lblRegistro;
    private JLabel lblVehiculo;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblPlaca;
    private JLabel lblFecha;
    private JLabel lblEntrada;
    private JLabel lblFecha1;
    private JLabel lblSalida;
    public JPanel pnlMain;
    private JLabel lblv;
    private JLabel lblv2;
    private JLabel lblej;
    private JLabel lblej1;
    private JTextField txtFecha;
    private JTextField txtHora;
    private JLabel lblHora;
    private JLabel lbleje;
    private JLabel lblHora1;
    private JTextField txtFecha1;
    private JTextField txtHora1;
    private JLabel lbleje1;
    private JTextField txtPrecio;
    private JLabel lblPrecio;
    private String Transporte;

    public Registro(){
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(carroRadioButton);
        buttonGroup.add(motoRadioButton);
        motoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transporte = "Moto";
            }
        });
        carroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transporte = "Carro";
            }
        });

        totalAPagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtMarca.getText().isEmpty() && !txtModelo.getText().isEmpty() && !txtPlaca.getText().isEmpty() && !txtFecha.getText().isEmpty() && !txtHora.getText().isEmpty() && !txtFecha1.getText().isEmpty() && !txtHora1.getText().isEmpty() && !txtPrecio.getText().isEmpty()){
                    JOptionPane.showMessageDialog(new JFrame(),   "\nVehiculo: "+Transporte.toString()+"\nMarca: " + txtMarca.getText()+ "\nPlaca: "+ txtPlaca.getText()+  "\nModelo: " + txtModelo.getText()+ "\nFecha de entrada: " + txtFecha.getText()+ "\nHora de entrada: " + txtHora.getText()+ "\nFecha de salida: " + txtFecha1.getText() + "\nHora de salida: " + txtHora1.getText());

                }else {
                    JOptionPane.showMessageDialog(new JFrame(),  "Digite los valores correctamente en los campos de marca, placa y modelo");
                }
            }
        });
        totalAPagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int Valor = Integer.parseInt(txtPrecio.getText());
                    SimpleDateFormat format = new  SimpleDateFormat("HH:mm:ss");
                    Date firstHora = format.parse(txtHora.getText());
                    Date secondHora = format.parse(txtHora1.getText());
                    long timeDiff = Math.abs(secondHora.getTime()-firstHora.getTime());
                    long hora = TimeUnit.HOURS.convert(timeDiff, TimeUnit.MILLISECONDS);
                    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date firstDate = format1.parse(txtFecha.getText());
                    Date secondDate = format1.parse(txtFecha1.getText());
                    long timeDiff1 = Math.abs(secondDate.getTime()-firstDate.getTime());
                    long dia = TimeUnit.HOURS.convert(timeDiff1,TimeUnit.MILLISECONDS);
                    JOptionPane.showMessageDialog(new JFrame(), "El precio a pagar es: " + (hora+dia)*Valor);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(new JFrame(), "Ingrese un formato de fecha y hora valido");
                }
            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}