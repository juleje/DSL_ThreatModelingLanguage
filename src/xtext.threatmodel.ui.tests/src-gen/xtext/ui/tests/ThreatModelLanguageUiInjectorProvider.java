/*
 * generated by Xtext 2.33.0
 */
package xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import xtext.threatmodel.ui.internal.ThreatmodelActivator;

public class ThreatModelLanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ThreatmodelActivator.getInstance().getInjector("xtext.ThreatModelLanguage");
	}

}
