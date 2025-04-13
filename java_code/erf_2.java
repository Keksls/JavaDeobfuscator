/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from erf
 */
public class erf_2
extends erd_2 {
    private static erf_2 a;

    public erf_2() {
    }

    public erf_2(short s2, String string, int n, short s3, epq_2 epq_22, int n2, fiz<fio_0> fiz2) {
        super(s2, string, n, s3, epq_22, n2, fiz2);
    }

    public erf_2(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        super(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    public static erf_2 d() {
        return a;
    }

    public static void a(erf_2 erf_22) {
        a = erf_22;
    }

    @Override
    protected byte r() {
        return 3;
    }
}

