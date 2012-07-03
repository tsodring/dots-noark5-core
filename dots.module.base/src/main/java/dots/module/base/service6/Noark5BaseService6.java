package dots.module.base.service6;

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
import dots.module.base.entitybeans.DocumentObjectBean;
import dots.module.base.entitybeans.FondsBean;
import dots.module.base.entitybeans.FondsCreatorBean;
import dots.module.base.entitybeans.RegistryEntryBean;
import dots.module.base.entitybeans.SeriesBean;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebContext(contextRoot = "/n5", urlPattern = "/Noark5BaseService6")
@Stateless(mappedName = "Noark5BaseService6")
public class Noark5BaseService6 implements INoark5BaseService6 {

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
	public List<DocumentObjectBean> registryEntryGetDocumentObjects(
			String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	/** Document Object **/

	@Override
	public Result documentCreate(String reSystemId, String createdBy,
			String base64Content, String extension, String format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result documentObjectDelete(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistryEntryBean documentObjectGetRegistryEntry(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

}
