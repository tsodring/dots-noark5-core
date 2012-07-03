package dots.module.base.service3;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.jboss.wsf.spi.annotation.WebContext;

import dots.module.base.entitybeans.CaseFileBean;
import dots.module.base.entitybeans.ChangeLogEntryBean;
import dots.module.base.entitybeans.DocumentDescriptionBean;
import dots.module.base.entitybeans.DocumentObjectBean;
import dots.module.base.entitybeans.FondsBean;
import dots.module.base.entitybeans.FondsCreatorBean;
import dots.module.base.entitybeans.RegistryEntryBean;
import dots.module.base.entitybeans.SeriesBean;
import dots.module.hlapi.find.CaseFileFindAPI;
import dots.module.hlapi.find.ChangeLogEntryFindAPI;
import dots.module.hlapi.find.DocumentDescriptionFindAPI;
import dots.module.hlapi.find.DocumentObjectFindAPI;
import dots.module.hlapi.find.FondsCreatorFindAPI;
import dots.module.hlapi.find.FondsFindAPI;
import dots.module.hlapi.find.RegistryEntryFindAPI;
import dots.module.hlapi.find.SeriesFindAPI;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebContext(contextRoot = "/n5", urlPattern = "/Noark5SearchService3")
@Stateless(mappedName = "Noark5SearchService3")
public class Noark5SearchService3 implements INoark5SearchService3 {

	@PersistenceContext
	EntityManager em;

	/** Fonds **/

	@Override
	public FondsBean fondsFindBySystemId(String systemId) {

		return FondsFindAPI.findBySystemId(em, systemId);
	}

	@Override
	public List<FondsBean> fondsFindAll() {

		return FondsFindAPI.findAll(em);
	}

	@Override
	public List<FondsBean> fondsFindTopLevel() {

		return FondsFindAPI.findTopLevel(em);
	}

	@Override
	public List<FondsBean> fondsFindAllByTitle(String title) {

		return FondsFindAPI.findAllByTitle(em, title);
	}

	@Override
	public List<FondsBean> fondsFindAllByDescription(String description) {

		return FondsFindAPI.findAllByDescription(em, description);
	}

	@Override
	public List<FondsBean> fondsFindAllByCreatedBy(String createdBy) {

		return FondsFindAPI.findAllByCreatedBy(em, createdBy);
	}

	@Override
	public FondsCreatorBean fondsCreatorFindBySystemId(String systemId) {

		return FondsCreatorFindAPI.findBySystemId(em, systemId);
	}

	@Override
	public FondsCreatorBean fondsCreatorFindByFondsCreatorId(
			String fondsCreatorId) {

		return FondsCreatorFindAPI.findByFondsCreatorId(em, fondsCreatorId);
	}

	@Override
	public List<FondsCreatorBean> fondsCreatorFindAll() {

		return FondsCreatorFindAPI.findAll(em);
	}

	@Override
	public List<FondsCreatorBean> fondsCreatorFindAllByFondsCreatorName(
			String fondsCreatorName) {

		return FondsCreatorFindAPI.findAllByFondsCreatorName(em,
				fondsCreatorName);
	}

	@Override
	public List<FondsCreatorBean> fondsCreatorFindAllByDescription(
			String description) {

		return FondsCreatorFindAPI.findAllByDescription(em, description);
	}

	/** Series **/

	@Override
	public SeriesBean seriesFindBySystemId(String systemId) {

		return SeriesFindAPI.findBySystemId(em, systemId);
	}

	@Override
	public List<SeriesBean> seriesFindAll() {

		return SeriesFindAPI.findAll(em);
	}

	@Override
	public List<SeriesBean> seriesFindAllByTitle(String title) {

		return SeriesFindAPI.findAllByTitle(em, title);
	}

	@Override
	public List<SeriesBean> seriesFindAllByDescription(String description) {

		return SeriesFindAPI.findAllByDescription(em, description);
	}

