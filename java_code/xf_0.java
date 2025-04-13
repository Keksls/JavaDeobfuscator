/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/*
 * Renamed from XF
 */
public enum xf_0 {
    a("config.properties", new String[0]);

    private final String b;
    private final Set<String> c;

    private xf_0(String string2, String ... stringArray) {
        this.b = string2;
        this.c = ImmutableSet.copyOf((Object[])stringArray);
    }

    public static xf_0 a(String string) {
        for (xf_0 xf_02 : xf_0.values()) {
            if (!xf_02.c.contains(string)) continue;
            return xf_02;
        }
        return a;
    }

    public String a() {
        return this.b;
    }
}

