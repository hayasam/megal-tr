/**
 */
package org.softlang.megal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.softlang.megal.MegalFactory
 * @model kind="package"
 * @generated
 */
public interface MegalPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "megal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://softlang.wikidot.com/megal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MegalPackage eINSTANCE = org.softlang.megal.impl.MegalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalAnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalAnnotationImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalAnnotation()
	 * @generated
	 */
	int MEGAL_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ANNOTATION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ANNOTATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.MegalElement <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.MegalElement
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalElement()
	 * @generated
	 */
	int MEGAL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ELEMENT__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalFileImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalFile()
	 * @generated
	 */
	int MEGAL_FILE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__ANNOTATIONS = MEGAL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__DECLARATIONS = MEGAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__BINDINGS = MEGAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__NAME = MEGAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE__IMPORTS = MEGAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE_FEATURE_COUNT = MEGAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_FILE_OPERATION_COUNT = MEGAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalLinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalLinkImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalLink()
	 * @generated
	 */
	int MEGAL_LINK = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__ANNOTATIONS = MEGAL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__LINK = MEGAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__TO = MEGAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__FIRST = MEGAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK__SECOND = MEGAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK_FEATURE_COUNT = MEGAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_LINK_OPERATION_COUNT = MEGAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalDeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalDeclarationImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalDeclaration()
	 * @generated
	 */
	int MEGAL_DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_DECLARATION__ANNOTATIONS = MEGAL_ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_DECLARATION_FEATURE_COUNT = MEGAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_DECLARATION_OPERATION_COUNT = MEGAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalRelationshipImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalRelationship()
	 * @generated
	 */
	int MEGAL_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP__ANNOTATIONS = MEGAL_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP__TYPE = MEGAL_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP__LEFT = MEGAL_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP__RIGHT = MEGAL_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_FEATURE_COUNT = MEGAL_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_OPERATION_COUNT = MEGAL_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalPairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalPairImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalPair()
	 * @generated
	 */
	int MEGAL_PAIR = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR__ANNOTATIONS = MEGAL_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR__SET = MEGAL_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR__FIRST = MEGAL_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR__SECOND = MEGAL_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR_FEATURE_COUNT = MEGAL_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_PAIR_OPERATION_COUNT = MEGAL_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalNamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalNamedImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalNamed()
	 * @generated
	 */
	int MEGAL_NAMED = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_NAMED__ANNOTATIONS = MEGAL_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_NAMED__NAME = MEGAL_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_NAMED_FEATURE_COUNT = MEGAL_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_NAMED_OPERATION_COUNT = MEGAL_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalEntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalEntityTypeImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalEntityType()
	 * @generated
	 */
	int MEGAL_ENTITY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE__ANNOTATIONS = MEGAL_NAMED__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE__NAME = MEGAL_NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE__SUPERTYPE = MEGAL_NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE_FEATURE_COUNT = MEGAL_NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_TYPE_OPERATION_COUNT = MEGAL_NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalRelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalRelationshipTypeImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalRelationshipType()
	 * @generated
	 */
	int MEGAL_RELATIONSHIP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__ANNOTATIONS = MEGAL_NAMED__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__NAME = MEGAL_NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__LEFT = MEGAL_NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__RIGHT = MEGAL_NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Both</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH = MEGAL_NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right Both</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH = MEGAL_NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Left Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__LEFT_MANY = MEGAL_NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Right Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY = MEGAL_NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Left Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS = MEGAL_NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Right Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS = MEGAL_NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE_FEATURE_COUNT = MEGAL_NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_RELATIONSHIP_TYPE_OPERATION_COUNT = MEGAL_NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.impl.MegalEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.impl.MegalEntityImpl
	 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalEntity()
	 * @generated
	 */
	int MEGAL_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__ANNOTATIONS = MEGAL_NAMED__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__NAME = MEGAL_NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__TYPE = MEGAL_NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__PARAMS = MEGAL_NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY__MANY = MEGAL_NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_FEATURE_COUNT = MEGAL_NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAL_ENTITY_OPERATION_COUNT = MEGAL_NAMED_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.softlang.megal.MegalAnnotation
	 * @generated
	 */
	EClass getMegalAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalAnnotation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.softlang.megal.MegalAnnotation#getKey()
	 * @see #getMegalAnnotation()
	 * @generated
	 */
	EAttribute getMegalAnnotation_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalAnnotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.softlang.megal.MegalAnnotation#getValue()
	 * @see #getMegalAnnotation()
	 * @generated
	 */
	EAttribute getMegalAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.softlang.megal.MegalElement
	 * @generated
	 */
	EClass getMegalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.MegalElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.softlang.megal.MegalElement#getAnnotations()
	 * @see #getMegalElement()
	 * @generated
	 */
	EReference getMegalElement_Annotations();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.softlang.megal.MegalFile
	 * @generated
	 */
	EClass getMegalFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.MegalFile#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see org.softlang.megal.MegalFile#getDeclarations()
	 * @see #getMegalFile()
	 * @generated
	 */
	EReference getMegalFile_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.MegalFile#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.softlang.megal.MegalFile#getBindings()
	 * @see #getMegalFile()
	 * @generated
	 */
	EReference getMegalFile_Bindings();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.MegalFile#getName()
	 * @see #getMegalFile()
	 * @generated
	 */
	EAttribute getMegalFile_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.MegalFile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see org.softlang.megal.MegalFile#getImports()
	 * @see #getMegalFile()
	 * @generated
	 */
	EReference getMegalFile_Imports();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.softlang.megal.MegalLink
	 * @generated
	 */
	EClass getMegalLink();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see org.softlang.megal.MegalLink#getLink()
	 * @see #getMegalLink()
	 * @generated
	 */
	EReference getMegalLink_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalLink#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.softlang.megal.MegalLink#getTo()
	 * @see #getMegalLink()
	 * @generated
	 */
	EAttribute getMegalLink_To();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalLink#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see org.softlang.megal.MegalLink#getFirst()
	 * @see #getMegalLink()
	 * @generated
	 */
	EReference getMegalLink_First();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalLink#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see org.softlang.megal.MegalLink#getSecond()
	 * @see #getMegalLink()
	 * @generated
	 */
	EReference getMegalLink_Second();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.softlang.megal.MegalDeclaration
	 * @generated
	 */
	EClass getMegalDeclaration();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.softlang.megal.MegalRelationship
	 * @generated
	 */
	EClass getMegalRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.softlang.megal.MegalRelationship#getType()
	 * @see #getMegalRelationship()
	 * @generated
	 */
	EReference getMegalRelationship_Type();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalRelationship#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.softlang.megal.MegalRelationship#getLeft()
	 * @see #getMegalRelationship()
	 * @generated
	 */
	EReference getMegalRelationship_Left();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalRelationship#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.softlang.megal.MegalRelationship#getRight()
	 * @see #getMegalRelationship()
	 * @generated
	 */
	EReference getMegalRelationship_Right();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalPair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see org.softlang.megal.MegalPair
	 * @generated
	 */
	EClass getMegalPair();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalPair#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see org.softlang.megal.MegalPair#getSet()
	 * @see #getMegalPair()
	 * @generated
	 */
	EReference getMegalPair_Set();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalPair#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see org.softlang.megal.MegalPair#getFirst()
	 * @see #getMegalPair()
	 * @generated
	 */
	EReference getMegalPair_First();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalPair#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second</em>'.
	 * @see org.softlang.megal.MegalPair#getSecond()
	 * @see #getMegalPair()
	 * @generated
	 */
	EReference getMegalPair_Second();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalNamed <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see org.softlang.megal.MegalNamed
	 * @generated
	 */
	EClass getMegalNamed();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalNamed#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.MegalNamed#getName()
	 * @see #getMegalNamed()
	 * @generated
	 */
	EAttribute getMegalNamed_Name();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see org.softlang.megal.MegalEntityType
	 * @generated
	 */
	EClass getMegalEntityType();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalEntityType#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertype</em>'.
	 * @see org.softlang.megal.MegalEntityType#getSupertype()
	 * @see #getMegalEntityType()
	 * @generated
	 */
	EReference getMegalEntityType_Supertype();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see org.softlang.megal.MegalRelationshipType
	 * @generated
	 */
	EClass getMegalRelationshipType();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalRelationshipType#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.softlang.megal.MegalRelationshipType#getLeft()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EReference getMegalRelationshipType_Left();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalRelationshipType#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.softlang.megal.MegalRelationshipType#getRight()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EReference getMegalRelationshipType_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalRelationshipType#isLeftBoth <em>Left Both</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Both</em>'.
	 * @see org.softlang.megal.MegalRelationshipType#isLeftBoth()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EAttribute getMegalRelationshipType_LeftBoth();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalRelationshipType#isRightBoth <em>Right Both</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Both</em>'.
	 * @see org.softlang.megal.MegalRelationshipType#isRightBoth()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EAttribute getMegalRelationshipType_RightBoth();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalRelationshipType#isLeftMany <em>Left Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Many</em>'.
	 * @see org.softlang.megal.MegalRelationshipType#isLeftMany()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EAttribute getMegalRelationshipType_LeftMany();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalRelationshipType#isRightMany <em>Right Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Many</em>'.
	 * @see org.softlang.megal.MegalRelationshipType#isRightMany()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EAttribute getMegalRelationshipType_RightMany();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.MegalRelationshipType#getLeftParams <em>Left Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left Params</em>'.
	 * @see org.softlang.megal.MegalRelationshipType#getLeftParams()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EReference getMegalRelationshipType_LeftParams();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.MegalRelationshipType#getRightParams <em>Right Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Params</em>'.
	 * @see org.softlang.megal.MegalRelationshipType#getRightParams()
	 * @see #getMegalRelationshipType()
	 * @generated
	 */
	EReference getMegalRelationshipType_RightParams();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.MegalEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.softlang.megal.MegalEntity
	 * @generated
	 */
	EClass getMegalEntity();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.MegalEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.softlang.megal.MegalEntity#getType()
	 * @see #getMegalEntity()
	 * @generated
	 */
	EReference getMegalEntity_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.MegalEntity#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see org.softlang.megal.MegalEntity#getParams()
	 * @see #getMegalEntity()
	 * @generated
	 */
	EReference getMegalEntity_Params();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.MegalEntity#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.softlang.megal.MegalEntity#isMany()
	 * @see #getMegalEntity()
	 * @generated
	 */
	EAttribute getMegalEntity_Many();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MegalFactory getMegalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalAnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalAnnotationImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalAnnotation()
		 * @generated
		 */
		EClass MEGAL_ANNOTATION = eINSTANCE.getMegalAnnotation();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_ANNOTATION__KEY = eINSTANCE.getMegalAnnotation_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_ANNOTATION__VALUE = eINSTANCE.getMegalAnnotation_Value();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.MegalElement <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.MegalElement
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalElement()
		 * @generated
		 */
		EClass MEGAL_ELEMENT = eINSTANCE.getMegalElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_ELEMENT__ANNOTATIONS = eINSTANCE.getMegalElement_Annotations();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalFileImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalFile()
		 * @generated
		 */
		EClass MEGAL_FILE = eINSTANCE.getMegalFile();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_FILE__DECLARATIONS = eINSTANCE.getMegalFile_Declarations();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_FILE__BINDINGS = eINSTANCE.getMegalFile_Bindings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_FILE__NAME = eINSTANCE.getMegalFile_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_FILE__IMPORTS = eINSTANCE.getMegalFile_Imports();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalLinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalLinkImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalLink()
		 * @generated
		 */
		EClass MEGAL_LINK = eINSTANCE.getMegalLink();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_LINK__LINK = eINSTANCE.getMegalLink_Link();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_LINK__TO = eINSTANCE.getMegalLink_To();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_LINK__FIRST = eINSTANCE.getMegalLink_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_LINK__SECOND = eINSTANCE.getMegalLink_Second();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalDeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalDeclarationImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalDeclaration()
		 * @generated
		 */
		EClass MEGAL_DECLARATION = eINSTANCE.getMegalDeclaration();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalRelationshipImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalRelationship()
		 * @generated
		 */
		EClass MEGAL_RELATIONSHIP = eINSTANCE.getMegalRelationship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP__TYPE = eINSTANCE.getMegalRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP__LEFT = eINSTANCE.getMegalRelationship_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP__RIGHT = eINSTANCE.getMegalRelationship_Right();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalPairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalPairImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalPair()
		 * @generated
		 */
		EClass MEGAL_PAIR = eINSTANCE.getMegalPair();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_PAIR__SET = eINSTANCE.getMegalPair_Set();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_PAIR__FIRST = eINSTANCE.getMegalPair_First();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_PAIR__SECOND = eINSTANCE.getMegalPair_Second();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalNamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalNamedImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalNamed()
		 * @generated
		 */
		EClass MEGAL_NAMED = eINSTANCE.getMegalNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_NAMED__NAME = eINSTANCE.getMegalNamed_Name();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalEntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalEntityTypeImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalEntityType()
		 * @generated
		 */
		EClass MEGAL_ENTITY_TYPE = eINSTANCE.getMegalEntityType();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_ENTITY_TYPE__SUPERTYPE = eINSTANCE.getMegalEntityType_Supertype();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalRelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalRelationshipTypeImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalRelationshipType()
		 * @generated
		 */
		EClass MEGAL_RELATIONSHIP_TYPE = eINSTANCE.getMegalRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP_TYPE__LEFT = eINSTANCE.getMegalRelationshipType_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP_TYPE__RIGHT = eINSTANCE.getMegalRelationshipType_Right();

		/**
		 * The meta object literal for the '<em><b>Left Both</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH = eINSTANCE.getMegalRelationshipType_LeftBoth();

		/**
		 * The meta object literal for the '<em><b>Right Both</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH = eINSTANCE.getMegalRelationshipType_RightBoth();

		/**
		 * The meta object literal for the '<em><b>Left Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_RELATIONSHIP_TYPE__LEFT_MANY = eINSTANCE.getMegalRelationshipType_LeftMany();

		/**
		 * The meta object literal for the '<em><b>Right Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY = eINSTANCE.getMegalRelationshipType_RightMany();

		/**
		 * The meta object literal for the '<em><b>Left Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS = eINSTANCE.getMegalRelationshipType_LeftParams();

		/**
		 * The meta object literal for the '<em><b>Right Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS = eINSTANCE.getMegalRelationshipType_RightParams();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.impl.MegalEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.impl.MegalEntityImpl
		 * @see org.softlang.megal.impl.MegalPackageImpl#getMegalEntity()
		 * @generated
		 */
		EClass MEGAL_ENTITY = eINSTANCE.getMegalEntity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_ENTITY__TYPE = eINSTANCE.getMegalEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAL_ENTITY__PARAMS = eINSTANCE.getMegalEntity_Params();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEGAL_ENTITY__MANY = eINSTANCE.getMegalEntity_Many();

	}

} //MegalPackage
