/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsh
 */
public class fsh_0
implements fac_2,
fad_2 {
    public static final float a = 1.0f;
    private final faj_2 b;
    private float c;

    public fsh_0(faj_2 faj_22) {
        this.b = faj_22;
    }

    @Override
    public void a() {
        this.b.setOffset(this.c);
    }

    @Override
    public void a(float f2) {
        if (f2 == 0.0f && this.c > 1.0f) {
            return;
        }
        this.c = f2;
    }
}

