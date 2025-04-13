/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class brn
implements ajh_1 {
    private static final Logger m = Logger.getLogger(brn.class);
    public static final String a = "name";
    public static final String b = "smallIconUrl";
    public static final String d = "circleIconUrl";
    public static final String e = "characterSheetSmallIllustrationUrl";
    public static final String f = "breedId";
    public static final String g = "dragEnabled";
    public static final String h = "isPlayer";
    public static final String i = "id";
    protected String j;
    protected final int k;
    protected boolean l = true;

    protected brn(faU faU2) {
        this.j = faU2.dp();
        this.k = faU2.gO();
    }

    protected brn(String string, int n) {
        this.j = string;
        this.k = n;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e();
        }
        if (string.equals(f)) {
            return this.k;
        }
        if (string.equals(g)) {
            return this.l;
        }
        if (string.equals(b) || string.equals(e)) {
            try {
                return String.format(azs_0.a().a("companionIconsPath"), this.k);
            }
            catch (gm_0 gm_02) {
                m.error((Object)"PropertyException during getFieldValue for SMALL_ICON_URL_FIELD or CHARACTER_SMALL_ICON_URL_FIELD", (Throwable)gm_02);
            }
        }
        if (string.equals(d)) {
            try {
                return String.format(azs_0.a().a("companionCircleIllustrationPath"), this.k);
            }
            catch (gm_0 gm_03) {
                m.error((Object)"PropertyException during getFieldValue for SMALL_ICON_URL_FIELD or CHARACTER_SMALL_ICON_URL_FIELD", (Throwable)gm_03);
            }
        }
        if (string.equals(h)) {
            return this.c();
        }
        if (string.equals(i)) {
            return this.a();
        }
        return null;
    }

    public abstract long a();

    public String e() {
        if (this.j != null && !this.j.isEmpty()) {
            return this.j;
        }
        bpb_1 bpb_12 = bpc_1.a().a((short)this.k);
        return bpb_12.f();
    }

    public int f() {
        return this.k;
    }

    public boolean c() {
        return false;
    }

    public void a(String string) {
        this.j = string;
    }

    public void a(boolean bl) {
        this.l = bl;
        fis_1.a().a((ajf_1)this, g);
    }

    public abstract brn b();
}

