/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eTG
 */
public class etg_2
implements Comparable<etg_2> {
    private final short a;
    private final short b;
    private final wx_0 c;
    private final short d;
    private final byte e;

    public etg_2(short s2, short s3, short s4, long l, byte by) {
        this.d = s2;
        this.a = s3;
        this.b = s4;
        this.c = ww_0.b(l);
        this.e = by;
    }

    public short a() {
        return this.d;
    }

    public short b() {
        return this.a;
    }

    public short c() {
        return this.b;
    }

    public wx_0 d() {
        return this.c;
    }

    public boolean e() {
        return !this.c.e();
    }

    public int a(@NotNull etg_2 etg_22) {
        return this.e - etg_22.e;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((etg_2)object);
    }
}

