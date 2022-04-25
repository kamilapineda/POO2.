import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private JTextField textProducto;
    private JTextField textPrecioU;
    private JTextField textCantidad;
    private JButton guardarProductoButton;
    private JTable table1;
    private JLabel lblProducto;
    private JLabel lblPrecioU;
    private JLabel lblCantidad;
    private JLabel lblMini;

    private List<Producto> producto= new ArrayList<>();

    public Menu(){
        String[] cols ={"Nombre", "Precio Unidad", "Cantidad"};
        DefaultTableModel model = new DefaultTableModel(cols,0);
        table1.setModel(model);

    guardarProductoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object[] data= {textProducto.getText(),textPrecioU.getText(), textCantidad.getText()};
            model.addRow(data);
            textProducto.setText("");
            textPrecioU.setText("");
            textCantidad.setText("");

        }
    });
    }


}
