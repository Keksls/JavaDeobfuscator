/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.cache.CacheLoader;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bLD
 */
class bld_1
extends CacheLoader<String, byte[]> {
    bld_1() {
    }

    public byte[] a(@NotNull String string) {
        return gg_0.b(string);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.a((String)object);
    }
}

