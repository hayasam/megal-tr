package plugins;

import java.io.IOException;
import java.util.List;

import org.softlang.megal.mi2.api.AbstractPlugin;
import org.softlang.megal.mi2.api.Artifact;


public abstract class Fragmentizer extends AbstractPlugin {

	class Fragment {
		
		private String name;
		private String type;
		private String link;
		private String partOf;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getLink() {
			return link;
		}
		public void setLink(String link) {
			this.link = link;
		}
		public String getPartOf() {
			return partOf;
		}
		public void setPartOf(String partOf) {
			this.partOf = partOf;
		}
		
		
		
	}
	
	abstract public List<Fragment> getFragments (Artifact artifact) throws IOException;
	
	
}
