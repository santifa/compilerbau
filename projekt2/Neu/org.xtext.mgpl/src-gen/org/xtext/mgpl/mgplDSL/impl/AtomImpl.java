/**
 */
package org.xtext.mgpl.mgplDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.mgpl.mgplDSL.Atom;
import org.xtext.mgpl.mgplDSL.MgplDSLPackage;
import org.xtext.mgpl.mgplDSL.VARI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.AtomImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.AtomImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.AtomImpl#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.AtomImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomImpl extends MinimalEObjectImpl.Container implements Atom
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar1() <em>Var1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected VARI var1;

  /**
   * The cached value of the '{@link #getVar2() <em>Var2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected VARI var2;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected VARI expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomImpl()
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
    return MgplDSLPackage.Literals.ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.ATOM__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARI getVar1()
  {
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar1(VARI newVar1, NotificationChain msgs)
  {
    VARI oldVar1 = var1;
    var1 = newVar1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.ATOM__VAR1, oldVar1, newVar1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar1(VARI newVar1)
  {
    if (newVar1 != var1)
    {
      NotificationChain msgs = null;
      if (var1 != null)
        msgs = ((InternalEObject)var1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.ATOM__VAR1, null, msgs);
      if (newVar1 != null)
        msgs = ((InternalEObject)newVar1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.ATOM__VAR1, null, msgs);
      msgs = basicSetVar1(newVar1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.ATOM__VAR1, newVar1, newVar1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARI getVar2()
  {
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar2(VARI newVar2, NotificationChain msgs)
  {
    VARI oldVar2 = var2;
    var2 = newVar2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.ATOM__VAR2, oldVar2, newVar2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar2(VARI newVar2)
  {
    if (newVar2 != var2)
    {
      NotificationChain msgs = null;
      if (var2 != null)
        msgs = ((InternalEObject)var2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.ATOM__VAR2, null, msgs);
      if (newVar2 != null)
        msgs = ((InternalEObject)newVar2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.ATOM__VAR2, null, msgs);
      msgs = basicSetVar2(newVar2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.ATOM__VAR2, newVar2, newVar2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARI getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(VARI newExpr, NotificationChain msgs)
  {
    VARI oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.ATOM__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(VARI newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.ATOM__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.ATOM__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.ATOM__EXPR, newExpr, newExpr));
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
      case MgplDSLPackage.ATOM__VAR1:
        return basicSetVar1(null, msgs);
      case MgplDSLPackage.ATOM__VAR2:
        return basicSetVar2(null, msgs);
      case MgplDSLPackage.ATOM__EXPR:
        return basicSetExpr(null, msgs);
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
      case MgplDSLPackage.ATOM__VALUE:
        return getValue();
      case MgplDSLPackage.ATOM__VAR1:
        return getVar1();
      case MgplDSLPackage.ATOM__VAR2:
        return getVar2();
      case MgplDSLPackage.ATOM__EXPR:
        return getExpr();
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
      case MgplDSLPackage.ATOM__VALUE:
        setValue((Integer)newValue);
        return;
      case MgplDSLPackage.ATOM__VAR1:
        setVar1((VARI)newValue);
        return;
      case MgplDSLPackage.ATOM__VAR2:
        setVar2((VARI)newValue);
        return;
      case MgplDSLPackage.ATOM__EXPR:
        setExpr((VARI)newValue);
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
      case MgplDSLPackage.ATOM__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MgplDSLPackage.ATOM__VAR1:
        setVar1((VARI)null);
        return;
      case MgplDSLPackage.ATOM__VAR2:
        setVar2((VARI)null);
        return;
      case MgplDSLPackage.ATOM__EXPR:
        setExpr((VARI)null);
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
      case MgplDSLPackage.ATOM__VALUE:
        return value != VALUE_EDEFAULT;
      case MgplDSLPackage.ATOM__VAR1:
        return var1 != null;
      case MgplDSLPackage.ATOM__VAR2:
        return var2 != null;
      case MgplDSLPackage.ATOM__EXPR:
        return expr != null;
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //AtomImpl
