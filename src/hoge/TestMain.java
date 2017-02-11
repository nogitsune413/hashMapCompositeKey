package hoge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {

	public static void main(String[] args) {

		// テストデータ
		List<SalesRecord> salesRecords = new ArrayList<SalesRecord>();
		salesRecords.add(new SalesRecord(1,LocalDate.of(2017,1,1),100));
		salesRecords.add(new SalesRecord(2,LocalDate.of(2017,1,2),200));
		salesRecords.add(new SalesRecord(3,LocalDate.of(2017,1,3),300));

		// HashMapを生成
		Map<CompositeKey,SalesRecord> map = new HashMap<CompositeKey,SalesRecord>();

		for (SalesRecord record : salesRecords) {
			map.put(new CompositeKey(record.getStoreNo(), record.getSalesDate()), record);
		}

		// KeyからValueを取り出せることを確認する。
		System.out.println(map.get(new CompositeKey(2,LocalDate.of(2017,1,2))));
	}
}