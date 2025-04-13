/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bPj
 */
public class bpj_0
implements Comparable {
    private final bph_0 a;
    private bpl_0 b;

    public bpj_0(bph_0 bph_02, bpl_0 bpl_02) {
        this.a = bph_02;
        this.b = bpl_02;
    }

    public bph_0 a() {
        return this.a;
    }

    public bpl_0 b() {
        return this.b;
    }

    public void a(bpl_0 bpl_02) {
        this.b = bpl_02;
    }

    public int compareTo(@NotNull Object object) {
        if (!(object instanceof bpj_0)) {
            return 0;
        }
        return this.a.F() - ((bpj_0)object).a.F();
    }
}

