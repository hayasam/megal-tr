/**
 */
package org.softlang.megal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.MegalEntity#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.MegalEntity#getParams <em>Params</em>}</li>
 *   <li>{@link org.softlang.megal.MegalEntity#isMany <em>Many</em>}</li>
 * </ul>
 *
 * @see org.softlang.megal.MegalPackage#getMegalEntity()
 * @model
 * @generated
 */
public interface MegalEntity extends MegalNamed
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
	 * @see #setType(MegalEntityType)
	 * @see org.softlang.megal.MegalPackage#getMegalEntity_Type()
	 * @model required="true"
	 * @generated
	 */
	MegalEntityType getType();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalEntity#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MegalEntityType value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.MegalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' reference list.
	 * @see org.softlang.megal.MegalPackage#getMegalEntity_Params()
	 * @model
	 * @generated
	 */
	EList<MegalEntity> getParams();

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see org.softlang.megal.MegalPackage#getMegalEntity_Many()
	 * @model
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalEntity#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

} // MegalEntity
