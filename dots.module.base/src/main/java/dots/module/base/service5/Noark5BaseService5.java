package dots.module.base.service5;

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
import dots.module.base.entitybeans.DocumentDescriptionBean;
import dots.module.base.entitybeans.DocumentObjectBean;
import dots.module.base.entitybeans.FondsBean;
import dots.module.base.entitybeans.FondsCreatorBean;
import dots.module.base.entitybeans.RegistryEntryBean;
import dots.module.base.entitybeans.SeriesBean;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebContext(contextRoot = "/n5", urlPattern = "/Noark5BaseService5")
@Stateless(mappedName = "Noark5BaseService5")
public class Noark5BaseService5 implements INoark5BaseService5 {

	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unused")
	@Resource
	private SessionContext ctx;

	/** Fonds **/

	@Override
	public Result fondsCreate(String fondsCreatorId,
			String parentFondsSystemId, String title, String description,
			String documentMedium, String createdBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result fondsDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FondsBean fondsGetParentFonds(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsBean> fondsGetChildFonds(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeriesBean> fondsGetSeries(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsCreatorBean> fondsGetFondsCreators(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result fondsCreatorCreate(String fondsCreatorId,
			String fondsCreatorName, String description) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result seriesDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SeriesBean seriesGetPrecursor(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SeriesBean seriesGetSuccessor(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistryEntryBean> seriesGetRegistryEntries(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	/** RegistryEntry **/

	@Override
	public Result registryEntryCreate(String seriesSystemId, String title,
			String officialTitle, String description, String documentMedium,
			String createdBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result registryEntryDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SeriesBean registryEntryGetSeries(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentDescriptionBean> registryEntryGetDocumentDescriptions(
			String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	/** DocumentDescription & DocumentObject **/

	@Override
	public Result documentCreate(String reSystemId, String documentType,
			String title, String description, String createdBy,
			String documentMedium, String base64Content, String extension,
			String format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String documentGet(String ddSystemId) {
		// TODO
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentObjectBean> documentDescriptionGetDocumentObjects(
			String systemId) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

}
