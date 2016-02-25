/**
 */
package org.softlang.megal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.softlang.megal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalFactoryImpl extends EFactoryImpl implements MegalFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MegalFactory init()
	{
		try
		{
			MegalFactory theMegalFactory = (MegalFactory)EPackage.Registry.INSTANCE.getEFactory(MegalPackage.eNS_URI);
			if (theMegalFactory != null)
			{
				return theMegalFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MegalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case MegalPackage.MEGAL_ANNOTATION: return createMegalAnnotation();
			case MegalPackage.MEGAL_FILE: return createMegalFile();
			case MegalPackage.MEGAL_LINK: return createMegalLink();
			case MegalPackage.MEGAL_RELATIONSHIP: return createMegalRelationship();
			case MegalPackage.MEGAL_PAIR: return createMegalPair();
			case MegalPackage.MEGAL_ENTITY_TYPE: return createMegalEntityType();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE: return createMegalRelationshipType();
			case MegalPackage.MEGAL_ENTITY: return createMegalEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalAnnotation createMegalAnnotation()
	{
		MegalAnnotationImpl megalAnnotation = new MegalAnnotationImpl();
		return megalAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalFile createMegalFile()
	{
		MegalFileImpl megalFile = new MegalFileImpl();
		return megalFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalLink createMegalLink()
	{
		MegalLinkImpl megalLink = new MegalLinkImpl();
		return megalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalRelationship createMegalRelationship()
	{
		MegalRelationshipImpl megalRelationship = new MegalRelationshipImpl();
		return megalRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalPair createMegalPair()
	{
		MegalPairImpl megalPair = new MegalPairImpl();
		return megalPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntityType createMegalEntityType()
	{
		MegalEntityTypeImpl megalEntityType = new MegalEntityTypeImpl();
		return megalEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalRelationshipType createMegalRelationshipType()
	{
		MegalRelationshipTypeImpl megalRelationshipType = new MegalRelationshipTypeImpl();
		return megalRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity createMegalEntity()
	{
		MegalEntityImpl megalEntity = new MegalEntityImpl();
		return megalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalPackage getMegalPackage()
	{
		return (MegalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MegalPackage getPackage()
	{
		return MegalPackage.eINSTANCE;
	}

} //MegalFactoryImpl
