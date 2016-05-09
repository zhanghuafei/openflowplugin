/**
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.openflowplugin.applications.config.yang.statistics_manager;

import org.opendaylight.controller.sal.common.util.NoopAutoCloseable;

/**
 * @deprecated Replaced by blueprint wiring
 */
@Deprecated
public class StatisticsManagerModule extends AbstractStatisticsManagerModule {
    public StatisticsManagerModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public StatisticsManagerModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.openflowplugin.applications.config.yang.statistics_manager.StatisticsManagerModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public AutoCloseable createInstance() {
        // StatisticsManager instance is created via blueprint so this in a no-op.
        return NoopAutoCloseable.INSTANCE;
    }
}
