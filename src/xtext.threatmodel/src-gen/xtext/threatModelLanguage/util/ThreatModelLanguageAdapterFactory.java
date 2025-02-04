/**
 * generated by Xtext 2.33.0
 */
package xtext.threatModelLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xtext.threatModelLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xtext.threatModelLanguage.ThreatModelLanguagePackage
 * @generated
 */
public class ThreatModelLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ThreatModelLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThreatModelLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ThreatModelLanguagePackage.eINSTANCE;
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
  protected ThreatModelLanguageSwitch<Adapter> modelSwitch =
    new ThreatModelLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseStatements(Statements object)
      {
        return createStatementsAdapter();
      }
      @Override
      public Adapter caseOperations(Operations object)
      {
        return createOperationsAdapter();
      }
      @Override
      public Adapter caseAdd(Add object)
      {
        return createAddAdapter();
      }
      @Override
      public Adapter caseAddEntity(AddEntity object)
      {
        return createAddEntityAdapter();
      }
      @Override
      public Adapter caseAddProcess(AddProcess object)
      {
        return createAddProcessAdapter();
      }
      @Override
      public Adapter caseAddExternal(AddExternal object)
      {
        return createAddExternalAdapter();
      }
      @Override
      public Adapter caseAddDatastore(AddDatastore object)
      {
        return createAddDatastoreAdapter();
      }
      @Override
      public Adapter caseAddFlow(AddFlow object)
      {
        return createAddFlowAdapter();
      }
      @Override
      public Adapter caseAddBoundary(AddBoundary object)
      {
        return createAddBoundaryAdapter();
      }
      @Override
      public Adapter caseRemove(Remove object)
      {
        return createRemoveAdapter();
      }
      @Override
      public Adapter caseModify(Modify object)
      {
        return createModifyAdapter();
      }
      @Override
      public Adapter caseRename(Rename object)
      {
        return createRenameAdapter();
      }
      @Override
      public Adapter caseReID(ReID object)
      {
        return createReIDAdapter();
      }
      @Override
      public Adapter caseChangeDescription(ChangeDescription object)
      {
        return createChangeDescriptionAdapter();
      }
      @Override
      public Adapter caseFlowSource(FlowSource object)
      {
        return createFlowSourceAdapter();
      }
      @Override
      public Adapter caseFlowDestination(FlowDestination object)
      {
        return createFlowDestinationAdapter();
      }
      @Override
      public Adapter caseBoundaryAddEntity(BoundaryAddEntity object)
      {
        return createBoundaryAddEntityAdapter();
      }
      @Override
      public Adapter caseBoundaryRemoveEntity(BoundaryRemoveEntity object)
      {
        return createBoundaryRemoveEntityAdapter();
      }
      @Override
      public Adapter caseRotateFlow(RotateFlow object)
      {
        return createRotateFlowAdapter();
      }
      @Override
      public Adapter caseMergeEntity(MergeEntity object)
      {
        return createMergeEntityAdapter();
      }
      @Override
      public Adapter caseMergeIntoProcess(MergeIntoProcess object)
      {
        return createMergeIntoProcessAdapter();
      }
      @Override
      public Adapter caseMergeIntoExternal(MergeIntoExternal object)
      {
        return createMergeIntoExternalAdapter();
      }
      @Override
      public Adapter caseMergeIntoDatastore(MergeIntoDatastore object)
      {
        return createMergeIntoDatastoreAdapter();
      }
      @Override
      public Adapter caseSplitEntity(SplitEntity object)
      {
        return createSplitEntityAdapter();
      }
      @Override
      public Adapter caseFlowFix(FlowFix object)
      {
        return createFlowFixAdapter();
      }
      @Override
      public Adapter caseSplitProcessAndProcess(SplitProcessAndProcess object)
      {
        return createSplitProcessAndProcessAdapter();
      }
      @Override
      public Adapter caseSplitsProcessAndDatastore(SplitsProcessAndDatastore object)
      {
        return createSplitsProcessAndDatastoreAdapter();
      }
      @Override
      public Adapter caseSplitsDatastoreAndProcess(SplitsDatastoreAndProcess object)
      {
        return createSplitsDatastoreAndProcessAdapter();
      }
      @Override
      public Adapter caseSplitProcessAndExternal(SplitProcessAndExternal object)
      {
        return createSplitProcessAndExternalAdapter();
      }
      @Override
      public Adapter caseSplitExternalAndProcess(SplitExternalAndProcess object)
      {
        return createSplitExternalAndProcessAdapter();
      }
      @Override
      public Adapter caseSplitDatastoreAndExternal(SplitDatastoreAndExternal object)
      {
        return createSplitDatastoreAndExternalAdapter();
      }
      @Override
      public Adapter caseSplitExternalAndDatastore(SplitExternalAndDatastore object)
      {
        return createSplitExternalAndDatastoreAdapter();
      }
      @Override
      public Adapter caseSplitDatastoreAndDatastore(SplitDatastoreAndDatastore object)
      {
        return createSplitDatastoreAndDatastoreAdapter();
      }
      @Override
      public Adapter caseSplitExternalAndExternal(SplitExternalAndExternal object)
      {
        return createSplitExternalAndExternalAdapter();
      }
      @Override
      public Adapter caseGrouping(Grouping object)
      {
        return createGroupingAdapter();
      }
      @Override
      public Adapter caseCountermeasure(Countermeasure object)
      {
        return createCountermeasureAdapter();
      }
      @Override
      public Adapter caseDesign(Design object)
      {
        return createDesignAdapter();
      }
      @Override
      public Adapter caseRefactoring(Refactoring object)
      {
        return createRefactoringAdapter();
      }
      @Override
      public Adapter caseTesting(Testing object)
      {
        return createTestingAdapter();
      }
      @Override
      public Adapter caseSketching(Sketching object)
      {
        return createSketchingAdapter();
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
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Statements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Statements
   * @generated
   */
  public Adapter createStatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Operations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Operations
   * @generated
   */
  public Adapter createOperationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Add
   * @generated
   */
  public Adapter createAddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.AddEntity <em>Add Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.AddEntity
   * @generated
   */
  public Adapter createAddEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.AddProcess <em>Add Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.AddProcess
   * @generated
   */
  public Adapter createAddProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.AddExternal <em>Add External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.AddExternal
   * @generated
   */
  public Adapter createAddExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.AddDatastore <em>Add Datastore</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.AddDatastore
   * @generated
   */
  public Adapter createAddDatastoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.AddFlow <em>Add Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.AddFlow
   * @generated
   */
  public Adapter createAddFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.AddBoundary <em>Add Boundary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.AddBoundary
   * @generated
   */
  public Adapter createAddBoundaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Remove <em>Remove</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Remove
   * @generated
   */
  public Adapter createRemoveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Modify <em>Modify</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Modify
   * @generated
   */
  public Adapter createModifyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Rename <em>Rename</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Rename
   * @generated
   */
  public Adapter createRenameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.ReID <em>Re ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.ReID
   * @generated
   */
  public Adapter createReIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.ChangeDescription <em>Change Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.ChangeDescription
   * @generated
   */
  public Adapter createChangeDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.FlowSource <em>Flow Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.FlowSource
   * @generated
   */
  public Adapter createFlowSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.FlowDestination <em>Flow Destination</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.FlowDestination
   * @generated
   */
  public Adapter createFlowDestinationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.BoundaryAddEntity <em>Boundary Add Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.BoundaryAddEntity
   * @generated
   */
  public Adapter createBoundaryAddEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.BoundaryRemoveEntity <em>Boundary Remove Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.BoundaryRemoveEntity
   * @generated
   */
  public Adapter createBoundaryRemoveEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.RotateFlow <em>Rotate Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.RotateFlow
   * @generated
   */
  public Adapter createRotateFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.MergeEntity <em>Merge Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.MergeEntity
   * @generated
   */
  public Adapter createMergeEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.MergeIntoProcess <em>Merge Into Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.MergeIntoProcess
   * @generated
   */
  public Adapter createMergeIntoProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.MergeIntoExternal <em>Merge Into External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.MergeIntoExternal
   * @generated
   */
  public Adapter createMergeIntoExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.MergeIntoDatastore <em>Merge Into Datastore</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.MergeIntoDatastore
   * @generated
   */
  public Adapter createMergeIntoDatastoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitEntity <em>Split Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitEntity
   * @generated
   */
  public Adapter createSplitEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.FlowFix <em>Flow Fix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.FlowFix
   * @generated
   */
  public Adapter createFlowFixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitProcessAndProcess <em>Split Process And Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitProcessAndProcess
   * @generated
   */
  public Adapter createSplitProcessAndProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitsProcessAndDatastore <em>Splits Process And Datastore</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitsProcessAndDatastore
   * @generated
   */
  public Adapter createSplitsProcessAndDatastoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitsDatastoreAndProcess <em>Splits Datastore And Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitsDatastoreAndProcess
   * @generated
   */
  public Adapter createSplitsDatastoreAndProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitProcessAndExternal <em>Split Process And External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitProcessAndExternal
   * @generated
   */
  public Adapter createSplitProcessAndExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitExternalAndProcess <em>Split External And Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitExternalAndProcess
   * @generated
   */
  public Adapter createSplitExternalAndProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitDatastoreAndExternal <em>Split Datastore And External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitDatastoreAndExternal
   * @generated
   */
  public Adapter createSplitDatastoreAndExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitExternalAndDatastore <em>Split External And Datastore</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitExternalAndDatastore
   * @generated
   */
  public Adapter createSplitExternalAndDatastoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitDatastoreAndDatastore <em>Split Datastore And Datastore</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitDatastoreAndDatastore
   * @generated
   */
  public Adapter createSplitDatastoreAndDatastoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.SplitExternalAndExternal <em>Split External And External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.SplitExternalAndExternal
   * @generated
   */
  public Adapter createSplitExternalAndExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Grouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Grouping
   * @generated
   */
  public Adapter createGroupingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Countermeasure <em>Countermeasure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Countermeasure
   * @generated
   */
  public Adapter createCountermeasureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Design <em>Design</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Design
   * @generated
   */
  public Adapter createDesignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Refactoring <em>Refactoring</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Refactoring
   * @generated
   */
  public Adapter createRefactoringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Testing <em>Testing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Testing
   * @generated
   */
  public Adapter createTestingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link xtext.threatModelLanguage.Sketching <em>Sketching</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see xtext.threatModelLanguage.Sketching
   * @generated
   */
  public Adapter createSketchingAdapter()
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

} //ThreatModelLanguageAdapterFactory
