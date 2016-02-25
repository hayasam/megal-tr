/**
 */
package org.softlang.megal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.softlang.megal.MegalEntity;
import org.softlang.megal.MegalEntityType;
import org.softlang.megal.MegalPackage;
import org.softlang.megal.MegalRelationshipType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipTypeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipTypeImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipTypeImpl#isLeftBoth <em>Left Both</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipTypeImpl#isRightBoth <em>Right Both</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipTypeImpl#isLeftMany <em>Left Many</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipTypeImpl#isRightMany <em>Right Many</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipTypeImpl#getLeftParams <em>Left Params</em>}</li>
 *   <li>{@link org.softlang.megal.impl.MegalRelationshipTypeImpl#getRightParams <em>Right Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MegalRelationshipTypeImpl extends MegalNamedImpl implements MegalRelationshipType
{
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected MegalEntityType left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected MegalEntityType right;

	/**
	 * The default value of the '{@link #isLeftBoth() <em>Left Both</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftBoth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEFT_BOTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeftBoth() <em>Left Both</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftBoth()
	 * @generated
	 * @ordered
	 */
	protected boolean leftBoth = LEFT_BOTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isRightBoth() <em>Right Both</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightBoth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RIGHT_BOTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRightBoth() <em>Right Both</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightBoth()
	 * @generated
	 * @ordered
	 */
	protected boolean rightBoth = RIGHT_BOTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isLeftMany() <em>Left Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEFT_MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeftMany() <em>Left Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftMany()
	 * @generated
	 * @ordered
	 */
	protected boolean leftMany = LEFT_MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRightMany() <em>Right Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RIGHT_MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRightMany() <em>Right Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightMany()
	 * @generated
	 * @ordered
	 */
	protected boolean rightMany = RIGHT_MANY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeftParams() <em>Left Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftParams()
	 * @generated
	 * @ordered
	 */
	protected EList<MegalEntity> leftParams;

	/**
	 * The cached value of the '{@link #getRightParams() <em>Right Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightParams()
	 * @generated
	 * @ordered
	 */
	protected EList<MegalEntity> rightParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MegalRelationshipTypeImpl()
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
		return MegalPackage.Literals.MEGAL_RELATIONSHIP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntityType getLeft()
	{
		if (left != null && left.eIsProxy())
		{
			InternalEObject oldLeft = (InternalEObject)left;
			left = (MegalEntityType)eResolveProxy(oldLeft);
			if (left != oldLeft)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntityType basicGetLeft()
	{
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(MegalEntityType newLeft)
	{
		MegalEntityType oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntityType getRight()
	{
		if (right != null && right.eIsProxy())
		{
			InternalEObject oldRight = (InternalEObject)right;
			right = (MegalEntityType)eResolveProxy(oldRight);
			if (right != oldRight)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalEntityType basicGetRight()
	{
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(MegalEntityType newRight)
	{
		MegalEntityType oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeftBoth()
	{
		return leftBoth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftBoth(boolean newLeftBoth)
	{
		boolean oldLeftBoth = leftBoth;
		leftBoth = newLeftBoth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH, oldLeftBoth, leftBoth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRightBoth()
	{
		return rightBoth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightBoth(boolean newRightBoth)
	{
		boolean oldRightBoth = rightBoth;
		rightBoth = newRightBoth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH, oldRightBoth, rightBoth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeftMany()
	{
		return leftMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftMany(boolean newLeftMany)
	{
		boolean oldLeftMany = leftMany;
		leftMany = newLeftMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_MANY, oldLeftMany, leftMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRightMany()
	{
		return rightMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightMany(boolean newRightMany)
	{
		boolean oldRightMany = rightMany;
		rightMany = newRightMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY, oldRightMany, rightMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MegalEntity> getLeftParams()
	{
		if (leftParams == null)
		{
			leftParams = new EObjectResolvingEList<MegalEntity>(MegalEntity.class, this, MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS);
		}
		return leftParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MegalEntity> getRightParams()
	{
		if (rightParams == null)
		{
			rightParams = new EObjectResolvingEList<MegalEntity>(MegalEntity.class, this, MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS);
		}
		return rightParams;
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
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH:
				return isLeftBoth();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH:
				return isRightBoth();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_MANY:
				return isLeftMany();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY:
				return isRightMany();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS:
				return getLeftParams();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS:
				return getRightParams();
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
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT:
				setLeft((MegalEntityType)newValue);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT:
				setRight((MegalEntityType)newValue);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH:
				setLeftBoth((Boolean)newValue);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH:
				setRightBoth((Boolean)newValue);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_MANY:
				setLeftMany((Boolean)newValue);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY:
				setRightMany((Boolean)newValue);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS:
				getLeftParams().clear();
				getLeftParams().addAll((Collection<? extends MegalEntity>)newValue);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS:
				getRightParams().clear();
				getRightParams().addAll((Collection<? extends MegalEntity>)newValue);
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
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT:
				setLeft((MegalEntityType)null);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT:
				setRight((MegalEntityType)null);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH:
				setLeftBoth(LEFT_BOTH_EDEFAULT);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH:
				setRightBoth(RIGHT_BOTH_EDEFAULT);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_MANY:
				setLeftMany(LEFT_MANY_EDEFAULT);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY:
				setRightMany(RIGHT_MANY_EDEFAULT);
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS:
				getLeftParams().clear();
				return;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS:
				getRightParams().clear();
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
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT:
				return left != null;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT:
				return right != null;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_BOTH:
				return leftBoth != LEFT_BOTH_EDEFAULT;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_BOTH:
				return rightBoth != RIGHT_BOTH_EDEFAULT;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_MANY:
				return leftMany != LEFT_MANY_EDEFAULT;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_MANY:
				return rightMany != RIGHT_MANY_EDEFAULT;
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__LEFT_PARAMS:
				return leftParams != null && !leftParams.isEmpty();
			case MegalPackage.MEGAL_RELATIONSHIP_TYPE__RIGHT_PARAMS:
				return rightParams != null && !rightParams.isEmpty();
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
		result.append(" (leftBoth: ");
		result.append(leftBoth);
		result.append(", rightBoth: ");
		result.append(rightBoth);
		result.append(", leftMany: ");
		result.append(leftMany);
		result.append(", rightMany: ");
		result.append(rightMany);
		result.append(')');
		return result.toString();
	}

} //MegalRelationshipTypeImpl
