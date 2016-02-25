package plugins;

import org.softlang.megal.mi2.Entity;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.any;
import static plugins.util.Prelude.isElementOfLanguage;

import java.util.List;

import plugins.Fragmentizer.Fragment;
import plugins.prelude.GuidedReasonerPlugin;

public class FileFragmentReasoner extends GuidedReasonerPlugin {
		
	@Override
	protected void guidedDerive(Entity entity) throws Throwable {
		
		for (Fragmentizer fragmentizer : filter(getParts(), Fragmentizer.class)) {
			
			if (!any(fragmentizer.getRealization(), lang -> isElementOfLanguage(entity, lang))) {
			
				continue;
			
			}
			
			List<Fragment> fragments = fragmentizer.getFragments(artifactOf(entity));
			
			for (Fragment fragment : fragments) {
								
				entity(fragment.getName(),fragment.getType());
				if (fragment.getPartOf() != null)
					relationship(fragment.getName(), fragment.getPartOf(), "partOf");
				
			}
			
		}
		
	}
	
}
