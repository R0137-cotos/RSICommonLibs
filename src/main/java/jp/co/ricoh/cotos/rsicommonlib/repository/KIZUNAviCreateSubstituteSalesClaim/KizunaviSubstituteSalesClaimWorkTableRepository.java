package jp.co.ricoh.cotos.rsicommonlib.repository.KIZUNAviCreateSubstituteSalesClaim;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.KIZUNAviCreateSubstituteSalesClaim.KizunaviSubstituteSalesClaimWorkTable;

@Repository
public interface KizunaviSubstituteSalesClaimWorkTableRepository extends CrudRepository<KizunaviSubstituteSalesClaimWorkTable, Long> {

}
