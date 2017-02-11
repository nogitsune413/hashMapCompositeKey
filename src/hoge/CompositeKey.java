package hoge;

import java.time.LocalDate;

/** 複合キー */
public class CompositeKey {

	/** 店舗番号 */
	private final Integer shopNo;

	/** 売上日 */
	private final LocalDate salesDate;

	public CompositeKey(Integer storeNo, LocalDate salesDate) {
		this.shopNo = storeNo;
		this.salesDate = salesDate;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((salesDate == null) ? 0 : salesDate.hashCode());
		result = prime * result + ((shopNo == null) ? 0 : shopNo.hashCode());
		return result;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositeKey other = (CompositeKey) obj;
		if (salesDate == null) {
			if (other.salesDate != null)
				return false;
		} else if (!salesDate.equals(other.salesDate))
			return false;
		if (shopNo == null) {
			if (other.shopNo != null)
				return false;
		} else if (!shopNo.equals(other.shopNo))
			return false;
		return true;
	}
}