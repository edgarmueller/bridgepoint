/*
 * generated by Xtext
 */
package org.xtuml.bp.xtext.oal.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XoalExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.xtuml.bp.xtext.oal.ui.internal.XoalActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.xtuml.bp.xtext.oal.ui.internal.XoalActivator.getInstance().getInjector("org.xtuml.bp.xtext.oal.Xoal");
	}
	
}
