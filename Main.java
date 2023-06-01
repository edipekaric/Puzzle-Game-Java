import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static LinkedList<PuzzlePiece> pieces = new LinkedList<>();
	Image imgs[] = new Image[80]; //Creating an array of picture pieces
	public static boolean isNextPieceReady = true; //We set it to true, so when the program starts we get the first puzzle piece
	//Printed outside the grid, for the player and try to find the right place
	public static PuzzlePiece random = null; //Creating a variable for object PuzzlePiece
	//Reason for this is because when we generate a random number, we want to get the PuzzlePiece with that int index
	public static PuzzlePiece selectedPiece = null; //When we drag a piece acros our GUI, we will set this variable to that object
	public static boolean isNextpieceReady = true; //If this is true, then next value of random int will be printed, and along
	//with it, another random puzzle piece that is not yet in the right place
	public static boolean buttonPressed = false;
	
	public void cutPicture() throws IOException
	{
		BufferedImage all = ImageIO.read(new File("C:\\Users\\light\\eclipse-workspace\\puzzle 2\\src\\breakingbad.jpg"));
		//Importing the image
		int index = 0; //Goes from 0 - 79
		for(int y = 0; y < 800; y = y + 100)
		{
			for(int x = 0; x < 1000; x = x + 100)
			{
				imgs[index] = all.getSubimage(x, y, 100, 100).getScaledInstance(50, 50, BufferedImage.SCALE_SMOOTH);
				index = index + 1;
				//Creates smaller images 100x100 from the photo and scales it to 50x50
				//Reason for this is so it can fit into the GUI
			}
		}
	}
	
	public void createInstancesOfPuzzles()
	{
		PuzzlePiece piece0 = new PuzzlePiece(0,pieces);
		PuzzlePiece piece1 = new PuzzlePiece(1,pieces);
		PuzzlePiece piece2 = new PuzzlePiece(2,pieces);
		PuzzlePiece piece3 = new PuzzlePiece(3,pieces);
		PuzzlePiece piece4 = new PuzzlePiece(4,pieces);
		PuzzlePiece piece5 = new PuzzlePiece(5,pieces);
		PuzzlePiece piece6 = new PuzzlePiece(6,pieces);
		PuzzlePiece piece7 = new PuzzlePiece(7,pieces);
		PuzzlePiece piece8 = new PuzzlePiece(8,pieces);
		PuzzlePiece piece9 = new PuzzlePiece(9,pieces);
		
		PuzzlePiece piece10 = new PuzzlePiece(10,pieces);
		PuzzlePiece piece11 = new PuzzlePiece(11,pieces);
		PuzzlePiece piece12 = new PuzzlePiece(12,pieces);
		PuzzlePiece piece13 = new PuzzlePiece(13,pieces);
		PuzzlePiece piece14 = new PuzzlePiece(14,pieces);
		PuzzlePiece piece15 = new PuzzlePiece(15,pieces);
		PuzzlePiece piece16 = new PuzzlePiece(16,pieces);
		PuzzlePiece piece17 = new PuzzlePiece(17,pieces);
		PuzzlePiece piece18 = new PuzzlePiece(18,pieces);
		PuzzlePiece piece19 = new PuzzlePiece(19,pieces);
		
		PuzzlePiece piece20 = new PuzzlePiece(20,pieces);
		PuzzlePiece piece21 = new PuzzlePiece(21,pieces);
		PuzzlePiece piece22 = new PuzzlePiece(22,pieces);
		PuzzlePiece piece23 = new PuzzlePiece(23,pieces);
		PuzzlePiece piece24 = new PuzzlePiece(24,pieces);
		PuzzlePiece piece25 = new PuzzlePiece(25,pieces);
		PuzzlePiece piece26 = new PuzzlePiece(26,pieces);
		PuzzlePiece piece27 = new PuzzlePiece(27,pieces);
		PuzzlePiece piece28 = new PuzzlePiece(28,pieces);
		PuzzlePiece piece29 = new PuzzlePiece(29,pieces);
		
		PuzzlePiece piece30 = new PuzzlePiece(30,pieces);
		PuzzlePiece piece31 = new PuzzlePiece(31,pieces);
		PuzzlePiece piece32 = new PuzzlePiece(32,pieces);
		PuzzlePiece piece33 = new PuzzlePiece(33,pieces);
		PuzzlePiece piece34 = new PuzzlePiece(34,pieces);
		PuzzlePiece piece35 = new PuzzlePiece(35,pieces);
		PuzzlePiece piece36 = new PuzzlePiece(36,pieces);
		PuzzlePiece piece37 = new PuzzlePiece(37,pieces);
		PuzzlePiece piece38 = new PuzzlePiece(38,pieces);
		PuzzlePiece piece39 = new PuzzlePiece(39,pieces);
		
		PuzzlePiece piece40 = new PuzzlePiece(40,pieces);
		PuzzlePiece piece41 = new PuzzlePiece(41,pieces);
		PuzzlePiece piece42 = new PuzzlePiece(42,pieces);
		PuzzlePiece piece43 = new PuzzlePiece(43,pieces);
		PuzzlePiece piece44 = new PuzzlePiece(44,pieces);
		PuzzlePiece piece45 = new PuzzlePiece(45,pieces);
		PuzzlePiece piece46 = new PuzzlePiece(46,pieces);
		PuzzlePiece piece47 = new PuzzlePiece(47,pieces);
		PuzzlePiece piece48 = new PuzzlePiece(48,pieces);
		PuzzlePiece piece49 = new PuzzlePiece(49,pieces);
		
		PuzzlePiece piece50 = new PuzzlePiece(50,pieces);
		PuzzlePiece piece51 = new PuzzlePiece(51,pieces);
		PuzzlePiece piece52 = new PuzzlePiece(52,pieces);
		PuzzlePiece piece53 = new PuzzlePiece(53,pieces);
		PuzzlePiece piece54 = new PuzzlePiece(54,pieces);
		PuzzlePiece piece55 = new PuzzlePiece(55,pieces);
		PuzzlePiece piece56 = new PuzzlePiece(56,pieces);
		PuzzlePiece piece57 = new PuzzlePiece(57,pieces);
		PuzzlePiece piece58 = new PuzzlePiece(58,pieces);
		PuzzlePiece piece59 = new PuzzlePiece(59,pieces);
		
		PuzzlePiece piece60 = new PuzzlePiece(60,pieces);
		PuzzlePiece piece61 = new PuzzlePiece(61,pieces);
		PuzzlePiece piece62 = new PuzzlePiece(62,pieces);
		PuzzlePiece piece63 = new PuzzlePiece(63,pieces);
		PuzzlePiece piece64 = new PuzzlePiece(64,pieces);
		PuzzlePiece piece65 = new PuzzlePiece(65,pieces);
		PuzzlePiece piece66 = new PuzzlePiece(66,pieces);
		PuzzlePiece piece67 = new PuzzlePiece(67,pieces);
		PuzzlePiece piece68 = new PuzzlePiece(68,pieces);
		PuzzlePiece piece69 = new PuzzlePiece(69,pieces);
		
		PuzzlePiece piece70 = new PuzzlePiece(70,pieces);
		PuzzlePiece piece71 = new PuzzlePiece(71,pieces);
		PuzzlePiece piece72 = new PuzzlePiece(72,pieces);
		PuzzlePiece piece73 = new PuzzlePiece(73,pieces);
		PuzzlePiece piece74 = new PuzzlePiece(74,pieces);
		PuzzlePiece piece75 = new PuzzlePiece(75,pieces);
		PuzzlePiece piece76 = new PuzzlePiece(76,pieces);
		PuzzlePiece piece77 = new PuzzlePiece(77,pieces);
		PuzzlePiece piece78 = new PuzzlePiece(78,pieces);
		PuzzlePiece piece79 = new PuzzlePiece(79,pieces);
		
		//Declaring all of the instances of the pieces
		//Under is declaring what piece we want to be printed at the begining
		
		if(buttonPressed == true)
		{
			piece1.inRightPlace = true;
			piece5.inRightPlace = true;
			piece8.inRightPlace = true;
			piece11.inRightPlace = true;
			piece15.inRightPlace = true;
			piece17.inRightPlace = true;
			piece21.inRightPlace = true;
			piece26.inRightPlace = true;
			piece29.inRightPlace = true;
			piece35.inRightPlace = true;
			piece37.inRightPlace = true;
			piece39.inRightPlace = true;
			piece40.inRightPlace = true;
			piece44.inRightPlace = true;
			piece47.inRightPlace = true;
			piece51.inRightPlace = true;
			piece55.inRightPlace = true;
			piece58.inRightPlace = true;
			piece63.inRightPlace = true;
			piece66.inRightPlace = true;
			piece78.inRightPlace = true;
			piece79.inRightPlace = true;
//			pieces.remove(piece1);
//			pieces.remove(piece5);
//			pieces.remove(piece8);
//			pieces.remove(piece11);
//			pieces.remove(piece15);
//			pieces.remove(piece17);
//			pieces.remove(piece21);
//			pieces.remove(piece26);
//			pieces.remove(piece29);
//			pieces.remove(piece35);
//			pieces.remove(piece37);
//			pieces.remove(piece39);
//			pieces.remove(piece40);
//			pieces.remove(piece44);
//			pieces.remove(piece47);
//			pieces.remove(piece51);
//			pieces.remove(piece55);
//			pieces.remove(piece58);
//			pieces.remove(piece63);
//			pieces.remove(piece66);
//			pieces.remove(piece78);
//			pieces.remove(piece79);
		}
		
	}
	
	public void createFrame()
	{
		JFrame frame = new JFrame();
		frame.setBounds(10,10,1000,600);
		frame.setUndecorated(true);
		JButton initial = new JButton("Show initial pieces");
		initial.setSize(600,600);
		initial.setBounds(650,300,250,50);
		frame.add(initial);
		initial.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            buttonPressed = true;
			            createInstancesOfPuzzles();
			            frame.repaint();
			        }  
			    });  
		JPanel panel = new JPanel()
		{
			public void paint(Graphics g)
			{
				g.setColor(Color.black); //Setting the color of lines to black
				
				//Drawing vertical lines
				g.drawLine(50, 0, 50, 400);
				g.drawLine(100, 0, 100, 400);
				g.drawLine(150, 0, 150, 400);
				g.drawLine(200, 0, 200, 400);
				g.drawLine(250, 0, 250, 400);
				g.drawLine(300, 0, 300, 400);
				g.drawLine(350, 0, 350, 400);
				g.drawLine(400, 0, 400, 400);
				g.drawLine(450, 0, 450, 400);
				g.drawLine(500, 0, 500, 400);
				
				//Drawing horizontal lines
				g.drawLine(0, 50, 500, 50);
				g.drawLine(0, 100, 500, 100);
				g.drawLine(0, 150, 500, 150);
				g.drawLine(0, 200, 500, 200);
				g.drawLine(0, 250, 500, 250);
				g.drawLine(0, 300, 500, 300);
				g.drawLine(0, 350, 500, 350);
				g.drawLine(0, 400, 500, 400);
				
				for(PuzzlePiece p: pieces)
				{
					if(p.inRightPlace == true)
					{
						g.drawImage(imgs[p.index], p.x*50, p.y*50, this);
					}
				}
				
				if(isNextpieceReady == true)
				{
					do
					{
						int min = 0; //Minimum range for the random int
						int max = pieces.size() - 1; //Maximum range for the random int
						int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
						random = pieces.get(random_int);
						if(random.inRightPlace == false)
						{
							selectedPiece = random;
							selectedPiece.tempX = 13;
							selectedPiece.tempY = 5;
						}
					}
					while(random.inRightPlace == true);
					isNextpieceReady = false;
				}
				
				g.drawImage(imgs[random.index], random.posX, random.posY, this);
				
			}
		};
		
		frame.add(panel);
		
		frame.addMouseMotionListener(new MouseMotionListener() {
			
			public void mouseMoved(MouseEvent e) {
				
			}
			
			public void mouseDragged(MouseEvent e) {
				if(selectedPiece != null)
				{
					selectedPiece.posX = e.getX() - 32;
					selectedPiece.posY = e.getY() - 32;
					frame.repaint();
				}
			}
		});
		
		frame.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				try
				{
					if(e.getX() / 50 == selectedPiece.x && e.getY() / 50 == selectedPiece.y)
					{
						selectedPiece.inRightPlace = true;
						isNextpieceReady = true;
						selectedPiece.tempX = 0;
						selectedPiece.tempY = 0;
					}
					else
					{
						selectedPiece.posX = 13*50;
						selectedPiece.posY = 5*50;
		 			}
					frame.repaint();
				}
				catch(Exception ee)
				{
					
				}
				
			}
			
			public void mousePressed(MouseEvent e) {
				if(e.getX()/50 == 13 && e.getY()/50 == 6)
				{
					buttonPressed = true;
					createInstancesOfPuzzles();
					System.out.println("Bolijan: " + buttonPressed);
					System.out.println("e.x/50: " + e.getX()/50);
					System.out.println("e.y/50: " + e.getY()/50);
				}
				else
				{
					System.out.println("Nop");
					System.out.println("e.x/50: " + e.getX()/50);
					System.out.println("e.y/50: " + e.getY()/50);
				}
				try
				{
					
					selectedPiece = getPiece(e.getX(), e.getY());
					System.out.println("Piece needs to go on X value: " + selectedPiece.x);
					System.out.println("Piece needs to go on Y value: " + selectedPiece.y);
					//This prints in the console, the value of positions X and Y where you need to put the piece
					//Because that is the right place of the piece
					
				}
				catch(Exception ee)
				{
					
				}
				frame.repaint();
			}
			
			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
	}
	public void createButton() {
		JButton initial = new JButton("Show initial pieces");
		initial.setBounds(650,300,95,30);
		frame.add(initial);
	}
	public static PuzzlePiece getPiece(int x, int y)
	{
		int xx = x / 50;
		int yy = y / 50;
		for(PuzzlePiece p: pieces)
		{
			if(p.tempX == 13 && xx == 13 && p.tempY == 5 && yy == 5)
			{
				return p;
			}
		}
		//If there were no puzzle pieces that satisfy the above if, then it will return null, because if any piece satisfied the if
		//Then it would have returned and exited the loop
		return null;
	}
	
	public static void Run() throws IOException
	{
		Main application = new Main();
		application.cutPicture();
		application.createInstancesOfPuzzles();
		application.createFrame();
	}

	public static void main(String[] args) throws IOException {
		
		Run();
		
	}

}
