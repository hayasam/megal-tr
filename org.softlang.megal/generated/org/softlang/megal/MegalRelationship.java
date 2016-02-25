/**
 */
package org.softlang.megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.MegalRelationship#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.MegalRelationship#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.MegalRelationship#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.softlang.megal.MegalPackage#getMegalRelationship()
 * @model
 * @generated
 */
public interface MegalRelationship extends MegalDeclaration
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MegalRelationshipType)
	 * @see org.softlang.megal.MegalPackage#getMegalRelationship_Type()
	 * @model required="true"
	 * @generated
	 */
	MegalRelationshipType getType();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalRelationship#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MegalRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(MegalEntity)
	 * @see org.softlang.megal.MegalPackage#getMegalRelationship_Left()
	 * @model required="true"
	 * @generated
	 */
	MegalEntity getLeft();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalRelationship#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(MegalEntity value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(MegalEntity)
	 * @see org.softlang.megal.MegalPackage#getMegalRelationship_Right()
	 * @model required="true"
	 * @generated
	 */
	MegalEntity getRight();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalRelationship#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(MegalEntity value);

} // MegalRelationship
