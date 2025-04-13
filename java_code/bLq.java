/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bLq
extends bLP {
    private static final Logger a = Logger.getLogger(bLq.class);
    private long b;

    public bLq(long l, String string) {
        super(l, null, string, null);
        this.h();
    }

    private void h() {
        URL uRL = null;
        try {
            uRL = new URL(azs_0.b("completeMapCoordsPath", this.j()));
        }
        catch (gm_0 gm_02) {
            return;
        }
        catch (MalformedURLException malformedURLException) {
            return;
        }
        ath_2 ath_22 = bLq.a(uRL);
        if (ath_22 == null) {
            return;
        }
        ati_2 ati_22 = ath_22.a();
        aqx_2 aqx_22 = ati_22.f("soundId");
        this.b = aqx_22 != null ? aqx_22.h() : -1L;
        ArrayList<aqx_2> arrayList = ati_22.d("coord");
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            blp_0 blp_02 = bLq.a(arrayList.get(k));
            this.a(blp_02);
            this.a((fwB)blp_02);
        }
    }

    private static ath_2 a(URL uRL) {
        atg_2 atg_22 = new atg_2();
        ath_2 ath_22 = new ath_2();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream());
            atg_22.a(bufferedInputStream);
            atg_22.a(ath_22, new aqy_2[0]);
            atg_22.l();
            bufferedInputStream.close();
        }
        catch (Exception exception) {
            a.error((Object)("Probl\u00e8me lors de la lecture du fichier de map d'url : " + uRL));
            return null;
        }
        return ath_22;
    }

    private static blp_0 a(aqx_2 aqx_22) {
        Object object;
        boolean bl;
        int n = aqx_22.f("id").g();
        int n2 = aqx_22.f("startX").g();
        int n3 = aqx_22.f("startY").g();
        int n4 = aqx_22.f("endX").g();
        int n5 = aqx_22.f("endY").g();
        aqx_2 aqx_23 = aqx_22.f("scrollDecorator");
        byte by = aqx_23 != null ? aqx_23.e() : (byte)0;
        aqx_2 aqx_24 = aqx_22.f("animName1");
        String string = aqx_24 != null ? aqx_24.c() : null;
        aqx_2 aqx_25 = aqx_22.f("animName2");
        String string2 = aqx_25 != null ? aqx_25.c() : null;
        aqx_2 aqx_26 = aqx_22.f("highlightSoundId");
        long l = aqx_26 != null ? aqx_26.h() : -1L;
        aqx_2 aqx_27 = aqx_22.f("type");
        blh_1 blh_12 = blh_1.c;
        aqx_2 aqx_28 = aqx_22.f("display");
        boolean bl2 = bl = aqx_28 == null || aqx_28.d();
        if (aqx_27 != null && (object = blh_1.a(aqx_27.c())) != null) {
            blh_12 = object;
        }
        object = null;
        if (blh_12 == blh_1.c) {
            object = n == 0 ? "???" : bae.h().a(77, (long)n, new Object[0]);
        } else if (blh_12 == blh_1.e) {
            object = n == 0 ? "???" : bae.h().a(145, (long)n, new Object[0]);
        } else if (blh_12 == blh_1.f && n >= 0) {
            object = n == 0 ? "???" : bae.h().a(144, (long)n, new Object[0]);
        }
        xd_0 xd_02 = bl ? bLq.a(n2, n4, n3, n5) : null;
        return new blp_0(xd_02, n, blh_12, (String)object, by, string, string2, l);
    }

    @Override
    private void a(blp_0 blp_02) {
        blh_1 blh_12 = blp_02.a();
        long l = blp_02.j();
        fwt fwt2 = null;
        switch (blh_12) {
            case e: {
                fwt2 = new bLq(l, blp_02.bc_());
                break;
            }
            case d: {
                short s2 = (short)l;
                TLongArrayList tLongArrayList = ccs_1.a().b(s2);
                fwt2 = new bLM(s2, tLongArrayList);
                break;
            }
            case c: {
                if (l == 0L) break;
                fwt2 = new blb_1(l, false);
            }
        }
        if (fwt2 != null) {
            fwt2.a(this);
            blg_1.a().a(blh_12, fwt2.j(), (bLP)fwt2);
        }
    }

    private static xd_0 a(int n, int n2, int n3, int n4) {
        xd_0 xd_02 = new xd_0();
        for (int k = n; k <= n2; ++k) {
            for (int i2 = n3; i2 <= n4; ++i2) {
                xd_02.a(k, i2);
            }
        }
        return xd_02;
    }

    @Override
    public azj_2 aX_() {
        return azf_2.b;
    }

    @Override
    public String b() {
        try {
            return azs_0.b("completeMapPath", this.j());
        }
        catch (gm_0 gm_02) {
            return null;
        }
    }

    public long c() {
        return this.b;
    }

    @Override
    public void a(blo_0 blo_02) {
        blo_02.z().e();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean f() {
        bLP bLP2 = this.s();
        return bLP2 != null;
    }

    @Override
    public void b(blo_0 blo_02) {
        bLP bLP2 = this.s();
        if (bLP2 != null) {
            ble_1.E().a(bLP2);
        }
    }

    private bLP s() {
        bLP bLP2;
        for (bLP2 = blg_1.a().b(blh_1.c, azu_0.j().k().T_()); bLP2 != null && bLP2.q() != this; bLP2 = (bLP)bLP2.q()) {
        }
        return bLP2;
    }
}

