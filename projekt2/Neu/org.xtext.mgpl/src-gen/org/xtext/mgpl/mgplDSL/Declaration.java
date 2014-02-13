/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Declaration#getVari <em>Vari</em>}</li>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Declaration#getObj <em>Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Vari</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vari</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vari</em>' containment reference.
   * @see #setVari(VARE)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getDeclaration_Vari()
   * @model containment="true"
   * @generated
   */
  VARE getVari();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.Declaration#getVari <em>Vari</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vari</em>' containment reference.
   * @see #getVari()
   * @generated
   */
  void setVari(VARE value);

  /**
   * Returns the value of the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj</em>' containment reference.
   * @see #setObj(VARE)
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getDeclaration_Obj()
   * @model containment="true"
   * @generated
   */
  VARE getObj();

  /**
   * Sets the value of the '{@link org.xtext.mgpl.mgplDSL.Declaration#getObj <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' containment reference.
   * @see #getObj()
   * @generated
   */
  void setObj(VARE value);

} // Declaration
