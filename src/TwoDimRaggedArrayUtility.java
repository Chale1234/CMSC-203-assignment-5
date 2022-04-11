import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TwoDimRaggedArrayUtility {
	static double getAverage(double[][] data) {
		int count = 0;
		double total = 0;
		// using a  for loop the validate 
		for ( int i = 0; i < data.length ; i++) {
			for ( int j = 0; j < data[i].length; j++) {
			double average  = total / count;
			total +=data[i][j];
			count++;
		}
	}
		return total/count;
	}
		static double getColumnTotal(double[][] data , int col) {
			double total = 0;
			// using the for loop to check if the row is less than or equals to the column
			for (int i = 0; i < data.length; i++) {
				if (data[i].length <= col || col < 0) {
					continue;
				}
				total += data[i][data[i].length == 1 && col == 1? col-1 : col];
			}
			return total;
		}
		static double getHighestInArray(double[][] data) {
			double highest= 0;
			 // using the for loop the check if the value of the column is lesser or equal to column
			for (int i = 0; i < data.length; i++) {
				for (int j =0; j< data[i].length; j++) {
					double value = data[i][j];
					
					if (value > highest ) {
						highest = value;
					}
				}
			}
				
				return highest;
				
			}
			static double getHighestInColumn(double[][] data, int col) {
				double highest =0;
				for (int i = 0; i < data.length; i++) {
					if (data[i].length <= col || col < 0) {
						continue;
					}
					if (data[i][col]> highest ) {
						highest  = data[i][col];}
					}
					return highest;
			}
			static int getHighestInColumnIndex(double[][] data , int col) {
				double highest = 0;
				int index = 0;
				for (int i = 0; i < data.length;i++) {
					if (data[i].length <= col || col < 0) {
						continue;
					}
					if (data[i][col] > highest) {
						highest = data[i][col];
						index = i;
					}
				}
				return index;
			}
				
		
			static double getHighestInRow(double [][] data , int row) {
				if (data.length < row || row < 0) { return 0;}
				double highest = 0;
				
				for (int i =0; i < data[row].length; i++) {
					if (data[row][i] > highest) {
						highest = data[row][i];}
					}
				return highest;
				}
			static int getHighestInRowIndex(double[][] data, int row) {
				
			if (data.length < row || row < 0) { return 0;}
			double highest = 0;
			int index = 0;
			for ( int I = 0; I < data[row].length; I++) {
				if (data[row][I] > highest ) {
					highest = data[row][I];
					index = I;
				}
			}
			 return index;
				
		}
			static double getLowestInArray(double[][] data) {
				double lowest = 0; 
				for( int i = 0; i < data.length; i++) {
					for (int j = 0 ; j < data[i].length; i++) {
						if( lowest  == 0 || data[i][j] < lowest) {
							lowest= data[i][j];}
						}
					}
				return lowest;
		}
			static double getLowestInColumn(double[][] data, int col) {
				double lowest = 0;
				for ( int i =0 ; i < data.length; i++) {
					if (data[i].length <= col || col < 0) {continue;}
					if (lowest == 0 || data[i][col] < lowest) {lowest = data[i][col];}
				}
				return lowest;
		}
			static int getLowestInColumnIndex(double [][] data, int col) {
				double lowest = 0;
				int index = 0;
				for ( int i = 0 ; i < data.length; i++) {
					if (data[i].length <= col || col < 0){
						continue;
					}
					if ( lowest == 0 || data[i][col] < lowest) {
						lowest = data[i][col];
						index = i;
					}
				}
				return index;
			}
			static double getLowestInRow(double[][]data, int row) {
				if (data.length < row || row < 0) { return 0;}
				double lowest =0;
				for ( int a =0 ; a < data[row].length; a++) {
					if(lowest == 0 || data[row][a] < lowest) {lowest = data[row][a];}
					
				}
				return lowest;
			}
			static double getLowestInRowIndex(double[][] data, int row) {
				if (data.length < row || row < 0) {return 0;}
				double lowest = 0;
				int index =0;
				for ( int a = 0; a < data[row].length; a++) {
					if(lowest == 0 || data[row][a] < lowest) {
						lowest = data[row][a];
						index = a;
					}
				}
				return index;
		}
			static double getRowTotal(double[][] data, int row) {
				double total = 0;
				
				for(int a =0; a < data[row].length; a++) {
					total+=data[row][a];
				}
				return total;
			}
			static double getTotal(double[][] data) {
				double total =0;
				for ( int i = 0; i < data.length; i++) {
					for(int j = 0; j < data[i].length;j++) {
						total +=data[i][j];
					}
				}
				return total;
			}
			static double[][]readFile(java.io.File file) throws FileNotFoundException {
				double data[][] = null;
				Scanner scanner1, scanner2;
				int rows = 0;
				int currentRow = 0;
				scanner1 = new Scanner(file);
				// count row
				while (scanner1.hasNextLine()) {
					rows++;
					scanner1.nextLine();
				}
					scanner1.close();
					// give and intializa rows
					data = new double[rows][];
					scanner2 = new Scanner(file);
				while (scanner2.hasNextLine()) {
					String L = scanner2.nextLine();
					String columns[] = L.trim().split(" ");
					data[currentRow] = new double[columns.length];
					
					for(int a =0; a < columns.length; a++) {
						data[currentRow][a] = Double.parseDouble(columns[a]); 
					}
					currentRow++;
				}
				scanner2.close();
				return data;
					
					
		}
			static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
				PrintWriter output = new PrintWriter(outputFile);
				StringBuilder Strb = new StringBuilder();
				// using the for loops
				for ( int i = 0; i < data.length; i++) {
					for ( int j = 0; j < data[i].length; j++) {
						Strb.append(data[i][j]+ " ");
					}
					output.print(Strb.toString());
				}
				output.close();
			}
				
	}
			
			
				
		
				
			
			
		
		



			
		
		
		

	

	


