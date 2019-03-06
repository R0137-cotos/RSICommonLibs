package jp.co.ricoh.cotos.rsicommonlib.repository;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import jp.co.ricoh.cotos.commonlib.db.DBUtil;
import jp.co.ricoh.cotos.commonlib.entity.estimation.Estimation;
import jp.co.ricoh.cotos.rsicommonlib.DBConfig;
import jp.co.ricoh.cotos.rsicommonlib.TestTools;
import jp.co.ricoh.cotos.rsicommonlib.entity.BasicContents;
import jp.co.ricoh.cotos.rsicommonlib.entity.BranchCustomerInfo;
import jp.co.ricoh.cotos.rsicommonlib.entity.ContractInfo;
import jp.co.ricoh.cotos.rsicommonlib.entity.ContractorInfo;
import jp.co.ricoh.cotos.rsicommonlib.entity.CotosManagementInfo;
import jp.co.ricoh.cotos.rsicommonlib.entity.DistributorInfo;
import jp.co.ricoh.cotos.rsicommonlib.entity.KizunaviSubstituteSalesClaim;
import jp.co.ricoh.cotos.rsicommonlib.entity.KizunaviSubstituteSalesClaimWorkTable;
import jp.co.ricoh.cotos.rsicommonlib.entity.ParentDistributorInfo;
import jp.co.ricoh.cotos.rsicommonlib.entity.SalesCalcResultWork;

/**
 * Repository（RSI）のテストクラス
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestRsiRepository {

	static ConfigurableApplicationContext context;

	@Autowired
	TestTools testTool;

	@Autowired
	BasicContentsRepository basicContentsRepository;

	@Autowired
	BranchCustomerInfoRepository branchCustomerInfoRepository;

	@Autowired
	ContractInfoRepository contractInfoRepository;

	@Autowired
	ContractorInfoRepository contractorInfoRepository;

	@Autowired
	CotosManagementInfoRepository cotosManagementInfoRepository;

	@Autowired
	DistributorInfoRepository distributorInfoRepository;

	@Autowired
	KizunaviSubstituteSalesClaimRepository kizunaviSubstituteSalesClaimRepository;

	@Autowired
	KizunaviSubstituteSalesClaimWorkTableRepository kizunaviSubstituteSalesClaimWorkTableRepository;

	@Autowired
	ParentDistributorInfoRepository parentDistributorInfoRepository;

	@Autowired
	SalesCalcResultWorkRepository salesCalcResultWorkRepository;

	@Autowired
	DBUtil dbutil;

	@Autowired
	public void injectContext(ConfigurableApplicationContext injectContext) {
		context = injectContext;
		context.getBean(DBConfig.class).clearData();
		context.getBean(DBConfig.class).initTargetTestData("repository/rsiRepository.sql");
	}

	@AfterClass
	public static void stopAPServer() throws InterruptedException {
		if (null != context) {
			context.getBean(DBConfig.class).clearData();
			context.stop();
		}
	}

	@Test
	public void BasicContentsRepositoryのテスト() throws Exception {

		BasicContents found = basicContentsRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);
	}

	@Test
	public void BranchCustomerInfoRepositoryのテスト() throws Exception {

		BranchCustomerInfo found = branchCustomerInfoRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);
	}

	@Test
	public void ContractInfoRepositoryのテスト() throws Exception {

		ContractInfo found = contractInfoRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);
	}

	@Test
	public void ContractorInfoRepositoryのテスト() throws Exception {

		ContractorInfo found = contractorInfoRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);

	}

	@Test
	public void CotosManagementInfoRepositoryのテスト() throws Exception {

		CotosManagementInfo found = cotosManagementInfoRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);

	}

	@Test
	public void EstimationDetailRepositoryのテスト() throws Exception {

		DistributorInfo found = distributorInfoRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);

	}

	@Test
	public void KizunaviSubstituteSalesClaimRepositoryのテスト() throws Exception {

		KizunaviSubstituteSalesClaim found = kizunaviSubstituteSalesClaimRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);

	}

	@Test
	public void KizunaviSubstituteSalesClaimWorkTableRepositoryのテスト() throws Exception {

		KizunaviSubstituteSalesClaimWorkTable found = kizunaviSubstituteSalesClaimWorkTableRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);

	}

	@Test
	public void ParentDistributorInfoRepositoryのテスト() throws Exception {

		ParentDistributorInfo found = parentDistributorInfoRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);

	}

	@Test
	public void SalesCalcResultWorkRepositoryのテスト() throws Exception {

		SalesCalcResultWork found = salesCalcResultWorkRepository.findOne(1L);

		// Entity が null ではないことを確認
		Assert.assertNotNull(found);

		// Entity の各項目の値が null ではないことを確認
		testTool.assertColumnsNotNull(found);

	}

	@Test
	public void DBUtilのメソッドテスト() throws Exception {

		String sql = "SELECT * FROM BASIC_CONTENTS";
		List<Estimation> foundList = dbutil.executeSelectWithSQL(sql);

		// Entity が null ではないことを確認
		Assert.assertNotNull(foundList);

		// Entity 1件以上取得できていることを確認
		Assert.assertNotEquals(foundList.size(), 0);

	}

}
