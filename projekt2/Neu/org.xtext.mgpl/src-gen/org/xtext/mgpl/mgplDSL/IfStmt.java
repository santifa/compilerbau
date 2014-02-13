/**
 */
package org.xtext.mgpl.mgplDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.IfStmt#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.IfStmt#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getIfStmt()
 * @model
 * @generated
 */
public interface IfStmt extends Stmt
{
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
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getIfStmt_Stmt()
   * @model containment="true"
   * @generated
   */
  StatementBlock getStmt();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.IfStmt#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(StatementBlock value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(ElseStmt)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getIfStmt_Else()
   * @model containment="true"
   * @generated
   */
  ElseStmt getElse();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.IfStmt#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(ElseStmt value);

} // IfStmt
