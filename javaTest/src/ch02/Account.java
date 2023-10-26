package ch02;

public class Account {
    private String accountNum;
    private String accountName;
    private int accountMoney;
    
    public Account() { };

    public Account(String accountNum, String accountName, int accountMoney) {
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.accountMoney = accountMoney;
    }

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountMoney() {
		return accountMoney;
	}

	public void setAccountMoney(int accountMoney) {
		this.accountMoney = accountMoney;
	}
}
