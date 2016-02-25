/**
 */
package org.softlang.megal.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.softlang.megal.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.softlang.megal.MegalPackage
 * @generated
 */
public class MegalSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MegalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = MegalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case MegalPackage.MEGAL_ANNOTATION:
			{
				MegalAnnotation megalAnnotation = (MegalAnnotation)theEObject;
				T result = caseMegalAnnotation(megalAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_ELEMENT:
			{
				MegalElement megalElement = (MegalElement)theEObject;
				T result = caseMegalElement(megalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_FILE:
			{
				MegalFile megalFile = (MegalFile)theEObject;
				T result = caseMegalFile(megalFile);
				if (result == null) result = caseMegalElement(megalFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_LINK:
			{
				MegalLink megalLink = (MegalLink)theEObject;
				T result = caseMegalLink(megalLink);
				if (result == null) result = caseMegalElement(megalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_DECLARATION:
			{
				MegalDeclaration megalDeclaration = (MegalDeclaration)theEObject;
				T result = caseMegalDeclaration(megalDeclaration);
				if (result == null) result = caseMegalElement(megalDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_RELATIONSHIP:
			{
				MegalRelationship megalRelationship = (MegalRelationship)theEObject;
				T result = caseMegalRelationship(megalRelationship);
				if (result == null) result = caseMegalDeclaration(megalRelationship);
				if (result == null) result = caseMegalElement(megalRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_PAIR:
			{
				MegalPair megalPair = (MegalPair)theEObject;
				T result = caseMegalPair(megalPair);
				if (result == null) result = caseMegalDeclaration(megalPair);
				if (result == null) result = caseMegalElement(megalPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_NAMED:
			{
				MegalNamed megalNamed = (MegalNamed)theEObject;
				T result = caseMegalNamed(megalNamed);
				if (result == null) result = caseMegalDeclaration(megalNamed);
				if (result == null) result = caseMegalElement(megalNamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_ENTITY_TYPE:
			{
				MegalEntityType megalEntityType = (MegalEntityType)theEObject;
				T result = caseMegalEntityType(megalEntityType);
				if (result == null) result = caseMegalNamed(megalEntityType);
				if (result == null) result = caseMegalDeclaration(megalEntityType);
				if (result == null) result = caseMegalElement(megalEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE:
			{
				MegalRelationshipType megalRelationshipType = (MegalRelationshipType)theEObject;
				T result = caseMegalRelationshipType(megalRelationshipType);
				if (result == null) result = caseMegalNamed(megalRelationshipType);
				if (result == null) result = caseMegalDeclaration(megalRelationshipType);
				if (result == null) result = caseMegalElement(megalRelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.MEGAL_ENTITY:
			{
				MegalEntity megalEntity = (MegalEntity)theEObject;
				T result = caseMegalEntity(megalEntity);
				if (result == null) result = caseMegalNamed(megalEntity);
				if (result == null) result = caseMegalDeclaration(megalEntity);
				if (result == null) result = caseMegalElement(megalEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalAnnotation(MegalAnnotation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalElement(MegalElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalFile(MegalFile object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalLink(MegalLink object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalDeclaration(MegalDeclaration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalRelationship(MegalRelationship object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalPair(MegalPair object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalNamed(MegalNamed object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalEntityType(MegalEntityType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalRelationshipType(MegalRelationshipType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegalEntity(MegalEntity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //MegalSwitch
