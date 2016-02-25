package org.softlang.megal.language.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.softlang.megal.MegalDeclaration;
import org.softlang.megal.MegalFile;
import org.softlang.megal.MegalNamed;

/**
 * This scope provider uses declarative mechanisms to determine local scopes for MegaL objects
 */
@SuppressWarnings("all")
public class MegalScopeProvider extends AbstractDeclarativeScopeProvider {
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  private Iterable<MegalFile> allImports(final MegalFile m) {
    EList<MegalFile> _imports = m.getImports();
    EList<MegalFile> _imports_1 = m.getImports();
    final Function1<MegalFile, Iterable<MegalFile>> _function = (MegalFile it) -> {
      return this.allImports(it);
    };
    List<Iterable<MegalFile>> _map = ListExtensions.<MegalFile, Iterable<MegalFile>>map(_imports_1, _function);
    Iterable<MegalFile> _flatten = Iterables.<MegalFile>concat(_map);
    return Iterables.<MegalFile>concat(_imports, _flatten);
  }
  
  private IScope elementScope(final MegalFile file, final EReference reference) {
    EClassifier _eType = reference.getEType();
    Class<?> _instanceClass = _eType.getInstanceClass();
    boolean _isAssignableFrom = MegalNamed.class.isAssignableFrom(_instanceClass);
    boolean _not = (!_isAssignableFrom);
    if (_not) {
      return this.delegateGetScope(file, reference);
    }
    EClassifier _eType_1 = reference.getEType();
    Class<?> _instanceClass_1 = _eType_1.getInstanceClass();
    final Class<? extends MegalNamed> type = _instanceClass_1.<MegalNamed>asSubclass(MegalNamed.class);
    return this.elementScopeWith(file, type, IScope.NULLSCOPE);
  }
  
  private IScope elementScopeWith(final MegalFile file, final Class<? extends MegalNamed> type, final IScope parent) {
    IScope visible = parent;
    EList<MegalFile> _imports = file.getImports();
    for (final MegalFile i : _imports) {
      IScope _elementScopeWith = this.elementScopeWith(i, type, visible);
      visible = _elementScopeWith;
    }
    EList<MegalDeclaration> _declarations = file.getDeclarations();
    Iterable<? extends MegalNamed> _filter = Iterables.filter(_declarations, type);
    return Scopes.<EObject>scopeFor(_filter, this.qualifiedNameProvider, visible);
  }
  
  public static <T extends MegalNamed> T resolve(final MegalFile file, final Class<T> type, final String name) {
    EList<MegalDeclaration> _declarations = file.getDeclarations();
    Iterable<T> _filter = Iterables.<T>filter(_declarations, type);
    final Function1<T, Boolean> _function = (T d) -> {
      String _name = d.getName();
      return Boolean.valueOf(Objects.equal(_name, name));
    };
    Iterable<T> _filter_1 = IterableExtensions.<T>filter(_filter, _function);
    for (final T d : _filter_1) {
      return d;
    }
    EList<MegalFile> _imports = file.getImports();
    List<MegalFile> _reverseView = ListExtensions.<MegalFile>reverseView(_imports);
    for (final MegalFile i : _reverseView) {
      {
        final T p = MegalScopeProvider.<T>resolve(i, type, name);
        boolean _notEquals = (!Objects.equal(p, null));
        if (_notEquals) {
          return p;
        }
      }
    }
    return null;
  }
  
  public IScope scope_MegalEntity(final MegalFile m, final EReference r) {
    return this.elementScope(m, r);
  }
  
  public IScope scope_MegalEntityType(final MegalFile m, final EReference r) {
    return this.elementScope(m, r);
  }
  
  public IScope scope_MegalRelationshipType(final MegalFile m, final EReference r) {
    return this.elementScope(m, r);
  }
}
