/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fyL
 */
public class fyl_0
extends fbo_2 {
    public static final String TAG = "Sound";
    private int b = -1;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setSoundId(int n) {
        this.b = n;
    }

    public int getSoundId() {
        return this.b;
    }

    @Override
    public void a() {
        if (this.b != -1) {
            fza_0.a().a(this.b);
        }
    }
}

