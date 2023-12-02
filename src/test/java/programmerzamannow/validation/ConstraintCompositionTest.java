package programmerzamannow.validation;

import org.junit.jupiter.api.Test;
import programmerzamannow.validation.group.CreditCardPaymentGroup;

public class ConstraintCompositionTest extends AbstractValidatorTest{
    @Test
    void testComposition() {
        Payment payment = new Payment();
        payment.setOrderId("234235542434243243242342dfdfdfdfd");

        validateWithGroups(payment, CreditCardPaymentGroup.class);
    }
}
