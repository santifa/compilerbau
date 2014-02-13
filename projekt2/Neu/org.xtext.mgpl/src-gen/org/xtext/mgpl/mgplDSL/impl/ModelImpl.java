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

import org.xtext.mgpl.mgplDSL.AttrList;
import org.xtext.mgpl.mgplDSL.Block;
import org.xtext.mgpl.mgplDSL.Declaration;
import org.xtext.mgpl.mgplDSL.MgplDSLPackage;
import org.xtext.mgpl.mgplDSL.Model;
import org.xtext.mgpl.mgplDSL.StatementBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ModelImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ModelImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ModelImpl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ModelImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
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
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected AttrList attr;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected EList<Declaration> decl;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected StatementBlock stmt;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<Block> blocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return MgplDSLPackage.Literals.MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.MODEL__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.MODEL__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.MODEL__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.MODEL__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.MODEL__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Declaration> getDecl()
  {
    if (decl == null)
    {
      decl = new EObjectContainmentEList<Declaration>(Declaration.class, this, MgplDSLPackage.MODEL__DECL);
    }
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock getStmt()
  {
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt(StatementBlock newStmt, NotificationChain msgs)
  {
    StatementBlock oldStmt = stmt;
    stmt = newStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.MODEL__STMT, oldStmt, newStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmt(StatementBlock newStmt)
  {
    if (newStmt != stmt)
    {
      NotificationChain msgs = null;
      if (stmt != null)
        msgs = ((InternalEObject)stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.MODEL__STMT, null, msgs);
      if (newStmt != null)
        msgs = ((InternalEObject)newStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.MODEL__STMT, null, msgs);
      msgs = basicSetStmt(newStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.MODEL__STMT, newStmt, newStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Block> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<Block>(Block.class, this, MgplDSLPackage.MODEL__BLOCKS);
    }
    return blocks;
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
      case MgplDSLPackage.MODEL__ATTR:
        return basicSetAttr(null, msgs);
      case MgplDSLPackage.MODEL__DECL:
        return ((InternalEList<?>)getDecl()).basicRemove(otherEnd, msgs);
      case MgplDSLPackage.MODEL__STMT:
        return basicSetStmt(null, msgs);
      case MgplDSLPackage.MODEL__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
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
      case MgplDSLPackage.MODEL__NAME:
        return getName();
      case MgplDSLPackage.MODEL__ATTR:
        return getAttr();
      case MgplDSLPackage.MODEL__DECL:
        return getDecl();
      case MgplDSLPackage.MODEL__STMT:
        return getStmt();
      case MgplDSLPackage.MODEL__BLOCKS:
        return getBlocks();
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
      case MgplDSLPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case MgplDSLPackage.MODEL__ATTR:
        setAttr((AttrList)newValue);
        return;
      case MgplDSLPackage.MODEL__DECL:
        getDecl().clear();
        getDecl().addAll((Collection<? extends Declaration>)newValue);
        return;
      case MgplDSLPackage.MODEL__STMT:
        setStmt((StatementBlock)newValue);
        return;
      case MgplDSLPackage.MODEL__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends Block>)newValue);
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
      case MgplDSLPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MgplDSLPackage.MODEL__ATTR:
        setAttr((AttrList)null);
        return;
      case MgplDSLPackage.MODEL__DECL:
        getDecl().clear();
        return;
      case MgplDSLPackage.MODEL__STMT:
        setStmt((StatementBlock)null);
        return;
      case MgplDSLPackage.MODEL__BLOCKS:
        getBlocks().clear();
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
      case MgplDSLPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MgplDSLPackage.MODEL__ATTR:
        return attr != null;
      case MgplDSLPackage.MODEL__DECL:
        return decl != null && !decl.isEmpty();
      case MgplDSLPackage.MODEL__STMT:
        return stmt != null;
      case MgplDSLPackage.MODEL__BLOCKS:
        return blocks != null && !blocks.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ModelImpl
