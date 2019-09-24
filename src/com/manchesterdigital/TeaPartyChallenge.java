package com.manchesterdigital;

public class TeaPartyChallenge {

    private static final int BAD_OUTCOME = 0;
    private static final int GOOD_OUTCOME = 1;
    private static final int GREAT_OUTCOME = 2;

    public static void main(String[] args) {
        System.out.println(teaParty(6,5));
        System.out.println(teaParty(25, 20));
    }

    // method returning outcome of tea party. int data type
    public static int teaParty(int tea, int candy){

        if (tea < 5 || candy < 5) {
            return BAD_OUTCOME;
        } else if (tea >= (candy * 2) || candy >= (tea * 2)) {
            return GREAT_OUTCOME;
        }
        return GOOD_OUTCOME;
    }
}


/**
 * create method to test
 * put back int the main
 * else at the bottom is redundant as system knows
 * return
 *should term numbers into constants... private static final BAD_OUTCOME = 0;
 * Can do it like below but it does have a bit more computation. IF bad not even need to test anything else like mine above
 *
 *  if (tea >= 5 && candy >= 5) {
 *       if (tea >= (candy * 2) || candy >= (tea * 2)) {
 *             return GREAT_OUTCOME;
 *         } return GOOD_OUTCOME;
 *     } return BAD_OUTCOME;
 *   }
 *
 *  Cannot use switch statement as no expressions for switch. Switch only constant/literals
 *  If evaluting use IF straight away
 **/