/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.inject.AbstractModule
 *  com.google.inject.Module
 *  com.google.inject.Scopes
 *  com.google.inject.assistedinject.FactoryModuleBuilder
 */
import com.ankamagames.wakfu.client.WakfuClient;
import com.google.common.collect.ImmutableList;
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Scopes;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import java.util.List;

public final class aNz
extends AbstractModule {
    @GL
    public List<Module> a() {
        return ImmutableList.of((Object)((Object)new ccr_0()));
    }

    public void configure() {
        this.bind(WakfuClient.class).in(Scopes.SINGLETON);
        this.bind(csc_1.class).to(bxn_2.class);
        this.bind(csj_1.class).to(cKY.class);
        this.bind(csk_1.class).to(cLd.class);
        this.bind(csl_1.class).to(cLe.class);
        this.install(new FactoryModuleBuilder().implement(esy_2.class, cdj_1.class).build(csh_1.class));
    }
}

