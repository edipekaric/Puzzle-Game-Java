import java.util.LinkedList;

public class PuzzlePiece {
int posX; //0-1000
int posY; //0-1000
int index; //Number coraltes to the number in the linklist
int x; //0-9
int y; //0-7
int tempX; //X post the picture is printed if it is needed to be placed in the grid
int tempY; //Y post the picture is printed if it is needed to be placed in the grid
//When we do a check in the main loop to see if the piece is placed in the right place
//we will comapre the actual value of the piece (meaning where the piece is placed on the grid)
//So actual position posX/50 == x AND posY/50 == y
boolean inRightPlace = false; //Is the puzzle piece in the right place?

LinkedList<PuzzlePiece> pieces;

public PuzzlePiece(int index, LinkedList<PuzzlePiece> pieces)
{
	this.index = index;
	this.x = index % 10;
	this.y = index / 10;
    this.posX = 13*50;
    this.posY = 5*50;
	this.pieces = pieces;
	pieces.add(this);
}

public void move(int x, int y)
{
	this.posX = x;
	this.posY = y;
}

}

//If a puzzle piece is selected from the random index, then its TempX will be set to 13 and TempY will be set to 5
//Summury: tempX = 13, tempY = 5;