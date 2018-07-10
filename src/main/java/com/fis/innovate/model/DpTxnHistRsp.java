package com.fis.innovate.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DpTxnHistRsp {

	@JsonProperty("RspHdr")
	private RspHdr rspHdr;
	@JsonProperty("TxnRec")
	private List<TxnRec> txnRec = new ArrayList<TxnRec>();
		
	public DpTxnHistRsp() {

	}

	public DpTxnHistRsp(long acctId) {
		this.rspHdr = new RspHdr("Success");
		TxnRec trn1= new TxnRec("87594643173966462",5.00,"USD","Transfer to Checking 50000002576","Debit",null,"2018-01-27");
		this.txnRec.add(trn1);
		TxnRec trn2= new TxnRec("36853215680654267",5.00,"USD","Transfer to Checking 50000002576","Debit",null,"2018-01-27");
		this.txnRec.add(trn2);
		TxnRec trn3= new TxnRec("2467898675435357",1.00,"USD","Transfer to Checking 50000002576","Debit",null,"2018-01-27");
		this.txnRec.add(trn3);
		TxnRec trn4= new TxnRec("65263873570934783",1.00,"USD","Transfer to Checking 50000002576","Debit",null,"2018-01-27");
		this.txnRec.add(trn4);
		TxnRec trn5= new TxnRec("95673574217589536",1.00,"USD","Transfer to Checking 50000002576","Debit",null,"2018-01-27");
		this.txnRec.add(trn5);
	}
}
