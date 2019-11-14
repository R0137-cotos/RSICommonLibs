package jp.co.ricoh.cotos.rsicommonlib.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.KizunaviSubstituteSalesClaimWorkTable;

@Repository
public interface KizunaviSubstituteSalesClaimWorkTableRepository extends CrudRepository<KizunaviSubstituteSalesClaimWorkTable, Long> {

}
