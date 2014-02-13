/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ass Stmt2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.AssStmt2#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.AssStmt2#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAssStmt2()
 * @model
 * @generated
 */
public interface AssStmt2 extends EObject
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
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAssStmt2_Var()
   * @model containment="true"
   * @generated
   */
  VARI getVar();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.AssStmt2#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VARI value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(BOOL)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAssStmt2_Expr()
   * @model containment="true"
   * @generated
   */
  BOOL getExpr();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.AssStmt2#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(BOOL value);

} // AssStmt2
