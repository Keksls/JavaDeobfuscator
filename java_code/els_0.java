/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eLS
 */
public abstract class els_0<F extends epq_2>
extends fl_1
implements su_0,
Sv,
apk_1<Su>,
elv_0<F> {
    public static final String o = "mainLog.fightLog";
    protected static final Logger p = Logger.getLogger((String)"mainLog.fightLog");
    public static final int q = 300;
    public static final int r = 301;
    public static final int s = 305;
    public static final int t = 306;
    public static final int u = 307;
    public static final int v = 308;
    private final ArrayList<emz_2> a = new ArrayList();
    private final Set<F> b = new HashSet<F>();
    private boolean c;
    protected final enm_0<F> w = new enm_0();
    private final TLongArrayList d = new TLongArrayList();
    protected eof_2 x;
    protected final tg_0 y;
    protected So z;
    protected ss_0 A;
    @Nullable
    private enh_1 e = null;
    private final int f;
    @NotNull
    protected final emr_2 B;
    protected boolean C = false;
    protected final emm_1 D = new emn_2();
    protected wt_0 E;
    private final wu_0 g;
    protected byte F;
    private final fo_1 h = new elt_0(this);

    @Override
    public abstract long a(byte var1);

    protected els_0(int n, @NotNull emr_2 emr_22, tg_0 tg_02) {
        this.E = wc_0.p().j();
        this.g = wt_0.b(this.E.h());
        this.B = emr_22;
        this.f = n;
        this.y = tg_02;
        this.A = ekz_0.a(this, this.h());
    }

    @Override
    public fo_1[] b_() {
        return new fo_1[]{this.af()};
    }

    public fo_1 af() {
        return this.h;
    }

    public final void c(byte[] byArray) {
        this.P().a(this.h(), byArray);
    }

    public StringBuilder a(String string) {
        return new StringBuilder().append("[_FL_] fightId=").append(this.c()).append(' ').append(string);
    }

    public StringBuilder c(String string) {
        return new StringBuilder().append("[_FL_] fightId=").append(this.c()).append(' ').append(string).append(" ; fighters = ").append(this.j().stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

    public StringBuilder a(String string, Throwable throwable) {
        return this.a(string).append(' ').append(aho_2.a(throwable));
    }

    @Override
    public int c() {
        return this.f;
    }

    public boolean a(emz_2 emz_22) {
        if (!this.a.contains(emz_22)) {
            return this.a.add(emz_22);
        }
        return false;
    }

    @Override
    public byte f() {
        throw new UnsupportedOperationException("Impossible de r\u00e9cup\u00e9rer cette info");
    }

    @Override
    public tg_0 g() {
        return this.y;
    }

    public byte ag() {
        return this.B.a();
    }

    public va_0 P() {
        return this.x;
    }

    @Override
    public ss_0 i() {
        return this.A;
    }

    protected abstract void a(enh_1 var1);

    protected final enh_1 ah() {
        if (this.e == null) {
            this.e = new eni_1();
            this.e.a(this.g());
            this.a(this.e);
        }
        return this.e;
    }

    @Nullable
    public enj_1 o(epq_2 epq_22) {
        if (this.e == null) {
            return null;
        }
        if (epq_22 == null) {
            return null;
        }
        return this.e.a(epq_22.a_());
    }

    public List<enj_1> h(byte by) {
        if (this.e == null) {
            return Collections.emptyList();
        }
        ArrayList<enj_1> arrayList = new ArrayList<enj_1>();
        for (epq_2 epq_22 : this.g(by)) {
            enj_1 enj_12 = this.e.a(epq_22.a_());
            if (enj_12 == null || enj_12.b()) continue;
            arrayList.add(enj_12);
        }
        return arrayList;
    }

    public byte ai() {
        return this.af_().b();
    }

    public byte aj() {
        return this.af_().c();
    }

    public byte ak() {
        return this.af_().d();
    }

    public byte al() {
        return this.af_().e();
    }

    public Collection<F> f(byte by) {
        return this.w.b(enw_2.a(enw_2.b(by)));
    }

    public Collection<F> i(byte by) {
        return this.w.b(enw_2.b(enw_2.a(enw_2.b(by)), enw_2.c()));
    }

    public Collection<F> j(byte by) {
        return this.w.b(enw_2.b(enw_2.b(by), enw_2.c()));
    }

    public Collection<F> k(byte by) {
        return this.w.b(enw_2.b(enw_2.a(enw_2.b(by)), enw_2.a(enw_2.e(), enw_2.c())));
    }

    public Collection<F> l(byte by) {
        return this.w.b(enw_2.a(enw_2.b(by)), enw_2.a((byte)0));
    }

    public Collection<F> m(byte by) {
        return this.w.b(enw_2.b(by), enw_2.a((byte)0));
    }

    @Override
    public Collection<F> g(byte by) {
        return this.w.b(enw_2.b(by));
    }

    public Collection<F> n(byte by) {
        return this.w.b(enw_2.b(by), enw_2.a(enw_2.a(eoz_1.bh)));
    }

    public Collection<F> o(byte by) {
        return this.w.b(enw_2.b(enw_2.c(), enw_2.k(), enw_2.a(enw_2.b(by))));
    }

    public Collection<F> p(epq_2 epq_22) {
        return this.w.b(enw_2.c(), enw_2.a(enw_2.d(epq_22.hn())), enw_2.a(enw_2.g()), enw_2.a(enw_2.a(eoz_1.o)));
    }

    public F n(long l) {
        return this.w.a(l);
    }

    public Collection<F> am() {
        return this.w.b(enw_2.c());
    }

    @Override
    public Collection<F> j() {
        return this.w.b(enw_2.a(enw_2.c(), enw_2.e()));
    }

    public Collection<F> q(epq_2 epq_22) {
        return this.w.b(enw_2.c(epq_22));
    }

    public boolean r(F f2) {
        return f2.ak() && (this.w.e((epq_2)f2) || this.w.g((epq_2)f2));
    }

    @Override
    public So h() {
        return this.z;
    }

    @Override
    public ema_1 a(F f2, byte by) {
        if (f2.ck() != null && f2.ck().n(((epq_2)f2).a_()) != null) {
            p.error((Object)"Le personnage est deja ajout\u00e9 au combat !");
            return ema_1.b;
        }
        if (this.g(by).contains(f2)) {
            return ema_1.b;
        }
        if (((epq_2)f2).ab_()) {
            return ema_1.d;
        }
        if (by < 0 || by >= this.B.c()) {
            return ema_1.e;
        }
        if (!emb_0.a(this, f2)) {
            return ema_1.w;
        }
        if (!emb_0.a(this, f2, by)) {
            return ema_1.j;
        }
        if (!emb_0.a(this, f2, by)) {
            return ema_1.i;
        }
        if (!emb_0.b(this, f2, by)) {
            return ema_1.i;
        }
        ema_1 ema_12 = emb_0.c(this, f2, by);
        if (ema_12 != ema_1.a) {
            return ema_12;
        }
        if (by == 0 && this.B.t()) {
            return ema_1.a;
        }
        int n = this.w.b(enw_2.b(by)).size() + 1;
        byte by2 = ((epq_2)f2).gY();
        if (by2 == 0 || by2 == 5 ? n > this.ak() : n > this.al()) {
            return ema_1.c;
        }
        return ema_1.a;
    }

    public boolean a(byte by, Collection<F> collection) {
        return this.a(by, collection, true);
    }

    public boolean a(byte by, Collection<F> collection, boolean bl) {
        if (bl && !this.b(by, collection)) {
            return false;
        }
        for (epq_2 epq_22 : collection) {
            this.a(epq_22, by, epq_22.C_());
            this.M(epq_22);
            if (this.e() != elp_0.e) continue;
            return false;
        }
        return true;
    }

    private boolean b(byte by, Collection<F> collection) {
        if (by == 0 && this.B.t()) {
            return true;
        }
        int n = collection.size();
        boolean bl = this.a(collection);
        return by >= 0 && by < this.aj() && n <= (bl ? this.ak() : this.al());
    }

    private boolean a(Collection<F> collection) {
        for (epq_2 epq_22 : collection) {
            if (epq_22.gY() != 0) continue;
            return true;
        }
        return false;
    }

    public ema_1 b(F f2, byte by, boolean bl) {
        ema_1 ema_12 = ema_1.a;
        if (!bl || (ema_12 = this.a(f2, by)) == ema_1.a) {
            this.a(f2, by, false);
            this.M(f2);
        }
        return ema_12;
    }

    public void a(F f2, byte by, boolean bl) {
        this.a(f2, by, bl, f2);
    }

    public void a(F f2, byte by, boolean bl, F f3) {
        this.w.a(f2, by, bl, f3);
        this.f(f2);
    }

    public boolean m(long l) {
        F f2 = this.w.a(enw_2.a(l));
        if (this.A != null) {
            this.A.a((Su)f2);
        }
        if (!this.b(f2)) {
            return false;
        }
        if (!this.l()) {
            if (((epq_2)f2).hm()) {
                this.O(f2);
            } else {
                this.N(f2);
            }
            return true;
        }
        return false;
    }

    private boolean b(F f2) {
        if (f2 == null) {
            return false;
        }
        for (epq_2 epq_22 : this.w.n(f2)) {
            if (epq_22 != null) {
                epq_22.aA();
                continue;
            }
            p.error((Object)"On un fighter non pr\u00e9sent en combat sous le contr\u00f4le d'un fighter en combat ");
        }
        for (epq_2 epq_22 : this.w.b(enw_2.c(), enw_2.c(f2))) {
            epq_22.a(true);
            this.l(epq_22);
            epq_22.a(false);
        }
        for (epq_2 epq_22 : this.w.b(enw_2.e(), enw_2.c(f2))) {
            epq_22.a(true);
            this.m(epq_22);
            epq_22.a(false);
        }
        return true;
    }

    @Override
    @NotNull
    public emr_2 af_() {
        return this.B;
    }

    public Collection<F> an() {
        return this.w.b(enw_2.a((byte)0));
    }

    public Collection<F> ao() {
        return this.w.b(enw_2.a((byte)1));
    }

    public Collection<F> ap() {
        return this.w.b(enw_2.a((byte)5));
    }

    public Collection<F> aq() {
        return this.w.b(enw_2.a(enw_2.a((byte)0), enw_2.a((byte)5)));
    }

    public Collection<F> s(epq_2 epq_22) {
        return this.w.b(enw_2.a((byte)5), enw_2.b(epq_22));
    }

    public Collection<F> ar() {
        return this.w.b(enw_2.a(enw_2.c(), enw_2.a(eoz_1.aF)));
    }

    public int as() {
        return this.am().size();
    }

    public boolean l(F f2) {
        if (f2 == null) {
            throw new IllegalArgumentException("appel de putFighterOffPlay avec fighter = null");
        }
        boolean bl = true;
        if (!this.af_().s() && this.as() <= 1) {
            bl = false;
        } else if (this.t(f2)) {
            this.e(f2);
        } else {
            bl = false;
            p.error((Object)this.a("\u00c9chec de la transition IN PLAY -> OFF PLAY pour " + ((epq_2)f2).a_()));
        }
        ((epq_2)f2).n();
        return bl;
    }

    public boolean t(F f2) {
        return this.w.b(f2);
    }

    @Override
    public Collection<F> e(byte by) {
        return this.w.b(enw_2.c(), enw_2.b(by), enw_2.a(enw_2.a(eoz_1.bh)));
    }

    public Collection<F> a(enw_2 ... enw_2Array) {
        return this.w.b(enw_2Array);
    }

    public Collection<F> p(byte by) {
        return this.w.b(enw_2.a(enw_2.c(), enw_2.a(eoz_1.aF)), enw_2.b(by), enw_2.a(enw_2.a(eoz_1.bh)));
    }

    public Collection<F> q(byte by) {
        return this.w.b(enw_2.d(by));
    }

    public Collection<F> r(byte by) {
        Collection<F> collection = this.w.b(enw_2.a(enw_2.c(), enw_2.a(eoz_1.aF)), enw_2.b(by));
        Iterator<F> iterator = collection.iterator();
        while (iterator.hasNext()) {
            epq_2 epq_22 = (epq_2)iterator.next();
            if (!epq_22.f(eoz_1.au)) continue;
            iterator.remove();
        }
        return collection;
    }

    public void g(F f2) {
        if (f2 == null) {
            throw new IllegalArgumentException("appel de putFighterBackInPlay avec fighter = null");
        }
        if (this.w.a(f2)) {
            ((epq_2)f2).aA();
        } else {
            p.error((Object)this.a("\u00c9chec de la transition OFF PLAY -> IN PLAY pour " + ((epq_2)f2).a_()));
        }
        ((epq_2)f2).q();
    }

    public boolean m(F f2) {
        if (f2 == null) {
            throw new IllegalArgumentException("appel de putFighterOutOfPlay avec fighter = null");
        }
        boolean bl = true;
        try {
            if (!this.u(f2)) {
                p.error((Object)this.a("\u00c9chec de la transition OFF PLAY -> OUT OF PLAY pour " + f2), (Throwable)new Exception("for stacktrace"));
                bl = false;
            } else {
                ((epq_2)f2).aA();
            }
            ((epq_2)f2).s();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            p.error((Object)"Exception levee", (Throwable)illegalArgumentException);
        }
        this.k(f2);
        return bl;
    }

    public boolean u(F f2) {
        return this.w.c(f2);
    }

    private boolean b() {
        return this.af_().r().a(this);
    }

    public boolean l() {
        try {
            if (!this.c) {
                return false;
            }
            if (this.C) {
                return false;
            }
            if (this.b()) {
                return false;
            }
            this.C = true;
            byte by = this.B.r().b(this);
            if (by != -1) {
                this.t(by);
            }
            abx_2 abx_22 = new abx_2();
            for (epq_2 epq_22 : this.ax()) {
                byte by2 = epq_22.Y();
                if (by2 == by || abx_22.b(by2)) continue;
                abx_22.a(by2);
                this.u(by2);
            }
            this.o();
        }
        catch (Exception exception) {
            p.error((Object)this.a("CHECK DE FIN DE COMBAT : On termine de force"));
            p.error((Object)this.a("CHECK DE FIN DE COMBAT : on loggue, mais on ne fait rien, sinon on p\u00e8te un combat "), (Throwable)exception);
        }
        return true;
    }

    public byte at() {
        TByteHashSet tByteHashSet = this.p();
        if (tByteHashSet.size() == 1) {
            return tByteHashSet.toArray()[0];
        }
        if (this.B.O()) {
            return 1;
        }
        p.error((Object)this.c("There's more than one winning team at the end of the fight, no team is considered winner then"));
        return -1;
    }

    private TByteHashSet p() {
        TByteHashSet tByteHashSet = new TByteHashSet();
        for (epq_2 epq_22 : this.am()) {
            if (epq_22.Y() == -1) {
                p.error((Object)this.a("[FIGHT_REFACTOR] Fighter is inPlay but have team id of -1 : " + epq_22 + " - " + aho_2.a(8)));
                continue;
            }
            if (epq_22.f(eoz_1.au)) continue;
            tByteHashSet.add(epq_22.Y());
        }
        return tByteHashSet;
    }

    public boolean au() {
        return this.c;
    }

    public void o() {
        this.C = true;
        try {
            this.P().c();
            this.P().z();
        }
        catch (Exception exception) {
            p.error((Object)this.a("FIN DE COMBAT : Arret de la timeline ", exception));
        }
        try {
            for (epq_2 su : this.am()) {
                this.e(su);
                this.k(su);
            }
        }
        catch (Exception exception) {
            p.error((Object)this.a("FIN DE COMBAT : Retrait des personnages inplay", exception));
        }
        try {
            for (epq_2 epq_22 : this.w.b(enw_2.e())) {
                this.k(epq_22);
            }
        }
        catch (Exception exception) {
            p.error((Object)this.a("FIN DE COMBAT : Retrait des personnages offplay", exception));
        }
        try {
            for (sr_0 sr_02 : this.A.c()) {
                this.b(sr_02);
            }
        }
        catch (Exception exception) {
            p.error((Object)this.a("FIN DE COMBAT : Retrait des zones d'effets", exception));
        }
        try {
            for (epq_2 epq_23 : this.w.b(enw_2.d())) {
                if (epq_23.ci() != epq_23) continue;
                epq_23.az();
            }
        }
        catch (Exception exception) {
            p.error((Object)this.a("FIN DE COMBAT : Notification de fin de combat", exception));
        }
        try {
            for (epq_2 epq_24 : this.w.b(enw_2.d())) {
                if (epq_24.ci() != epq_24) continue;
                this.C(epq_24);
            }
        }
        catch (Exception exception) {
            p.error((Object)this.a("FIN DE COMBAT : Retrait des fighters li\u00e9s aux combats de leur controlleur", exception));
        }
        if (euu_2.a()) {
            this.q();
        }
        for (epq_2 epq_25 : this.ax()) {
            try {
                if (this.B(epq_25) != epq_25) continue;
                this.h(epq_25);
            }
            catch (Exception exception) {
                p.error((Object)this.a("FIN DE COMBAT : Retrait des controlleurs", exception));
            }
        }
        try {
            this.I();
        }
        catch (Exception exception) {
            p.error((Object)this.a("FIN DE COMBAT : Dispatch de l'\u00e9venement de fin de combat", exception));
        }
        try {
            this.ae();
        }
        catch (Exception exception) {
            p.error((Object)this.a("FIN DE COMBAT : Destruction des aires d'effet", exception));
        }
        this.m();
    }

    private void q() {
        for (epq_2 epq_22 : this.ax()) {
            try {
                if (this.B(epq_22) != epq_22 || !euv_2.a.a(epq_22)) continue;
                this.h(epq_22);
            }
            catch (Exception exception) {
                p.error((Object)this.a("FIN DE COMBAT : Retrait des controlleurs", exception));
            }
        }
    }

    public long av() {
        return 0L;
    }

    protected void ae() {
        this.A.g();
    }

    public void m() {
        if (this.A != null) {
            this.A.b();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
        this.b.clear();
        this.x = null;
        this.a.clear();
        this.w.b();
        this.e = null;
    }

    public abstract emk_2 n();

    protected void k(F f2) {
        this.w(f2);
        this.v(f2);
    }

    protected void v(F f2) {
        if (!((epq_2)f2).E_()) {
            return;
        }
        long l = ((epq_2)f2).hv().g().m();
        F f3 = this.w.a(l);
        if (f3 == null) {
            p.error((Object)("[SYMBIOT] Cannot put summon  on cooldown, summoner character not found id=" + l + " summon=" + f2));
            return;
        }
        if (((epq_2)f3).dQ() == null) {
            p.error((Object)("[SYMBIOT] Cannot put summon on cooldown, summoner character has no symbiot id=" + l + " summon=" + f2));
            return;
        }
        byte by = ((epq_2)f3).dQ().a(((epq_2)f2).a_());
        if (by == -1) {
            p.error((Object)("[SYMBIOT] Cannot put summon on cooldown, summon has no valid index in symbiot. Summoner id=" + l + " summon=" + f2));
            return;
        }
        ((epq_2)f3).gh().a((epq_2)f3, by, (int)this.P().u());
        ((epq_2)f3).dQ().a(by, true);
        Optional.ofNullable(((epq_2)f3).dQ().a((int)by)).ifPresent(eqy_12 -> eqy_12.a(-1L));
    }

    public void w(F f2) {
        this.y.g((ti_0)f2);
    }

    private Iterator<Su> r() {
        Collection<Iterator<Su>> collection = this.s();
        return new aca_1<Su>(collection);
    }

    private Collection<Iterator<? extends Su>> s() {
        ArrayList<sr_0> arrayList;
        ArrayList<Iterator<? extends Su>> arrayList2 = new ArrayList<Iterator<? extends Su>>();
        arrayList2.add(this.j().iterator());
        if (this.A != null && !(arrayList = new ArrayList<sr_0>(this.A.f())).isEmpty()) {
            arrayList2.add(arrayList.iterator());
        }
        return arrayList2;
    }

    @Override
    public Su f_(long l) {
        sr_0 sr_02 = this.A.a(l);
        if (sr_02 != null) {
            return sr_02;
        }
        sr_02 = this.w.a(l);
        if (sr_02 != null) {
            return sr_02;
        }
        return this.l(l);
    }

    public int aw() {
        return this.w.b(new enw_2[0]).size();
    }

    public Collection<F> ax() {
        return this.w.b(new enw_2[0]);
    }

    public Collection<F> ay() {
        if (this.B.O()) {
            ArrayList<F> arrayList = new ArrayList<F>();
            arrayList.addAll(this.w.b(enw_2.b(enw_2.b((byte)1), enw_2.a(enw_2.b(enw_2.b(), enw_2.f())))));
            arrayList.addAll(this.w.b(enw_2.b(enw_2.b((byte)0), enw_2.a(enw_2.f()))));
            return arrayList;
        }
        return this.w.b(enw_2.a(enw_2.b(enw_2.b(), enw_2.f())));
    }

    public Su l(long l) {
        return null;
    }

    @Nullable
    public Iterator<Su> V() {
        return new abz_2<Su>();
    }

    public boolean j(long l) {
        return false;
    }

    Iterator<Su> u() {
        Collection<Iterator<Su>> collection = this.s();
        Iterator<Su> iterator = this.V();
        if (iterator != null) {
            collection.add(iterator);
        }
        return new aca_1<Su>(collection);
    }

    @Override
    public Iterator<Su> k() {
        return new elu_0(this);
    }

    @Override
    public List<Su> a(aff_1 aff_12) {
        return this.a(aff_12.d(), aff_12.e(), (int)aff_12.f());
    }

    @Override
    public List<Su> a(int n, int n2, int n3) {
        Iterator<Su> iterator = this.k();
        ArrayList<Su> arrayList = new ArrayList<Su>();
        while (iterator.hasNext()) {
            Su su = iterator.next();
            if (aob_2.a(su, n, n2) != 0) continue;
            arrayList.add(su);
        }
        return arrayList;
    }

    public <T extends epq_2> T d(aff_1 aff_12) {
        if (aff_12 == null) {
            return null;
        }
        return this.a(aff_12.d(), aff_12.e());
    }

    public <T extends epq_2> T a(int n, int n2) {
        if (this.y == null) {
            return null;
        }
        TByteHashSet tByteHashSet = this.y.f(n, n2);
        if (tByteHashSet == null) {
            return null;
        }
        for (byte by : tByteHashSet) {
            ti_0 ti_02 = this.y.a(by);
            if (!(ti_02 instanceof epq_2)) continue;
            return (T)((epq_2)ti_02);
        }
        return null;
    }

    public byte az() {
        return this.F;
    }

    @Override
    public byte d(long l) {
        F f2 = this.w.a(l);
        return this.x((epq_2)f2);
    }

    public byte x(epq_2 epq_22) {
        return this.w.r(epq_22);
    }

    public byte y(epq_2 epq_22) {
        return this.w.s(epq_22);
    }

    public void b(epq_2 epq_22, byte by) {
        this.w.a(epq_22, by);
    }

    public F s(byte by) {
        return this.w.a(enw_2.c(by), enw_2.i());
    }

    public boolean z(F f2) {
        return this.w.t((epq_2)f2);
    }

    public F A(F f2) {
        return this.w.p(f2);
    }

    public F B(F f2) {
        return this.w.q(f2);
    }

    public void a(long l, long l2) {
        F f2 = this.n(l);
        F f3 = this.n(l2);
        if (f2 == null) {
            p.error((Object)String.format("[FIGHT_CONTROLLERS] Fighter introuvable pour un changement de controlleur : %d", l));
        }
        if (f3 == null) {
            p.error((Object)String.format("[FIGHT_CONTROLLERS] Fighter introuvable pour un changement de controlleur : %d", l2));
        }
        this.w.a(f2, f3);
    }

    public void C(F f2) {
        this.w.l(f2);
    }

    public void D(F f2) {
        this.w.m(f2);
    }

    public enm_0<F> aA() {
        return this.w;
    }

    public Collection<sr_0> aB() {
        if (this.A != null) {
            return this.A.f();
        }
        return Collections.emptyList();
    }

    public boolean E(epq_2 epq_22) {
        return this.w.j(epq_22);
    }

    public boolean F(epq_2 epq_22) {
        return this.w.e(epq_22);
    }

    public boolean G(epq_2 epq_22) {
        return this.w.g(epq_22);
    }

    public boolean H(epq_2 epq_22) {
        return this.w.h(epq_22);
    }

    public enq_0 I(epq_2 epq_22) {
        return this.w.f(epq_22);
    }

    public void J(F f2) {
        if (((epq_2)f2).a(eoz_1.bh)) {
            return;
        }
        if (!this.P().h(((epq_2)f2).a_())) {
            StringBuilder stringBuilder = new StringBuilder("Cannot remove fighter " + f2 + " from timeline because it's not in it --- Fighters : ");
            for (epq_2 epq_22 : this.w.b(new enw_2[0])) {
                stringBuilder.append(epq_22.a_()).append(" (breed ").append(epq_22.gO()).append(") - ");
            }
            p.error((Object)this.a(stringBuilder.toString()), new Throwable());
        }
    }

    public void K(F f2) {
        if (!((epq_2)f2).a(eoz_1.bh)) {
            this.P().w(((epq_2)f2).a_());
        }
    }

    public void L(epq_2 epq_22) {
        this.d.add(epq_22.a_());
    }

    public boolean o(long l) {
        return this.d.contains(l);
    }

    public int aC() {
        throw new UnsupportedOperationException("Not implemented - this method must be overloaded");
    }

    public void c(int n) {
        throw new UnsupportedOperationException("Not implemented - this method must be overloaded");
    }

    public wu_0 aD() {
        return this.g;
    }

    public void M(F f2) {
        ((epq_2)f2).a(300, this);
        for (int k = 0; k < this.a.size(); ++k) {
            this.a.get(k).a((epq_2)f2);
        }
    }

    public void j(F f2) {
        ((epq_2)f2).a(305, this);
        for (int k = 0; k < this.a.size(); ++k) {
            this.a.get(k).c((epq_2)f2);
        }
    }

    public void i(F f2) {
        ((epq_2)f2).a(306, this);
        for (int k = 0; k < this.a.size(); ++k) {
            this.a.get(k).b((epq_2)f2);
        }
    }

    public void N(F f2) {
        ((epq_2)f2).a(308, this);
    }

    public void O(F f2) {
        ((epq_2)f2).a(307, this);
    }

    public void h(F f2) {
        if (f2 == null) {
            return;
        }
        try {
            this.c(f2);
            this.w.k(f2);
        }
        catch (Exception exception) {
            p.error((Object)"Exception levee", (Throwable)exception);
        }
        try {
            ((epq_2)f2).a(301, this);
        }
        catch (Exception exception) {
            p.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void c(F f2) {
        if (!this.b.contains(f2)) {
            this.b.add(f2);
            for (epq_2 epq_22 : this.w.o(f2)) {
                if (epq_22 == f2) continue;
                this.c(epq_22);
            }
        }
        this.P(f2);
    }

    protected void P(F f2) {
        if (!this.w.i(f2)) {
            return;
        }
        ((epq_2)f2).az();
        this.w.d(f2);
    }

    public void f(F f2) {
        ((epq_2)f2).a(this);
        p.info((Object)this.a(((epq_2)f2).gd() + " breed : " + ((epq_2)f2).gO() + " [" + ((epq_2)f2).a_() + "] isControlledByAI=" + ((epq_2)f2).gk() + " obstacleId : " + ((epq_2)f2).Z() + " join the fight at " + ((epq_2)f2).P_()));
    }

    public void Q(epq_2 epq_22) {
        if (epq_22 == null) {
            return;
        }
        if (epq_22.a(eoz_1.aj)) {
            return;
        }
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 sr_02 : this.A.f()) {
            if (!sr_02.a(epq_22, epq_22.G(), epq_22.H(), epq_22.I())) continue;
            arrayList.add(sr_02);
        }
        if (!arrayList.isEmpty()) {
            for (sr_0 sr_02 : arrayList) {
                sr_02.a(10012, null, (apq_2)epq_22);
                if (!this.l()) continue;
                return;
            }
        }
    }

    public void a(epq_2 epq_22) {
        this.y.f(epq_22);
    }

    public void e(F f2) {
        if (this.i() != null) {
            this.i().a((Su)f2);
        }
    }

    public abstract void a(F var1, List<int[]> var2, emu_2 var3);

    public abstract void n(F var1);

    public void ab() {
        this.c = true;
    }

    public abstract void I();

    public void t(byte by) {
        for (epq_2 epq_22 : this.w.a(by)) {
            this.j(epq_22);
        }
        this.F = by;
    }

    public void u(byte by) {
        for (epq_2 epq_22 : this.w.a(by)) {
            try {
                if (epq_22.hm()) {
                    this.O(epq_22);
                    continue;
                }
                this.i(epq_22);
            }
            catch (Exception exception) {
                p.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public void a(sr_0 sr_02) {
        if (sr_02.Z() >= 0) {
            this.y.h(sr_02);
        } else {
            this.y.f(sr_02);
        }
        if (sr_02.w() == ele_0.j.a()) {
            ((ekh_0)sr_02).a(this.D);
            this.D.b((ekh_0)sr_02);
        } else if (sr_02.w() == ele_0.n.a()) {
            ekl_0 ekl_02 = (ekl_0)sr_02;
            switch (ekl_02.au()) {
                case 4: {
                    this.ah().a(ekl_02);
                    break;
                }
            }
        }
    }

    @Override
    public void b(sr_0 sr_02) {
        this.y.g(sr_02);
        if (sr_02.w() == ele_0.j.a()) {
            this.D.c((ekh_0)sr_02);
            ((ekh_0)sr_02).a((emp_2)null);
        } else if (sr_02.w() == ele_0.n.a()) {
            ekl_0 ekl_02 = (ekl_0)sr_02;
            switch (ekl_02.au()) {
                case 4: {
                    this.ah().b(ekl_02);
                    break;
                }
            }
        }
    }

    protected void f(sr_0 sr_02) {
        if (!(sr_02 instanceof erc_2)) {
            return;
        }
        erc_2 erc_22 = (erc_2)((Object)sr_02);
        boolean bl = erc_22.hh();
        if (!bl) {
            return;
        }
        if (erc_22.hf() != null) {
            erc_22.hf().ap();
        }
    }

    @Override
    public void c(sr_0 sr_02) {
        if (sr_02.m() && sr_02.u()) {
            sr_02.a(true);
            sr_02.a((Su)null);
            sr_02.a(false);
        }
    }

    @Override
    public void c(sr_0 sr_02, apq_2 apq_22) {
    }

    @Override
    public void d(sr_0 sr_02) {
    }

    public wt_0 aE() {
        return this.E;
    }

    @Override
    public /* synthetic */ elw_0 i(long l) {
        return this.n(l);
    }
}

