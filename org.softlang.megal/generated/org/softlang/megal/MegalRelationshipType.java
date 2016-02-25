/**
 */
package org.softlang.megal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.MegalRelationshipType#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.MegalRelationshipType#getRight <em>Right</em>}</li>
 *   <li>{@link org.softlang.megal.MegalRelationshipType#isLeftBoth <em>Left Both</em>}</li>
 *   <li>{@link org.softlang.megal.MegalRelationshipType#isRightBoth <em>Right Both</em>}</li>
 *   <li>{@link org.softlang.megal.MegalRelationshipType#isLeftMany <em>Left Many</em>}</li>
 *   <li>{@link org.softlang.megal.MegalRelationshipType#isRightMany <em>Right Many</em>}</li>
 *   <li>{@link org.softlang.megal.MegalRelationshipType#getLeftParams <em>Left Params</em>}</li>
 *   <li>{@link org.softlang.megal.MegalRelationshipType#getRightParams <em>Right Params</em>}</li>
 * </ul>
 *
 * @see org.softlang.megal.MegalPackage#getMegalRelationshipType()
 * @model
 * @generated
 */
public interface MegalRelationshipType extends MegalNamed
{
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(MegalEntityType)
	 * @see org.softlang.megal.MegalPackage#getMegalRelationshipType_Left()
	 * @model required="true"
	 * @generated
	 */
	MegalEntityType getLeft();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalRelationshipType#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(MegalEntityType value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(MegalEntityType)
	 * @see org.softlang.megal.MegalPackage#getMegalRelationshipType_Right()
	 * @model required="true"
	 * @generated
	 */
	MegalEntityType getRight();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalRelationshipType#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(MegalEntityType value);

	/**
	 * Returns the value of the '<em><b>Left Both</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Both</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Both</em>' attribute.
	 * @see #setLeftBoth(boolean)
	 * @see org.softlang.megal.MegalPackage#getMegalRelationshipType_LeftBoth()
	 * @model
	 * @generated
	 */
	boolean isLeftBoth();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalRelationshipType#isLeftBoth <em>Left Both</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Both</em>' attribute.
	 * @see #isLeftBoth()
	 * @generated
	 */
	void setLeftBoth(boolean value);

	/**
	 * Returns the value of the '<em><b>Right Both</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Both</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Both</em>' attribute.
	 * @see #setRightBoth(boolean)
	 * @see org.softlang.megal.MegalPackage#getMegalRelationshipType_RightBoth()
	 * @model
	 * @generated
	 */
	boolean isRightBoth();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalRelationshipType#isRightBoth <em>Right Both</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Both</em>' attribute.
	 * @see #isRightBoth()
	 * @generated
	 */
	void setRightBoth(boolean value);

	/**
	 * Returns the value of the '<em><b>Left Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Many</em>' attribute.
	 * @see #setLeftMany(boolean)
	 * @see org.softlang.megal.MegalPackage#getMegalRelationshipType_LeftMany()
	 * @model
	 * @generated
	 */
	boolean isLeftMany();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalRelationshipType#isLeftMany <em>Left Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Many</em>' attribute.
	 * @see #isLeftMany()
	 * @generated
	 */
	void setLeftMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Right Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Many</em>' attribute.
	 * @see #setRightMany(boolean)
	 * @see org.softlang.megal.MegalPackage#getMegalRelationshipType_RightMany()
	 * @model
	 * @generated
	 */
	boolean isRightMany();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalRelationshipType#isRightMany <em>Right Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Many</em>' attribute.
	 * @see #isRightMany()
	 * @generated
	 */
	void setRightMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Left Params</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.MegalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Params</em>' reference list.
	 * @see org.softlang.megal.MegalPackage#getMegalRelationshipType_LeftParams()
	 * @model
	 * @generated
	 */
	EList<MegalEntity> getLeftParams();

	/**
	 * Returns the value of the '<em><b>Right Params</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.MegalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Params</em>' reference list.
	 * @see org.softlang.megal.MegalPackage#getMegalRelationshipType_RightParams()
	 * @model
	 * @generated
	 */
	EList<MegalEntity> getRightParams();

} // MegalRelationshipType
