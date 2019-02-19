package jp.co.ricoh.cotos.rsicommonlib.repository.CreateAccountingInitialData;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.BasicContents;

@Repository
public interface BasicContentsRepository extends CrudRepository<BasicContents, Long> {

	public BasicContents findFirstByBplatsRequestNoAndMakerManageNo(String bplatsRequestNo, String makerManageNo);

}
