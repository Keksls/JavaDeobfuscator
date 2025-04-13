/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bmI
 */
final class bmi_2
extends eqk_2 {
    private final sg_2 b;
    final /* synthetic */ bmr_1 a;

    bmi_2(bmr_1 bmr_12, sg_2 sg_22) {
        this.a = bmr_12;
        this.b = sg_22;
        this.b.a().a(this);
    }

    @Override
    public void b() {
        this.a.dw().d();
        fiR fiR2 = fiQ.b(ByteBuffer.wrap(this.b.c));
        this.a.dw().a(fiR2);
    }

    @Override
    public void a() {
    }
}

