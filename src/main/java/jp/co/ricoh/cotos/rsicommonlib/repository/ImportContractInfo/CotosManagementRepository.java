package jp.co.ricoh.cotos.rsicommonlib.repository.ImportContractInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.ImportContractInfo.CotosManagementInfo;

@Repository
public interface CotosManagementRepository extends CrudRepository<CotosManagementInfo, Long> {

}
