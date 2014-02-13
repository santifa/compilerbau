/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VARI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARI#getSubname <em>Subname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI()
 * @model
 * @generated
 */
public interface VARI extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARI#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Expr()
   * @model containment="true"
   * @generated
   */
  BOOL getExpr();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARI#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(BOOL value);

  /**
   * Returns the value of the '<em><b>Subname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subname</em>' attribute.
   * @see #setSubname(String)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARI_Subname()
   * @model
   * @generated
   */
  String getSubname();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARI#getSubname <em>Subname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subname</em>' attribute.
   * @see #getSubname()
   * @generated
   */
  void setSubname(String value);

} // VARI
