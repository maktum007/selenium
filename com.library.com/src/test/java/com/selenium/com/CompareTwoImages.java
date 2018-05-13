package com.selenium.com;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

public class CompareTwoImages 
{
	@Test
	public void imgProcessing() throws IOException
	{
		BufferedImage img1=ImageIO.read(new File("C:\\Users\\Maktum\\git\\com.library.com\\com.library.com\\Data\\img1.jpg"));
		BufferedImage img2=ImageIO.read(new File("C:\\Users\\Maktum\\git\\com.library.com\\com.library.com\\Data\\img2.jpg"));
		boolean test=bufferedImagesEqual( img1, img2);
		if(test==true)
			System.out.println("Same");
		else
			System.out.println("Different");
	}
	public boolean bufferedImagesEqual(BufferedImage img1, BufferedImage img2) 
	{
		if (img1.getWidth() == img2.getWidth() && img1.getHeight() == img2.getHeight()) 
		{
			for (int x = 0; x < img1.getWidth(); x++) 
			{
				for (int y = 0; y < img1.getHeight(); y++) 
				{
					if (img1.getRGB(x, y) != img2.getRGB(x, y))
						return false;
				}
		    }
		} 
		else 
		{
		     return false;
		}
		return true;
	}

}

