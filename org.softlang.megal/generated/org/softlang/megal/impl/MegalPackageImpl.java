/**
 */
package org.softlang.megal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.softlang.megal.MegalAnnotation;
import org.softlang.megal.MegalDeclaration;
import org.softlang.megal.MegalElement;
import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalEntityType;
import org.softlang.megal.MegalFactory;
import org.softlang.megal.MegalFile;
import org.softlang.megal.MegalLink;
import org.softlang.megal.MegalNamed;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.MegalPair;
import org.softlang.megal.MegalRelationship;
import org.softlang.megal.MegalRelationshipType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalPackageImpl extends EPackageImpl implements MegalPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalNamedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megalEntityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.softlang.megal.MegalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MegalPackageImpl()
	{
		super(eNS_URI, MegalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MegalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MegalPackage init()
	{
		if (isInited) return (MegalPackage)EPackage.Registry.INSTANCE.getEPackage(MegalPackage.eNS_URI);

		// Obtain or create and register package
		MegalPackageImpl theMegalPackage = (MegalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MegalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MegalPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMegalPackage.createPackageContents();

		// Initialize created meta-data
		theMegalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMegalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MegalPackage.eNS_URI, theMegalPackage);
		return theMegalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalAnnotation()
	{
		return megalAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalAnnotation_Key()
	{
		return (EAttribute)megalAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalAnnotation_Value()
	{
		return (EAttribute)megalAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalElement()
	{
		return megalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalElement_Annotations()
	{
		return (EReference)megalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalFile()
	{
		return megalFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalFile_Declarations()
	{
		return (EReference)megalFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalFile_Bindings()
	{
		return (EReference)megalFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalFile_Name()
	{
		return (EAttribute)megalFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalFile_Imports()
	{
		return (EReference)megalFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalLink()
	{
		return megalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalLink_Link()
	{
		return (EReference)megalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalLink_To()
	{
		return (EAttribute)megalLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalLink_First()
	{
		return (EReference)megalLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalLink_Second()
	{
		return (EReference)megalLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalDeclaration()
	{
		return megalDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalRelationship()
	{
		return megalRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalRelationship_Type()
	{
		return (EReference)megalRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalRelationship_Left()
	{
		return (EReference)megalRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalRelationship_Right()
	{
		return (EReference)megalRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalPair()
	{
		return megalPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalPair_Set()
	{
		return (EReference)megalPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalPair_First()
	{
		return (EReference)megalPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalPair_Second()
	{
		return (EReference)megalPairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalNamed()
	{
		return megalNamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalNamed_Name()
	{
		return (EAttribute)megalNamedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalEntityType()
	{
		return megalEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalEntityType_Supertype()
	{
		return (EReference)megalEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalRelationshipType()
	{
		return megalRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalRelationshipType_Left()
	{
		return (EReference)megalRelationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalRelationshipType_Right()
	{
		return (EReference)megalRelationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalRelationshipType_LeftBoth()
	{
		return (EAttribute)megalRelationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalRelationshipType_RightBoth()
	{
		return (EAttribute)megalRelationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalRelationshipType_LeftMany()
	{
		return (EAttribute)megalRelationshipTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalRelationshipType_RightMany()
	{
		return (EAttribute)megalRelationshipTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalRelationshipType_LeftParams()
	{
		return (EReference)megalRelationshipTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalRelationshipType_RightParams()
	{
		return (EReference)megalRelationshipTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegalEntity()
	{
		return megalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalEntity_Type()
	{
		return (EReference)megalEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegalEntity_Params()
	{
		return (EReference)megalEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMegalEntity_Many()
	{
		return (EAttribute)megalEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalFactory getMegalFactory()
	{
		return (MegalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		megalAnnotationEClass = createEClass(MEGAL_ANNOTATION);
		createEAttribute(megalAnnotationEClass, MEGAL_ANNOTATION__KEY);
		createEAttribute(megalAnnotationEClass, MEGAL_ANNOTATION__VALUE);

		megalElementEClass = createEClass(MEGAL_ELEMENT);
		createEReference(megalElementEClass, MEGAL_ELEMENT__ANNOTATIONS);

		megalFileEClass = createEClass(MEGAL_FILE);
		createEReference(megalFileEClass, MEGAL_FILE__DECLARATIONS);
		createEReference(megalFileEClass, MEGAL_FILE__BINDINGS);
		createEAttribute(megalFileEClass, MEGAL_FILE__NAME);
		createEReference(megalFileEClass, MEGAL_FILE__IMPORTS);

		megalLinkEClass = createEClass(MEGAL_LINK);
		createEReference(megalLinkEClass, MEGAL_LINK__LINK);
		createEAttribute(megalLinkEClass, MEGAL_LINK__TO);
		createEReference(megalLinkEClass, MEGAL_LINK__FIRST);
		createEReference(megalLinkEClass, MEGAL_LINK__SECOND);

		megalDeclarationEClass = createEClass(MEGAL_DECLARATION);

		megalRelationshipEClass = createEClass(MEGAL_RELATIONSHIP);
		createEReference(megalRelationshipEClass, MEGAL_RELATIONSHIP__TYPE);
		createEReference(megalRelationshipEClass, MEGAL_RELATIONSHIP__LEFT);
		createEReference(megalRelationshipEClass, MEGAL_RELATIONSHIP__RIGHT);

		megalPairEClass = createEClass(MEGAL_PAIR);
		createEReference(megalPairEClass, MEGAL_PAIR__SET);
		createEReference(megalPairEClass, MEGAL_PAIR__FIRST);
		createEReference(megalPairEClass, MEGAL_PAIR__SECOND);

		megalNamedEClass = createEClass(MEGAL_NAMED);
		createEAttribute(megalNamedEClass, MEGAL_NAMED__NAME);

		megalEntityTypeEClass = createEClass(MEGAL_ENTITY_TYPE);
		createEReference(megalEntityTypeEClass, MEGAL_ENTITY_TYPE__SUPERTYPE);

		megalRelationshipTypeEClass = createEClass(MEGAL_RELATIONSHIP_TYPE);
		createEReference(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__LEFT);
		createEReference(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__RIGHT);
		createEAttribute(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH);
		createEAttribute(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH);
		createEAttribute(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__LEFT_MANY);
		createEAttribute(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY);
		createEReference(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS);
		createEReference(megalRelationshipTypeEClass, MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS);

		megalEntityEClass = createEClass(MEGAL_ENTITY);
		createEReference(megalEntityEClass, MEGAL_ENTITY__TYPE);
		createEReference(megalEntityEClass, MEGAL_ENTITY__PARAMS);
		createEAttribute(megalEntityEClass, MEGAL_ENTITY__MANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		megalFileEClass.getESuperTypes().add(this.getMegalElement());
		megalLinkEClass.getESuperTypes().add(this.getMegalElement());
		megalDeclarationEClass.getESuperTypes().add(this.getMegalElement());
		megalRelationshipEClass.getESuperTypes().add(this.getMegalDeclaration());
		megalPairEClass.getESuperTypes().add(this.getMegalDeclaration());
		megalNamedEClass.getESuperTypes().add(this.getMegalDeclaration());
		megalEntityTypeEClass.getESuperTypes().add(this.getMegalNamed());
		megalRelationshipTypeEClass.getESuperTypes().add(this.getMegalNamed());
		megalEntityEClass.getESuperTypes().add(this.getMegalNamed());

		// Initialize classes, features, and operations; add parameters
		initEClass(megalAnnotationEClass, MegalAnnotation.class, "MegalAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMegalAnnotation_Key(), ecorePackage.getEString(), "key", null, 0, 1, MegalAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, MegalAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalElementEClass, MegalElement.class, "MegalElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalElement_Annotations(), this.getMegalAnnotation(), null, "annotations", null, 0, -1, MegalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalFileEClass, MegalFile.class, "MegalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalFile_Declarations(), this.getMegalDeclaration(), null, "declarations", null, 0, -1, MegalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalFile_Bindings(), this.getMegalLink(), null, "bindings", null, 0, -1, MegalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalFile_Name(), ecorePackage.getEString(), "name", null, 1, 1, MegalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalFile_Imports(), this.getMegalFile(), null, "imports", null, 0, -1, MegalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalLinkEClass, MegalLink.class, "MegalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalLink_Link(), this.getMegalEntity(), null, "link", null, 1, 1, MegalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalLink_To(), ecorePackage.getEString(), "to", null, 1, 1, MegalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalLink_First(), this.getMegalEntity(), null, "first", null, 0, 1, MegalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalLink_Second(), this.getMegalEntity(), null, "second", null, 0, 1, MegalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalDeclarationEClass, MegalDeclaration.class, "MegalDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(megalRelationshipEClass, MegalRelationship.class, "MegalRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalRelationship_Type(), this.getMegalRelationshipType(), null, "type", null, 1, 1, MegalRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationship_Left(), this.getMegalEntity(), null, "left", null, 1, 1, MegalRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationship_Right(), this.getMegalEntity(), null, "right", null, 1, 1, MegalRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalPairEClass, MegalPair.class, "MegalPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalPair_Set(), this.getMegalEntity(), null, "set", null, 1, 1, MegalPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalPair_First(), this.getMegalEntity(), null, "first", null, 1, 1, MegalPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalPair_Second(), this.getMegalEntity(), null, "second", null, 1, 1, MegalPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalNamedEClass, MegalNamed.class, "MegalNamed", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMegalNamed_Name(), ecorePackage.getEString(), "name", null, 1, 1, MegalNamed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalEntityTypeEClass, MegalEntityType.class, "MegalEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalEntityType_Supertype(), this.getMegalEntityType(), null, "supertype", null, 0, 1, MegalEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalRelationshipTypeEClass, MegalRelationshipType.class, "MegalRelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalRelationshipType_Left(), this.getMegalEntityType(), null, "left", null, 1, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationshipType_Right(), this.getMegalEntityType(), null, "right", null, 1, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalRelationshipType_LeftBoth(), ecorePackage.getEBoolean(), "leftBoth", null, 0, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalRelationshipType_RightBoth(), ecorePackage.getEBoolean(), "rightBoth", null, 0, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalRelationshipType_LeftMany(), ecorePackage.getEBoolean(), "leftMany", null, 0, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalRelationshipType_RightMany(), ecorePackage.getEBoolean(), "rightMany", null, 0, 1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationshipType_LeftParams(), this.getMegalEntity(), null, "leftParams", null, 0, -1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalRelationshipType_RightParams(), this.getMegalEntity(), null, "rightParams", null, 0, -1, MegalRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(megalEntityEClass, MegalEntity.class, "MegalEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegalEntity_Type(), this.getMegalEntityType(), null, "type", null, 1, 1, MegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegalEntity_Params(), this.getMegalEntity(), null, "params", null, 0, -1, MegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMegalEntity_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, MegalEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MegalPackageImpl
