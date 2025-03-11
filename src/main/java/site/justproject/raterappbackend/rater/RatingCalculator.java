package site.justproject.raterappbackend.rater;

import site.justproject.raterappbackend.rater.entities.RatingPair;

class RatingCalculator {

    private final static int K = 20;

    private double probability(int rating1, int rating2) {
        return 1.0 / (1 + Math.pow(10, (rating1 - rating2) / 400.0));
    }

    public RatingPair calculateRatings(int winnerRating, int loserRating) {

        double Pb = probability(winnerRating, loserRating);

        double Pa = probability(loserRating, winnerRating);

        winnerRating = (int) (winnerRating + K * (1 - Pa));
        loserRating = (int) (loserRating + K * ((-1) *  Pb));


        return new RatingPair(winnerRating,loserRating);
    }

}
