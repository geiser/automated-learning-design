package br.usp.ime.cg.automatedld.server.util;

import java.io.File;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.tencompetence.imsldmodel.ILDModel;
import org.tencompetence.imsldmodel.IMSNamespaces;
import org.tencompetence.imsldmodel.LDModel;
import org.tencompetence.imsldmodel.LDModelFactory;
import org.tencompetence.jdom.JDOMXMLUtils;

public class IMSManifest implements IMSNamespaces {

    private final ILDModel ldModel;
    
//    public static String[] learningActivities = {
//            "anchoredInstruction",
//            "cognitiveApprenticeship",
//            "cognitiveFlexibility",
//            "distributedCognition",
//            "lpp",
//            "peerTutoring",
//            "extremeTheory"
//    };

    public IMSManifest(String path) {
        this.ldModel = new LDModel();

        File manifestFile = new File(path);
        ldModel.setManifestFile(manifestFile);
        //ldModel.getRolesModel().addChild(getDefaultRoles());
        //this.setDefaultConditions();
        //this.setDefaultResourcesForCollaborativeActivities();
    }

//    private void setDefaultResourcesForCollaborativeActivities() {
//        for (String learningActivity : learningActivities) {            
//            IResourceModel resource =  new Resource(ldModel);
//            resource.setIdentifier("resource-"+learningActivity);
//            resource.setType("imsldcontent");
//            resource.setHrefAndResourceFile(learningActivity+".xml");
//            ldModel.getResourcesModel().addResource(resource);
//        }
//    }

    public ILDModel getLdModel() {
        return ldModel;
    }

    /**
     * Load the LD model from manifest file
     * 
     * @throws IOException
     * @throws JDOMException
     */
    public void loadModel() throws IOException, JDOMException {
        Document doc = JDOMXMLUtils.readXMLFile(ldModel.getManifestFile());
        Element rootElement = doc.getRootElement();

        // Manifest ID
        ldModel.setManifestIdentifier(rootElement.getAttributeValue(LDModelFactory.IDENTIFIER));

        Element ldRoot = null;

        /*
         * Get the organizations element
         */
        Element orgsElement = rootElement.getChild("organizations", rootElement.getNamespace()); //$NON-NLS-1$
        if(orgsElement != null) {
            /*
             * Get the LD element
             */
            ldRoot = orgsElement.getChild(LDModelFactory.LEARNING_DESIGN, IMSLD_NAMESPACE_100);
        }

        /*
         * Load Resources elements **first** because we need to reference them
         */
        Element resources = rootElement.getChild(LDModelFactory.RESOURCES, rootElement.getNamespace());
        if(resources != null) {
            ldModel.getResourcesModel().fromJDOM(resources);
        }

        // Then load LD Model
        if(ldRoot != null) {
            ldModel.fromJDOM(ldRoot);
        }
    }

//    private ILearnerModel getDefaultRoles(){
//        ILearnerModel instructorRole =  new LearnerRoleModel(ldModel);
//        instructorRole.setIdentifier("role-collab-instructor");
//        ILearnerModel learnerRole =  new LearnerRoleModel(ldModel);
//        learnerRole.setIdentifier("role-collab-learner");
//
//        ILearnerModel anchoredInstructorRole =  new LearnerRoleModel(ldModel);
//        anchoredInstructorRole.setIdentifier("role-anchored-instructor");
//        ILearnerModel masterRole =  new LearnerRoleModel(ldModel);
//        masterRole.setIdentifier("role-master");
//        ILearnerModel panelistRole =  new LearnerRoleModel(ldModel);
//        panelistRole.setIdentifier("role-panelist");
//        ILearnerModel fullParticipantRole =  new LearnerRoleModel(ldModel);
//        fullParticipantRole.setIdentifier("role-full-participant");
//        ILearnerModel peerTutorRole =  new LearnerRoleModel(ldModel);
//        peerTutorRole.setIdentifier("role-peer-tutor");
//
//        instructorRole.addChild(anchoredInstructorRole);
//        instructorRole.addChild(masterRole);
//        instructorRole.addChild(panelistRole);
//        instructorRole.addChild(fullParticipantRole);
//        instructorRole.addChild(peerTutorRole);
//
//        ILearnerModel anchorHolderRole =  new LearnerRoleModel(ldModel);
//        anchorHolderRole.setIdentifier("role-anchor-holder");
//        ILearnerModel apprenticeshipRole =  new LearnerRoleModel(ldModel);
//        apprenticeshipRole.setIdentifier("role-apprenticeship");
//        ILearnerModel audienceRole =  new LearnerRoleModel(ldModel);
//        audienceRole.setIdentifier("role-audience");
//        ILearnerModel peripheralParticipantRole =  new LearnerRoleModel(ldModel);
//        peripheralParticipantRole.setIdentifier("role-peripheral-participant");
//        ILearnerModel peerTuteeRole =  new LearnerRoleModel(ldModel);
//        peerTuteeRole.setIdentifier("role-peer-tutee");
//
//        learnerRole.addChild(anchorHolderRole);
//        learnerRole.addChild(apprenticeshipRole);
//        learnerRole.addChild(audienceRole);
//        learnerRole.addChild(peripheralParticipantRole);
//        learnerRole.addChild(peerTuteeRole);
//
//        ILearnerModel defaultRoles =  new LearnerRoleModel(ldModel);
//        defaultRoles.setIdentifier("role-collab-system");
//        defaultRoles.addChild(instructorRole);
//        defaultRoles.addChild(learnerRole);
//
//        return defaultRoles;
//    }

//    private void setDefaultConditions() {
//
//        IClassType instructionalEventClass = new ClassType(ldModel);
//        instructionalEventClass.setClassString("instructional-event");
//        instructionalEventClass.setWithControl(false);
//
//        IClassType learningEventClass = new ClassType(ldModel);
//        learningEventClass.setClassString("learning-event");
//        learningEventClass.setWithControl(false);
//
//        IShowHideType instructionalEventShow = new ShowHideType(ldModel, "show");
//        instructionalEventShow.addMember(instructionalEventClass);
//        IShowHideType learningEventShow = new ShowHideType(ldModel, "show");
//        learningEventShow.addMember(learningEventClass);
//
//        IShowHideType instructionalEventHide = new ShowHideType(ldModel, "hide");
//        instructionalEventHide.addMember(instructionalEventClass);
//        IShowHideType learningEventHide = new ShowHideType(ldModel, "hide");
//        learningEventHide.addMember(learningEventClass);
//
//        IIsMemberOfRoleType isMemberOfInstructorRole = new IsMemberOfRoleType(ldModel);
//        isMemberOfInstructorRole.setReferenceIdentifer("role-collab-instructor");
//
//        IIsMemberOfRoleType isMemberOfLearnerRole = new IsMemberOfRoleType(ldModel);
//        isMemberOfLearnerRole.setReferenceIdentifer("role-collab-learner");
//
////        IIfType instructorRoleIf = new IfType(ldModel);
////        instructorRoleIf.addExpressionMemberType(isMemberOfInstructorRole);
////
////        IIfType learnerRoleIf = new IfType(ldModel);
////        learnerRoleIf.addExpressionMemberType(isMemberOfLearnerRole);
//        
//        IConditionType instructorCondition = new ConditionType(ldModel.getMethodModel());
//        instructorCondition.getIfType().addExpressionMemberType(isMemberOfInstructorRole);
//        instructorCondition.getThenType().addMember(instructionalEventShow);
//        instructorCondition.getThenType().addMember(learningEventHide);
//        
//        IConditionType learnerCondition = new ConditionType(ldModel.getMethodModel());
//        learnerCondition.getIfType().addExpressionMemberType(isMemberOfLearnerRole);
//        learnerCondition.getThenType().addMember(learningEventShow);
//        learnerCondition.getThenType().addMember(instructionalEventHide);
//        
//        IConditionsType conditionsType = new ConditionsType(ldModel); 
//        conditionsType.getConditions().add(instructorCondition);
//        conditionsType.getConditions().add(learnerCondition);
//        
//        ldModel.getMethodModel().getConditionsModel().addChild(conditionsType);
//
//    }

