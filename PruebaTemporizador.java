import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTemporizador {
    private static int tiempoRestTotal;

    public static void main(String[] args) {
        mostrarDialogoConCronometro(60);
    }

    public static void mostrarDialogoConCronometro(int segundos) {
        Timer timer = new Timer(1000, new ActionListener() {
            int tiempoRestante = segundos;

            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoRestante--;
                tiempoRestTotal = tiempoRestante;
                System.out.println("Tiempo restante: " + tiempoRestante + " segundos");
                if (tiempoRestante <= 0) {
                    ((Timer) e.getSource()).stop(); // Detener el temporizador
                    System.out.println("¡Se acabó el tiempo!");
                }
            }
        });

        // Iniciar el temporizador
        timer.start();

        // Mantener el hilo principal activo hasta que el temporizador termine
        while (timer.isRunning()) {
            // Este bucle espera activamente sin usar Thread.sleep
        }
    }
}
