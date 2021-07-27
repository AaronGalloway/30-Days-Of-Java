package BinarySearchTree;

import java.util.Random;

public class Testers {

    // Random Integers
    public static int rndInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
        // Min = 5 and Max = 15
        // Example: 15-5 = 10 + 1 == 11 --> 0 to 10
        // + 5 to whatever the random number is
    }

    // Random Binary Search Trees
    public static Tree rndTree(int count) {
        if (count == 0) {
            return new EmptyBST();
        } else {
            return rndTree(count - 1).add(rndInt(0,50));
        }
    }

    // x + (x*2) = x + x *2 { This is an example of a test. We know these are equal, so if for some reason they were not we have a problem.}
    
    public static void checkIsEmpty(Tree t) throws Exception{
        // if the tree t is an instance of EmptyBST then t.isEmpty should return True
        // if the tree t is an instance of NonEmptyBST then t.isEmpty should return False
        if (t instanceof EmptyBST) {
            if (!t.isEmpty()) {
                throw new Exception("All is not good. The tree is an EmptyBST and it is non-empty.");
            } else if (t instanceof NonEmptyBST) {
                if (t.isEmpty()) {
                    throw new Exception("All is not good, the tree is a NonEmptyBST and it is empty");
                }
            }
        }
    }

    public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
        int nT = (t.add(x)).cardinality();
        // 1. Either something was added and the cardinality increased by one.
        if (nT == (t.cardinality() + 1)) {
            if (t.member(x)) {
                throw new Exception("The cardinality increased by 1, but the thing that was added was already a member of the tree");
            }
        } // 2. OR the thing that was added was already there and not really added so the cardinality stayed the same.
        else if (nT == t.cardinality()) {
            if (!t.member(x)) {
                throw new Exception("The cardinality didn't increase by 1, but we added a new thing");
            } else {
                throw new Exception("Something is wrong with our program.");
            }
        }
    }
}
