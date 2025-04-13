/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.log4j.Logger;

/*
 * Renamed from aEE
 */
final class aee_1
extends aed_1 {
    private static final byte[] c = new byte[65536];
    protected static final Logger b = Logger.getLogger(aee_1.class);
    private InputStream d;
    private byte[] e;
    private boolean f;

    aee_1(aeo_1 aeo_12) {
        super(aeo_12);
    }

    @Override
    public boolean a() {
        return this.f;
    }

    @Override
    public void b() {
        if (this.d == null) {
            File file = new File(this.a.c());
            this.d = new FileInputStream(file);
            this.e = new byte[0];
            this.f = false;
        } else {
            int n = this.d.read(c);
            if (n > 0) {
                byte[] byArray = new byte[this.e.length + n];
                System.arraycopy(this.e, 0, byArray, 0, this.e.length);
                System.arraycopy(c, 0, byArray, this.e.length, n);
                this.e = byArray;
            } else if (n < 0) {
                this.f = true;
                this.d.close();
                this.d = null;
                this.a.a(this.e);
                this.a.d();
            }
        }
    }
}

