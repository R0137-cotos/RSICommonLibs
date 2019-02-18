package jp.co.ricoh.cotos.rsicommonlib.repository.AccountingCreateRsiRunnging;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.AccountingCreateRsiRunnging.SalesCalcResultWork;
import jp.co.ricoh.cotos.rsicommonlib.entity.AccountingCreateRsiRunnging.SalesCalcResultWork.CotosProcessingFlg;;



@Repository
public interface SalesCalcResultWorkRepository extends CrudRepository<SalesCalcResultWork, Long> {

	public List<SalesCalcResultWork> deleteByCotosProcessingFlgNot(CotosProcessingFlg cotosProcessingFlg);
}
