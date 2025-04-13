/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bIH
 */
public class bih_1
extends big_1 {
    private static final Logger a = Logger.getLogger(bih_1.class);
    private int g;
    private int h;
    private int i;

    public bih_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        if (stringArray.length != 1) {
            a.error((Object)"[LD] Mauvais nombre de param\u00e8tres sur une action d'item");
            return;
        }
        this.g = Integer.parseInt(stringArray[0]);
    }

    public int g() {
        return this.g;
    }

    @Override
    public boolean a(exk_2 exk_22) {
        if (!this.h()) {
            return false;
        }
        bii_1 bii_12 = new bii_1(this);
        dei.a().a(bii_12);
        fta_0.getInstance().addEventListener(frd_0.B, bii_12, true);
        if (exk_22 != null) {
            if (azu_0.j().c(dam_0.a())) {
                azu_0.j().b(dam_0.a());
            } else {
                dam_0.a().a(exk_22);
                azu_0.j().a(dam_0.a());
            }
        }
        return true;
    }

    private boolean h() {
        bmr_1 bmr_12 = azu_0.j().k();
        bvc_2 bvc_22 = bvz_2.a.b();
        if (bvc_22 != null) {
            return false;
        }
        if (!bih_1.i()) {
            aUh.a("error.notInOwnHavenWorld", new Object[0]);
            return false;
        }
        if (!this.q()) {
            aUh.a("guild.rank.missing", new Object[]{bae.h().a(eQt.i.name(), new Object[0])});
            return false;
        }
        return true;
    }

    private static boolean i() {
        bmr_1 bmr_12 = azu_0.j().k();
        bos_2 bos_22 = bmr_12.eV();
        long l = bos_22.d();
        if (l <= 0L) {
            return false;
        }
        long l2 = bmr_12.T_();
        return l2 == cci_2.a.b(l);
    }

    private boolean q() {
        bmr_1 bmr_12 = azu_0.j().k();
        return eqt_2.a(bmr_12.eV(), bmr_12.eV().a(bmr_12.a_()), eQt.i);
    }

    public void a(exk_2 exk_22, int n, int n2) {
        this.h = n;
        this.i = n2;
        this.a(exk_22.a());
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.h);
        byteBuffer.putInt(this.i);
        return true;
    }

    @Override
    public int b() {
        return super.b() + 4 + 4;
    }

    @Override
    public void c() {
        this.h = 0;
        this.i = 0;
        this.a((aff_1)null);
    }

    @Override
    public eyx_1 f() {
        return eyx_1.B;
    }
}

