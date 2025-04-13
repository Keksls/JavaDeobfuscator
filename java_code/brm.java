/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class brm
extends brn {
    private static final Logger m = Logger.getLogger(brm.class);
    private final byte n;
    private final long o;

    public brm(faU faU2) {
        super(faU2);
        this.o = faU2.a_();
        this.n = faU2.gX();
    }

    public brm(long l, String string, int n, byte by) {
        super(string, n);
        this.o = l;
        this.n = by;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals("smallIconUrl") || string.equals("characterSheetSmallIllustrationUrl")) {
            try {
                return String.format(azs_0.a().a("breedPortraitIllustrationPath"), String.valueOf(this.k) + String.valueOf(this.n));
            }
            catch (gm_0 gm_02) {
                m.error((Object)"PropertyException during getFieldValue for SMALL_ICON_URL_FIELD or CHARACTER_SMALL_ICON_URL_FIELD", (Throwable)gm_02);
            }
        }
        return super.b(string);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public long a() {
        return this.o;
    }

    @Override
    public brn b() {
        brm brm2 = new brm(this.a(), this.e(), this.f(), this.n);
        return brm2;
    }
}

