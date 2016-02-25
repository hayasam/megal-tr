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
import org.eclipse.emf.ecore.util.InternalEList;

import org.softlang.megal.MegalAnnotation;
import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalLink;
import org.softlang.megal.MegalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.impl.MegalLinkImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalLinkImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalLinkImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalLinkImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalLinkImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MegalLinkImpl extends MinimalEObjectImpl.Container implements MegalLink
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
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected MegalEntity link;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected MegalEntity first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected MegalEntity second;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MegalLinkImpl()
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
		return MegalPackage.Literals.MEGAL_LINK;
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
			annotations = new EObjectContainmentEList<MegalAnnotation>(MegalAnnotation.class, this, MegalPackage.MEGAL_LINK__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity getLink()
	{
		if (link != null && link.eIsProxy())
		{
			InternalEObject oldLink = (InternalEObject)link;
			link = (MegalEntity)eResolveProxy(oldLink);
			if (link != oldLink)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_LINK__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity basicGetLink()
	{
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(MegalEntity newLink)
	{
		MegalEntity oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_LINK__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo()
	{
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo)
	{
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_LINK__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity getFirst()
	{
		if (first != null && first.eIsProxy())
		{
			InternalEObject oldFirst = (InternalEObject)first;
			first = (MegalEntity)eResolveProxy(oldFirst);
			if (first != oldFirst)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_LINK__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity basicGetFirst()
	{
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(MegalEntity newFirst)
	{
		MegalEntity oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_LINK__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity getSecond()
	{
		if (second != null && second.eIsProxy())
		{
			InternalEObject oldSecond = (InternalEObject)second;
			second = (MegalEntity)eResolveProxy(oldSecond);
			if (second != oldSecond)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_LINK__SECOND, oldSecond, second));
			}
		}
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity basicGetSecond()
	{
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(MegalEntity newSecond)
	{
		MegalEntity oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_LINK__SECOND, oldSecond, second));
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
			case MegalPackage.MEGAL_LINK__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case MegalPackage.MEGAL_LINK__ANNOTATIONS:
				return getAnnotations();
			case MegalPackage.MEGAL_LINK__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case MegalPackage.MEGAL_LINK__TO:
				return getTo();
			case MegalPackage.MEGAL_LINK__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case MegalPackage.MEGAL_LINK__SECOND:
				if (resolve) return getSecond();
				return basicGetSecond();
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
			case MegalPackage.MEGAL_LINK__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends MegalAnnotation>)newValue);
				return;
			case MegalPackage.MEGAL_LINK__LINK:
				setLink((MegalEntity)newValue);
				return;
			case MegalPackage.MEGAL_LINK__TO:
				setTo((String)newValue);
				return;
			case MegalPackage.MEGAL_LINK__FIRST:
				setFirst((MegalEntity)newValue);
				return;
			case MegalPackage.MEGAL_LINK__SECOND:
				setSecond((MegalEntity)newValue);
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
			case MegalPackage.MEGAL_LINK__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case MegalPackage.MEGAL_LINK__LINK:
				setLink((MegalEntity)null);
				return;
			case MegalPackage.MEGAL_LINK__TO:
				setTo(TO_EDEFAULT);
				return;
			case MegalPackage.MEGAL_LINK__FIRST:
				setFirst((MegalEntity)null);
				return;
			case MegalPackage.MEGAL_LINK__SECOND:
				setSecond((MegalEntity)null);
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
			case MegalPackage.MEGAL_LINK__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case MegalPackage.MEGAL_LINK__LINK:
				return link != null;
			case MegalPackage.MEGAL_LINK__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case MegalPackage.MEGAL_LINK__FIRST:
				return first != null;
			case MegalPackage.MEGAL_LINK__SECOND:
				return second != null;
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
		result.append(" (to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //MegalLinkImpl
