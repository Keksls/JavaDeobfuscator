/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Module
 */
import com.google.inject.Module;

public interface Gx {
    public Module a(Module ... var1);

    public <T extends Module> Gx a(Class<T> var1, T var2);

    public Gx b(Module ... var1);

    public Gx a(Class<? extends Module> var1, Module ... var2);

    public Gx b(Class<? extends Module> var1, Module ... var2);
}

