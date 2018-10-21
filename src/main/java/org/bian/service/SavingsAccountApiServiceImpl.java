/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SavingsAccountApiServiceImpl implements SavingsAccountApiService {

	public SavingsAccountDepositWithIdAndRoot executePostDeposits(String crReferenceId, SavingsAccountDeposit request){
		return JsonReader.read("executePost-SavingsAccountDepositWithIdAndRoot.json",new TypeReference<SavingsAccountDepositWithIdAndRoot>(){});
	}
	
	public SavingsAccountDepositWithIdAndRoot executePutDeposits(String crReferenceId, String bqReferenceId, SavingsAccountDeposit request){
		return JsonReader.read("executePut-SavingsAccountDepositWithIdAndRoot.json",new TypeReference<SavingsAccountDepositWithIdAndRoot>(){});
	}
	
	public SavingsAccountPaymentWithIdAndRoot executePostPayments(String crReferenceId, SavingsAccountPayment request){
		return JsonReader.read("executePost-SavingsAccountPaymentWithIdAndRoot.json",new TypeReference<SavingsAccountPaymentWithIdAndRoot>(){});
	}
	
	public SavingsAccountPaymentWithIdAndRoot executePutPayments(String crReferenceId, String bqReferenceId, SavingsAccountPayment request){
		return JsonReader.read("executePut-SavingsAccountPaymentWithIdAndRoot.json",new TypeReference<SavingsAccountPaymentWithIdAndRoot>(){});
	}
	
	public SavingsAccountWithIdAndStatus initiate(SavingsAccount request){
		return JsonReader.read("initiate-SavingsAccountWithIdAndStatus.json",new TypeReference<SavingsAccountWithIdAndStatus>(){});
	}
	
	public SavingsAccountRecordResponse record(String crReferenceId, SavingsAccountRecordRequest request){
		return JsonReader.read("record-SavingsAccountRecordResponse.json",new TypeReference<SavingsAccountRecordResponse>(){});
	}
	
	public SavingsAccountDirectDebitWithIdAndRoot requestPostDirectDebits(String crReferenceId, SavingsAccountDirectDebit request){
		return JsonReader.read("requestPost-SavingsAccountDirectDebitWithIdAndRoot.json",new TypeReference<SavingsAccountDirectDebitWithIdAndRoot>(){});
	}
	
	public SavingsAccountDirectDebitWithIdAndRoot requestPutDirectDebits(String crReferenceId, String bqReferenceId, SavingsAccountDirectDebit request){
		return JsonReader.read("requestPut-SavingsAccountDirectDebitWithIdAndRoot.json",new TypeReference<SavingsAccountDirectDebitWithIdAndRoot>(){});
	}
	
	public SavingsAccountInventoryWithIdAndRoot requestPostInventories(String crReferenceId, SavingsAccountInventory request){
		return JsonReader.read("requestPost-SavingsAccountInventoryWithIdAndRoot.json",new TypeReference<SavingsAccountInventoryWithIdAndRoot>(){});
	}
	
	public SavingsAccountInventoryWithIdAndRoot requestPutInventories(String crReferenceId, String bqReferenceId, SavingsAccountInventory request){
		return JsonReader.read("requestPut-SavingsAccountInventoryWithIdAndRoot.json",new TypeReference<SavingsAccountInventoryWithIdAndRoot>(){});
	}
	
	public SavingsAccountLienWithIdAndRoot requestPostLiens(String crReferenceId, SavingsAccountLien request){
		return JsonReader.read("requestPost-SavingsAccountLienWithIdAndRoot.json",new TypeReference<SavingsAccountLienWithIdAndRoot>(){});
	}
	
	public SavingsAccountLienWithIdAndRoot requestPutLiens(String crReferenceId, String bqReferenceId, SavingsAccountLien request){
		return JsonReader.read("requestPut-SavingsAccountLienWithIdAndRoot.json",new TypeReference<SavingsAccountLienWithIdAndRoot>(){});
	}
	
	public SavingsAccountStandingOrderWithIdAndRoot requestPostStandingOrders(String crReferenceId, SavingsAccountStandingOrder request){
		return JsonReader.read("requestPost-SavingsAccountStandingOrderWithIdAndRoot.json",new TypeReference<SavingsAccountStandingOrderWithIdAndRoot>(){});
	}
	
	public SavingsAccountStandingOrderWithIdAndRoot requestPutStandingOrders(String crReferenceId, String bqReferenceId, SavingsAccountStandingOrder request){
		return JsonReader.read("requestPut-SavingsAccountStandingOrderWithIdAndRoot.json",new TypeReference<SavingsAccountStandingOrderWithIdAndRoot>(){});
	}
	
	public SavingsAccountSweepWithIdAndRoot requestPostSweeps(String crReferenceId, SavingsAccountSweep request){
		return JsonReader.read("requestPost-SavingsAccountSweepWithIdAndRoot.json",new TypeReference<SavingsAccountSweepWithIdAndRoot>(){});
	}
	
	public SavingsAccountSweepWithIdAndRoot requestPutSweeps(String crReferenceId, String bqReferenceId, SavingsAccountSweep request){
		return JsonReader.read("requestPut-SavingsAccountSweepWithIdAndRoot.json",new TypeReference<SavingsAccountSweepWithIdAndRoot>(){});
	}
	
	public SavingsAccountSweepWithIdAndRoot retrieveSweeps(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountSweepWithIdAndRoot.json",new TypeReference<SavingsAccountSweepWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public SavingsAccountDepositWithIdAndRoot retrieveDeposits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountDepositWithIdAndRoot.json",new TypeReference<SavingsAccountDepositWithIdAndRoot>(){});
	}
	
	public SavingsAccountDirectDebitWithIdAndRoot retrieveDirectDebits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountDirectDebitWithIdAndRoot.json",new TypeReference<SavingsAccountDirectDebitWithIdAndRoot>(){});
	}
	
	public SavingsAccountFeeWithIdAndRoot retrieveFees(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountFeeWithIdAndRoot.json",new TypeReference<SavingsAccountFeeWithIdAndRoot>(){});
	}
	
	public SavingsAccountWithIdAndStatus retrieve(String crReferenceId){
		return JsonReader.read("retrieve-SavingsAccountWithIdAndStatus.json",new TypeReference<SavingsAccountWithIdAndStatus>(){});
	}
	
	public SavingsAccountInterestWithIdAndRoot retrieveInterests(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountInterestWithIdAndRoot.json",new TypeReference<SavingsAccountInterestWithIdAndRoot>(){});
	}
	
	public SavingsAccountInventoryWithIdAndRoot retrieveInventories(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountInventoryWithIdAndRoot.json",new TypeReference<SavingsAccountInventoryWithIdAndRoot>(){});
	}
	
	public SavingsAccountLienWithIdAndRoot retrieveLiens(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountLienWithIdAndRoot.json",new TypeReference<SavingsAccountLienWithIdAndRoot>(){});
	}
	
	public SavingsAccountPaymentWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountPaymentWithIdAndRoot.json",new TypeReference<SavingsAccountPaymentWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SavingsAccountReportWithIdAndRoot retrieveReports(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountReportWithIdAndRoot.json",new TypeReference<SavingsAccountReportWithIdAndRoot>(){});
	}
	
	public SavingsAccountStandingOrderWithIdAndRoot retrieveStandingOrders(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountStandingOrderWithIdAndRoot.json",new TypeReference<SavingsAccountStandingOrderWithIdAndRoot>(){});
	}
	
	public SavingsAccountStatementWithIdAndRoot retrieveStatements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SavingsAccountStatementWithIdAndRoot.json",new TypeReference<SavingsAccountStatementWithIdAndRoot>(){});
	}
	
	public Void terminate(String crReferenceId){
		return null;
	}
	
	public SavingsAccountWithIdAndStatus update(String crReferenceId, SavingsAccountWithStatus request){
		return JsonReader.read("update-SavingsAccountWithIdAndStatus.json",new TypeReference<SavingsAccountWithIdAndStatus>(){});
	}
	
}
