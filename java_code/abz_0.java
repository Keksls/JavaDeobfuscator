/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from abz
 */
public class abz_0
extends aby_0
implements YP {
    protected static final Logger Y = Logger.getLogger(abz_0.class);
    public static final short Z = 6;
    private boolean ac = false;
    protected boolean aa = false;
    protected final ArrayList<afu_0> ab = new ArrayList();

    public abz_0() {
    }

    public abz_0(long l) {
        super(l);
    }

    public abz_0(long l, float f2, float f3) {
        super(l, f2, f3);
    }

    public abz_0(long l, float f2, float f3, float f4) {
        super(l, f2, f3, f4);
    }

    @Override
    public void a(short s2) {
        this.U = s2;
    }

    public boolean aD() {
        return this.ac;
    }

    @Override
    public void e(boolean bl) {
        if (bl != this.ac) {
            this.ac = bl;
            this.aa = true;
        }
    }

    public boolean aE() {
        return true;
    }

    public void a(afu_0 afu_02) {
        if (!this.ab.contains(afu_02)) {
            this.ab.add(afu_02);
        }
    }

    public void b(afu_0 afu_02) {
        this.ab.remove(afu_02);
    }

    public void aF() {
        this.ab.clear();
    }

    @Override
    public boolean a(ahg_0 ahg_02, int n) {
        boolean bl = super.a(ahg_02, n);
        if (this.aa) {
            this.aG();
        }
        return bl;
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        super.a(acb_02, n);
        if (this.aa) {
            this.aG();
        }
    }

    private void aG() {
        for (afu_0 afu_02 : this.ab) {
            afu_02.a(this, this.aD());
        }
        this.aa = false;
    }

    @Override
    public int f() {
        return -1;
    }

    @Override
    public azj_2 h() {
        return azf_2.e;
    }

    @Override
    public String g() {
        return "";
    }
}

