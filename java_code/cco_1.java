/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ccO
 */
public class cco_1
implements csi_1 {
    static final Logger b = Logger.getLogger(cco_1.class);
    public static final cco_1 a = new cco_1();
    private final ccp_2 c = new ccp_2("patchImagePath", "patchImageOffsetFile");
    private final ccp_2 d = new ccp_2("buildingImagePath", "buildingImageOffsetFile");

    private cco_1() {
        try {
            this.c.c();
            this.d.c();
        }
        catch (Exception exception) {
            b.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public float a() {
        return this.c.a();
    }

    @Override
    public float b() {
        return this.d.a();
    }

    @Override
    public afe_1 a(int n) {
        return this.c.b(n);
    }

    @Override
    public afe_1 b(int n) {
        return this.d.b(n);
    }

    @Override
    public ays_2 c(int n) {
        return this.c.a(n);
    }

    @Override
    public ays_2 d(int n) {
        return this.d.a(n);
    }

    public afe_1 e(int n) {
        return this.c.c(n);
    }

    public afe_1 f(int n) {
        return this.d.c(n);
    }

    @Override
    public void c() {
        this.c.b();
        this.d.b();
    }
}

