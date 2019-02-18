package jp.co.ricoh.cotos.rsicommonlib.repository.ImportApplicationInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.ImportApplicationInfo.DistributorInfo;

@Repository
public interface DistributorInfoRepository extends CrudRepository<DistributorInfo, Long> {

}
