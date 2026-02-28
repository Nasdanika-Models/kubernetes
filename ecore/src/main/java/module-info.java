import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.kubernetes.ecore.ECoreGenKubernetesProcessorsCapabilityFactory;

module org.nasdanika.models.kubernetes.ecore {
		
	requires transitive org.nasdanika.models.kubernetes;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.kubernetes.ecore;
	opens org.nasdanika.models.kubernetes.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenKubernetesProcessorsCapabilityFactory; 		
	
}
