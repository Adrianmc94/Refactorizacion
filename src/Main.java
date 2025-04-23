public class Main {
    /**
     * Método para devolver la puntuación de tenis
     */
    public static String getScore(int score1, int score2) {
        if (score1 == score2) {
            return getDrawScore(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            return getAdvantageOrWin(score1, score2);
        } else {
            return getRegularScore(score1, score2);
        }
    }

    private static String getDrawScore(int score) {
        return switch (score) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            case 3 -> "Forty-All";
            default -> "Deuce";
        };
    }

    private static String getAdvantageOrWin(int score1, int score2) {
        int difference = score1 - score2;
        if (difference == 1) return "Advantage player1";
        if (difference == -1) return "Advantage player2";
        return (difference >= 2) ? "Win for player1" : "Win for player2";
    }

    private static String getRegularScore(int score1, int score2) {
        return getScoreName(score1) + "-" + getScoreName(score2);
    }

    private static String getScoreName(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "";
        };
    }
}
