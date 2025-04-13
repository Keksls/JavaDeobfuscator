/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awq
 */
public class awq_1
extends awd_2<avz_1> {
    public static final awq_1 a = new awq_1();

    private awq_1() {
    }

    @Override
    protected byte a() {
        return 2;
    }

    public avz_1 a(DataInput dataInput, float f2) {
        float f3 = awq_1.e(dataInput, f2);
        float f4 = awq_1.e(dataInput, f2);
        float f5 = awq_1.e(dataInput, f2);
        mu_1 mu_12 = new mu_1();
        mu_12.a(f3);
        mu_12.b(f4);
        mu_12.c(f5);
        return new avz_1(mu_12);
    }

    @Override
    protected boolean a(avz_1 avz_12, avz_1 avz_13) {
        mu_1 mu_12 = avz_12.b();
        mu_1 mu_13 = avz_13.b();
        return mu_12.a() == mu_13.a() && mu_12.b() == mu_13.b() && mu_12.c() == mu_13.c();
    }

    @Override
    public /* synthetic */ Object b(DataInput dataInput, float f2) {
        return this.a(dataInput, f2);
    }
}

