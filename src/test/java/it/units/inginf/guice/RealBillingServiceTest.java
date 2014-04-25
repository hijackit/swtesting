package it.units.inginf.guice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class RealBillingServiceTest {

	PizzaOrder order = new PizzaOrder(100);
	CreditCard creditCard = new CreditCard("1234", 11, 2015);

	InMemoryTransactionLog transactionLog = new InMemoryTransactionLog();
	FakeCreditCardProcessor creditCardProcessor = new FakeCreditCardProcessor();

	@Before
	public void setUp() throws Exception {
		TransactionLogFactory.setInstance(transactionLog);
		CreditCardProcessorFactory.setInstance(creditCardProcessor);
	}

	@After
	public void tearDown() throws Exception {
		TransactionLogFactory.setInstance(null);
		CreditCardProcessorFactory.setInstance(null);
	}

	@Ignore
	@Test
	public void testSuccessfulCharge() {
		RealBillingService billingService = new RealBillingService();
		Receipt receipt = billingService.chargeOrder(order, creditCard);

		assertTrue(receipt.hasSuccessfulCharge());
		assertEquals(100, receipt.getAmountOfCharge());
		assertEquals(creditCard, creditCardProcessor.getCardOfOnlyCharge());
		assertEquals(100, creditCardProcessor.getAmountOfOnlyCharge());
		assertTrue(transactionLog.wasSuccessLogged());
	}

}
