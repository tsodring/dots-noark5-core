package dots.module.base.service3;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.jboss.wsf.spi.annotation.WebContext;

import dots.module.base.beans.Result;
import dots.module.base.entitybeans.CaseFileBean;
import dots.module.base.entitybeans.DocumentDescriptionBean;
import dots.module.base.entitybeans.DocumentObjectBean;
import dots.module.base.entitybeans.FondsBean;
import dots.module.base.entitybeans.FondsCreatorBean;
import dots.module.base.entitybeans.RegistryEntryBean;
import dots.module.base.entitybeans.SeriesBean;
import dots.module.hlapi.base.CaseFileAPI;
import dots.module.hlapi.base.DocumentAPI;
import dots.module.hlapi.base.FondsAPI;
import dots.module.hlapi.base.FondsCreatorAPI;
import dots.module.hlapi.base.RegistryEntryAPI;
import dots.module.hlapi.base.SeriesAPI;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebContext(contextRoot = "/n5", urlPattern = "/Noark5BaseService3")
@Stateless(mappedName = "Noark5BaseService3")
public class Noark5BaseService3 implements INoark5BaseService3 {

	@PersistenceContext
	EntityManager em;

	@Resource
	private SessionContext ctx;

	/** Fonds **/

	@Override
	public Result fondsCreate(String fondsCreatorId,
			String parentFondsSystemId, String title, String description,
			String documentMedium, String createdBy) {
		try {
			return FondsAPI.create(em, fondsCreatorId, parentFondsSystemId,
					title, description, documentMedium, createdBy);
		} catch (Exception ex) {
			ex.printStackTrace();
			ctx.setRollbackOnly();
			return new Result(false);
		}
	}

	@Override
	public Result fondsDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FondsBean fondsGetParentFonds(String systemId) {

		return FondsAPI.getParentFonds(em, systemId);
	}

	@Override
	public List<FondsBean> fondsGetChildFonds(String systemId) {
		return FondsAPI.getChildFonds(em, systemId);
	}

	@Override
	public List<SeriesBean> fondsGetSeries(String systemId) {
		return FondsAPI.getSeries(em, systemId);
	}

	@Override
	public List<FondsCreatorBean> fondsGetFondsCreators(String systemId) {
		return FondsAPI.getFondsCreators(em, systemId);
	}

	@Override
	public Result fondsCreatorCreate(String fondsCreatorId,
			String fondsCreatorName, String description) {
		try {
			return FondsCreatorAPI.create(em, fondsCreatorId, fondsCreatorName,
					description);
		} catch (Exception ex) {
			ex.printStackTrace();
			ctx.setRollbackOnly();
			return new Result(false);
		}
	}

	@Override
	public Result fondsCreatorDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	/** Series **/

	@Override
	public Result seriesCreate(String fondsSystemId, String precursorSystemId,
			String title, String description, String documentMedium,
			String createdBy) {
		try {
			return SeriesAPI.create(em, fondsSystemId, precursorSystemId,
					title, description, documentMedium, createdBy);
		} catch (Exception ex) {
			ex.printStackTrace();
			ctx.setRollbackOnly();
			return new Result(false);
		}
	}

	@Override
	public Result seriesDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SeriesBean seriesGetPrecursor(String systemId) {
		return SeriesAPI.getPrecursor(em, systemId);
	}

	@Override
	public SeriesBean seriesGetSuccessor(String systemId) {
		return SeriesAPI.getSuccessor(em, systemId);
	}

	@Override
	public List<CaseFileBean> seriesGetCaseFiles(String systemId) {
		return SeriesAPI.getCaseFiles(em, systemId);
	}

	/** CaseFile **/

	@Override
	public Result caseFileCreate(String seriesSystemId,
			String parentFileSystemId, String title, String officialTitle,
			String description, String documentMedium, String createdBy) {
		try {
			return CaseFileAPI.create(em, seriesSystemId, parentFileSystemId,
					title, officialTitle, description, documentMedium,
					createdBy);
		} catch (Exception ex) {
			ex.printStackTrace();
			ctx.setRollbackOnly();
			return new Result(false);
		}
	}

	@Override
	public Result caseFileDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CaseFileBean caseFileGetParentCaseFile(String systemId) {
		return CaseFileAPI.getParentCaseFile(em, systemId);
	}

	@Override
	public List<CaseFileBean> caseFileGetChildCaseFiles(String systemId) {
		return CaseFileAPI.getChildCaseFiles(em, systemId);
	}

	@Override
	public SeriesBean caseFileGetSeries(String systemId) {
		return CaseFileAPI.getSeries(em, systemId);
	}

	@Override
	public List<RegistryEntryBean> caseFileGetRegistryEntries(String systemId) {
		return CaseFileAPI.getRegistryEntries(em, systemId);
	}

	/** RegistryEntry **/

	@Override
	public Result registryEntryCreate(String caseFileSystemId, String title,
			String officialTitle, String description, String documentMedium,
			String createdBy) {
		try {
			return RegistryEntryAPI.create(em, caseFileSystemId, title,
					officialTitle, description, documentMedium, createdBy);
		} catch (Exception ex) {
			ex.printStackTrace();
			ctx.setRollbackOnly();
			return new Result(false);
		}
	}

	@Override
	public Result registryEntryDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CaseFileBean registryEntryGetCaseFile(String systemId) {
		return RegistryEntryAPI.getCaseFile(em, systemId);
	}

	@Override
	public List<DocumentDescriptionBean> registryEntryGetDocumentDescriptions(
			String systemId) {
		return RegistryEntryAPI.getDocumentDescriptions(em, systemId);
	}

	/** DocumentDescription & DocumentObject **/

	@Override
	public Result documentCreate(String reSystemId, String documentType,
			String title, String description, String createdBy,
			String documentMedium, String base64Content, String extension,
			String format) {
		try {
			return DocumentAPI.documentCreate(em, reSystemId, documentType,
					title, description, createdBy, documentMedium,
					base64Content, extension, format);
		} catch (Exception ex) {
			ex.printStackTrace();
			ctx.setRollbackOnly();
			return new Result(false);
		}
	}

	@Override
	public String documentGet(String ddSystemId) {
		return DocumentAPI.documentGet(em, ddSystemId);
	}

	/** DocumentDescription **/

	@Override
	public Result documentDescriptionDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistryEntryBean> documentDescriptionGetRegistryEntries(
			String systemId) {
		return DocumentAPI.documentDescriptionGetRegistryEntries(em, systemId);
	}

	@Override
	public List<DocumentObjectBean> documentDescriptionGetDocumentObjects(
			String systemId) {
		return DocumentAPI.documentDescriptionGetDocumentObjects(em, systemId);
	}

	/** DocumentObject **/

	@Override
	public Result documentObjectDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentDescriptionBean documentObjectGetDocumentDescription(
			String systemId) {
		return DocumentAPI.documentObjectGetDocumentDescription(em, systemId);
	}

}
