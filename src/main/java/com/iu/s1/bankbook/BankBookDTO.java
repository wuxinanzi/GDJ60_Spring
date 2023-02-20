package com.iu.s1.bankbook;

public class BankBookDTO {
	private Long bookNumber;
	private String bookName;
	private String bookDetail;
	private Double bookRate;
	private Integer bookSale;
	private BankBookImgDTO bankBookImgDTO;
	
	public BankBookImgDTO getBankBookImgDTO() {
		return bankBookImgDTO;
	}
	public void setBankBookImgDTO(BankBookImgDTO bankBookImgDTO) {
		this.bankBookImgDTO = bankBookImgDTO;
	}
	public Long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(Long bookNum) {
		this.bookNumber = bookNum;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDetail() {
		return bookDetail;
	}
	public void setBookDetail(String bookDetail) {
		this.bookDetail = bookDetail;
	}
	public Double getBookRate() {
		return bookRate;
	}
	public void setBookRate(Double bookRate) {
		this.bookRate = bookRate;
	}
	public Integer getBookSale() {
		if(this.bookSale == null || this.bookSale != 1) {
			this.bookSale=0;
		}
		return bookSale;
	}
	public void setBookSale(Integer bookSale) {
		if(bookSale == null || bookSale != 1) {
			this.bookSale=0;
		}
		this.bookSale = bookSale;
	}

}
