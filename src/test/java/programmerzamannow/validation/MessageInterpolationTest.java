package programmerzamannow.validation;

import org.junit.jupiter.api.Test;
import programmerzamannow.validation.group.VirtualAccountPaymentGroup;

public class MessageInterpolationTest extends AbstractValidatorTest{

    @Test
    void testMessage() {

        Payment payment = new Payment();
        payment.setOrderId("21311143242424241");
        payment.setVirtualAccount("72377232");
        payment.setAmount(10L);

        validateWithGroups(payment, VirtualAccountPaymentGroup.class);
    }
}
