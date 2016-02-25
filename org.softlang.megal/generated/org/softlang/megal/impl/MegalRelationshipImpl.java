/**
 */
package org.softlang.megal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.MegalRelationship;
import org.softlang.megal.MegalRelationshipType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MegalRelationshipImpl extends MegalDeclarationImpl implements MegalRelationship
{
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MegalRelationshipType type;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected MegalEntity left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected MegalEntity right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MegalRelationshipImpl()
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
		return MegalPackage.Literals.MEGAL_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalRelationshipType getType()
	{
		if (type != null && type.eIsProxy())
		{
			InternalEObject oldType = (InternalEObject)type;
			type = (MegalRelationshipType)eResolveProxy(oldType);
			if (type != oldType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_RELATIONSHIP__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalRelationshipType basicGetType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MegalRelationshipType newType)
	{
		MegalRelationshipType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_RELATIONSHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity getLeft()
	{
		if (left != null && left.eIsProxy())
		{
			InternalEObject oldLeft = (InternalEObject)left;
			left = (MegalEntity)eResolveProxy(oldLeft);
			if (left != oldLeft)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_RELATIONSHIP__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity basicGetLeft()
	{
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(MegalEntity newLeft)
	{
		MegalEntity oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_RELATIONSHIP__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity getRight()
	{
		if (right != null && right.eIsProxy())
		{
			InternalEObject oldRight = (InternalEObject)right;
			right = (MegalEntity)eResolveProxy(oldRight);
			if (right != oldRight)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_RELATIONSHIP__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntity basicGetRight()
	{
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(MegalEntity newRight)
	{
		MegalEntity oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_RELATIONSHIP__RIGHT, oldRight, right));
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
			case MegalPackage.MEGAL_RELATIONSHIP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MegalPackage.MEGAL_RELATIONSHIP__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case MegalPackage.MEGAL_RELATIONSHIP__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
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
			case MegalPackage.MEGAL_RELATIONSHIP__TYPE:
				setType((MegalRelationshipType)newValue);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP__LEFT:
				setLeft((MegalEntity)newValue);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP__RIGHT:
				setRight((MegalEntity)newValue);
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
			case MegalPackage.MEGAL_RELATIONSHIP__TYPE:
				setType((MegalRelationshipType)null);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP__LEFT:
				setLeft((MegalEntity)null);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP__RIGHT:
				setRight((MegalEntity)null);
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
			case MegalPackage.MEGAL_RELATIONSHIP__TYPE:
				return type != null;
			case MegalPackage.MEGAL_RELATIONSHIP__LEFT:
				return left != null;
			case MegalPackage.MEGAL_RELATIONSHIP__RIGHT:
				return right != null;
		}
		return super.eIsSet(featureID);
	}

} //MegalRelationshipImpl
