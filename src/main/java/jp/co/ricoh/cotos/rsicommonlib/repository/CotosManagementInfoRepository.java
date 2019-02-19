package jp.co.ricoh.cotos.rsicommonlib.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.CotosManagementInfo;

@Repository
public interface CotosManagementInfoRepository extends CrudRepository<CotosManagementInfo, Long> {

}
