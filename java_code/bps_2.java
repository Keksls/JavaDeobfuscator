/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bpS
 */
public class bps_2
extends bpc_2 {
    protected static final Logger a = Logger.getLogger(bps_2.class);
    private final blx_1 b;
    private int c;
    private final HashMap<String, Object> e = new HashMap();

    public bps_2(blx_1 blx_12) {
        this.b = blx_12;
    }

    @Override
    public short ac_() {
        return 20;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public void a() {
        this.b.a(false, true);
        this.b.a(this.c, this.e, true);
        this.b.a(this);
        if (this.h()) {
            this.i();
        }
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        if (bl2) {
            cpz_0 cpz_02 = new cpz_0();
            cpz_02.a((byte)3);
            cpz_02.a(this.ac_());
            azu_0.j().K().c(cpz_02);
        }
        return this.b();
    }

    @Override
    public boolean b() {
        if (this.h()) {
            this.j();
        }
        return true;
    }

    public void a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.getInt();
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.e.put(Cz.a(byArray2), byteBuffer.getLong());
        }
    }

    private boolean h() {
        bhu bhu2 = bhA.a.c(this.c);
        if (bhu2 == null) {
            a.error((Object)("Emote inconnu: " + this.c));
            return false;
        }
        boolean bl = this.b == azu_0.j().k();
        return bl && bhu2.h();
    }

    private void i() {
        amc_1 amc_12 = cdl_0.a.b();
        amc_12.a(amc_12.a() * 0.2f, 700.0f);
    }

    private void j() {
        amc_1 amc_12 = cdl_0.a.b();
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        float f2 = bvx_02.c(ago_0.a);
        amc_12.a(f2, 700.0f);
    }

    @Override
    public boolean f() {
        return true;
    }
}

