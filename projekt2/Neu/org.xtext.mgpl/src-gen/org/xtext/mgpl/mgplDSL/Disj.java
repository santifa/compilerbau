/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Disj#getConj <em>Conj</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getDisj()
 * @model
 * @generated
 */
public interface Disj extends Expr
{
  /**
   * Returns the value of the '<em><b>Conj</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.Conj}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conj</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conj</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getDisj_Conj()
   * @model containment="true"
   * @generated
   */
  EList<Conj> getConj();

} // Disj
