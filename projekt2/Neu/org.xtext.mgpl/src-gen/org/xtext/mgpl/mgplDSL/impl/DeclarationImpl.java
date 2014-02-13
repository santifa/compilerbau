/**
 */
package org.xtext.mgpl.mgplDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.mgpl.mgplDSL.Declaration;
import org.xtext.mgpl.mgplDSL.MgplDSLPackage;
import org.xtext.mgpl.mgplDSL.VARE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.DeclarationImpl#getVari <em>Vari</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.DeclarationImpl#getObj <em>Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration
{
  /**
   * The cached value of the '{@link #getVari() <em>Vari</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVari()
   * @generated
   * @ordered
   */
  protected VARE vari;

  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected VARE obj;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationImpl()
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
    return MgplDSLPackage.Literals.DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARE getVari()
  {
    return vari;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVari(VARE newVari, NotificationChain msgs)
  {
    VARE oldVari = vari;
    vari = newVari;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.DECLARATION__VARI, oldVari, newVari);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVari(VARE newVari)
  {
    if (newVari != vari)
    {
      NotificationChain msgs = null;
      if (vari != null)
        msgs = ((InternalEObject)vari).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.DECLARATION__VARI, null, msgs);
      if (newVari != null)
        msgs = ((InternalEObject)newVari).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.DECLARATION__VARI, null, msgs);
      msgs = basicSetVari(newVari, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.DECLARATION__VARI, newVari, newVari));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARE getObj()
  {
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObj(VARE newObj, NotificationChain msgs)
  {
    VARE oldObj = obj;
    obj = newObj;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.DECLARATION__OBJ, oldObj, newObj);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObj(VARE newObj)
  {
    if (newObj != obj)
    {
      NotificationChain msgs = null;
      if (obj != null)
        msgs = ((InternalEObject)obj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.DECLARATION__OBJ, null, msgs);
      if (newObj != null)
        msgs = ((InternalEObject)newObj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.DECLARATION__OBJ, null, msgs);
      msgs = basicSetObj(newObj, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.DECLARATION__OBJ, newObj, newObj));
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
      case MgplDSLPackage.DECLARATION__VARI:
        return basicSetVari(null, msgs);
      case MgplDSLPackage.DECLARATION__OBJ:
        return basicSetObj(null, msgs);
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
      case MgplDSLPackage.DECLARATION__VARI:
        return getVari();
      case MgplDSLPackage.DECLARATION__OBJ:
        return getObj();
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
      case MgplDSLPackage.DECLARATION__VARI:
        setVari((VARE)newValue);
        return;
      case MgplDSLPackage.DECLARATION__OBJ:
        setObj((VARE)newValue);
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
      case MgplDSLPackage.DECLARATION__VARI:
        setVari((VARE)null);
        return;
      case MgplDSLPackage.DECLARATION__OBJ:
        setObj((VARE)null);
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
      case MgplDSLPackage.DECLARATION__VARI:
        return vari != null;
      case MgplDSLPackage.DECLARATION__OBJ:
        return obj != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclarationImpl
