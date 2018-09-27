package entrada;

import java.awt.Color;

import org.joda.time.LocalTime;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( );
		ImagePlus imp = IJ.openImage("/Atividade_N1/src/main/java/Link_Start.jpg");
		ImageProcessor ip = imp.getProcessor();
		ip.setColor(Color.YELLOW);
		ip.setLineWidth(4);
		ip.drawRect(10, 10, imp.getWidth() - 20, imp.getHeight() - 20);
		imp.show();

	}

	public LocalTime getHorario() {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime.toString());
		 String horario = new LocalTime().toString();
		// sting horario = toString( new SimpleDateFormat("HH:mm").format(new
		// java.util.Date()) );
		return currentTime;
	}
}
