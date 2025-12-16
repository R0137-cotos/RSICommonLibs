package jp.co.ricoh.cotos.rsicommonlib.repository;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.SalesCalcResultWork;
import jp.co.ricoh.cotos.rsicommonlib.entity.SalesCalcResultWork.CotosProcessingFlg;

@Repository
public interface SalesCalcResultWorkRepository extends JpaRepository<SalesCalcResultWork, Long> {

	public List<SalesCalcResultWork> deleteByCotosProcessingFlgNotIn(List<CotosProcessingFlg> cotosProcessingFlg);

	@Transactional
	@Modifying
	@Query(value = "update SalesCalcResultWork scrw set "//
			+ "scrw.cotosProcessingFlg = jp.co.ricoh.cotos.rsicommonlib.entity.SalesCalcResultWork$CotosProcessingFlg.処理不可 "
			+ "where scrw.cotosProcessingFlg = jp.co.ricoh.cotos.rsicommonlib.entity.SalesCalcResultWork$CotosProcessingFlg.未処理 "//
			+ "and not exists ("//
			+ "select ic from ItemContract ic "//
			+ "where ic.ricohItemCode = scrw.productrateplanchargePrcEdpcodeC and ic.contractDetail.contract.rjManageNumber = scrw.rjManagementNumber)") //
	public Integer updateCotosProcessingFlgNotExistsContract();

}
