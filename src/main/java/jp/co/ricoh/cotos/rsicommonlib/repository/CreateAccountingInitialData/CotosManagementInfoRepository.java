package jp.co.ricoh.cotos.rsicommonlib.repository.CreateAccountingInitialData;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.CreateAccountingInitialData.CotosManagementInfo;

@Repository
public interface CotosManagementInfoRepository extends CrudRepository<CotosManagementInfo, Long> {

}
