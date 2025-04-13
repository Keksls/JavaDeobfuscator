/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bVX
 */
public class bvx_0
extends agk_0<bvo_0, bvp_0>
implements ajc_1 {
    public static final String d = "languageIcon";
    protected static final Logger e = Logger.getLogger(bvx_0.class);
    private static final short l = 16;
    public static final String f = "chatWindowModulationColor";
    public static final String g = "availableRelicAuraMode";
    public static final String h = "availableTitleColorMode";
    public static final String i = "autoRunModes";
    private static final String[] m = new String[]{"chatWindowModulationColor", "availableRelicAuraMode", "availableTitleColorMode"};
    protected final eux_2<bmr_1> j = new bvy_0(this);
    final FileFilter k = new bvz_0(this);

    public bvx_0() {
        euw_2.a.a(this.j);
    }

    @Override
    public agp_0 a(String string) {
        agp_0 agp_02 = bWe.a(string);
        return agp_02 != null ? agp_02 : super.a(string);
    }

    @Override
    public String[] d() {
        String[] stringArray = super.d();
        bWe[] bWeArray = bWe.values();
        String[] stringArray2 = new String[stringArray.length + bWeArray.length + m.length];
        System.arraycopy(stringArray2, 0, stringArray, 0, stringArray.length);
        int n = stringArray.length;
        for (bWe bWe2 : bWeArray) {
            stringArray2[n] = bWe2.b();
            ++n;
        }
        System.arraycopy(m, 0, stringArray2, stringArray.length + bWeArray.length, m.length);
        return stringArray2;
    }

    @Override
    public Object b(String string) {
        if (string.equals(d)) {
            Ow ow = bae.h().f();
            try {
                return String.format(azs_0.a().a("langIconsPath"), ow.b().getLanguage().toUpperCase());
            }
            catch (gm_0 gm_02) {
                e.warn((Object)gm_02.getMessage());
                return null;
            }
        }
        if (string.equals(agq_0.a.b())) {
            Ow ow = bae.h().f();
            return ow != null ? ow.b().getLanguage() : null;
        }
        if (string.equals(bWe.d.b())) {
            return this.a(bWe.d);
        }
        if (string.equals(bWe.e.b())) {
            return this.f(bWe.e);
        }
        if (string.equals(bWe.p.b())) {
            return this.a(bWe.p);
        }
        if (string.equals(bWe.q.b())) {
            return this.a(bWe.q);
        }
        if (string.equals(bWe.o.b())) {
            return bWd.a((byte)this.d(bWe.o));
        }
        if (string.equals(bWe.r.b())) {
            return this.a(bWe.r);
        }
        if (string.equals(bWe.s.b())) {
            return this.a(bWe.s);
        }
        if (string.equals(bWe.t.b())) {
            return this.a(bWe.t);
        }
        if (string.equals(bWe.C.b())) {
            return this.a(bWe.C);
        }
        if (string.equals(bWe.u.b())) {
            return this.a(bWe.u);
        }
        if (string.equals(bWe.v.b())) {
            return this.a(bWe.v);
        }
        if (string.equals(bWe.D.b())) {
            return this.a(bWe.D);
        }
        if (string.equals(bWe.E.b())) {
            return this.a(bWe.E);
        }
        if (string.equals(bWe.F.b())) {
            return this.a(bWe.F);
        }
        if (string.equals(bWe.G.b())) {
            return this.a(bWe.G);
        }
        if (string.equals(bWe.H.b())) {
            return aPw.a((byte)this.d(bWe.H));
        }
        if (string.equals(bWe.I.b())) {
            return aPw.values();
        }
        if (string.equals(bWe.J.b())) {
            return this.a(bWe.J);
        }
        if (string.equals(bWe.K.b())) {
            return this.a(bWe.K);
        }
        if (string.equals(bWe.L.b())) {
            return this.a(bWe.L);
        }
        if (string.equals(bWe.M.b())) {
            return this.a(bWe.M);
        }
        if (string.equals(bWe.O.b())) {
            return fqz_0.a(this.d(bWe.O));
        }
        if (string.equals(bWe.P.b())) {
            return this.a(bWe.P);
        }
        if (string.equals(bWe.Q.b())) {
            return Float.valueOf(this.c(bWe.Q) * 2.0f);
        }
        if (string.equals(bWe.S.b())) {
            return this.a(bWe.S);
        }
        if (string.equals(bWe.U.b())) {
            return this.a(bWe.U);
        }
        if (string.equals(bWe.W.b())) {
            return this.d(bWe.W);
        }
        if (string.equals(bWe.X.b())) {
            return this.a(bWe.X);
        }
        if (string.equals(bWe.Y.b())) {
            return this.a(bWe.Y);
        }
        if (string.equals(bWe.Z.b())) {
            return this.a(bWe.Z);
        }
        if (string.equals(bWe.aa.b())) {
            return this.a(bWe.aa);
        }
        if (string.equals(bWe.V.b())) {
            return this.a(bWe.V);
        }
        if (string.equals(bWe.af.b())) {
            return this.a(bWe.af);
        }
        if (string.equals(bWe.ag.b())) {
            return this.a(bWe.ag);
        }
        if (string.equals(bWe.ad.b())) {
            return this.a(bWe.ad);
        }
        if (string.equals(bWe.ae.b())) {
            return this.a(bWe.ae);
        }
        if (string.equals(bWe.x.b())) {
            bvq_0 bvq_02 = bvq_0.a((byte)this.d(bWe.x));
            if (bvq_02 == null) {
                return bae.h().a(bvq_0.a.b(), new Object[0]);
            }
            return bae.h().a(bvq_02.b(), new Object[0]);
        }
        if (string.equals(bWe.z.b())) {
            bvu_0 bvu_02 = bvu_0.c();
            if (bvu_02 == null) {
                return bae.h().a(bvu_0.a.b(), new Object[0]);
            }
            return bae.h().a(bvu_02.b(), new Object[0]);
        }
        if (string.equals(bWe.w.b())) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (bvq_0 bvq_03 : bvq_0.values()) {
                arrayList.add(bae.h().a(bvq_03.b(), new Object[0]));
            }
            return arrayList;
        }
        if (string.equals(g)) {
            return bvt_0.values();
        }
        if (string.equals(h)) {
            return bvv_0.values();
        }
        if (string.equals(bWe.aI.b())) {
            int n = this.d(bWe.aI);
            return bvt_0.a(n).orElse(bvt_0.a);
        }
        if (string.equals(bWe.aJ.b())) {
            int n = this.d(bWe.aJ);
            return bvv_0.a(n).orElse(bvv_0.a);
        }
        if (string.equals(bWe.y.b())) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (bvu_0 bvu_03 : bvu_0.values()) {
                arrayList.add(bae.h().a(bvu_03.b(), new Object[0]));
            }
            return arrayList;
        }
        if (string.equals(bWe.T.b())) {
            return this.a(bWe.T);
        }
        if (string.equals(bWe.al.b())) {
            return this.a(bWe.al);
        }
        if (string.equals(i)) {
            return blu_1.values();
        }
        if (string.equals(bWe.am.b())) {
            return blu_1.a(this.d(bWe.am));
        }
        if (string.equals(bWe.ar.b())) {
            return this.a(bWe.ar);
        }
        if (string.equals(bWe.A.b())) {
            return this.a(bWe.A);
        }
        if (string.equals(bWe.B.b())) {
            return this.a(bWe.B);
        }
        if (string.equals(bWe.aK.b())) {
            return this.a(bWe.aK);
        }
        if (string.equals(bWe.aL.b())) {
            return this.a(bWe.aL);
        }
        if (string.equals(bWe.aM.b())) {
            return this.a(bWe.aM);
        }
        if (string.equals(bWe.aN.b())) {
            return this.a(bWe.aN);
        }
        if (string.equals(bWe.aO.b())) {
            return this.a(bWe.aO);
        }
        if (string.equals(bWe.aP.b())) {
            return bvs_0.values();
        }
        if (string.equals(bWe.aQ.b())) {
            return bvs_0.a(this.d(bWe.aQ));
        }
        if (string.equals(bWe.aS.b())) {
            return this.a(bWe.aS);
        }
        return super.b(string);
    }

    @Override
    protected void b() {
        super.b();
        this.b((agp_0)bWe.b, true);
        this.b((agp_0)bWe.i, 0);
        this.b((agp_0)bWe.k, fid.a.name());
        this.b((agp_0)bWe.l, 0);
        this.b((agp_0)bWe.m, 0);
        this.b((agp_0)bWe.R, true);
        this.b((agp_0)bWe.n, "1;3;4;5;6;7;8;10;11;12;13");
        this.b((agp_0)bWe.T, false);
        this.b((agp_0)bWe.U, true);
        this.b((agp_0)bWe.L, false);
        this.b((agp_0)bWe.V, false);
        this.b((agp_0)bWe.W, aUz.b.ordinal());
        this.b((agp_0)bWe.X, true);
        this.b((agp_0)bWe.Y, true);
        this.b((agp_0)bWe.ab, -1);
        this.b((agp_0)bWe.s, true);
        this.b((agp_0)bWe.t, false);
        this.b((agp_0)bWe.u, true);
        this.b((agp_0)bWe.ar, false);
        this.b((agp_0)bWe.as, false);
        this.b((agp_0)bWe.C, true);
        this.b((agp_0)bWe.at, false);
        this.b((agp_0)bWe.au, false);
        this.b((agp_0)bWe.aU, true);
    }

    @Override
    protected void a() {
        super.a();
        this.b((agp_0)bWe.f, 0.5f);
        this.b((agp_0)bWe.F, true);
        this.b((agp_0)bWe.G, false);
        this.b((agp_0)bWe.M, false);
        this.b((agp_0)bWe.O, fqz_0.a.ordinal());
        this.b((agp_0)bWe.P, true);
        this.b((agp_0)bWe.Q, 0);
        this.b((agp_0)bWe.S, true);
        this.b((agp_0)bWe.v, true);
        this.b((agp_0)bWe.x, 0);
        this.b((agp_0)bWe.z, 0);
        this.b((agp_0)bWe.ac, "");
        this.b((agp_0)bWe.ad, false);
        this.b((agp_0)bWe.ae, false);
        this.b((agp_0)bWe.af, false);
        this.b((agp_0)bWe.ag, false);
        this.b((agp_0)bWe.ah, true);
        this.b((agp_0)bWe.Z, true);
        this.b((agp_0)bWe.aa, true);
        this.b((agp_0)bWe.al, true);
        this.b((agp_0)bWe.am, blu_1.a.a());
        this.b((agp_0)bWe.aq, true);
        this.b((agp_0)bWe.aI, bvt_0.a.a());
        this.b((agp_0)bWe.aJ, bvv_0.a.a());
        this.b((agp_0)bWe.B, false);
        this.b((agp_0)bWe.aK, true);
        this.b((agp_0)bWe.J, false);
        this.b((agp_0)bWe.K, false);
        this.b((agp_0)bWe.H, aPw.a.a());
        Ow ow = bah_0.d();
        this.b((agp_0)bWe.aL, ow == Ow.a);
        this.b((agp_0)bWe.aM, ow == Ow.b);
        this.b((agp_0)bWe.aN, ow == Ow.c);
        this.b((agp_0)bWe.aO, ow == Ow.d);
        this.b((agp_0)bWe.aQ, bvs_0.a.a());
        this.b((agp_0)bWe.aS, true);
        this.b((agp_0)bWe.aV, false);
        this.b((agp_0)bWe.aW, true);
        this.b((agp_0)bWe.aX, 0);
        this.b((agp_0)bWe.aY, true);
        this.b((agp_0)bWe.aZ, false);
        this.b((agp_0)bWe.ba, true);
        this.b((agp_0)bWe.bb, bLb.j.a());
        this.b((agp_0)bWe.bc, bLb.l.a());
        this.b((agp_0)bWe.bd, true);
        this.b((agp_0)bWe.be, bLb.j.a());
        this.b((agp_0)bWe.bf, bLb.l.a());
        this.b((agp_0)bWe.bg, true);
        this.b((agp_0)bWe.bh, true);
        this.b((agp_0)bWe.bi, true);
    }

    public void j() {
        List<Long> list = enp_2.a.h(ens_2.I);
        if (list.isEmpty()) {
            return;
        }
        EnumSet<Ow> enumSet = EnumSet.noneOf(Ow.class);
        list.forEach(l -> enumSet.add(xz_0.a(l.intValue()).c()));
        for (Ow ow : Ow.p) {
            if (enumSet.contains((Object)ow)) continue;
            this.a(ow, false);
        }
    }

    private void a(Ow ow, boolean bl) {
        switch (ow) {
            case a: {
                this.a((agp_0)bWe.aL, bl);
                break;
            }
            case b: {
                this.a((agp_0)bWe.aM, bl);
                break;
            }
            case c: {
                this.a((agp_0)bWe.aN, bl);
                break;
            }
            case d: {
                this.a((agp_0)bWe.aO, bl);
            }
        }
    }

    public void a(Ow ow) {
        this.a((agp_0)bWe.aL, ow == Ow.a);
        this.a((agp_0)bWe.aM, ow == Ow.b);
        this.a((agp_0)bWe.aN, ow == Ow.c);
        this.a((agp_0)bWe.aO, ow == Ow.d);
    }

    public boolean b(@Nullable Ow ow) {
        if (ow == null) {
            return true;
        }
        switch (ow) {
            case a: {
                return this.a(bWe.aL);
            }
            case b: {
                return this.a(bWe.aM);
            }
            case c: {
                return this.a(bWe.aN);
            }
            case d: {
                return this.a(bWe.aO);
            }
        }
        return false;
    }

    public ArrayList<Ow> k() {
        ArrayList<Ow> arrayList = new ArrayList<Ow>();
        if (this.a(bWe.aL)) {
            arrayList.add(Ow.a);
        }
        if (this.a(bWe.aM)) {
            arrayList.add(Ow.b);
        }
        if (this.a(bWe.aN)) {
            arrayList.add(Ow.c);
        }
        if (this.a(bWe.aO)) {
            arrayList.add(Ow.d);
        }
        return arrayList;
    }

    public List<Ow> l() {
        ArrayList<Ow> arrayList = new ArrayList<Ow>();
        if (!this.a(bWe.aL)) {
            arrayList.add(Ow.a);
        }
        if (!this.a(bWe.aM)) {
            arrayList.add(Ow.b);
        }
        if (!this.a(bWe.aN)) {
            arrayList.add(Ow.c);
        }
        if (!this.a(bWe.aO)) {
            arrayList.add(Ow.d);
        }
        return arrayList;
    }

    public bvs_0 m() {
        return bvs_0.a(this.d(bWe.aQ));
    }

    @Override
    public void a(ajb_1 ajb_12) {
        super.a(ajb_12);
        if (ajb_12 != null) {
            ajb_12.a(this);
        }
    }

    public void a(bvo_0 bvo_02) {
        boolean bl;
        super.b(bvo_02);
        boolean bl2 = bl = bvo_02 != null;
        if (bl) {
            bvo_02.a(this);
        }
        this.a((agp_0)agq_0.e, bl);
    }

    public void a(bvp_0 bvp_02) {
        super.c(bvp_02);
        if (bvp_02 != null) {
            bvp_02.a(this);
        }
    }

    @Override
    public void b(bvp_0 bvp_02) {
        this.a(bvp_02.o(), bvp_02);
    }

    @NotNull
    public bvp_0 a(bmr_1 bmr_12) {
        bvp_0 bvp_02 = (bvp_0)this.f();
        if (bvp_02 != null && bmr_12.a_() == bvp_02.o()) {
            return bvp_02;
        }
        bvp_0 bvp_03 = (bvp_0)this.b(bmr_12.a_());
        if (bvp_03 == null) {
            bvp_03 = new bvp_0(bmr_12);
            this.a(bmr_12.a_(), bvp_03);
            try {
                bvp_03.i();
            }
            catch (IOException iOException) {
                e.error((Object)("[Preferences] Unable to load preferences for character " + bmr_12.a_()), (Throwable)iOException);
            }
        }
        return bvp_03;
    }

    @Override
    public void a(long l, bvp_0 bvp_02) {
        super.a(l, bvp_02);
        if (bvp_02 != null) {
            bvp_02.a(this);
        }
    }

    @Override
    protected void c() {
        super.c();
        this.b((agp_0)bWe.e, "");
        this.b((agp_0)bWe.d, true);
        this.b((agp_0)bWe.D, true);
        this.b((agp_0)bWe.E, true);
        this.b((agp_0)bWe.o, bWd.a.a());
        this.b((agp_0)bWe.r, true);
        this.b((agp_0)bWe.q, true);
        this.b((agp_0)bWe.A, true);
        this.b((agp_0)agq_0.c, 0);
        this.b((agp_0)agq_0.d, false);
    }

    public void n() {
        this.a((agp_0)bWe.L, this.g(bWe.L));
        this.a((agp_0)bWe.W, this.d(bWe.W));
    }

    @Override
    public void onPreferenceStoreLoaded(ajb_1 ajb_12) {
        this.d(ajb_12);
        if (ajb_12 == bWe.aL.a(this)) {
            bah_0.a(() -> {
                Ow ow = bah_0.d();
                this.a(ow, true);
                aUf.a(ow);
                aUf.b(ow);
            });
        }
    }

    private void d(ajb_1 ajb_12) {
        int n = ajb_12.q(bWe.a.b());
        if (n < 16) {
            URL uRL = this.getClass().getResource("/com/ankamagames/wakfu/client/preferences/wakfuPreferencesActions.xml");
            bWm.a(uRL, this, ajb_12, n);
            ajb_12.a(bWe.a.b(), 16);
            try {
                ajb_12.j();
            }
            catch (IOException iOException) {
                e.warn((Object)"Probl\u00e8me \u00e0 la sauvegarde", (Throwable)iOException);
            }
        }
    }

    private void e(String string) {
        File[] fileArray;
        File file = new File(string);
        for (File file2 : fileArray = file.listFiles(this.k)) {
            if (file2.isDirectory()) {
                this.e(file2.getPath());
                continue;
            }
            file2.delete();
        }
    }

    @Override
    public /* synthetic */ void c(ajb_1 ajb_12) {
        this.a((bvp_0)ajb_12);
    }

    @Override
    public /* synthetic */ void b(ajb_1 ajb_12) {
        this.a((bvo_0)ajb_12);
    }
}

