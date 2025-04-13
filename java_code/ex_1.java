/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from Ex
 */
public final class ex_1 {
    private ex_1() {
    }

    public static void a(fp_0 fp_02, eg_1 eg_12) {
        int n;
        int n2;
        Object object;
        int n3;
        fp_02.a(eg_12.a());
        if (fp_02.g()) {
            fp_02.a(eg_12.d());
        }
        if (fp_02.i()) {
            fp_02.b(eg_12.d());
        }
        if (fp_02.h()) {
            n3 = eg_12.b() & 0xFFFF;
            object = new String[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                object[n2] = eg_12.e();
            }
            fp_02.a((String[])object);
        }
        if (fp_02.j()) {
            n3 = eg_12.a() & 0xFF;
            object = new ArrayList(n3);
            for (n2 = 0; n2 < n3; ++n2) {
                int n4 = eg_12.c();
                n = eg_12.c();
                object.add(new FS(n4, n));
            }
            fp_02.b((List<FS>)object);
        }
        if (fp_02.m()) {
            n3 = eg_12.a() & 0xFF;
            object = new ArrayList(n3);
            for (n2 = 0; n2 < n3; ++n2) {
                String string = eg_12.e();
                n = eg_12.c();
                object.add(new FR(string, n));
            }
            fp_02.c((List<FR>)object);
        }
        if (fp_02.n()) {
            fq_0 fq_02 = new fq_0();
            ew_1.a(fq_02, eg_12);
            fp_02.a(fq_02);
        }
        int n5 = eg_12.b() & 0xFFFF;
        fp_02.a(new fo_0[n5]);
        object = fp_02.b();
        for (n2 = 0; n2 < ((String[])object).length; ++n2) {
            fo_0 fo_02 = new fo_0();
            object[n2] = fo_02;
            ev_1.a(fo_02, eg_12);
        }
    }
}

