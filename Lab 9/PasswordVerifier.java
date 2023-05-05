/**
 * class PasswordVerifier
 * constructed with a password string object and contains a method to test that string's
 * validity as a password
 * 
 * @author Akash Pandit (aspandit@ucsc.edu)
 * @since v1.0, 5/5/2023 
 */
class PasswordVerifier {
    String password;

    /**
     * constructor for PasswordVerifier
     * @param inPassword password string to test
     */
    PasswordVerifier(String inPassword) {
        password = inPassword;
    }

    /**
     * public method testPassword
     * tests whether a given password string meets all password criteria, outputting a boolean result
     * Criteria:
     * - has at least 8 characters
     * - has at least 1 lowercase character
     * - has at least 1 uppercase character
     * - has at least 1 number
     * 
     * @return boolean whether the password is valid or not
     */
    public boolean testPassword() {
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasNumber = false;

        if (password.length() < 8) {
            return false;
        }
        for (Character chr: password.toCharArray()) {
            if (Character.isDigit(chr)) {
                hasNumber = true;
            } else if (Character.isUpperCase(chr)) {
                hasUpper = true;
            } else if (Character.isLowerCase(chr)) {
                hasLower = true;
            }
        }
        if (hasLower == true && hasUpper == true && hasNumber == true) {
            return true;
        } return false;
    }
}
