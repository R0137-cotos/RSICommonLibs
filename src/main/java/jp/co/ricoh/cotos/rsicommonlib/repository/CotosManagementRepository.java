package jp.co.ricoh.cotos.rsicommonlib.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.CotosManagementInfo;

@Repository
public interface CotosManagementRepository extends CrudRepository<CotosManagementInfo, Long> {

	@Query(value = "FROM CotosManagementInfo "//
			+ "WHERE cotos_processing_flg = :cotosProcessingFlg "//
			+ "and (initial_cost_processing_flg = :initialCostProcessingFlg1 OR initial_cost_processing_flg = :initialCostProcessingFlg2) "//
			+ "ORDER BY id")
	public List<CotosManagementInfo> findByCotosProcessingFlgAndInitialCostProcessingFlg(@Param("cotosProcessingFlg") String cotosProcessingFlg, @Param("initialCostProcessingFlg1") String initialCostProcessingFlg1, @Param("initialCostProcessingFlg2") String initialCostProcessingFlg2);

}
