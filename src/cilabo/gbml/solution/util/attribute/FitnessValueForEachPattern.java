package cilabo.gbml.solution.util.attribute;

import java.util.Comparator;

import org.uma.jmetal.solution.Solution;
import org.uma.jmetal.solution.util.attribute.Attribute;

public class FitnessValueForEachPattern<S extends Solution<?>> implements Attribute<S> {
	private String attributeId = getClass().getName();
	private Comparator<S> solutionComparator;

	public FitnessValueForEachPattern() {}

	@Override
	public String getAttributeId() {
		return attributeId;
	}

	@Override
	public Comparator<S> getSolutionComparator() {
		return solutionComparator;
	}

}
