package jp.co.ricoh.cotos.rsicommonlib.repository.ImportApplicationInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.ImportApplicationInfo.ContractInfo;

@Repository
public interface ContractInfoRepository extends CrudRepository<ContractInfo, Long> {

}
