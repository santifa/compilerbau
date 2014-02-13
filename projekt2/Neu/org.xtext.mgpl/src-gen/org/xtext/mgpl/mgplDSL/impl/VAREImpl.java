/**
 */
package org.xtext.mgpl.mgplDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.mgpl.mgplDSL.AttrList;
import org.xtext.mgpl.mgplDSL.MgplDSLPackage;
import org.xtext.mgpl.mgplDSL.VARE;
import org.xtext.mgpl.mgplDSL.VARI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VARE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VAREImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VAREImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VAREImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VAREImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VAREImpl#getAttr <em>Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VAREImpl extends MinimalEObjectImpl.Container implements VARE
{
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
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected VARI expr;

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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected AttrList attr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VAREImpl()
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
    return MgplDSLPackage.Literals.VARE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARE__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARE__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.VARE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.VARE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARE__EXPR, newExpr, newExpr));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrList getAttr()
  {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttr(AttrList newAttr, NotificationChain msgs)
  {
    AttrList oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARE__ATTR, oldAttr, newAttr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(AttrList newAttr)
  {
    if (newAttr != attr)
    {
      NotificationChain msgs = null;
      if (attr != null)
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.VARE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.VARE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARE__ATTR, newAttr, newAttr));
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
      case MgplDSLPackage.VARE__EXPR:
        return basicSetExpr(null, msgs);
      case MgplDSLPackage.VARE__ATTR:
        return basicSetAttr(null, msgs);
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
      case MgplDSLPackage.VARE__NAME:
        return getName();
      case MgplDSLPackage.VARE__EXPR:
        return getExpr();
      case MgplDSLPackage.VARE__VALUE:
        return getValue();
      case MgplDSLPackage.VARE__TYPE:
        return getType();
      case MgplDSLPackage.VARE__ATTR:
        return getAttr();
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
      case MgplDSLPackage.VARE__NAME:
        setName((String)newValue);
        return;
      case MgplDSLPackage.VARE__EXPR:
        setExpr((VARI)newValue);
        return;
      case MgplDSLPackage.VARE__VALUE:
        setValue((Integer)newValue);
        return;
      case MgplDSLPackage.VARE__TYPE:
        setType((String)newValue);
        return;
      case MgplDSLPackage.VARE__ATTR:
        setAttr((AttrList)newValue);
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
      case MgplDSLPackage.VARE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MgplDSLPackage.VARE__EXPR:
        setExpr((VARI)null);
        return;
      case MgplDSLPackage.VARE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MgplDSLPackage.VARE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MgplDSLPackage.VARE__ATTR:
        setAttr((AttrList)null);
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
      case MgplDSLPackage.VARE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MgplDSLPackage.VARE__EXPR:
        return expr != null;
      case MgplDSLPackage.VARE__VALUE:
        return value != VALUE_EDEFAULT;
      case MgplDSLPackage.VARE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case MgplDSLPackage.VARE__ATTR:
        return attr != null;
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
    result.append(", value: ");
    result.append(value);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //VAREImpl
