/**
 */
package org.xtext.mgpl.mgplDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ass Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.AssStmt#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAssStmt()
 * @model
 * @generated
 */
public interface AssStmt extends Stmt
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(VARI)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAssStmt_Var()
   * @model containment="true"
   * @generated
   */
  VARI getVar();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.AssStmt#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VARI value);

} // AssStmt
