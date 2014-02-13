/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Atom#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Atom#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Atom#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Atom#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAtom()
 * @model
 * @generated
 */
public interface Atom extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAtom_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.Atom#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Var1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var1</em>' containment reference.
   * @see #setVar1(VARI)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAtom_Var1()
   * @model containment="true"
   * @generated
   */
  VARI getVar1();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.Atom#getVar1 <em>Var1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var1</em>' containment reference.
   * @see #getVar1()
   * @generated
   */
  void setVar1(VARI value);

  /**
   * Returns the value of the '<em><b>Var2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' containment reference.
   * @see #setVar2(VARI)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAtom_Var2()
   * @model containment="true"
   * @generated
   */
  VARI getVar2();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.Atom#getVar2 <em>Var2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' containment reference.
   * @see #getVar2()
   * @generated
   */
  void setVar2(VARI value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(VARI)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAtom_Expr()
   * @model containment="true"
   * @generated
   */
  VARI getExpr();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.Atom#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(VARI value);

} // Atom
