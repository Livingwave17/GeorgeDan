/*
 * Java main class ComputeInitials computes initials from my full name
 */
package stringandnumber;

/**
 *
 * @author Turbotwins2018
 */
public class ComputeInitials {

    /**
     * @param args the command line arguments
     */
    
    public static void computeInitials(String name) {
        String firstNameInitial = "";
        String lastNameInitial = "";
        boolean foundInitial = false;
        String findMeFirst = "G";
        String findMeLast = "D";
        String initials = "";
        
        for(int i=0; firstNameInitial == ""; i++) {
            if (name.regionMatches(i, findMeFirst, 0, 1)) {
                firstNameInitial = findMeFirst;
            };
        }
        for(int j=0; lastNameInitial == ""; j++) {
            if (name.regionMatches(j, findMeLast, 0, 1)) {
                lastNameInitial = findMeLast;
            }
        }
        initials = firstNameInitial.concat(lastNameInitial);
        System.out.println("Initials are: " + initials);
    }
    public static void main(String[] args) {
        String myName = "George Dan";
        
        computeInitials(myName);
    }
}
