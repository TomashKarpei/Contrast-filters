import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
public class GrayScale {
 BufferedImage image;
 int width;
 int height;

 public GrayScale() {

	 try {
		 //odczyt obrazu z pliku
		 File input = new File("Ratusz_Bia³ystok_rok_2013.jpg");
		 image = ImageIO.read(input);
		 width = image.getWidth();
		 height = image.getHeight();

		 //odczyt pixeli obrazu w dwóch pêtlach po kolumnach i wierszach
		 for(int i=0; i<height; i++){
		 for(int j=0; j<width; j++){

		 //odczyt sk³adowych koloru RGB
		 Color c = new Color(image.getRGB(j, i));
		 double red = (double)(c.getRed());
		 double green = (double)(c.getGreen());
		 double blue = (double)(c.getBlue());
		 int  x=0, y=0, z=0;
		 double delta_c = 100, red_prym = 0, green_prym = 0, blue_prym = 0;
		 
			 red_prym = (127/(127-delta_c))*(red - delta_c);
			 green_prym = (127/(127-delta_c))*(green- delta_c);
			 blue_prym = (127/(127-delta_c))*(blue - delta_c);

		 if (red_prym  >=0 && red_prym  <=255) x = (int) red_prym;
		 else  x = (int) red;

		 if (green_prym >=0 && green_prym <=255) y = (int) green_prym;
		 else y =  (int) green;

		 if (blue_prym >=0 && blue_prym <=255) z =  (int) blue_prym;
		 else z =  (int) blue;
		 

		 Color newColor = new Color(x, y, z);
		 image.setRGB(j,i,newColor.getRGB());

		 } //koniec dwóch pêtli po kolumnach i wierszach obrazu
		 }
		 //zapis do pliku zmodyfikowanego obrazu
		 File ouptut = new File("wariant1a.jpg");
		 ImageIO.write(image, "jpg", ouptut);

		 } catch (Exception e) {}
	 
	 try {
		 //odczyt obrazu z pliku
		 File input = new File("Ratusz_Bia³ystok_rok_2013.jpg");
		 image = ImageIO.read(input);
		 width = image.getWidth();
		 height = image.getHeight();

		 //odczyt pixeli obrazu w dwóch pêtlach po kolumnach i wierszach
		 for(int i=0; i<height; i++){
		 for(int j=0; j<width; j++){

		 //odczyt sk³adowych koloru RGB
		 Color c = new Color(image.getRGB(j, i));
		 double red = (double)(c.getRed());
		 double green = (double)(c.getGreen());
		 double blue = (double)(c.getBlue());
		 int  x=0, y=0, z=0;
		 double delta_c = -100, red_prym = 0, green_prym = 0, blue_prym = 0;
		 
			 red_prym = ((127 + delta_c)/127)*(red - delta_c);
			 green_prym = ((127 + delta_c)/127)*(green- delta_c);
			 blue_prym = ((127 + delta_c)/127)*(blue - delta_c);

		 if (red_prym  >=0 && red_prym  <=255) x = (int) red_prym;
		 else  x = (int) red;

		 if (green_prym >=0 && green_prym <=255) y = (int) green_prym;
		 else y =  (int) green;

		 if (blue_prym >=0 && blue_prym <=255) z =  (int) blue_prym;
		 else z =  (int) blue;
		 

		 Color newColor = new Color(x, y, z);
		 image.setRGB(j,i,newColor.getRGB());

		 } //koniec dwóch pêtli po kolumnach i wierszach obrazu
		 }
		 //zapis do pliku zmodyfikowanego obrazu
		 File ouptut = new File("wariant1b.jpg");
		 ImageIO.write(image, "jpg", ouptut);

		 } catch (Exception e) {}
	 
 try {
 //odczyt obrazu z pliku
 File input = new File("Ratusz_Bia³ystok_rok_2013.jpg");
 image = ImageIO.read(input);
 width = image.getWidth();
 height = image.getHeight();

 //odczyt pixeli obrazu w dwóch pêtlach po kolumnach i wierszach
 for(int i=0; i<height; i++){
 for(int j=0; j<width; j++){

 //odczyt sk³adowych koloru RGB
 Color c = new Color(image.getRGB(j, i));
 int red = (int)(c.getRed());
 int green = (int)(c.getGreen());
 int blue = (int)(c.getBlue());

 int x=0, y=0, z=0, delta_c = 70, red_pnym = (int)(c.getRed()), green_pnym = (int)(c.getGreen()), blue_pnym = (int)(c.getBlue());
 
 if (red_pnym < 127) { 
	 red_pnym = (int)((127-delta_c)/127)*red;
 }
 else if(red_pnym >= 127) {
	 red_pnym = (int)((127-delta_c)/127) *red+ 2*delta_c;
 }
 if (green_pnym < 127) { 
	 green_pnym = (int)((127-delta_c)/127) *green;
 }
 else if(green_pnym >= 127) {
	 green_pnym = (int)((127-delta_c)/127) *green+ 2*delta_c;
 }
 if (blue_pnym < 127) { 
	 blue_pnym = (int)((127-delta_c)/127) *blue;
 }
 else if(blue_pnym >= 127) {
	 blue_pnym = (int)((127-delta_c)/127) * blue + 2*delta_c;
 }

 if (red_pnym  >=0 && red_pnym  <=255) red = red_pnym;
 else red = red;

 if (green_pnym >=0 && green_pnym <=255) green = green_pnym ;
 else green = green;

 if (blue_pnym >=0 && blue_pnym <=255) blue = blue_pnym;
 else blue = blue;
 

 Color newColor = new Color(red, green,blue);
 image.setRGB(j,i,newColor.getRGB());

 } //koniec dwóch pêtli po kolumnach i wierszach obrazu
 }
 //zapis do pliku zmodyfikowanego obrazu
 File ouptut = new File("wariant2a.jpg");
 ImageIO.write(image, "jpg", ouptut);

 } catch (Exception e) {}
 
 try {
	 //odczyt obrazu z pliku
	 File input = new File("Ratusz_Bia³ystok_rok_2013.jpg");
	 image = ImageIO.read(input);
	 width = image.getWidth();
	 height = image.getHeight();

	 //odczyt pixeli obrazu w dwóch pêtlach po kolumnach i wierszach
	 for(int i=0; i<height; i++){
	 for(int j=0; j<width; j++){

	 //odczyt sk³adowych koloru RGB
	 Color c = new Color(image.getRGB(j, i));
	 int red = (int)(c.getRed());
	 int green = (int)(c.getGreen());
	 int blue = (int)(c.getBlue());

	 int x=0, y=0, z=0, delta_c = -40, red_prym = (int)(c.getRed()), green_prym = (int)(c.getGreen()), blue_prym = (int)(c.getBlue());
	 
	 if (red_prym > 0 && red_prym < 127+delta_c)
		 red_prym = (int)(127/(127+delta_c)*red);
		 else if (red_prym > 0 && red_prym < 127-delta_c)
		 red_prym = (int)(127*red+255*red)/(127+delta_c);
		 else red_prym = 127;

		 if (blue_prym > 0 && blue_prym < 127+delta_c)
		 green_prym = (int)(127/(127+delta_c)*green);
		 else if (green_prym > 0 && green_prym < 127-delta_c)
		 green_prym = (int)(127*green+255*green)/(127+delta_c);
		 else green_prym = 127;

		 if (blue_prym > 0 && blue_prym < 127+delta_c)
		 blue_prym = (int)(127/(127+delta_c)*blue);
		 else if (blue_prym > 0 && blue_prym < 127-delta_c)
		 blue_prym = (int)(127*blue+255*blue)/(127+delta_c);
		 else blue_prym = 127;

	 if (red_prym  >=0 && red_prym  <=255) red = red_prym;
	 else red = red;

	 if (green_prym >=0 && green_prym <=255) green = green_prym ;
	 else green = green;

	 if (blue_prym >=0 && blue_prym <=255) blue = blue_prym;
	 else blue = blue;
	 

	 Color newColor = new Color(red, green,blue);
	 image.setRGB(j,i,newColor.getRGB());

	 } //koniec dwóch pêtli po kolumnach i wierszach obrazu
	 }
	 //zapis do pliku zmodyfikowanego obrazu
	 File ouptut = new File("wariant2b.jpg");
	 ImageIO.write(image, "jpg", ouptut);

	 } catch (Exception e) {}
	 }


 static public void main(String args[]) throws Exception
 {
 GrayScale obj = new GrayScale();
 }
}