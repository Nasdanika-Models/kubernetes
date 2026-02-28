import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.kubernetes.util.KubernetesEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.kubernetes {
	exports org.nasdanika.models.kubernetes;
	exports org.nasdanika.models.kubernetes.impl;
	exports org.nasdanika.models.kubernetes.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	
	provides CapabilityFactory with KubernetesEPackageResourceSetCapabilityFactory;
	
}