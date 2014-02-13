/**
 */
package org.xtext.mgpl.mgplDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attr List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.mgpl.mgplDSL.AttrList#getAttr <em>Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAttrList()
 * @model
 * @generated
 */
public interface AttrList extends EObject
{
  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mgpl.mgplDSL.AttrAss}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference list.
   * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage#getAttrList_Attr()
   * @model containment="true"
   * @generated
   */
  EList<AttrAss> getAttr();

} // AttrList
