package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        double average;
        double highScore;
        double lowScore;
        double median;

        double[] testScores = {85, 92, 78, 96, 88, 66, 34, 103, 105,88, 90};
        double sum = 0;

        highScore = testScores[0];
        lowScore = testScores[0];



        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];

            if (testScores[i] > highScore) {
                highScore = testScores[i];

            }
            if (testScores[i] < lowScore) {
                lowScore = testScores[i];
            }

        }

        average = sum / testScores.length;
        System.out.printf("Average: %.2f%nHighest Score: %.2f%nLowest Score: %.2f%n", average, highScore, lowScore);
    }
}
