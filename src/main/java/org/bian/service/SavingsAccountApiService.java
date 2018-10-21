/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SavingsAccountApiService {

	SavingsAccountDepositWithIdAndRoot executePostDeposits(String crReferenceId, SavingsAccountDeposit request);
	
	SavingsAccountDepositWithIdAndRoot executePutDeposits(String crReferenceId, String bqReferenceId, SavingsAccountDeposit request);
	
	SavingsAccountPaymentWithIdAndRoot executePostPayments(String crReferenceId, SavingsAccountPayment request);
	
	SavingsAccountPaymentWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, SavingsAccountPayment request);
	
	SavingsAccountWithIdAndStatus initiate(SavingsAccount request);
	
	SavingsAccountRecordResponse record(String crReferenceId, SavingsAccountRecordRequest request);
	
	SavingsAccountDirectDebitWithIdAndRoot requestPostDirectDebits(String crReferenceId, SavingsAccountDirectDebit request);
	
	SavingsAccountDirectDebitWithIdAndRoot requestPutDirectDebits(String crReferenceId, String bqReferenceId, SavingsAccountDirectDebit request);
	
	SavingsAccountInventoryWithIdAndRoot requestPostInventories(String crReferenceId, SavingsAccountInventory request);
	
	SavingsAccountInventoryWithIdAndRoot requestPutInventories(String crReferenceId, String bqReferenceId, SavingsAccountInventory request);
	
	SavingsAccountLienWithIdAndRoot requestPostLiens(String crReferenceId, SavingsAccountLien request);
	
	SavingsAccountLienWithIdAndRoot requestPutLiens(String crReferenceId, String bqReferenceId, SavingsAccountLien request);
	
	SavingsAccountStandingOrderWithIdAndRoot requestPostStandingOrders(String crReferenceId, SavingsAccountStandingOrder request);
	
	SavingsAccountStandingOrderWithIdAndRoot requestPutStandingOrders(String crReferenceId, String bqReferenceId, SavingsAccountStandingOrder request);
	
	SavingsAccountSweepWithIdAndRoot requestPostSweeps(String crReferenceId, SavingsAccountSweep request);
	
	SavingsAccountSweepWithIdAndRoot requestPutSweeps(String crReferenceId, String bqReferenceId, SavingsAccountSweep request);
	
	SavingsAccountSweepWithIdAndRoot retrieveSweeps(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	SavingsAccountDepositWithIdAndRoot retrieveDeposits(String crReferenceId, String bqReferenceId);
	
	SavingsAccountDirectDebitWithIdAndRoot retrieveDirectDebits(String crReferenceId, String bqReferenceId);
	
	SavingsAccountFeeWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId);
	
	SavingsAccountWithIdAndStatus retrieve(String crReferenceId);
	
	SavingsAccountInterestWithIdAndRoot retrieveInterests(String crReferenceId, String bqReferenceId);
	
	SavingsAccountInventoryWithIdAndRoot retrieveInventories(String crReferenceId, String bqReferenceId);
	
	SavingsAccountLienWithIdAndRoot retrieveLiens(String crReferenceId, String bqReferenceId);
	
	SavingsAccountPaymentWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	SavingsAccountReportWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId);
	
	SavingsAccountStandingOrderWithIdAndRoot retrieveStandingOrders(String crReferenceId, String bqReferenceId);
	
	SavingsAccountStatementWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId);
	
	Void terminate(String crReferenceId);
	
	SavingsAccountWithIdAndStatus update(String crReferenceId, SavingsAccountWithStatus request);
	
}
