import java.awt.*;
import java.awt.event.*; // para usar WindowListener

public class MiVentana extends Frame {
    public static void main(String args[]) {
        // La instancia creada asegura que el constructor de
        // MiFrame sea llamado
        MiFrame unframe = new MiFrame();
    }
}

class MiFrame {
    Frame miFrame; // es el frame que se muestra

    public MiFrame() {
        // Se instancian tres botones con textos
        Button boton1 = new Button("Botón 1");
        Button boton2 = new Button("Botón 2");
        Button boton3 = new Button("Botón 3");
        // Instancia un objeto Frame con su título y utiliza un FlowLayout
        miFrame = new Frame("Primer Ventana");
        miFrame.setLayout(new FlowLayout());
        // setLayout(new FlowLayout(FlowLayout.LEFT)); botones a la izquierda
        // Añade tres objetos Button al Frame
        miFrame.add(boton1);
        miFrame.add(boton2);
        miFrame.add(boton3);
        // Fija el tamaño del Frame y lo hace visible
        miFrame.setSize(400, 300); // ancho 400 pixeles
        miFrame.setVisible(true);
        // Instancia y registra objetos ActionListener sobre los
        // tres botones utilizando la sintaxis abreviada de las
        // clases anidadas
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println(miFrame.getTitle());
            }
        });
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.out.println("Hola");
            }
        });
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                miFrame.setCursor(new Cursor(Cursor.HAND_CURSOR)); // tipo de cursor manita
            }
        });
        // Instancia y registra un objeto WindowListener sobre el objeto
        // Frame para terminar el programa cuando el usuario haga click
        // con el ratón sobre el botón de cerrar la ventana que se
        // coloca sobre el objeto Frame
        miFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                // recibe eventos de windows
                // Concluye la aplicación cuando el usuario cierra la // ventana
                System.exit(0);
            }
        });
    }
}
