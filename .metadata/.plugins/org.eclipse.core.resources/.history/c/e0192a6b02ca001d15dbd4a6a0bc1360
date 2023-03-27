package CodeTest;

import java.util.Stack;

class items {
	int x;
	int y;
	int dir;
}

class offsets {
	int a;
	int b;

}

//enum directions { N, NE, E, SE, S, SW, W, NW };
//int [] x = new int[10];

public class MazeT {
	static int N = 0;
	static int NE = 1;
	static int E = 2;
	static int SE = 3;
	static int S = 4;
	static int SW = 5;
	static int W = 6;
	static int NW = 7;

	static offsets[] moves = new offsets[8];
	static int maze[][] = new int[14][17];
	static int mark[][] = new int[14][17];

	public static void path(int m, int p)
	// Output a path (if any) in the maze; rows is m, cols is p;
	{
		//start at (1,1)
		mark[1][1] = 1;
		Stack<items> stack = new Stack<>();
		items temp = new items();
				
		temp.x = 1; temp.y = 1; temp.dir = 2;//E
		stack.push(temp);

		while (!stack.isEmpty()) // stack not empty
		{
			temp = stack.pop(); // unstack
			int i = temp.x; int j = temp.y; int d = temp.dir;
			
			System.out.print("temp = " + temp.x +" " + temp.y);
			System.out.println();
			while (d < 8) // moves forward
			
			{
				
				//outFile << i << " " << j << " " << d << endl;
				int g = i + moves[d].a;
				int h = j + moves[d].b;
				System.out.println("g"+g+" h" + h);
				if ((g == m) && (h == p)) { // reached exit
											// output path
										
					//cout << "the term near the exit: " << i << " " << j << endl;
					//cout << "exit: " << m << " " << p << endl;
					
					return;
				}
				if ((maze[g][h]==0) && (mark[g][h])==0) { // new position
					mark[g][h] = 1;
					temp = new items();
					temp.x = i;  temp.y = j; temp.dir = d + 1;
					stack.push(temp); // stack it
					i = g; j = h; d = N; // moves to (g,h)
					
					
				}
				
				else d++; // try next direction
			}
			
		}
		System.out.println("no path");
	}
	
	public static void main(String[] args) {
		int [][] input = {
		{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
		{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
		{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
		{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
		{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
		{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
		{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
		{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
		{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
		{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
		{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
		{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
		};
		
		for(int i=0; i<8;i++) 
			moves[i] = new offsets();
		moves[N].a = -1;
		moves[N].b = 0;
		moves[NE].a = -1; moves[NE].b = 1;
		moves[E].a = 0; moves[E].b = 1;
		moves[SE].a = 1; moves[SE].b = 1;
		moves[S].a = 1; moves[S].b = 0;
		moves[SW].a = 1; moves[SW].b = -1;
		moves[W].a = 0; moves[W].b = -1;
		moves[NW].a = -1; moves[NW].b = -1;


		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 17; j++)
			{
				if ((i==0) || (j==0) || (i == 13) || (j == 16))
					maze[i][j] = 1;
				else {
					maze[i][j] = input[i - 1][j - 1];
				}
				mark[i][j] = 0;

			}
		}
		for (int i = 0; i <= 13; i++)
		{
			for (int j = 0; j <= 16; j++) {
				System.out.print(maze[i][j]);
//			cout << endl;
			}
			System.out.println();
		}
		path(12, 15);
		
		int end;
//		cin >> end;
	}
}
