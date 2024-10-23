        public static void main(String[] args) {

            System.out.println("new score is:"+           CalculateScore("tim", 25));
            System.out.println("new score is:"+           CalculateScore("tim", 25));
            System.out.println("new score is:"+           CalculateScore("tim", 25));
            System.out.println("new score is:"+           CalculateScore("tim", 25));

            CalculateScore(75);
            CalculateScore();

        }

    public static int CalculateScore(String name,int score)
    {
        System.out.println("player name is:"+name+" " +"and he scored:"+score+" points");

        return score*100;
    }


    public static int CalculateScore(int score)
    {
        System.out.println("player name is:piyush "+"and he scored:"+score+" points");

        return score*100;
    }

    public static int CalculateScore()
    {
        System.out.println("No player and no score");

        return 0;
    }


