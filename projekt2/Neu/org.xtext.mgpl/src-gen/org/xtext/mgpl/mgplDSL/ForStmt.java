/**
 */
package org.xtext.mgpl.mgplDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.ForStmt#getAss1 <em>Ass1</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.ForStmt#getAss2 <em>Ass2</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.ForStmt#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getForStmt()
 * @model
 * @generated
 */
public interface ForStmt extends Stmt
{
  /**
   * Returns the value of the '<em><b>Ass1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ass1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ass1</em>' containment reference.
   * @see #setAss1(AssStmt)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getForStmt_Ass1()
   * @model containment="true"
   * @generated
   */
  AssStmt getAss1();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.ForStmt#getAss1 <em>Ass1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ass1</em>' containment reference.
   * @see #getAss1()
   * @generated
   */
  void setAss1(AssStmt value);

  /**
   * Returns the value of the '<em><b>Ass2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ass2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ass2</em>' containment reference.
   * @see #setAss2(AssStmt2)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getForStmt_Ass2()
   * @model containment="true"
   * @generated
   */
  AssStmt2 getAss2();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.ForStmt#getAss2 <em>Ass2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ass2</em>' containment reference.
   * @see #getAss2()
   * @generated
   */
  void setAss2(AssStmt2 value);

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(StatementBlock)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getForStmt_Stmt()
   * @model containment="true"
   * @generated
   */
  StatementBlock getStmt();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.ForStmt#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(StatementBlock value);

} // ForStmt
