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

import org.xtext.mgpl.mgplDSL.Atom;
import org.xtext.mgpl.mgplDSL.MgplDSLPackage;
import org.xtext.mgpl.mgplDSL.VARI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VARI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VARIImpl#getConj <em>Conj</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VARIImpl#getRelat <em>Relat</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VARIImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VARIImpl#getMult <em>Mult</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VARIImpl#getUnary <em>Unary</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VARIImpl#getAtom <em>Atom</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VARIImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VARIImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.VARIImpl#getSubname <em>Subname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VARIImpl extends MinimalEObjectImpl.Container implements VARI
{
  /**
   * The cached value of the '{@link #getConj() <em>Conj</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConj()
   * @generated
   * @ordered
   */
  protected EList<VARI> conj;

  /**
   * The cached value of the '{@link #getRelat() <em>Relat</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelat()
   * @generated
   * @ordered
   */
  protected EList<VARI> relat;

  /**
   * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected EList<VARI> add;

  /**
   * The cached value of the '{@link #getMult() <em>Mult</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMult()
   * @generated
   * @ordered
   */
  protected EList<VARI> mult;

  /**
   * The cached value of the '{@link #getUnary() <em>Unary</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary()
   * @generated
   * @ordered
   */
  protected EList<VARI> unary;

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
   * The default value of the '{@link #getSubname() <em>Subname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubname()
   * @generated
   * @ordered
   */
  protected static final String SUBNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubname() <em>Subname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubname()
   * @generated
   * @ordered
   */
  protected String subname = SUBNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VARIImpl()
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
    return MgplDSLPackage.Literals.VARI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VARI> getConj()
  {
    if (conj == null)
    {
      conj = new EObjectContainmentEList<VARI>(VARI.class, this, MgplDSLPackage.VARI__CONJ);
    }
    return conj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VARI> getRelat()
  {
    if (relat == null)
    {
      relat = new EObjectContainmentEList<VARI>(VARI.class, this, MgplDSLPackage.VARI__RELAT);
    }
    return relat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VARI> getAdd()
  {
    if (add == null)
    {
      add = new EObjectContainmentEList<VARI>(VARI.class, this, MgplDSLPackage.VARI__ADD);
    }
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VARI> getMult()
  {
    if (mult == null)
    {
      mult = new EObjectContainmentEList<VARI>(VARI.class, this, MgplDSLPackage.VARI__MULT);
    }
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VARI> getUnary()
  {
    if (unary == null)
    {
      unary = new EObjectContainmentEList<VARI>(VARI.class, this, MgplDSLPackage.VARI__UNARY);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARI__ATOM, oldAtom, newAtom);
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
        msgs = ((InternalEObject)atom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.VARI__ATOM, null, msgs);
      if (newAtom != null)
        msgs = ((InternalEObject)newAtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.VARI__ATOM, null, msgs);
      msgs = basicSetAtom(newAtom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARI__ATOM, newAtom, newAtom));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARI__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARI__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.VARI__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.VARI__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARI__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubname()
  {
    return subname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubname(String newSubname)
  {
    String oldSubname = subname;
    subname = newSubname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.VARI__SUBNAME, oldSubname, subname));
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
      case MgplDSLPackage.VARI__CONJ:
        return ((InternalEList<?>)getConj()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.VARI__RELAT:
        return ((InternalEList<?>)getRelat()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.VARI__ADD:
        return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.VARI__MULT:
        return ((InternalEList<?>)getMult()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.VARI__UNARY:
        return ((InternalEList<?>)getUnary()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.VARI__ATOM:
        return basicSetAtom(null, msgs);
      case MgplDSLPackage.VARI__EXPR:
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
      case MgplDSLPackage.VARI__CONJ:
        return getConj();
      case MgplDSLPackage.VARI__RELAT:
        return getRelat();
      case MgplDSLPackage.VARI__ADD:
        return getAdd();
      case MgplDSLPackage.VARI__MULT:
        return getMult();
      case MgplDSLPackage.VARI__UNARY:
        return getUnary();
      case MgplDSLPackage.VARI__ATOM:
        return getAtom();
      case MgplDSLPackage.VARI__NAME:
        return getName();
      case MgplDSLPackage.VARI__EXPR:
        return getExpr();
      case MgplDSLPackage.VARI__SUBNAME:
        return getSubname();
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
      case MgplDSLPackage.VARI__CONJ:
        getConj().clear();
        getConj().addAll((Collection<? extends VARI>)newValue);
        return;
      case MgplDSLPackage.VARI__RELAT:
        getRelat().clear();
        getRelat().addAll((Collection<? extends VARI>)newValue);
        return;
      case MgplDSLPackage.VARI__ADD:
        getAdd().clear();
        getAdd().addAll((Collection<? extends VARI>)newValue);
        return;
      case MgplDSLPackage.VARI__MULT:
        getMult().clear();
        getMult().addAll((Collection<? extends VARI>)newValue);
        return;
      case MgplDSLPackage.VARI__UNARY:
        getUnary().clear();
        getUnary().addAll((Collection<? extends VARI>)newValue);
        return;
      case MgplDSLPackage.VARI__ATOM:
        setAtom((Atom)newValue);
        return;
      case MgplDSLPackage.VARI__NAME:
        setName((String)newValue);
        return;
      case MgplDSLPackage.VARI__EXPR:
        setExpr((VARI)newValue);
        return;
      case MgplDSLPackage.VARI__SUBNAME:
        setSubname((String)newValue);
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
      case MgplDSLPackage.VARI__CONJ:
        getConj().clear();
        return;
      case MgplDSLPackage.VARI__RELAT:
        getRelat().clear();
        return;
      case MgplDSLPackage.VARI__ADD:
        getAdd().clear();
        return;
      case MgplDSLPackage.VARI__MULT:
        getMult().clear();
        return;
      case MgplDSLPackage.VARI__UNARY:
        getUnary().clear();
        return;
      case MgplDSLPackage.VARI__ATOM:
        setAtom((Atom)null);
        return;
      case MgplDSLPackage.VARI__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MgplDSLPackage.VARI__EXPR:
        setExpr((VARI)null);
        return;
      case MgplDSLPackage.VARI__SUBNAME:
        setSubname(SUBNAME_EDEFAULT);
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
      case MgplDSLPackage.VARI__CONJ:
        return conj != null && !conj.isEmpty();
      case MgplDSLPackage.VARI__RELAT:
        return relat != null && !relat.isEmpty();
      case MgplDSLPackage.VARI__ADD:
        return add != null && !add.isEmpty();
      case MgplDSLPackage.VARI__MULT:
        return mult != null && !mult.isEmpty();
      case MgplDSLPackage.VARI__UNARY:
        return unary != null && !unary.isEmpty();
      case MgplDSLPackage.VARI__ATOM:
        return atom != null;
      case MgplDSLPackage.VARI__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MgplDSLPackage.VARI__EXPR:
        return expr != null;
      case MgplDSLPackage.VARI__SUBNAME:
        return SUBNAME_EDEFAULT == null ? subname != null : !SUBNAME_EDEFAULT.equals(subname);
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
    result.append(", subname: ");
    result.append(subname);
    result.append(')');
    return result.toString();
  }

} //VARIImpl
