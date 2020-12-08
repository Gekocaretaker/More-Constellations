package com.gekocaretaker.mcas.common;

import com.google.common.collect.Lists;
import hellfirepvp.astralsorcery.common.CommonScheduler;
import hellfirepvp.astralsorcery.common.data.config.CommonConfig;
import hellfirepvp.astralsorcery.common.data.config.ServerConfig;
import hellfirepvp.astralsorcery.common.registry.internal.InternalRegistryPrimer;
import hellfirepvp.astralsorcery.common.registry.internal.PrimerEventHandler;
import hellfirepvp.astralsorcery.common.util.ServerLifecycleListener;
import hellfirepvp.observerlib.common.util.tick.TickManager;

import java.util.List;

public class CommonProxy {
    private InternalRegistryPrimer registryPrimer;
    private PrimerEventHandler registryEventHandler;
    private CommonScheduler commonScheduler;
    private TickManager tickManager;
    private List<ServerLifecycleListener> serverLifecycleListeners = Lists.newArrayList();

    private CommonConfig commonConfig;
    private ServerConfig serverConfig;

    public void initialize() {
        this.registryPrimer = new InternalRegistryPrimer();
        this.registryEventHandler = new PrimerEventHandler(this.registryPrimer);
        this.commonScheduler = new CommonScheduler();

        this.commonConfig = new CommonConfig();
        this.serverConfig = new ServerConfig();
    }
}