	@Override
	public List<SeriesBean> seriesFindAllByCreatedBy(String createdBy) {

		return SeriesFindAPI.findAllByCreatedBy(em, createdBy);
	}

	/** CaseFile **/

	@Override
	public CaseFileBean caseFileFindBySystemId(String systemId) {

		return CaseFileFindAPI.findBySystemId(em, systemId);
	}

	@Override
	public List<CaseFileBean> caseFileFindAll() {

		return CaseFileFindAPI.findAll(em);
	}

	@Override
	public List<CaseFileBean> caseFileFindAllByTitle(String title) {

		return CaseFileFindAPI.findAllByTitle(em, title);
	}

	@Override
	public List<CaseFileBean> caseFileFindAllByDescription(String description) {

		return CaseFileFindAPI.findAllByDescription(em, description);
	}

	@Override
	public List<CaseFileBean> caseFileFindAllByCreatedBy(String createdBy) {

		return CaseFileFindAPI.findAllByCreatedBy(em, createdBy);
	}

	/** RegistryEntry **/

	@Override
	public RegistryEntryBean registryEntryFindBySystemId(String systemId) {

		return RegistryEntryFindAPI.findBySystemId(em, systemId);
	}

	@Override
	public RegistryEntryBean registryEntryFindByRecordId(String recordId) {

		return RegistryEntryFindAPI.findByRecordId(em, recordId);
	}

	@Override
	public List<RegistryEntryBean> registryEntryFindAll() {

		return RegistryEntryFindAPI.findAll(em);
	}

	@Override
	public List<RegistryEntryBean> registryEntryFindAllByTitle(String title) {

		return RegistryEntryFindAPI.findAllByTitle(em, title);
	}

	@Override
	public List<RegistryEntryBean> registryEntryFindAllByDescription(
			String description) {

		return RegistryEntryFindAPI.findAllByDescription(em, description);
	}

	@Override
	public List<RegistryEntryBean> registryEntryFindAllByCreatedBy(
			String createdBy) {

		return RegistryEntryFindAPI.findAllByCreatedBy(em, createdBy);
	}

	/** DocumentDescription **/

	@Override
	public DocumentDescriptionBean documentDescriptionFindBySystemId(
			String systemId) {

		return DocumentDescriptionFindAPI.findBySystemId(em, systemId);
	}

	@Override
	public List<DocumentDescriptionBean> documentDescriptionFindAll() {

		return DocumentDescriptionFindAPI.findAll(em);
	}

	@Override
	public List<DocumentDescriptionBean> documentDescriptionFindAllByTitle(
			String title) {

		return DocumentDescriptionFindAPI.findAllByTitle(em, title);
	}

	@Override
	public List<DocumentDescriptionBean> documentDescriptionFindAllByDescription(
			String description) {

		return DocumentDescriptionFindAPI.findAllByDescription(em, description);
	}

	@Override
	public List<DocumentDescriptionBean> documentDescriptionFindAllByCreatedBy(
			String createdBy) {

		return DocumentDescriptionFindAPI.findAllByCreatedBy(em, createdBy);
	}

	/** DocumentObject **/

	@Override
	public DocumentObjectBean documentObjectFindBySystemId(String systemId) {

		return DocumentObjectFindAPI.findBySystemId(em, systemId);
	}

	@Override
	public List<DocumentObjectBean> documentObjectFindAll() {

		return DocumentObjectFindAPI.findAll(em);
	}

	@Override
	public List<DocumentObjectBean> documentObjectFindAllByCreatedBy(
			String createdBy) {

		return DocumentObjectFindAPI.findAllByCreatedBy(em, createdBy);
	}

	/** ChangeLogEntry **/

	@Override
	public List<ChangeLogEntryBean> changeLogEntryFindAll() {

		return ChangeLogEntryFindAPI.findAll(em);
	}

}
