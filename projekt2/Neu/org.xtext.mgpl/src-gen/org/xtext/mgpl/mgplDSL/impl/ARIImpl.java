/**
 */
package org.xtext.mgpl.mgplDSL.impl;

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

import org.xtext.mgpl.mgplDSL.ARI;
import org.xtext.mgpl.mgplDSL.Atom;
import org.xtext.mgpl.mgplDSL.MgplDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ARIImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ARIImpl#getUnary <em>Unary</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ARIImpl#getAtom <em>Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ARIImpl extends MinimalEObjectImpl.Container implements ARI
{
  /**
   * The cached value of the '{@link #getMult() <em>Mult</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMult()
   * @generated
   * @ordered
   */
  protected EList<ARI> mult;

  /**
   * The cached value of the '{@link #getUnary() <em>Unary</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary()
   * @generated
   * @ordered
   */
  protected EList<ARI> unary;

  /**
   * The cached value of the '{@link #getAtom() <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom()
   * @generated
   * @ordered
   */
  protected Atom atom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ARIImpl()
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
    return MgplDSLPackage.Literals.ARI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ARI> getMult()
  {
    if (mult == null)
    {
      mult = new EObjectContainmentEList<ARI>(ARI.class, this, MgplDSLPackage.ARI__MULT);
    }
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ARI> getUnary()
  {
    if (unary == null)
    {
      unary = new EObjectContainmentEList<ARI>(ARI.class, this, MgplDSLPackage.ARI__UNARY);
    }
    return unary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom getAtom()
  {
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtom(Atom newAtom, NotificationChain msgs)
  {
    Atom oldAtom = atom;
    atom = newAtom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.ARI__ATOM, oldAtom, newAtom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtom(Atom newAtom)
  {
    if (newAtom != atom)
    {
      NotificationChain msgs = null;
      if (atom != null)
        msgs = ((InternalEObject)atom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.ARI__ATOM, null, msgs);
      if (newAtom != null)
        msgs = ((InternalEObject)newAtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.ARI__ATOM, null, msgs);
      msgs = basicSetAtom(newAtom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.ARI__ATOM, newAtom, newAtom));
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
      case MgplDSLPackage.ARI__MULT:
        return ((InternalEList<?>)getMult()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.ARI__UNARY:
        return ((InternalEList<?>)getUnary()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.ARI__ATOM:
        return basicSetAtom(null, msgs);
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
      case MgplDSLPackage.ARI__MULT:
        return getMult();
      case MgplDSLPackage.ARI__UNARY:
        return getUnary();
      case MgplDSLPackage.ARI__ATOM:
        return getAtom();
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
      case MgplDSLPackage.ARI__MULT:
        getMult().clear();
        getMult().addAll((Collection<? extends ARI>)newValue);
        return;
      case MgplDSLPackage.ARI__UNARY:
        getUnary().clear();
        getUnary().addAll((Collection<? extends ARI>)newValue);
        return;
      case MgplDSLPackage.ARI__ATOM:
        setAtom((Atom)newValue);
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
      case MgplDSLPackage.ARI__MULT:
        getMult().clear();
        return;
      case MgplDSLPackage.ARI__UNARY:
        getUnary().clear();
        return;
      case MgplDSLPackage.ARI__ATOM:
        setAtom((Atom)null);
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
      case MgplDSLPackage.ARI__MULT:
        return mult != null && !mult.isEmpty();
      case MgplDSLPackage.ARI__UNARY:
        return unary != null && !unary.isEmpty();
      case MgplDSLPackage.ARI__ATOM:
        return atom != null;
    }
    return super.eIsSet(featureID);
  }

} //ARIImpl
