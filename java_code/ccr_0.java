/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.inject.AbstractModule
 *  com.google.inject.Module
 *  com.google.inject.Provides
 *  com.google.inject.Scopes
 *  com.google.inject.Singleton
 */
import com.google.common.collect.ImmutableList;
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import java.util.List;

/*
 * Renamed from cCR
 */
public final class ccr_0
extends AbstractModule {
    @GL
    public Module a() {
        return new cDb();
    }

    protected void configure() {
        this.bind(ccp_0.class).to(ccq_0.class).in(Scopes.SINGLETON);
    }

    @Provides
    @Singleton
    List<cco_0> a(ccw_0 ccw_02) {
        return ImmutableList.of((Object)ccw_02);
    }
}

