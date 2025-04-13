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
 * Renamed from avq
 */
class avq_2
extends CacheLoader<String, String> {
    avq_2() {
    }

    public String a(@NotNull String string) {
        byte[] byArray = gg_0.b(string);
        return new String(byArray);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.a((String)object);
    }
}

