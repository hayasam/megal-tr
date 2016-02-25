/**
 */
package org.softlang.megal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.MegalLink#getLink <em>Link</em>}</li>
 *   <li>{@link org.softlang.megal.MegalLink#getTo <em>To</em>}</li>
 *   <li>{@link org.softlang.megal.MegalLink#getFirst <em>First</em>}</li>
 *   <li>{@link org.softlang.megal.MegalLink#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see org.softlang.megal.MegalPackage#getMegalLink()
 * @model
 * @generated
 */
public interface MegalLink extends MegalElement
{
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(MegalEntity)
	 * @see org.softlang.megal.MegalPackage#getMegalLink_Link()
	 * @model required="true"
	 * @generated
	 */
	MegalEntity getLink();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalLink#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(MegalEntity value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see org.softlang.megal.MegalPackage#getMegalLink_To()
	 * @model required="true"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalLink#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(MegalEntity)
	 * @see org.softlang.megal.MegalPackage#getMegalLink_First()
	 * @model
	 * @generated
	 */
	MegalEntity getFirst();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalLink#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(MegalEntity value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(MegalEntity)
	 * @see org.softlang.megal.MegalPackage#getMegalLink_Second()
	 * @model
	 * @generated
	 */
	MegalEntity getSecond();

	/**
	 * Sets the value of the '{@link org.softlang.megal.MegalLink#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(MegalEntity value);

} // MegalLink
