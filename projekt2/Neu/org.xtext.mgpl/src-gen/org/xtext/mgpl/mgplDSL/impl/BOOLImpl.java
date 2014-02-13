/**
 */
package org.xtext.mgpl.mgplDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.mgpl.mgplDSL.ARI;
import org.xtext.mgpl.mgplDSL.BOOL;
import org.xtext.mgpl.mgplDSL.MgplDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOOL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.BOOLImpl#getConj <em>Conj</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.BOOLImpl#getRelat <em>Relat</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.BOOLImpl#getAdd <em>Add</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BOOLImpl extends MinimalEObjectImpl.Container implements BOOL
{
  /**
   * The cached value of the '{@link #getConj() <em>Conj</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConj()
   * @generated
   * @ordered
   */
  protected EList<BOOL> conj;

  /**
   * The cached value of the '{@link #getRelat() <em>Relat</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelat()
   * @generated
   * @ordered
   */
  protected EList<BOOL> relat;

  /**
   * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected EList<ARI> add;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BOOLImpl()
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
    return MgplDSLPackage.Literals.BOOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BOOL> getConj()
  {
    if (conj == null)
    {
      conj = new EObjectContainmentEList<BOOL>(BOOL.class, this, MgplDSLPackage.BOOL__CONJ);
    }
    return conj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BOOL> getRelat()
  {
    if (relat == null)
    {
      relat = new EObjectContainmentEList<BOOL>(BOOL.class, this, MgplDSLPackage.BOOL__RELAT);
    }
    return relat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ARI> getAdd()
  {
    if (add == null)
    {
      add = new EObjectContainmentEList<ARI>(ARI.class, this, MgplDSLPackage.BOOL__ADD);
    }
    return add;
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
      case MgplDSLPackage.BOOL__CONJ:
        return ((InternalEList<?>)getConj()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.BOOL__RELAT:
        return ((InternalEList<?>)getRelat()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.BOOL__ADD:
        return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
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
      case MgplDSLPackage.BOOL__CONJ:
        return getConj();
      case MgplDSLPackage.BOOL__RELAT:
        return getRelat();
      case MgplDSLPackage.BOOL__ADD:
        return getAdd();
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
      case MgplDSLPackage.BOOL__CONJ:
        getConj().clear();
        getConj().addAll((Collection<? extends BOOL>)newValue);
        return;
      case MgplDSLPackage.BOOL__RELAT:
        getRelat().clear();
        getRelat().addAll((Collection<? extends BOOL>)newValue);
        return;
      case MgplDSLPackage.BOOL__ADD:
        getAdd().clear();
        getAdd().addAll((Collection<? extends ARI>)newValue);
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
      case MgplDSLPackage.BOOL__CONJ:
        getConj().clear();
        return;
      case MgplDSLPackage.BOOL__RELAT:
        getRelat().clear();
        return;
      case MgplDSLPackage.BOOL__ADD:
        getAdd().clear();
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
      case MgplDSLPackage.BOOL__CONJ:
        return conj != null && !conj.isEmpty();
      case MgplDSLPackage.BOOL__RELAT:
        return relat != null && !relat.isEmpty();
      case MgplDSLPackage.BOOL__ADD:
        return add != null && !add.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BOOLImpl
