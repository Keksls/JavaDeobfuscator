/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aGp$aGs
 *  com.google.common.cache.CacheLoader
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.cache.CacheLoader;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aGr
 */
class agr_2
extends CacheLoader<String, agp_2.aGs> {
    final /* synthetic */ agp_2 a;

    agr_2(agp_2 agp_22) {
        this.a = agp_22;
    }

    public agp_2.aGs a(@NotNull String string) {
        return this.a.b(string);
    }

    public /* synthetic */ Object load(@NotNull Object object) {
        return this.a((String)object);
    }
}

