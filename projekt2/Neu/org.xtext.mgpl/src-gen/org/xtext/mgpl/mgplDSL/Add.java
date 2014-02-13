/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.Add#getMult <em>Mult</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends EObject
{
  /**
   * Returns the value of the '<em><b>Mult</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.Mult}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mult</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mult</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAdd_Mult()
   * @model containment="true"
   * @generated
   */
  EList<Mult> getMult();

} // Add
