package dots.module.base.service4;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.jboss.wsf.spi.annotation.WebContext;

import dots.module.base.entitybeans.ChangeLogEntryBean;
import dots.module.base.entitybeans.ClassBean;
import dots.module.base.entitybeans.ClassificationSystemBean;
import dots.module.base.entitybeans.DocumentDescriptionBean;
import dots.module.base.entitybeans.DocumentObjectBean;
import dots.module.base.entitybeans.FondsBean;
import dots.module.base.entitybeans.FondsCreatorBean;
import dots.module.base.entitybeans.RegistryEntryBean;
import dots.module.base.entitybeans.SeriesBean;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebContext(contextRoot = "/n5", urlPattern = "/Noark5SearchService4")
@Stateless(mappedName = "Noark5SearchService4")
public class Noark5SearchService4 implements INoark5SearchService4 {

	@PersistenceContext
	EntityManager em;

	/** Fonds **/

	@Override
	public FondsBean fondsFindBySystemId(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsBean> fondsFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsBean> fondsFindTopLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsBean> fondsFindAllByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsBean> fondsFindAllByDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsBean> fondsFindAllByCreatedBy(String createdBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FondsCreatorBean fondsCreatorFindBySystemId(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FondsCreatorBean fondsCreatorFindByFondsCreatorId(
			String fondsCreatorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsCreatorBean> fondsCreatorFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsCreatorBean> fondsCreatorFindAllByFondsCreatorName(
			String fondsCreatorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FondsCreatorBean> fondsCreatorFindAllByDescription(
			String description) {
		// TODO Auto-generated method stub
		return null;
	}

	/** Series **/

	@Override
	public SeriesBean seriesFindBySystemId(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeriesBean> seriesFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeriesBean> seriesFindAllByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeriesBean> seriesFindAllByDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeriesBean> seriesFindAllByCreatedBy(String createdBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/** ClassificationSystem **/

	@Override
	public ClassificationSystemBean classificationSystemFindBySystemId(
			String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassificationSystemBean> classificationSystemFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassificationSystemBean> classificationSystemFindAllByTitle(
			String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassificationSystemBean> classificationSystemFindAllByDescription(
			String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassificationSystemBean> classificationSystemFindAllByCreatedBy(
			String createdBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/** Class **/

	@Override
	public ClassBean classFindBySystemId(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassBean classFindByClassId(String classId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassBean> classFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassBean> classFindAllByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassBean> classFindAllByDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassBean> classFindAllByCreatedBy(String createdBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/** RegistryEntry **/

	@Override
	public RegistryEntryBean registryEntryFindBySystemId(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistryEntryBean registryEntryFindByRecordId(String recordId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistryEntryBean> registryEntryFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistryEntryBean> registryEntryFindAllByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistryEntryBean> registryEntryFindAllByDescription(
			String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistryEntryBean> registryEntryFindAllByCreatedBy(
			String createdBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/** DocumentDescription **/

	@Override
	public DocumentDescriptionBean documentDescriptionFindBySystemId(
			String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentDescriptionBean> documentDescriptionFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentDescriptionBean> documentDescriptionFindAllByTitle(
			String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentDescriptionBean> documentDescriptionFindAllByDescription(
			String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentDescriptionBean> documentDescriptionFindAllByCreatedBy(
			String createdBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/** DocumentObject **/

	@Override
	public DocumentObjectBean documentObjectFindBySystemId(String systemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentObjectBean> documentObjectFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocumentObjectBean> documentObjectFindAllByCreatedBy(
			String createdBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/** ChangeLogEntry **/

	@Override
	public List<ChangeLogEntryBean> changeLogEntryFindAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
