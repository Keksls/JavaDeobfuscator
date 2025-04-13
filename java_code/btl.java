/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class btl
implements ajh_1 {
    public static final String a = "item";
    public static final String b = "quantity";
    private final int d;
    private final bl_0 e;
    private final AY f;

    public btl(int n, bl_0 bl_02, AY aY) {
        this.d = n;
        this.e = bl_02;
        this.f = aY;
    }

    @Override
    public String[] d() {
        return new String[]{a, b};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            Object r2 = eyo_1.g().d(Hw.e((long)this.d));
            return new bht_1((ezr_0<bhg_0>)r2);
        }
        if (string.equals(b)) {
            return this.f.g();
        }
        return null;
    }

    public bl_0 a() {
        return this.e;
    }

    public int b() {
        return this.d;
    }

    public AY c() {
        return this.f;
    }
}

