/**
 */
package org.softlang.megal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.softlang.megal.MegalAnnotation;
import org.softlang.megal.MegalDeclaration;
import org.softlang.megal.MegalFile;
import org.softlang.megal.MegalLink;
import org.softlang.megal.MegalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.impl.MegalFileImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalFileImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalFileImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalFileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalFileImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MegalFileImpl extends MinimalEObjectImpl.Container implements MegalFile
{
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<MegalAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<MegalDeclaration> declarations;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<MegalLink> bindings;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<MegalFile> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MegalFileImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return MegalPackage.Literals.MEGAL_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MegalAnnotation> getAnnotations()
	{
		if (annotations == null)
		{
			annotations = new EObjectContainmentEList<MegalAnnotation>(MegalAnnotation.class, this, MegalPackage.MEGAL_FILE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MegalDeclaration> getDeclarations()
	{
		if (declarations == null)
		{
			declarations = new EObjectContainmentEList<MegalDeclaration>(MegalDeclaration.class, this, MegalPackage.MEGAL_FILE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MegalLink> getBindings()
	{
		if (bindings == null)
		{
			bindings = new EObjectContainmentEList<MegalLink>(MegalLink.class, this, MegalPackage.MEGAL_FILE__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_FILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MegalFile> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectResolvingEList<MegalFile>(MegalFile.class, this, MegalPackage.MEGAL_FILE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case MegalPackage.MEGAL_FILE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case MegalPackage.MEGAL_FILE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case MegalPackage.MEGAL_FILE__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case MegalPackage.MEGAL_FILE__ANNOTATIONS:
				return getAnnotations();
			case MegalPackage.MEGAL_FILE__DECLARATIONS:
				return getDeclarations();
			case MegalPackage.MEGAL_FILE__BINDINGS:
				return getBindings();
			case MegalPackage.MEGAL_FILE__NAME:
				return getName();
			case MegalPackage.MEGAL_FILE__IMPORTS:
				return getImports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MegalPackage.MEGAL_FILE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends MegalAnnotation>)newValue);
				return;
			case MegalPackage.MEGAL_FILE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends MegalDeclaration>)newValue);
				return;
			case MegalPackage.MEGAL_FILE__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends MegalLink>)newValue);
				return;
			case MegalPackage.MEGAL_FILE__NAME:
				setName((String)newValue);
				return;
			case MegalPackage.MEGAL_FILE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends MegalFile>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case MegalPackage.MEGAL_FILE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case MegalPackage.MEGAL_FILE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case MegalPackage.MEGAL_FILE__BINDINGS:
				getBindings().clear();
				return;
			case MegalPackage.MEGAL_FILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MegalPackage.MEGAL_FILE__IMPORTS:
				getImports().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case MegalPackage.MEGAL_FILE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case MegalPackage.MEGAL_FILE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case MegalPackage.MEGAL_FILE__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case MegalPackage.MEGAL_FILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MegalPackage.MEGAL_FILE__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MegalFileImpl
