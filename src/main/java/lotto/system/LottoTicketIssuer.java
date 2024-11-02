package lotto.system;

import java.util.List;

public class LottoTicketIssuer { // 로또 구매 금액을 입력받아 로또 티켓을 발급하는 객체

    private static final int TICKET_PRICE = 1000;
    private final int quantity;

    public LottoTicketIssuer(int totalPayment) {
        LottoPaymentValidator.validate(totalPayment);
        this.quantity = totalPayment / TICKET_PRICE;
    }

    public List<List<Integer>> issueLottoTickets() {
        return LottoTicketFactory.generate(quantity);
    }
}