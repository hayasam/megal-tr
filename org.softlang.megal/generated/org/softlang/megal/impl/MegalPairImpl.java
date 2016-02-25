/**
 */
package org.softlang.megal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.MegalPair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.impl.MegalPairImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalPairImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalPairImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MegalPairImpl extends MegalDeclarationImpl implements MegalPair
{
	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected MegalEntity set;

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
	protected MegalPairImpl()
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
		return MegalPackage.Literals.MEGAL_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity getSet()
	{
		if (set != null && set.eIsProxy())
		{
			InternalEObject oldSet = (InternalEObject)set;
			set = (MegalEntity)eResolveProxy(oldSet);
			if (set != oldSet)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_PAIR__SET, oldSet, set));
			}
		}
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity basicGetSet()
	{
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(MegalEntity newSet)
	{
		MegalEntity oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_PAIR__SET, oldSet, set));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_PAIR__FIRST, oldFirst, first));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_PAIR__FIRST, oldFirst, first));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_PAIR__SECOND, oldSecond, second));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_PAIR__SECOND, oldSecond, second));
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
			case MegalPackage.MEGAL_PAIR__SET:
				if (resolve) return getSet();
				return basicGetSet();
			case MegalPackage.MEGAL_PAIR__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case MegalPackage.MEGAL_PAIR__SECOND:
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
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MegalPackage.MEGAL_PAIR__SET:
				setSet((MegalEntity)newValue);
				return;
			case MegalPackage.MEGAL_PAIR__FIRST:
				setFirst((MegalEntity)newValue);
				return;
			case MegalPackage.MEGAL_PAIR__SECOND:
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
			case MegalPackage.MEGAL_PAIR__SET:
				setSet((MegalEntity)null);
				return;
			case MegalPackage.MEGAL_PAIR__FIRST:
				setFirst((MegalEntity)null);
				return;
			case MegalPackage.MEGAL_PAIR__SECOND:
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
			case MegalPackage.MEGAL_PAIR__SET:
				return set != null;
			case MegalPackage.MEGAL_PAIR__FIRST:
				return first != null;
			case MegalPackage.MEGAL_PAIR__SECOND:
				return second != null;
		}
		return super.eIsSet(featureID);
	}

} //MegalPairImpl
