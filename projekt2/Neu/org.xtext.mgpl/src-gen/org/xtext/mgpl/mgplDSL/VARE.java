/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VARE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARE#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARE#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARE#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARE#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.VARE#getAttr <em>Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARE()
 * @model
 * @generated
 */
public interface VARE extends EObject
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
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARE_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARE#getName <em>Name</em>}' attribute.
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
   * @see #setExpr(VARI)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARE_Expr()
   * @model containment="true"
   * @generated
   */
  VARI getExpr();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARE#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(VARI value);

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
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARE_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARE#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARE_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARE#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(AttrList)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getVARE_Attr()
   * @model containment="true"
   * @generated
   */
  AttrList getAttr();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.VARE#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrList value);

} // VARE
