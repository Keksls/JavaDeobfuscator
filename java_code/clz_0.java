/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from clZ
 */
public class clz_0
extends Pw {
    private static final byte[] a = new byte[0];
    private final long b;
    private final boolean c;
    private final int e;
    private final ezj_1 f;
    @Nullable
    private eyz_0 g;
    @Nullable
    private fiO h;
    @Nullable
    private ezx_2 i;

    public clz_0(long l, boolean bl, ezj_1 ezj_12) {
        this.b = l;
        this.c = bl;
        this.f = ezj_12;
        this.e = this.f.e();
    }

    @Override
    public byte[] b() {
        this.f.c(this.e);
        byte[] byArray = ezl_1.a(this.f, this.e);
        byte[] byArray2 = this.g == null ? a : eyy_0.b(this.g);
        byte[] byArray3 = this.h == null ? a : fiQ.a(this.h);
        byte[] byArray4 = this.i == null ? a : ezl_2.b(this.i);
        abx_2 abx_22 = new abx_2(clz_0.a(byArray, byArray2, byArray3, byArray4));
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        abx_22.a(byArray2.length);
        abx_22.b(byArray2);
        abx_22.a(byArray3.length);
        abx_22.b(byArray3);
        abx_22.a(byArray4.length);
        abx_22.b(byArray4);
        return this.a((byte)3, abx_22.c());
    }

    private static int a(byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        return 13 + byArray.length + 4 + byArray2.length + 4 + byArray3.length + 4 + byArray4.length;
    }

    @Override
    public int a() {
        return 12836;
    }

    public void a(@Nullable eyz_0 eyz_02) {
        this.g = eyz_02;
    }

    public void a(@Nullable fiO fiO2) {
        this.h = fiO2;
    }

    public void a(@Nullable ezx_2 ezx_22) {
        this.i = ezx_22;
    }
}

