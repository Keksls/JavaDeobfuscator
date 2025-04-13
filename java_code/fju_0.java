/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fjU
 */
public final class fju_0 {
    public static final float a = 0.9f;

    public static fjt_0 a(Yf yf, float f2, float f3) {
        fjr_0 fjr_02 = fjr_0.a(yf);
        if (fjr_02 == fjr_0.b) {
            return fjt_0.a;
        }
        fjs_0 fjs_02 = fjs_0.a(Math.round(f2));
        if (fjr_02 == fjr_0.c) {
            if (fjs_02 == fjs_0.a) {
                return fjt_0.g;
            }
            return fjt_0.b;
        }
        if (fjs_02 == fjs_0.a) {
            return f3 > 0.9f ? fjt_0.f : fjt_0.d;
        }
        return f3 > 0.9f ? fjt_0.e : fjt_0.c;
    }

    public static fjt_0 a(Ye ye) {
        return fju_0.a(ye.f(), ye.g(), ye.h());
    }
}

