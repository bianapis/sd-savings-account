/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class SavingsAccountApiController {

	@Autowired
	SavingsAccountApiService service;
	
	@BQ("deposits")
	@Fulfill.ExecutePost
	public BianResponse<SavingsAccountDepositWithIdAndRoot> executePostDeposits(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SavingsAccountDeposit> bianRequest) {
		return BianResponse.forSuccess(service.executePostDeposits(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("deposits")
	@Fulfill.ExecutePut
	public BianResponse<SavingsAccountDepositWithIdAndRoot> executePutDeposits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<SavingsAccountDeposit> bianRequest) {
		return BianResponse.forSuccess(service.executePutDeposits(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.ExecutePost
	public BianResponse<SavingsAccountPaymentWithIdAndRoot> executePostPayments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SavingsAccountPayment> bianRequest) {
		return BianResponse.forSuccess(service.executePostPayments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.ExecutePut
	public BianResponse<SavingsAccountPaymentWithIdAndRoot> executePutPayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<SavingsAccountPayment> bianRequest) {
		return BianResponse.forSuccess(service.executePutPayments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<SavingsAccountWithIdAndStatus> initiate(@RequestBody BianRequest<SavingsAccount> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@Fulfill.Record
	public BianResponse<SavingsAccountRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SavingsAccountRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("direct-debits")
	@Fulfill.RequestPost
	public BianResponse<SavingsAccountDirectDebitWithIdAndRoot> requestPostDirectDebits(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SavingsAccountDirectDebit> bianRequest) {
		return BianResponse.forSuccess(service.requestPostDirectDebits(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("direct-debits")
	@Fulfill.RequestPut
	public BianResponse<SavingsAccountDirectDebitWithIdAndRoot> requestPutDirectDebits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<SavingsAccountDirectDebit> bianRequest) {
		return BianResponse.forSuccess(service.requestPutDirectDebits(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventories")
	@Fulfill.RequestPost
	public BianResponse<SavingsAccountInventoryWithIdAndRoot> requestPostInventories(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SavingsAccountInventory> bianRequest) {
		return BianResponse.forSuccess(service.requestPostInventories(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inventories")
	@Fulfill.RequestPut
	public BianResponse<SavingsAccountInventoryWithIdAndRoot> requestPutInventories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<SavingsAccountInventory> bianRequest) {
		return BianResponse.forSuccess(service.requestPutInventories(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("liens")
	@Fulfill.RequestPost
	public BianResponse<SavingsAccountLienWithIdAndRoot> requestPostLiens(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SavingsAccountLien> bianRequest) {
		return BianResponse.forSuccess(service.requestPostLiens(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("liens")
	@Fulfill.RequestPut
	public BianResponse<SavingsAccountLienWithIdAndRoot> requestPutLiens(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<SavingsAccountLien> bianRequest) {
		return BianResponse.forSuccess(service.requestPutLiens(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("standing-orders")
	@Fulfill.RequestPost
	public BianResponse<SavingsAccountStandingOrderWithIdAndRoot> requestPostStandingOrders(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SavingsAccountStandingOrder> bianRequest) {
		return BianResponse.forSuccess(service.requestPostStandingOrders(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("standing-orders")
	@Fulfill.RequestPut
	public BianResponse<SavingsAccountStandingOrderWithIdAndRoot> requestPutStandingOrders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<SavingsAccountStandingOrder> bianRequest) {
		return BianResponse.forSuccess(service.requestPutStandingOrders(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweeps")
	@Fulfill.RequestPost
	public BianResponse<SavingsAccountSweepWithIdAndRoot> requestPostSweeps(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SavingsAccountSweep> bianRequest) {
		return BianResponse.forSuccess(service.requestPostSweeps(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweeps")
	@Fulfill.RequestPut
	public BianResponse<SavingsAccountSweepWithIdAndRoot> requestPutSweeps(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<SavingsAccountSweep> bianRequest) {
		return BianResponse.forSuccess(service.requestPutSweeps(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sweeps")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountSweepWithIdAndRoot> retrieveSweeps(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSweeps(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("deposits")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountDepositWithIdAndRoot> retrieveDeposits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeposits(crReferenceId, bqReferenceId));
	}
	
	@BQ("direct-debits")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountDirectDebitWithIdAndRoot> retrieveDirectDebits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDirectDebits(crReferenceId, bqReferenceId));
	}
	
	@BQ("fees")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountFeeWithIdAndRoot> retrieveFees(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFees(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountWithIdAndStatus> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("interests")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountInterestWithIdAndRoot> retrieveInterests(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterests(crReferenceId, bqReferenceId));
	}
	
	@BQ("inventories")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountInventoryWithIdAndRoot> retrieveInventories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventories(crReferenceId, bqReferenceId));
	}
	
	@BQ("liens")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountLienWithIdAndRoot> retrieveLiens(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLiens(crReferenceId, bqReferenceId));
	}
	
	@BQ("payments")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountPaymentWithIdAndRoot> retrievePayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reports")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountReportWithIdAndRoot> retrieveReports(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReports(crReferenceId, bqReferenceId));
	}
	
	@BQ("standing-orders")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountStandingOrderWithIdAndRoot> retrieveStandingOrders(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStandingOrders(crReferenceId, bqReferenceId));
	}
	
	@BQ("statements")
	@Fulfill.Retrieve
	public BianResponse<SavingsAccountStatementWithIdAndRoot> retrieveStatements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStatements(crReferenceId, bqReferenceId));
	}
	
	@Fulfill.Terminate
	public BianResponse<Void> terminate(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.terminate(crReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<SavingsAccountWithIdAndStatus> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<SavingsAccountWithStatus> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
