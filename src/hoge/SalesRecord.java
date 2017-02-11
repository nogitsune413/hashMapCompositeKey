package hoge;

import java.time.LocalDate;

/** 売上レコード */
public class SalesRecord {

	/** 店舗番号 */
	private final Integer shopNo;

	/** 売上日 */
	private final LocalDate salesDate;

	/** 売上金額 */
	private final Integer sales;

	public SalesRecord(Integer storeNo, LocalDate salesDate, Integer sales) {
		this.shopNo = storeNo;
		this.salesDate = salesDate;
		this.sales = sales;
	}

	public Integer getStoreNo() {
		return shopNo;
	}

	public LocalDate getSalesDate() {
		return salesDate;
	}

	public Integer getSales() {
		return sales;
	}

	/** テスト用 */
	@Override
	public String toString() {
		return "SalesRecord [storeNo=" + shopNo + ", salesDate=" + salesDate + ", sales=" + sales + "]";
	}
}