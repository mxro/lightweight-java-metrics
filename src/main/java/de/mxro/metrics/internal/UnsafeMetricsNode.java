package de.mxro.metrics.internal;

import de.mxro.metrics.MetricsNode;
import de.mxro.metrics.helpers.MetricOperation;
import de.mxro.metrics.helpers.MetricsData;

/**
 * A non-thread safe implementation of {@link MetricsNode}.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
public class UnsafeMetricsNode implements MetricsNode {

    private final MetricsData data;

    @Override
    public void record(final MetricOperation op) {
        op.perform(data);
    }

    public UnsafeMetricsNode() {
        super();
        this.data = new MetricsDataImpl();
    }

}
