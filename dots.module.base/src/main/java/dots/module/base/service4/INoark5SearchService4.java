package dots.module.base.service4;

import java.util.List;

import javax.ejb.Remote;

import dots.module.base.entitybeans.ChangeLogEntryBean;
import dots.module.base.entitybeans.ClassBean;
import dots.module.base.entitybeans.ClassificationSystemBean;
import dots.module.base.entitybeans.DocumentDescriptionBean;
import dots.module.base.entitybeans.DocumentObjectBean;
import dots.module.base.entitybeans.FondsBean;
import dots.module.base.entitybeans.FondsCreatorBean;
import dots.module.base.entitybeans.RegistryEntryBean;
import dots.module.base.entitybeans.SeriesBean;


// 1. fonds
// 2. series
// 3. classification system
// 4. class
// 5. registry entry
// 6. document description
// 7. document object

@Remote
public interface INoark5SearchService4 {

	/** Fonds **/

	public FondsBean fondsFindBySystemId(String systemId);

	public List<FondsBean> fondsFindAll();

	public List<FondsBean> fondsFindTopLevel();

	public List<FondsBean> fondsFindAllByTitle(String title);

	public List<FondsBean> fondsFindAllByDescription(String description);

	public List<FondsBean> fondsFindAllByCreatedBy(String createdBy);

	public FondsCreatorBean fondsCreatorFindBySystemId(String systemId);

	public FondsCreatorBean fondsCreatorFindByFondsCreatorId(
			String fondsCreatorId);

	public List<FondsCreatorBean> fondsCreatorFindAll();

	public List<FondsCreatorBean> fondsCreatorFindAllByFondsCreatorName(
			String fondsCreatorName);

	public List<FondsCreatorBean> fondsCreatorFindAllByDescription(
			String description);

	/** Series **/

	public SeriesBean seriesFindBySystemId(String systemId);

	public List<SeriesBean> seriesFindAll();

	public List<SeriesBean> seriesFindAllByTitle(String title);

	public List<SeriesBean> seriesFindAllByDescription(String description);

	public List<SeriesBean> seriesFindAllByCreatedBy(String createdBy);

	/** ClassificationSystem **/

	public ClassificationSystemBean classificationSystemFindBySystemId(
			String systemId);

	public List<ClassificationSystemBean> classificationSystemFindAll();

	public List<ClassificationSystemBean> classificationSystemFindAllByTitle(
			String title);

	public List<ClassificationSystemBean> classificationSystemFindAllByDescription(
			String description);

	public List<ClassificationSystemBean> classificationSystemFindAllByCreatedBy(
			String createdBy);

	/** Class **/

	public ClassBean classFindBySystemId(String systemId);

	public ClassBean classFindByClassId(String classId);

	public List<ClassBean> classFindAll();

	public List<ClassBean> classFindAllByTitle(String title);

	public List<ClassBean> classFindAllByDescription(String description);

	public List<ClassBean> classFindAllByCreatedBy(String createdBy);

	/** RegistryEntry **/

	public RegistryEntryBean registryEntryFindBySystemId(String systemId);

	public RegistryEntryBean registryEntryFindByRecordId(String recordId);

	public List<RegistryEntryBean> registryEntryFindAll();

	public List<RegistryEntryBean> registryEntryFindAllByTitle(String title);

	public List<RegistryEntryBean> registryEntryFindAllByDescription(
			String description);

	public List<RegistryEntryBean> registryEntryFindAllByCreatedBy(
			String createdBy);

	/** DocumentDescription **/

	public DocumentDescriptionBean documentDescriptionFindBySystemId(
			String systemId);

	public List<DocumentDescriptionBean> documentDescriptionFindAll();

	public List<DocumentDescriptionBean> documentDescriptionFindAllByTitle(
			String title);

	public List<DocumentDescriptionBean> documentDescriptionFindAllByDescription(
			String description);

	public List<DocumentDescriptionBean> documentDescriptionFindAllByCreatedBy(
			String createdBy);

	/** DocumentObject **/

	public DocumentObjectBean documentObjectFindBySystemId(String systemId);

	public List<DocumentObjectBean> documentObjectFindAll();

	public List<DocumentObjectBean> documentObjectFindAllByCreatedBy(
			String createdBy);

	/** ChangeLogEntry **/

	public List<ChangeLogEntryBean> changeLogEntryFindAll();

}
