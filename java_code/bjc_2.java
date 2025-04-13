/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bJc
 */
public class bjc_2
extends big_1 {
    private static final Logger a = Logger.getLogger(bjc_2.class);
    private int g;
    private short h;
    private int i;
    private int j;
    private int k;

    public bjc_2(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        if (stringArray.length != 4) {
            a.error((Object)"[LD] Mauvais nombre de param\u00e8tres sur une action d'item");
            return;
        }
        int n = Integer.parseInt(stringArray[0]);
        this.g = Integer.parseInt(stringArray[1]);
        this.h = Short.parseShort(stringArray[2]);
        this.i = Integer.parseInt(stringArray[3]);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        if (!this.q()) {
            return false;
        }
        if (azu_0.j().c(dcw.n()) && dcw.n().a() == exk_22) {
            azu_0.j().b(dcw.n());
            return false;
        }
        fyt_0.a().a(frb_0.l, true);
        bjd_2 bjd_22 = new bjd_2(this);
        dei.a().a(bjd_22);
        fta_0.getInstance().addEventListener(frd_0.B, bjd_22, true);
        if (exk_22 != null) {
            if (azu_0.j().c(dcw.n())) {
                azu_0.j().b(dcw.n());
            } else {
                dcw.n().a(exk_22);
                dcw.n().d();
                azu_0.j().a(dcw.n());
            }
        }
        return true;
    }

    private boolean q() {
        bmr_1 bmr_12 = azu_0.j().k();
        Optional<ece_0> optional = bmr_12.eW();
        if (optional.isEmpty()) {
            bQG.a();
            bQG.a(40, new Object[0]);
            return false;
        }
        if (bmr_12.f(erl_2.bd)) {
            bQG.a();
            bQG.a(39, new Object[0]);
            return false;
        }
        bvc_2 bvc_22 = bvz_2.a.b();
        if (bvc_22 != null) {
            return false;
        }
        if (!optional.get().e(this.g)) {
            bQG.a();
            bQG.a(21, new Object[0]);
            return false;
        }
        short s2 = optional.get().f(this.g);
        if (s2 < this.h) {
            bQG.a();
            bQG.a(4, new Object[0]);
            return false;
        }
        bNI bNI2 = (bNI)bNJ.a().a(this.i);
        if (bNI2 == null) {
            bQG.a();
            bQG.a(1, new Object[0]);
            return false;
        }
        if (bjc_2.r()) {
            aUh.a("error.notInOwnHavenWorld", new Object[0]);
            return false;
        }
        return !azu_0.j().k().dh();
    }

    private static boolean r() {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.T_();
        bos_2 bos_22 = bmr_12.eV();
        long l2 = bos_22.d();
        return cci_2.a.d(l) && !cci_2.a.a(l, l2);
    }

    public int g() {
        return this.g;
    }

    public short h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public void a(exk_2 exk_22, int n, int n2) {
        dcw.n().i();
        this.j = n;
        this.k = n2;
        this.a(exk_22.a());
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.j);
        byteBuffer.putInt(this.k);
        return true;
    }

    @Override
    public int b() {
        return super.b() + 4 + 4;
    }

    @Override
    public void c() {
        this.j = 0;
        this.k = 0;
    }

    @Override
    public eyx_1 f() {
        return eyx_1.a;
    }
}

