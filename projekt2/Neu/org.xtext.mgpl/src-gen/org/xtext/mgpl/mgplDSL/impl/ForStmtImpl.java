/**
 */
package org.xtext.mgpl.mgplDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.mgpl.mgplDSL.AssStmt;
import org.xtext.mgpl.mgplDSL.AssStmt2;
import org.xtext.mgpl.mgplDSL.ForStmt;
import org.xtext.mgpl.mgplDSL.MgplDSLPackage;
import org.xtext.mgpl.mgplDSL.StatementBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ForStmtImpl#getAss1 <em>Ass1</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ForStmtImpl#getAss2 <em>Ass2</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.impl.ForStmtImpl#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForStmtImpl extends StmtImpl implements ForStmt
{
  /**
   * The cached value of the '{@link #getAss1() <em>Ass1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAss1()
   * @generated
   * @ordered
   */
  protected AssStmt ass1;

  /**
   * The cached value of the '{@link #getAss2() <em>Ass2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAss2()
   * @generated
   * @ordered
   */
  protected AssStmt2 ass2;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStmtImpl()
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
    return MgplDSLPackage.Literals.FOR_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssStmt getAss1()
  {
    return ass1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAss1(AssStmt newAss1, NotificationChain msgs)
  {
    AssStmt oldAss1 = ass1;
    ass1 = newAss1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.FOR_STMT__ASS1, oldAss1, newAss1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAss1(AssStmt newAss1)
  {
    if (newAss1 != ass1)
    {
      NotificationChain msgs = null;
      if (ass1 != null)
        msgs = ((InternalEObject)ass1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.FOR_STMT__ASS1, null, msgs);
      if (newAss1 != null)
        msgs = ((InternalEObject)newAss1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.FOR_STMT__ASS1, null, msgs);
      msgs = basicSetAss1(newAss1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.FOR_STMT__ASS1, newAss1, newAss1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssStmt2 getAss2()
  {
    return ass2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAss2(AssStmt2 newAss2, NotificationChain msgs)
  {
    AssStmt2 oldAss2 = ass2;
    ass2 = newAss2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.FOR_STMT__ASS2, oldAss2, newAss2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAss2(AssStmt2 newAss2)
  {
    if (newAss2 != ass2)
    {
      NotificationChain msgs = null;
      if (ass2 != null)
        msgs = ((InternalEObject)ass2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.FOR_STMT__ASS2, null, msgs);
      if (newAss2 != null)
        msgs = ((InternalEObject)newAss2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.FOR_STMT__ASS2, null, msgs);
      msgs = basicSetAss2(newAss2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.FOR_STMT__ASS2, newAss2, newAss2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgplDSLPackage.FOR_STMT__STMT, oldStmt, newStmt);
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
        msgs = ((InternalEObject)stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.FOR_STMT__STMT, null, msgs);
      if (newStmt != null)
        msgs = ((InternalEObject)newStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgplDSLPackage.FOR_STMT__STMT, null, msgs);
      msgs = basicSetStmt(newStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MgplDSLPackage.FOR_STMT__STMT, newStmt, newStmt));
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
      case MgplDSLPackage.FOR_STMT__ASS1:
        return basicSetAss1(null, msgs);
      case MgplDSLPackage.FOR_STMT__ASS2:
        return basicSetAss2(null, msgs);
      case MgplDSLPackage.FOR_STMT__STMT:
        return basicSetStmt(null, msgs);
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
      case MgplDSLPackage.FOR_STMT__ASS1:
        return getAss1();
      case MgplDSLPackage.FOR_STMT__ASS2:
        return getAss2();
      case MgplDSLPackage.FOR_STMT__STMT:
        return getStmt();
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
      case MgplDSLPackage.FOR_STMT__ASS1:
        setAss1((AssStmt)newValue);
        return;
      case MgplDSLPackage.FOR_STMT__ASS2:
        setAss2((AssStmt2)newValue);
        return;
      case MgplDSLPackage.FOR_STMT__STMT:
        setStmt((StatementBlock)newValue);
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
      case MgplDSLPackage.FOR_STMT__ASS1:
        setAss1((AssStmt)null);
        return;
      case MgplDSLPackage.FOR_STMT__ASS2:
        setAss2((AssStmt2)null);
        return;
      case MgplDSLPackage.FOR_STMT__STMT:
        setStmt((StatementBlock)null);
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
      case MgplDSLPackage.FOR_STMT__ASS1:
        return ass1 != null;
      case MgplDSLPackage.FOR_STMT__ASS2:
        return ass2 != null;
      case MgplDSLPackage.FOR_STMT__STMT:
        return stmt != null;
    }
    return super.eIsSet(featureID);
  }

} //ForStmtImpl
