/*
 * Decompiled with CFR 0.152.
 */
public abstract class eDx
extends Enum<eDx> {
    public static final /* enum */ eDx a = new eDy(true, eDk.b);
    public static final /* enum */ eDx b = new eDz(false, eDk.b);
    public static final /* enum */ eDx c = new eda_0(false, eDk.c);
    private final boolean d;
    private final eDk e;
    private static final /* synthetic */ eDx[] f;

    public static eDx[] values() {
        return (eDx[])f.clone();
    }

    public static eDx valueOf(String string) {
        return Enum.valueOf(eDx.class, string);
    }

    eDx(boolean bl, eDk eDk2) {
        this.d = bl;
        this.e = eDk2;
    }

    public abstract Sm<efh_0> a(ezr_0 var1, exk_2 var2);

    public boolean a() {
        return this.d;
    }

    public eDk b() {
        return this.e;
    }

    static {
        f = new eDx[]{a, b, c};
    }
}

