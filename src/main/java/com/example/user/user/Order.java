package com.example.user.user;

import lombok.Data;

@Data
public class Order {
    private Long userId;
    private String passTicketName;
    private int ticketPrice;
    private int discountPrice;

    public int transactionTicket() {
        return ticketPrice - discountPrice;
    }

    public Order(Long userId, String passTicketName, int ticketPrice, int discountPrice) {
        this.userId = userId;
        this.passTicketName = passTicketName;
        this.ticketPrice = ticketPrice;
        this.discountPrice = discountPrice;
    }
}
