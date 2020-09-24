class OperatorChallenge {

    public static void main(String[] args) {

        double myFirstDouble = 20.0;
        double mySecondDouble = 80.0;

        double myResult = (myFirstDouble + mySecondDouble) * 100;

        double myRemainder = myResult % 40.0;

        boolean myVerdict = (myRemainder == 0) ? true : false;

        if (!myVerdict) {
            System.out.println("Got some remainder : " + myRemainder);
        }
        else {
            System.out.println("No remainder here!");
        }
    }
}
