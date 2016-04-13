package org.wso2.osgi.spi.bundle.test.mock;

import org.osgi.framework.wiring.BundleCapability;
import org.osgi.framework.wiring.BundleRequirement;
import org.osgi.framework.wiring.BundleRevision;

import java.util.Map;

public class MockBundleRequirement implements BundleRequirement {

    Map<String, String> directives;
    Map<String, Object> attributes;

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public void setDirectives(Map<String, String> directives) {
        this.directives = directives;
    }

    @Override
    public BundleRevision getRevision() {
        return null;
    }

    @Override
    public boolean matches(BundleCapability bundleCapability) {
        return attributes.equals(bundleCapability.getAttributes());
    }

    @Override
    public String getNamespace() {
        return null;
    }

    @Override
    public Map<String, String> getDirectives() {
        return directives;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    @Override
    public BundleRevision getResource() {
        return null;
    }
}
