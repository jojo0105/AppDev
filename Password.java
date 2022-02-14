/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdev;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Assignment 1
 * @author George Aziz 2070513
 * For Application Development 2 (Mobile) - Winter 2022
 * 
 * A password class that generates passwords under specific requirements 
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // welcome message
        System.out.println("Welcome to the password generator game!");
        //waits three seconds before starting the game 
        TimeUnit.SECONDS.sleep(3);
        generatePassword();
        //prints a goodbye message
        System.out.println("Thanks for using the password generator game. Good bye.");
    }

    /**
     * A method that generates passwords that have to meet with certain requirements 
     */
    public static void generatePassword() {

        // http://www.gutenberg.org/cache/epub/19033/pg19033.txt
        final String[][][] book = {
            {
                {"ALICE was beginning to get very tired of sitting by her sister on the\n",
                    "bank, and of having nothing to do. Once or twice she had peeped into the\n",
                    "book her sister was reading, but it had no pictures or conversations in\n",
                    "it, \"and what is the use of a book,\" thought Alice, \"without pictures or\n",
                    "conversations?\"\n"},
                {"So she was considering in her OWN mind (as well as she could, for the\n",
                    "day made her feel very sleepy and stupid), whether the pleasure of\n",
                    "making a daisy-chain would be worth the trouble of getting up and\n",
                    "picking the daisies, when suddenly a White Rabbit with pink eyes ran\n",
                    "close by her.\n"},
                {"There was nothing so very remarkable in that, nor did Alice think it so\n",
                    "very much out of the way to hear the Rabbit say to itself, \"Oh dear! Oh\n",
                    "dear! I shall be too late!\" But when the Rabbit actually took a watch\n",
                    "out of its waistcoat-pocket and looked at it and then hurried on, Alice\n",
                    "started to her feet, for it flashed across her mind that she had never\n",
                    "before seen a rabbit with either a waistcoat-pocket, or a watch to take\n",
                    "out of it, and, burning with curiosity, she ran across the field after\n",
                    "it and was just in time to see it pop down a large rabbit-hole, under\n",
                    "the hedge. In another moment, down went Alice after it!"}
            },
            {
                {"\"WHAT a curious feeling!\" said Alice. \"I must be shutting up like a\n",
                    "telescope!\"\n"},
                {"And so it was indeed! She was now only ten inches high, and her face\n",
                    "brightened up at the thought that she was now the right size for going\n",
                    "through the little door into that lovely garden.\n"},
                {"After awhile, finding that nothing more happened, she decided on going\n",
                    "into the garden at once; but, alas for poor Alice! When she got to the\n",
                    "door, she found she had forgotten the little golden key, and when she\n",
                    "went back to the table for it, she found she could not possibly reach\n",
                    "it: she could see it quite plainly through the glass and she tried her\n",
                    "best to climb up one of the legs of the table, but it was too slippery,\n",
                    "and when she had tired herself out with trying, the poor little thing\n",
                    "sat down and cried.\n"},
                {"\"Come, there's no use in crying like that!\" said Alice to herself rather\n",
                    "sharply. \"I advise you to leave off this minute!\" She generally gave\n",
                    "herself very good advice (though she very seldom followed it), and\n",
                    "sometimes she scolded herself so severely as to bring tears into her\n",
                    "eyes.\n"},
                {"Soon her eye fell on a little glass box that was lying under the table:\n",
                    "she opened it and found in it a very small cake, on which the words \"EAT\n",
                    "ME\" were beautifully marked in currants. \"Well, I'll eat it,\" said\n",
                    "Alice, \"and if it makes me grow larger, I CAN reach the key; and if it\n",
                    "makes me grow smaller, I can creep under the door: so either way I'll\n",
                    "get into the garden, and I don't care which happens!\"\n"},
                {"She ate a little bit and said anxiously to herself, \"Which way? Which\n",
                    "way?\" holding her hand on the top of her head to feel which way she was\n",
                    "growing; and she was quite surprised to find that she remained the same\n",
                    "size. So she set to work and very soon finished off the cake."}
            },
            {
                {"The King and Queen of Hearts were seated on their throne when they\n",
                    "arrived, with a great crowd assembled about them--all sorts of little\n",
                    "birds and beasts, as well as the whole pack of cards: the Knave was\n",
                    "standing before them, in chains, with a soldier on each side to guard\n",
                    "him; and near the King was the White Rabbit, with a trumpet in one hand\n",
                    "and a scroll of parchment in the other. In the very middle of the court\n",
                    "was a table, with a large DISH of tarts upon it. \"I wish they'd get the\n",
                    "trial done,\" Alice thought, \"and hand 'round the refreshments!\"\n"},
                {"The judge, by the way, was the King and he wore his crown over his great\n",
                    "wig. \"That's the jury-box,\" thought Alice; \"and those twelve creatures\n",
                    "(some were animals and some were birds) I suppose they are the jurors.\"\n"},
                {"Just then the White Rabbit cried out \"Silence in the court!\"\n"},
                {"\"HERALD! read the accusation!\" said the King."}
            }
        };
        String candidate = ""; //the generated password
        String[] candidates = {"", "", ""}; //the same generated password but the three words are divided
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            //Counter to know how many passwords were generated
            count++;
            
            //Conditions counter 
            int newLine = 0;
            int single = 0;
            int equal = 0;
            int length = 0;
            int upper = 0;
            int lower = 0;
            int special = 0;
            
            do {
                candidate = ""; //to initialize it every time its not a valid password
                for (int j = 0; j < 3; j++) {
                    //searches for a random word
                    Random rand = new Random();
                    int page = rand.nextInt(book.length);
                    int paragraph = rand.nextInt(book[page].length);
                    int line = rand.nextInt(book[page][paragraph].length);
                    String[] words = book[page][paragraph][line].split(" ");
                    int word = rand.nextInt(words.length);
                    candidate += words[word];
                    candidates[j] = words[word];
                }

                //checks for the requirements
                if (isNewLine(candidate)) {
                    newLine++;
                } else if (isSingle(candidates)) {
                    single++;
                } else if (!isDifferentWord(candidates)) {
                    equal++;
                } else if (!isGoodLength(candidate)) {
                    length++;
                } else if (!isUpper(candidate)) {
                    upper++;
                } else if (!isLower(candidate)) {
                    lower++;
                } else if (!isSpecial(candidate)) {
                    special++;
                }
            //checks if the generated password is accepteble or does the whole process again
            } while (isNewLine(candidate) || isSingle(candidates)
                    || !isDifferentWord(candidates) || !isGoodLength(candidate)
                    || !isUpper(candidate) || !isLower(candidate) || !isSpecial(candidate));

            //prints the passwords the how many times it failed for each requirement
            System.out.printf("Password = %-15s Newline = %-3d Single = %-3d Equal = %-3d "
                    + "Length = %-3d Upper = %-3d Lower = %-3d Special = %-3d\n", candidate,
                    newLine, single, equal, length, upper, lower, special);

            //breaks completely if the lower condition count wasn't equal to zero
            if (lower != 0) {
                break;
            }
        }
        //prints how many passwords were generated
        System.out.println("\nTotal passwords generated = " + count + "\n");
    }

    /**
     * Checks if there is a new line in the passwords or not
     * @param candidate the password
     * @return a boolean value whether there is a new line in the passwords or not 
     */
    public static boolean isNewLine(String candidate) {
        return candidate.contains("\n");
    }

    /**
     * Checks if there is a word in  the password that is composed of only one letter or not
     * @param candidate the three word that composes the password
     * @return a boolean value whether there is a word in  the password that is 
     * composed of only one letter or not
     */
    public static boolean isSingle(String[] candidate) {
        for (String can : candidate) {
            if (can.length() == 1) {
                return true;
            }
        }
        return false;

    }

    /**
     * Checks if there are similar words in the passwords
     * @param candidate the three word that composes the password
     * @return a boolean value whether there are similar words or not
     */
    public static boolean isDifferentWord(String[] candidate) {
        for (int i = 0; i < candidate.length; i++) {
            for (int j = 0; j < candidate.length; j++) {
                //don't compare the same word
                if (i == j) {
                    continue;
                } //if they are the same word stop and return false
                else if (candidate[i].compareTo(candidate[j]) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the passwords has a good length or not
     * @param candidate the password
     * @return whether the password has a good length or not
     */
    public static boolean isGoodLength(String candidate) {
        return 8 <= candidate.length() && candidate.length() < 16;
    }

    /**
     * Checks for an upper case letter in the password
     * @param candidate the password
     * @return whether the password has an upper case letter or not
     */
    public static boolean isUpper(String candidate) {
        char[] letters = candidate.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            //checks for upper case letter based on ASCII            
            if (letters[i] >= 65 && letters[i] <= 90) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks for an lower case letter in the password
     * @param candidate the password
     * @return whether the password has an lower case letter or not
     */
    public static boolean isLower(String candidate) {
        char[] letters = candidate.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            //checks for lower case letter based on ASCII
            if (letters[i] >= 97 && letters[i] <= 122) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks for special character in the password
     * @param candidate the password
     * @return whether the password has a special character or not
     */
    public static boolean isSpecial(String candidate) {
        char[] letters = candidate.toCharArray();
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            //checks for special case letter based on ASCII
            if (letters[i] < 65 || letters[i] > 122) {
                count++;
            }
        }
        return count == 1;
    }
}
