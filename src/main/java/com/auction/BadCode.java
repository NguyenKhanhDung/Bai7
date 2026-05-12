package com.auction;


/**
 * Lớp quản lý số dư tài khoản với các quy tắc sạch.
 */
public class BadCode {
    /** Số dư hiện tại của tài khoản. */
    private int balance;

    /**
     * Khởi tạo tài khoản với số dư ban đầu.
     * @param initialBalance Số dư ban đầu
     */
    public BadCode(final int initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * Nạp tiền vào tài khoản.
     * @param amount Số tiền cần nạp
     * @return Số dư mới sau khi nạp
     */
    public int deposit(final int amount) {
        // Loại bỏ System.out và các biến không sử dụng như 'x'
        balance = balance + amount;
        return balance;
    }

    /**
     * Rút tiền khỏi tài khoản.
     * @param amount Số tiền cần rút
     * @return Số dư còn lại
     */
    public int withdraw(final int amount) {
        balance = balance - amount;
        return balance;
    }

    /**
     * Lấy số dư hiện tại.
     * @return Số dư tài khoản
     */
    public int getBalance() {
        return balance;
    }
}
