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
 * Renamed from aeX
 */
class aex_0
extends CacheLoader<String, byte[]> {
    aex_0() {
    }

    public byte[] a(@NotNull String string) {
        return arl_1.b(string);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.a((String)object);
    }
}

