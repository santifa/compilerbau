/**
 */
package org.xtext.mgpl.mgplDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.mgpl.mgplDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.mgpl.mgplDSL.MgplDSLPackage
 * @generated
 */
public class MgplDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MgplDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MgplDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MgplDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MgplDSLSwitch<Adapter> modelSwitch =
    new MgplDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseVARE(VARE object)
      {
        return createVAREAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseAnimBlock(AnimBlock object)
      {
        return createAnimBlockAdapter();
      }
      @Override
      public Adapter caseEventBlock(EventBlock object)
      {
        return createEventBlockAdapter();
      }
      @Override
      public Adapter caseStatementBlock(StatementBlock object)
      {
        return createStatementBlockAdapter();
      }
      @Override
      public Adapter caseStmt(Stmt object)
      {
        return createStmtAdapter();
      }
      @Override
      public Adapter caseForStmt(ForStmt object)
      {
        return createForStmtAdapter();
      }
      @Override
      public Adapter caseIfStmt(IfStmt object)
      {
        return createIfStmtAdapter();
      }
      @Override
      public Adapter caseElseStmt(ElseStmt object)
      {
        return createElseStmtAdapter();
      }
      @Override
      public Adapter caseAssStmt(AssStmt object)
      {
        return createAssStmtAdapter();
      }
      @Override
      public Adapter caseAssStmt2(AssStmt2 object)
      {
        return createAssStmt2Adapter();
      }
      @Override
      public Adapter caseAttrList(AttrList object)
      {
        return createAttrListAdapter();
      }
      @Override
      public Adapter caseAttrAss(AttrAss object)
      {
        return createAttrAssAdapter();
      }
      @Override
      public Adapter caseVARI(VARI object)
      {
        return createVARIAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.VARE <em>VARE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.VARE
   * @generated
   */
  public Adapter createVAREAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.AnimBlock <em>Anim Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.AnimBlock
   * @generated
   */
  public Adapter createAnimBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.EventBlock <em>Event Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.EventBlock
   * @generated
   */
  public Adapter createEventBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.StatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.StatementBlock
   * @generated
   */
  public Adapter createStatementBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.Stmt
   * @generated
   */
  public Adapter createStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.ForStmt <em>For Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.ForStmt
   * @generated
   */
  public Adapter createForStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.IfStmt <em>If Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.IfStmt
   * @generated
   */
  public Adapter createIfStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.ElseStmt <em>Else Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.ElseStmt
   * @generated
   */
  public Adapter createElseStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.AssStmt <em>Ass Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.AssStmt
   * @generated
   */
  public Adapter createAssStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.AssStmt2 <em>Ass Stmt2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.AssStmt2
   * @generated
   */
  public Adapter createAssStmt2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.AttrList <em>Attr List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.AttrList
   * @generated
   */
  public Adapter createAttrListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.AttrAss <em>Attr Ass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.AttrAss
   * @generated
   */
  public Adapter createAttrAssAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.VARI <em>VARI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.VARI
   * @generated
   */
  public Adapter createVARIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.mgpl.mgplDSL.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.mgpl.mgplDSL.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MgplDSLAdapterFactory
