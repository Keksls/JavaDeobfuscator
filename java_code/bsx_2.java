/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TByteArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.array.TShortArrayList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bsx
 */
public class bsx_2
implements ajf_1,
acF,
act {
    protected static final Logger a = Logger.getLogger(bsx_2.class);
    public static final String b = "selectedName";
    public static final String d = "fleaList";
    public static final String e = "currentFlea";
    public static final String f = "selectedRoom";
    public static final String g = "room0";
    public static final String h = "room1";
    public static final String i = "room2";
    public static final String j = "room3";
    public static final String k = "room4";
    public static final String l = "room5";
    public static final String m = "room6";
    public static final String n = "room7";
    public static final String o = "room8";
    public static final String[] p = new String[]{"selectedName", "fleaList", "currentFlea", "selectedRoom", "room0", "room1", "room2", "room3", "room4", "room5", "room6", "room7", "room8"};
    private final bsq_1 q;
    bhm_0 r;
    private final bso_1 s;
    private final int[][] t = new int[18][18];
    private boolean u = true;
    private boolean v = false;
    private int w = 0;
    private String x = "";
    private String y = "";
    private short z;
    private final int A;
    private final int B;
    private short C;
    private final TShortArrayList D = new TShortArrayList(3);
    private final TByteArrayList E = new TByteArrayList(3);
    private final TByteArrayList F = new TByteArrayList(3);
    private final ArrayList<bsr_0> G = new ArrayList();
    private final ArrayList<bHN> H = new ArrayList();

    public static String a(ffj ffj2) {
        return bae.h().a("dimensionalBag.gem.error." + ffj2.name(), new Object[0]);
    }

    public bsx_2() {
        this.s = new bso_1();
        this.q = new bsq_1();
        this.q.a(new bsy_2(this));
        this.A = 0;
        this.B = 0;
        this.C = 0;
    }

    public void c() {
        this.a((exs_2)null);
    }

    void a(exs_2 exs_22) {
        if (exs_22 == null || exs_22.equals(this.r)) {
            cWt.e().f();
            this.r = null;
        }
        fis_1.a().a((ajf_1)this, d, e);
    }

    public boolean e() {
        a.debug((Object)"DimensionalBag.initializeToEnter()");
        this.E();
        return true;
    }

    private void E() {
        yx_0 yx_02 = yz_0.d((short)0, (short)0);
        this.s.a(yx_02);
        aoc_0 aoc_02 = (aoc_0)aew_0.a().d((short)0, (short)0);
        this.s.a(aoc_02);
        acs_0.b().e();
        this.G();
    }

    public void a(un_2 un_22) {
        if (un_22 != null) {
            this.b(un_22);
            this.E();
        }
    }

    public void a(int n) {
        this.s.a(n);
    }

    public int f() {
        return this.s.p();
    }

    public int g() {
        return this.A;
    }

    public int h() {
        return this.B;
    }

    public short i() {
        return this.C;
    }

    public void a(short s2) {
        this.C = s2;
    }

    public short j() {
        return this.z;
    }

    public void b(short s2) {
        this.z = s2;
    }

    public ArrayList<bHN> k() {
        return this.H;
    }

    @Override
    public void c(String string, Object object) {
    }

    @Override
    public String[] d() {
        return p;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.p();
        }
        if (string.equals(d)) {
            ArrayList<bhm_0> arrayList = new ArrayList<bhm_0>();
            TLongObjectIterator tLongObjectIterator = this.q.e();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                arrayList.add((bhm_0)tLongObjectIterator.value());
            }
            return arrayList;
        }
        if (string.equals(e)) {
            return this.r;
        }
        if (string.equals(g)) {
            return this.G.get(0);
        }
        if (string.equals(h)) {
            return this.G.get(1);
        }
        if (string.equals(i)) {
            return this.G.get(2);
        }
        if (string.equals(j)) {
            return this.G.get(3);
        }
        if (string.equals(k)) {
            return this.G.get(4);
        }
        if (string.equals(l)) {
            return this.G.get(5);
        }
        if (string.equals(m)) {
            return this.G.get(6);
        }
        if (string.equals(n)) {
            return this.G.get(7);
        }
        if (string.equals(o)) {
            return this.G.get(8);
        }
        return null;
    }

    @Override
    public boolean a_(String string) {
        return string.equals(b);
    }

    @Override
    public void b(String string, Object object) {
    }

    @Override
    public void a(String string, Object object) {
        if (string.equals(b) && object != null) {
            this.c(object.toString());
        }
    }

    public apl_1 a(epq_2 epq_22, apl_1 apl_12) {
        int n;
        Object object;
        int n2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        boolean bl = epq_22.a_() == this.s.e();
        int n3 = apl_12.a();
        for (n2 = 0; n2 < n3; ++n2) {
            feY feY2;
            object = apl_12.a(n2);
            n = object[0];
            short s2 = (short)object[1];
            if (n >= 0 && n < 18 && s2 < 0 && !bl) break;
            if (n >= 0 && n < 18 && s2 >= 0 && s2 <= 18 && (feY2 = this.s.j().a(n, s2)) instanceof ffi) {
                ffi ffi2 = (ffi)feY2;
                exk_2 exk_22 = ffi2.a(true);
                if (exk_22 == null) break;
                if (!this.s.a(epq_22, ffi2.j().orElse(null))) {
                    a.info((Object)("[Checkpath] Room access is forbidden for player with id " + epq_22.a_()));
                    break;
                }
            }
            arrayList.add(object);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        n2 = arrayList.size();
        object = new apl_1(n2);
        for (n = 0; n < n2; ++n) {
            ((apl_1)object).a(n, (int[])arrayList.get(n));
        }
        return object;
    }

    public void a(boolean bl) {
        this.u = bl;
    }

    public void b(boolean bl) {
        this.v = bl;
    }

    public void b(int n) {
        this.w = n;
    }

    public boolean l() {
        return this.u;
    }

    public boolean m() {
        return this.v;
    }

    public int n() {
        return this.w;
    }

    public String o() {
        return this.x;
    }

    public void a(String string) {
        this.x = string;
    }

    public String p() {
        return this.y;
    }

    public void c(String string) {
        this.y = string;
    }

    public long q() {
        return this.s.e();
    }

    public bnh_1 r() {
        return (bnh_1)bmf_2.a().c(this.q());
    }

    public String s() {
        return this.s.f();
    }

    public eyu_1 t() {
        return this.s.n();
    }

    public feX u() {
        return this.s.j();
    }

    public bso_1 v() {
        return this.s;
    }

    public boolean b(un_2 un_22) {
        boolean bl = this.s.a(un_22);
        this.F();
        return bl;
    }

    public boolean a(uw_2 uw_22) {
        this.s.a(uw_22.a);
        this.s.b(uw_22.b);
        this.s.a(uw_22.c);
        this.s.c(uw_22.d);
        this.s.a(uw_22.e);
        this.D.reset();
        this.E.reset();
        this.F.reset();
        this.H.clear();
        for (uz_2 gs_02 : uw_22.f) {
            bHN bHN2 = new bHN();
            bHN2.a(gs_02.a);
            this.H.add(bHN2);
        }
        for (ux_2 ux_22 : uw_22.g) {
            this.D.add((short)ux_22.a);
            this.E.add(ux_22.b);
            this.F.add(ux_22.c);
        }
        return true;
    }

    private void F() {
        this.G.clear();
        feX feX2 = this.s.j();
        byte by = feX2.c();
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            this.G.add(new bsr_0((ffi)feX2.a(by2)));
        }
    }

    public void a(byte by) {
        bsr_0 bsr_02 = this.G.get(by);
        if (bsr_02 != null) {
            bsr_02.a();
        }
    }

    public bsq_1 w() {
        return this.q;
    }

    public boolean a(short s2, short s3) {
        return this.s.a(s2, s3);
    }

    public ffi b(byte by) {
        return (ffi)this.s.j().a(by);
    }

    private Optional<ffk> b(short s2, short s3) {
        feY feY2 = this.s.j().a(s2, s3);
        if (feY2 instanceof ffi) {
            exk_2 exk_22 = ((ffi)feY2).a(true);
            if (exk_22 != null) {
                return Optional.of(ffk.a(exk_22.aT_()));
            }
            return Optional.empty();
        }
        return Optional.empty();
    }

    @Override
    public void b() {
        this.G();
    }

    @Override
    public void a() {
        this.G();
    }

    private void G() {
        Optional<ffk> optional;
        DisplayedScreenElement displayedScreenElement;
        short s2;
        short s3;
        Hw.a(this.q());
        acs_0 acs_02 = acs_0.b();
        boolean[][] blArray = new boolean[19][19];
        bsi_1[][] bsi_1Array = new bsi_1[19][19];
        feX feX2 = this.s.j();
        for (s3 = 0; s3 <= 18; s3 = (short)((short)(s3 + 1))) {
            for (s2 = 0; s2 <= 18; s2 = (short)(s2 + 1)) {
                displayedScreenElement = acs_02.b(s3, s2, 0, acV.a);
                if (displayedScreenElement == null) {
                    blArray[s3][s2] = true;
                    continue;
                }
                optional = this.b(s3, s2);
                if (optional.isEmpty()) {
                    blArray[s3][s2] = true;
                    if (s3 >= 18 || s2 >= 18) continue;
                    displayedScreenElement.a(false);
                    continue;
                }
                blArray[s3][s2] = false;
                ffk ffk2 = (ffk)optional.get();
                bsi_1 bsi_12 = bsg_1.a(ffk2);
                if (bsi_12 == null) {
                    a.error((Object)("No pattern for room of type " + ffk2 + ". Picking default pattern"));
                    bsi_12 = bsg_1.b();
                }
                displayedScreenElement.a(true);
                bsi_1Array[s3][s2] = bsi_12;
                int n = bsi_12.a(s3, s2);
                displayedScreenElement.b(n);
            }
        }
        for (s3 = 0; s3 <= 18; s3 = (short)((short)(s3 + 1))) {
            for (s2 = 0; s2 <= 18; s2 = (short)(s2 + 1)) {
                boolean bl;
                boolean bl2;
                int n;
                Object object;
                displayedScreenElement = acs_02.b(s3, s2, -4, acV.a);
                if (displayedScreenElement != null) {
                    displayedScreenElement.a(false);
                }
                if ((optional = acs_02.b(s3, s2, -3, acV.a)) == null) continue;
                ((DisplayedScreenElement)((Object)optional)).a(false);
                boolean bl3 = s2 % 6 == 0;
                boolean bl4 = s3 % 6 == 0;
                @Nullable ffi ffi2 = (ffi)feX2.a(s3, s2);
                Optional<Object> optional2 = ffi2 == null ? Optional.empty() : ffi2.j();
                @Nullable ffi ffi3 = (ffi)feX2.a(s3, s2 - 1);
                @Nullable ffi ffi4 = (ffi)feX2.a(s3 - 1, s2);
                @Nullable ffi ffi5 = (ffi)feX2.a(s3 + 1, s2);
                @Nullable ffi ffi6 = (ffi)feX2.a(s3 - 1, s2 - 1);
                int n2 = 0;
                if (bl4 && bl3) {
                    boolean bl5;
                    object = ffi6 == null ? Optional.empty() : ffi6.j();
                    n = ffi4 != null && ffi4.j().isPresent() ? 1 : 0;
                    bl2 = ffi3 != null && ffi3.j().isPresent();
                    bl = n != 0 || bl2;
                    boolean bl6 = optional2.isPresent() && ((Optional)object).isPresent() && optional2.equals(object);
                    boolean bl7 = optional2.isPresent() && n != 0 && optional2.equals(ffi4.j());
                    boolean bl8 = optional2.isPresent() && bl2 && optional2.equals(ffi3.j());
                    boolean bl9 = !bl6 || !bl7 || !bl8;
                    boolean bl10 = !((Optional)object).isPresent() && (s3 == 0 || s2 == 0) && bl;
                    boolean bl11 = bl5 = optional2.isPresent() || ((Optional)object).isPresent() || bl;
                    if ((bl10 || bl5) && bl9) {
                        n2 |= 4;
                    }
                }
                if (bl4) {
                    Object object2 = object = ffi4 == null ? Optional.empty() : ffi4.j();
                    if (((Optional)object).isEmpty() && optional2.isPresent() || !((Optional)object).equals(optional2)) {
                        n2 |= 2;
                    }
                }
                if (bl3) {
                    Object object3 = object = ffi3 == null ? Optional.empty() : ffi3.j();
                    if (((Optional)object).isEmpty() && optional2.isPresent() || !((Optional)object).equals(optional2)) {
                        n2 |= 1;
                    }
                }
                if ((object = bsi_1Array[s3][s2]) == null && n2 == 0) {
                    if (displayedScreenElement == null || s3 >= 18 || s2 >= 18) continue;
                    n = this.t[s3][s2];
                    if (n <= 0) {
                        UH<Integer> uH = bsg_1.c.a((Object)null, (Object)null, (Object)null, (Object)null);
                        if (uH == null) continue;
                        this.t[s3][s2] = n = uH.b().intValue();
                    }
                    displayedScreenElement.a(true);
                    displayedScreenElement.b(n);
                    continue;
                }
                int n3 = n = object != null ? ((bsi_1)object).a(n2) : bsg_1.b().a(n2);
                if (n == -1 || n == 0) continue;
                bl2 = s3 == 0 && s2 == 2;
                boolean bl12 = bl = s2 == 0 && (s3 == 1 || s3 == 2);
                if (bl2 || bl) continue;
                ((DisplayedScreenElement)((Object)optional)).a(true);
                ((DisplayedScreenElement)((Object)optional)).b(n);
            }
        }
    }

    public ffj a(byte by, exk_2 exk_22) {
        return this.s.a(by, exk_22, false);
    }

    public ffj a(byte by, boolean bl) {
        return this.s.a(by, bl, false);
    }

    public ffj a(byte by, boolean bl, byte by2, boolean bl2) {
        if (by == by2) {
            return ffj.j;
        }
        return this.s.a(by, bl, by2, bl2, false);
    }

    public ffj a(byte by, exk_2 exk_22, long l, boolean bl) {
        ffj ffj2 = this.s.b(by, exk_22, bl);
        if (ffj2 != ffj.a) {
            return ffj2;
        }
        ans_0.D();
        bmr_1 bmr_12 = ans_0.F().k();
        if (bl) {
            exg_2 exg_22 = euu_2.l(bmr_12.U_(), l);
            if (exg_22 == null) {
                return ffj.j;
            }
            if (!exg_22.g(exk_22)) {
                return ffj.j;
            }
            a.info((Object)("[GEM EXCHANGE FROM INVENTORY] commit ! gemUID=" + exk_22.a() + ", bagUID=" + l + ", room=" + by));
            exg_22.b(exk_22.a(), (short)-1);
            this.s.b(by, exk_22, true);
            this.E();
        } else {
            cpS cpS2 = new cpS();
            cpS2.a(exk_22.a());
            cpS2.a(by);
            ans_0.D();
            ans_0.F().K().c(cpS2);
        }
        return ffj2;
    }

    public ffj a(byte by, boolean bl, byte by2, boolean bl2, boolean bl3) {
        ffj ffj2 = this.a(by, bl, by2, bl2);
        if (ffj2 == ffj.a) {
            ans_0.D();
            bmr_1 bmr_12 = ans_0.F().k();
            if (bmr_12 != null) {
                if (bl3) {
                    a.info((Object)("[EXCHANGE GEM] commit ! sprimary=" + bl + " (pos:" + by + "), dprimary=" + bl2 + " (pos:" + by2 + ")"));
                    this.s.a(by, bl, by2, bl2, true);
                    this.E();
                } else {
                    a.info((Object)("[EXCHANGE GEM] query ! sprimary=" + bl + " (pos:" + by + "), dprimary=" + bl2 + " (pos:" + by2 + ")"));
                    cpU cpU2 = new cpU();
                    cpU2.a(bl);
                    cpU2.b(bl2);
                    cpU2.a(by);
                    cpU2.b(by2);
                    ans_0.F().K().c(cpU2);
                }
            } else {
                ffj2 = ffj.j;
            }
        }
        return ffj2;
    }

    public ffj b(byte by, exk_2 exk_22, long l, boolean bl) {
        ffj ffj2 = this.a(by, exk_22);
        if (ffj2 != ffj.a) {
            return ffj2;
        }
        if (l == 0L) {
            a.error((Object)"Cas non trait\u00e9");
            return ffj2;
        }
        ans_0.D();
        bmr_1 bmr_12 = ans_0.F().k();
        if (bmr_12 == null) {
            return ffj2;
        }
        exg_2 exg_22 = euu_2.l(bmr_12.U_(), l);
        if (exg_22 == null) {
            return ffj.j;
        }
        if (!exg_22.g(exk_22)) {
            return ffj.j;
        }
        if (bl) {
            a.info((Object)("[PUT GEM] commit ! gemUID=" + exk_22.a() + ", bagUID=" + l + ", room=" + by));
            exg_22.b(exk_22.a(), (short)-1);
            this.s.a(by, exk_22, true);
            this.E();
        } else {
            a.info((Object)("[PUT GEM] query ! gemUID=" + exk_22.a() + ", bagUID=" + l + ", room=" + by));
            cpS cpS2 = new cpS();
            cpS2.a(exk_22.a());
            cpS2.a(by);
            ans_0.D();
            ans_0.F().K().c(cpS2);
        }
        return ffj2;
    }

    public ffj a(byte by, long l, byte by2, boolean bl, boolean bl2) {
        ffj ffj2;
        block10: {
            ffj2 = this.a(by, bl);
            if (ffj2 == ffj.a) {
                if (l == 0L) {
                    a.error((Object)"Cas non trait\u00e9");
                } else {
                    ans_0.D();
                    bmr_1 bmr_12 = ans_0.F().k();
                    if (bmr_12 != null) {
                        exg_2 exg_22 = euu_2.l(bmr_12.U_(), l);
                        if (exg_22 != null) {
                            try {
                                if (bl2) {
                                    this.s.a(by, bl, true);
                                    this.E();
                                    break block10;
                                }
                                cpT cpT2 = new cpT();
                                cpT2.a(l);
                                cpT2.b(by2);
                                cpT2.a(bl);
                                cpT2.a(by);
                                ans_0.F().K().c(cpT2);
                            }
                            catch (Exception exception) {
                                a.error((Object)"Exception during removeGem", (Throwable)exception);
                                ffj2 = ffj.j;
                            }
                        } else {
                            ffj2 = ffj.j;
                        }
                    } else {
                        ffj2 = ffj.j;
                    }
                }
            }
        }
        return ffj2;
    }

    public exk_2 b(byte by, boolean bl) {
        return this.s.a(by, bl);
    }

    public ffn x() {
        ans_0.D();
        bmr_1 bmr_12 = ans_0.F().k();
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 != null) {
            return this.s.o();
        }
        return null;
    }

    public void a(ffn ffn2) {
        bmr_1 bmr_12 = ans_0.F().k();
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 != null && bsx_22 == bmr_12.dj()) {
            ud_2 ud_22 = new ud_2();
            ffn2.a(ud_22);
            int n = ud_22.b();
            ByteBuffer byteBuffer = ByteBuffer.allocate(n);
            ud_22.a(byteBuffer);
            byteBuffer.flip();
            this.s.a(ud_22);
            cpR cpR2 = new cpR();
            cpR2.a(byteBuffer.array());
            ans_0.D();
            ans_0.F().K().c(cpR2);
        }
    }

    public void a(ud_2 ud_22) {
        a.info((Object)"[DIMENSIONAL BAG PERMISSIONS UPDATE]");
        this.s.a(ud_22);
    }

    public void a(long l, boolean bl) {
        bhm_0 bhm_02;
        if (azu_0.j().k().dj() != this && (bhm_02 = (bhm_0)this.q.b(l)) != null) {
            bhm_02.b(bl);
            if (bl && fpm_0.b().q("confirmFleaPurchaseDialog")) {
                fpm_0.b().o("confirmFleaPurchaseDialog");
            }
            bhm_02.p();
            fis_1.a().a((ajf_1)this, d);
        }
    }

    public void y() {
        ans_0.D();
        azu_0 azu_02 = ans_0.F();
        cpI cpI2 = new cpI();
        azu_02.K().c(cpI2);
    }

    public void z() {
        Iterable iterable = () -> this.s.j().iterator();
        List<ffq> list = StreamSupport.stream(iterable.spliterator(), false).flatMap(feY2 -> feY2.e().stream()).collect(Collectors.toList());
        list.forEach(this::b);
    }

    public feY a(ffq ffq2) {
        return this.s.a(ffq2);
    }

    public boolean b(ffq ffq2) {
        return this.s.b(ffq2);
    }

    public List<ffq> A() {
        ArrayList<ffq> arrayList = new ArrayList<ffq>();
        for (feY feY2 : this.s.j()) {
            arrayList.addAll(feY2.e());
        }
        return arrayList;
    }

    public boolean a(bmr_1 bmr_12, int n, int n2) {
        if (bmr_12.dj() == this) {
            return true;
        }
        ffi ffi2 = (ffi)this.s.j().a(n, n2);
        exk_2 exk_22 = ffi2.a(true);
        if (exk_22 != null) {
            return this.s.a(bmr_12, ffi2.j().orElse(null));
        }
        return false;
    }

    public void B() {
        this.s.a();
    }

    public void a(bhm_0 bhm_02) {
        this.r = bhm_02;
        bpc_2 bpc_22 = azu_0.j().k().eE();
        if (bpc_22 != null && this.r != null) {
            if (bpc_22 instanceof bqb_2) {
                bqb_2 bqb_22 = (bqb_2)((Object)bpc_22);
                this.r.a(bqb_22.h().al_());
                this.r.f(bqb_22.h().ar());
                this.r.c(bqb_22.h().aq());
            } else {
                abo_2 abo_22 = cWt.e().c(this.r.r());
                ezr_0 ezr_02 = (ezr_0)abo_22.b();
                this.r.a(ezr_02.e());
                this.r.f(ezr_02.C());
                this.r.e((int)((Byte)abo_22.a()).byteValue());
            }
            this.r.p();
        }
        fis_1.a().a((ajf_1)this, e);
    }

    public bhm_0 C() {
        return this.r;
    }

    public void D() {
        short s2 = this.s.l();
        long l = this.s.m();
        if (s2 <= 0 || l <= 0L) {
            aki_0.h().i();
            return;
        }
        afp afp2 = afr.a().a(s2);
        if (afp2 == null) {
            return;
        }
        Optional<amb_1> optional = afp2.a((Long)l);
        if (optional.isEmpty()) {
            return;
        }
        amb_1 amb_12 = optional.get();
        aki_0.h().a(amb_12.a());
    }
}

