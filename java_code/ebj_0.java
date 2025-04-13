/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from eBJ
 */
public final class ebj_0 {
    public static ebh_0 a(long l) {
        Collection<ebh_0> collection = ebi_0.a.a();
        for (ebh_0 ebh_02 : collection) {
            if ((long)ebh_02.d() > l || (long)ebh_02.e() < l) continue;
            return ebh_02;
        }
        return ebi_0.a.b();
    }
}

