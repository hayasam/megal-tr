/**
 */
package org.softlang.megal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.MegalElement#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.softlang.megal.MegalPackage#getMegalElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MegalElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.MegalAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.softlang.megal.MegalPackage#getMegalElement_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MegalAnnotation> getAnnotations();

} // MegalElement
