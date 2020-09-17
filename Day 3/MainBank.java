public class MainBank {
    public static void main(String[] args) {
        //pass the accountNo and amount to deposit from CLA
        //get the Account using the accountNo by calling getAccount(...)
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        
        // show the account information before deposit
        //deposit the amount to that particular Account
        //show the account information after deposit
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();

        Account account = null;
        // get the account from accounts using the accountNo

        return account;
    }
}