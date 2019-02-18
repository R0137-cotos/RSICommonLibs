package jp.co.ricoh.cotos.rsicommonlib.repository.KIZUNAviCreateSubstituteInvoice;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.ricoh.cotos.rsicommonlib.entity.KIZUNAviCreateSubstituteInvoice.KizunaviSubstituteSalesClaim;

@Repository
public interface KizunaviSubstituteSalesClaimRepository extends JpaRepository<KizunaviSubstituteSalesClaim, Long> {

	public List<KizunaviSubstituteSalesClaim> findByClaimDate(Date claimDate);
}
