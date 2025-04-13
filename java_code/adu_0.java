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
 * Renamed from adu
 */
class adu_0
extends CacheLoader<String, azk_2> {
    adu_0() {
    }

    public azk_2 a(@NotNull String string) {
        return azl_1.a().a("TGA").b(string);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.a((String)object);
    }
}

