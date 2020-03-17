import org.apache.maven.lifecycle.mapping.LifecyclePhase;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "hello", requiresProject = true, defaultPhase = LifecyclePhase.PROCESS_RESOURCES)
public class HelloMojo extends AbstractMojo {

	public void execute() throws MojoExecutionException {
		System.out.println("Hello There!");
	}

}