    /**
     * Save the LD Model to the file specified in ILDModel
     * @throws IOException
     */
    public void saveModel() throws IOException {
        Document doc = new Document();

        /*
         * Root is CP manifest
         */ 
        Element root = new Element("manifest", IMSCP_NAMESPACE_114); //$NON-NLS-1$
        doc.setRootElement(root);

        /*
         * Additional namespaces
         */
        root.addNamespaceDeclaration(IMSLD_NAMESPACE_100_EMBEDDED);
        root.addNamespaceDeclaration(XSI_NAMESPACE);

        /* 
         * Add Schema Location Attribute which is constructed from Target Namespaces
         * and file names of Schemas
         */
        StringBuffer schemaLocationURI = new StringBuffer();

        // CP
        schemaLocationURI.append(root.getNamespace().getURI());
        schemaLocationURI.append(" ");  //$NON-NLS-1$
        schemaLocationURI.append(IMSCP_SCHEMALOCATION_114);
        schemaLocationURI.append(" ");  //$NON-NLS-1$

        // Schema location depends on LD level
        String level = ldModel.getLevel();

        schemaLocationURI.append(IMSLD_NAMESPACE_100.getURI());
        schemaLocationURI.append(" ");  //$NON-NLS-1$
        if("B".equalsIgnoreCase(level)) { //$NON-NLS-1$
            schemaLocationURI.append(IMSLD_SCHEMALOCATION_100B);
        }
        else if("C".equalsIgnoreCase(level)) { //$NON-NLS-1$
            schemaLocationURI.append(IMSLD_SCHEMALOCATION_100C);
        }
        else {
            schemaLocationURI.append(IMSLD_SCHEMALOCATION_100A);
        }

        root.setAttribute(XSI_SCHEMALOCATION, schemaLocationURI.toString(), XSI_NAMESPACE);

        /*
         * Manifest Identifier
         */
        root.setAttribute(LDModelFactory.IDENTIFIER, ldModel.getManifestIdentifier());

        /*
         * Add Learning Design to "organizations" element with LD Namespace
         */
        Element orgs = new Element("organizations", root.getNamespace()); //$NON-NLS-1$
        root.addContent(orgs);

        Element ldRoot = ldModel.toJDOM();
        orgs.addContent(ldRoot);

        /*
         * Resources element
         */
        Element resources = ldModel.getResourcesModel().toJDOM();
        root.addContent(resources);

        // And save the model
        JDOMXMLUtils.write2XMLFile(doc, ldModel.getManifestFile());
    }

}
