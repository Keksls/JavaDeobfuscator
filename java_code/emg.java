/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.AbstractModule
 *  com.google.inject.Module
 *  com.google.inject.Scopes
 */
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.Scopes;

public final class emg
extends AbstractModule {
    @GL
    public Module a() {
        return new azt_0();
    }

    protected void configure() {
        this.bind(emd.class).to(emf.class).in(Scopes.SINGLETON);
    }
}

