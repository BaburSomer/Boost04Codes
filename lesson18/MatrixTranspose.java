package com.bilgeadam.course04.lesson18;

import java.util.Arrays;

public class MatrixTranspose {

	public static void main(String[] args) {
		String[][] matrix = {{"a1", "b1", "c1", "d1"}, {"a2", "b2", "c2", "d2"}, {"a3", "b3", "c3", "d3"}};

		printMatrix(matrix);
		
		String[][] transposed = new String[matrix[0].length][matrix.length];

		
		for (int i=0; i < matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				transposed[j][i] = matrix[i][j];
			}
		}
		
		System.out.println("=================");
		
		printMatrix(transposed);

		String[][] anotherMatrix = new String[6][5];
		anotherMatrix[0][0] = "a1";
		anotherMatrix[0][1] = "a2";
		anotherMatrix[0][2] = "a3";
		anotherMatrix[0][3] = "a4";
		anotherMatrix[0][4] = "a5";
		anotherMatrix[1][0] = "b1";
		anotherMatrix[1][0] = "b1";
		anotherMatrix[1][0] = "b1";
		anotherMatrix[1][0] = "b1";
		anotherMatrix[1][0] = "b1";
		
		for (int i=0; i<anotherMatrix.length;i++) {
			for (int j=0; j<anotherMatrix[0].length; j++) {
				anotherMatrix[i][j] = Character.toString(97+i) + (j+1);
				System.out.print(anotherMatrix[i][j] + " ");
			}
			System.out.println();
		}
		
		printMatrix(anotherMatrix);

		System.out.println(Arrays.deepToString(anotherMatrix));
	}

	private static void printMatrix(String[][] aMatrix) {
		for (int i=0; i < aMatrix.length; i++) {
			for (int j=0; j<aMatrix[i].length; j++) {
				System.out.print(aMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
