package Aplicacion.Vistas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class SimpleTableDemo extends JPanel {
    private boolean DEBUG = false;
    String titulo;
    
    String ventanaObjetivo;
    
public SimpleTableDemo(String [] cabecera, Object[] [] datos, String titulo, String ventanaObjetivo) {
        super(new GridLayout(1,0));
        this.titulo = titulo;
        this.ventanaObjetivo=ventanaObjetivo;
        
        String[] columnNames = cabecera;

        Object[][] data =datos;
       

        final JTable table = new JTable(data, columnNames);
        table.setEnabled(true);
        
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        
        table.addMouseListener(new MouseAdapter() {
            
                public void mouseClicked(MouseEvent e) {
                    //int[] l = table.getSelectedRows();
                    //int ALGO = table.getSelectedRow();
                    
                    int row = table.getSelectedRow();
                    int column = 0;  //table.getSelectedColumn();
                    Object puntero = table.getValueAt(row, column);
                    System.out.println("seleccionado"); //por si las moscas
                    System.out.println(puntero);
                    
                    if(ventanaObjetivo.equals ("EditarEmpleado")){
                      
                        new EditarEmpleado((String) puntero);

                    }
                    
                    else if(ventanaObjetivo.equals ("EditarProducto")){
                      
                        //new EditarProducto((String) puntero);

                    }
                    
                    
                    
                }
            });
       

        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }
    
    
    
    
    public SimpleTableDemo() {
        super(new GridLayout(1,0));

        String[] columnNames = {"First Name",
                                "Last Name",
                                "Sport",
                                "# of Years",
                                "Vegetarian"};

        Object[][] data = {
	    {"Kathy", "Smith",
	     "Snowboarding", new Integer(5), new Boolean(false)},
	    {"John", "Doe",
	     "Rowing", new Integer(3), new Boolean(true)},
	    {"Sue", "Black",
	     "Knitting", new Integer(2), new Boolean(false)},
	    {"Jane", "White",
	     "Speed reading", new Integer(20), new Boolean(true)},
	    {"Joe", "Brown",
	     "Pool", new Integer(10), new Boolean(false)}
        };

        final JTable table = new JTable(data, columnNames);
        table.setEnabled(false);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
        
    }
    

    public void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("SimpleTableDemo");
        frame.setTitle(titulo);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Create and set up the content pane.
        SimpleTableDemo newContentPane = new SimpleTableDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(this);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
    }

    
}