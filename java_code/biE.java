/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public abstract class biE
extends afe_0
implements Uo,
bhe_1 {
    private static final Logger aJ = Logger.getLogger(biE.class);
    private static final int aK = 2000;
    public static final int aH = 1500;
    private final bnx_0 aL = new bnx_0();
    private boolean aM;
    private ael_2 aN;
    private ael_2 aO;
    private long aP;
    private static int aQ = 1;
    private int aR;
    private boolean aS;
    private final List<afb_0> aT = new ArrayList<afb_0>();
    private final TShortObjectHashMap<Anm> aU = new TShortObjectHashMap(biK.values().length);
    static final ut_0 aI = new ut_0();
    private static final yy_0 aV;

    protected biE(long l) {
        super(l);
        this.au = (short)4;
    }

    public void a(int n, short s2, boolean bl) {
        biK biK2 = biK.a(s2);
        if (biK2 == null) {
            return;
        }
        this.c(s2);
        if (!bl) {
            return;
        }
        try {
            String string = azs_0.a().a("ANMEquipmentPath");
            Anm anm = biE.c(String.format(string, n));
            this.a(anm, biK2.m);
            this.aU.put(s2, (Object)anm);
        }
        catch (Exception exception) {
            aJ.error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    public void a(ezr_0<?> ezr_02, short s2, byte by) {
        int n = by == 0 ? ezr_02.C() : ezr_02.D();
        this.a(n, s2, ezr_02.F().l());
    }

    public void c(int n) {
        try {
            String string = azs_0.a().a("ANMEquipmentPath");
            Anm anm = biE.c(String.format(string, n));
            this.a(anm, new int[0]);
        }
        catch (Exception exception) {
            aJ.error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    public void bx() {
        if (this.an() == null) {
            return;
        }
        this.an().I();
        this.C();
    }

    @Override
    public void aW() {
        if (this.av == null) {
            return;
        }
        if (this.aw + 1 > this.av.a()) {
            return;
        }
        apl_1 apl_12 = this.av.a(this.aw, this.aw + 1);
        this.aw = 0;
        this.ax = -1;
        this.a(apl_12, true);
    }

    protected apl_1 a(bsx_2 bsx_22, apl_1 apl_12) {
        return bsx_22.a(azu_0.j().k(), apl_12);
    }

    public boolean a(apl_1 apl_12, boolean bl) {
        return this.a(apl_12, bl, afm_0.p);
    }

    private boolean a(apl_1 apl_12, boolean bl, afm_0 afm_02) {
        for (afb_0 object : new ArrayList<afb_0>(this.aT)) {
            object.pathStarted(this, apl_12);
        }
        if ((apl_12 = this.a(apl_12)) == null || !apl_12.b()) {
            return false;
        }
        if (apl_12.a() > 1) {
            this.b(apl_12, bl);
            this.a(apl_12, false, true, afm_02);
        } else if (apl_12.a() == 1 && this.bb() != null && this.bb().c() != null) {
            Object object = null;
            for (int[] nArray : this.bb()) {
                if (nArray[0] == apl_12.c()[0] && nArray[1] == apl_12.c()[1] && nArray[2] == apl_12.c()[2]) {
                    apl_1 apl_13 = new apl_1(2);
                    if (object != null) {
                        apl_13.a(0, (int[])object);
                        apl_13.a(1, nArray);
                        this.b(apl_13, true);
                        this.a(apl_13, false, true, afm_02);
                        aJ.trace((Object)"Envoi d'un chemin 'pseudo-stop' au serveur");
                    }
                    break;
                }
                object = nArray;
            }
        } else {
            return false;
        }
        return true;
    }

    private apl_1 a(apl_1 apl_12) {
        if (apl_12 == null || !apl_12.b()) {
            return apl_12;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return null;
        }
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 == null) {
            return apl_12;
        }
        return this.a(bsx_22, apl_12);
    }

    public apl_1 a(aff_1 aff_12, boolean bl, boolean bl2) {
        return this.a(aff_12.d(), aff_12.e(), aff_12.f(), bl, bl2);
    }

    public apl_1 a(int n, int n2, short s2, boolean bl, boolean bl2) {
        int n3 = this.be();
        int n4 = this.bf();
        this.a(bl, bl2);
        yz_0.a(n3, n4, n, n2, aV);
        uq_0 uq_02 = uq_0.a();
        uq_02.a((int)this.af(), this.X(), this.aU());
        uq_02.a(aI);
        uq_02.b(n, n2, s2);
        uq_02.a(aV);
        uq_02.a(n3, n4, this.bg());
        uq_02.g();
        apl_1 apl_12 = uq_02.e();
        uq_02.release();
        return apl_12;
    }

    private apl_1 b(boolean bl, boolean bl2, List<aff_1> list) {
        if (list.isEmpty()) {
            return apl_1.a;
        }
        this.a(bl, bl2);
        int n = this.be();
        int n2 = this.bf();
        aff_1 aff_12 = list.get(0);
        yz_0.a(n, n2, aff_12.d(), aff_12.e(), aV);
        uq_0 uq_02 = uq_0.a();
        THashSet tHashSet = new THashSet(list.size());
        for (int k = 0; k < list.size(); ++k) {
            aff_1 aff_13 = list.get(k);
            short s2 = yz_0.b(aff_13.d(), aff_13.e(), aff_13.f());
            if (s2 == Short.MIN_VALUE || !yz_0.c(aff_13.d(), aff_13.e(), aff_13.f())) continue;
            short s3 = Math.abs(s2 - aff_13.f()) <= 2 ? s2 : aff_13.f();
            if (!tHashSet.add((Object)new aff_1(aff_13.d(), aff_13.e(), s3))) continue;
            uq_02.a(aff_13.d(), aff_13.e(), s3);
        }
        if (tHashSet.isEmpty()) {
            uq_02.release();
            return apl_1.a;
        }
        uq_02.a((int)this.af(), this.X(), this.aU());
        uq_02.a(aI);
        uq_02.b(n, n2, this.bg());
        uq_02.a(aV);
        uq_02.g();
        apl_1 apl_12 = uq_02.f();
        uq_02.release();
        return apl_12;
    }

    private void a(boolean bl, boolean bl2) {
        biE.aI.f = bl;
        biE.aI.a = !bl2;
        biE.aI.j = true;
        biE.aI.h = biE.aI.a;
        biE.aI.l = this.by();
        biE.aI.m = this.bz();
        biE.aI.n = this.bA();
        biE.aI.o = this.bB();
        biE.aI.p = this.bC();
    }

    public boolean a(apq_2 apq_22, boolean bl, boolean bl2) {
        aff_1 aff_12 = new aff_1(apq_22.G(), apq_22.H(), apq_22.I());
        return this.a(aff_12, (int)apq_22.X(), bl, bl2);
    }

    public boolean b(aff_1 aff_12, boolean bl, boolean bl2) {
        return this.a(aff_12, 0, bl, bl2);
    }

    private boolean a(aff_1 aff_12, int n, boolean bl, boolean bl2) {
        this.a(false, bl);
        biE.aI.i = true;
        int n2 = this.be();
        int n3 = this.bf();
        int n4 = aff_12.d();
        int n5 = aff_12.e();
        short s2 = aff_12.f();
        yz_0.a(n2, n3, n4, n5, aV);
        uq_0 uq_02 = uq_0.a();
        uq_02.b(n2, n3, this.bg());
        int n6 = n4 - n - 1;
        int n7 = n4 + n + 1;
        int n8 = n5 - n - 1;
        int n9 = n5 + n + 1;
        for (int k = n6; k <= n7; ++k) {
            for (int i2 = n8; i2 <= n9; ++i2) {
                yv_0 yv_02;
                if (bl2 && (k == n6 || k == n7) && (i2 == n8 || i2 == n9) || (yv_02 = aV.n(k, i2)) == null || !yz_0.j(k, i2, s2) || !yz_0.c(k, i2, s2)) continue;
                uq_02.a(k, i2, s2);
            }
        }
        uq_02.a((int)this.af(), this.X(), this.aU());
        uq_02.a(aI);
        uq_02.a(aV);
        uq_02.g();
        apl_1 apl_12 = uq_02.f();
        uq_02.release();
        biE.aI.i = false;
        return apl_12.b() && this.a(apl_12, true);
    }

    protected boolean by() {
        return true;
    }

    protected boolean bz() {
        return false;
    }

    protected boolean bA() {
        return false;
    }

    protected boolean bB() {
        return false;
    }

    protected boolean bC() {
        return false;
    }

    public boolean c(aff_1 aff_12, boolean bl, boolean bl2) {
        return this.a(aff_12, bl, bl2, afm_0.p);
    }

    public boolean a(aff_1 aff_12, boolean bl, boolean bl2, afm_0 afm_02) {
        return this.a(aff_12.d(), aff_12.e(), aff_12.f(), bl, bl2, afm_02);
    }

    public boolean b(int n, int n2, short s2, boolean bl, boolean bl2) {
        return this.a(n, n2, s2, bl, bl2, afm_0.p);
    }

    public boolean a(int n, int n2, short s2, boolean bl, boolean bl2, afm_0 afm_02) {
        apl_1 apl_12 = this.a(n, n2, s2, bl, bl2);
        return apl_12.b() && this.a(apl_12, true, afm_02);
    }

    public boolean a(boolean bl, boolean bl2, List<aff_1> list) {
        return this.a(bl, bl2, list, afm_0.p);
    }

    public boolean a(boolean bl, boolean bl2, List<aff_1> list, afm_0 afm_02) {
        apl_1 apl_12 = this.b(bl, bl2, list);
        return apl_12.b() && this.a(apl_12, true, afm_02);
    }

    public void a(aff_1 aff_12, boolean bl, boolean bl2, boolean bl3) {
        this.a(aff_12.d(), aff_12.e(), aff_12.f(), bl, bl2, bl3);
    }

    private void a(int n, int n2, short s2, boolean bl, boolean bl2, boolean bl3) {
        apl_1 apl_12;
        this.bH();
        if (bl && (apl_12 = this.a(n, n2, s2, bl2, bl3)) != null && apl_12.a() != 0) {
            this.a(apl_12, false, true);
            return;
        }
        this.b(n, (float)n2, (float)s2);
    }

    public void bD() {
        if (this.aO == null) {
            return;
        }
        long l = System.currentTimeMillis();
        if (this.aN == null || !this.aN.a(this.aO) || !this.aN.b().equals(this.aO.b())) {
            clg clg2 = new clg();
            clg2.a(this.aO);
            afm_0 afm_02 = this.aZ().a(this, this.aO.e()).a();
            clg2.a(afm_02);
            azu_0.j().K().c(clg2);
            this.aN = this.aO;
            this.aP = l;
        }
        this.aO = null;
    }

    public void m(@NotNull String string) {
        this.c(string, false);
    }

    public void c(@NotNull String string, boolean bl) {
        try {
            if (string.equals(this.s) && !bl) {
                return;
            }
            int n = Integer.parseInt(string);
            String string2 = biE.k(n);
            this.a(string);
            this.a(string2, true);
        }
        catch (Exception exception) {
            aJ.error((Object)"Erreur lors de la cr\u00e9ation de la DescriptorLibrary : ", (Throwable)exception);
        }
    }

    public static String k(int n) {
        String string = biG.e(n);
        String string2 = azs_0.a().a(string);
        return String.format(string2, Integer.toString(n));
    }

    public static String a(String string, int n) {
        String string2;
        if (Cz.f(string)) {
            return biE.k(n);
        }
        switch (string) {
            case "equipment": {
                string2 = azs_0.a().a("ANMEquipmentPath");
                break;
            }
            case "npc": {
                string2 = azs_0.a().a("npcGfxPath");
                break;
            }
            case "player": {
                string2 = azs_0.a().a("playerGfxPath");
                break;
            }
            default: {
                return null;
            }
        }
        return String.format(string2, Integer.toString(n));
    }

    public void bE() {
        TShortObjectIterator tShortObjectIterator = this.aU.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            biK biK2 = biK.a(tShortObjectIterator.key());
            if (biK2 == null) continue;
            this.a(biK2, (Anm)tShortObjectIterator.value());
        }
        this.aU.clear();
    }

    public void c(short s2) {
        biK biK2 = biK.a(s2);
        if (biK2 == null) {
            return;
        }
        Anm anm = (Anm)this.aU.remove(s2);
        if (anm != null) {
            this.a(biK2, anm);
        }
    }

    private void a(biK biK2, Anm anm) {
        this.b(anm, biK2.m);
    }

    public void a(ael_2 ael_22) {
        apl_1 apl_12 = new apl_1(ael_22.e() + 1);
        apl_12.a(0, ael_22.a().d(), ael_22.a().e(), ael_22.a().f());
        aff_1 aff_12 = new aff_1(ael_22.a());
        for (int k = 0; k < ael_22.e(); ++k) {
            aem_2 aem_22 = ael_22.a(k);
            aff_12.a(aem_22.a);
            aff_12.a(0, 0, aem_22.b);
            apl_12.a(k + 1, aff_12.d(), aff_12.e(), aff_12.f());
        }
        this.a(apl_12, true, this.aT() != 4);
    }

    private void b(apl_1 apl_12, boolean bl) {
        if (!this.aM) {
            return;
        }
        long l = System.currentTimeMillis();
        ael_2 ael_22 = ael_2.a(apl_12);
        if (ael_22 == null) {
            aJ.error((Object)"Impossible d'\u00e9mettre un chemin null en direction du serveur");
            return;
        }
        this.aO = this.aO == null ? ael_22 : ael_2.a(this.aO.a(), this.aO, ael_22);
        if (!bl) {
            if (l - this.aP >= 2000L) {
                this.bD();
            }
        } else {
            long l2 = l - this.aP;
            long l3 = 1500L - l2;
            int n = aQ++;
            if (l3 > 0L && enp_2.a.d(ens_2.s)) {
                this.aR = n;
                ado_1.a().a(() -> {
                    if (this.aR == n) {
                        this.bD();
                    }
                }, l3, 1);
            } else {
                this.bD();
            }
        }
    }

    public bnx_0 bF() {
        return this.aL;
    }

    public void r(boolean bl) {
        this.aM = bl;
    }

    public boolean bG() {
        return this.aS;
    }

    public void s(boolean bl) {
        this.aS = bl;
    }

    public void a(afb_0 afb_02) {
        this.aT.add(afb_02);
    }

    public void b(afb_0 afb_02) {
        this.aT.remove(afb_02);
    }

    public void t(boolean bl) {
        if (azu_0.j().k().bv() == this) {
            this.f(((bvx_0)ans_0.D().h()).a(bWe.r));
        } else {
            this.f(bl);
        }
    }

    @Override
    protected void m() {
        super.m();
        this.aU.clear();
    }

    public void bH() {
        this.aN = null;
        this.aP = 0L;
    }

    static {
        biE.aI.b = 400;
        aV = new yy_0();
    }
}

