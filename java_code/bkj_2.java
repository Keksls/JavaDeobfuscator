/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkJ
 */
public class bkj_2
implements ajh_1 {
    public static final String a = "nationsList";
    public static final String b = "isDefender";
    public static final String d = "score";
    public static final String e = "nbPlayer";
    public static final String f = "maxPlace";
    public static final String g = "placeText";
    public static final String h = "hasWin";
    private final ArrayList<bVn> j = new ArrayList();
    private boolean k;
    private final fhe_0 l;
    public static final String[] i = new String[]{"nationsList", "isDefender", "score", "nbPlayer", "maxPlace", "placeText", "hasWin"};

    public bkj_2(fhe_0 fhe_02, boolean bl) {
        this.l = fhe_02;
        if (bl) {
            fhe_02.j().forEach((TIntProcedure)new bkk_2(this));
        } else {
            fhe_02.i().forEach((TIntProcedure)new bkl_2(this));
        }
        this.k = bl;
    }

    public void a(int n) {
        bVn bVn2 = bVr.b.a(n);
        if (bVn2 == null) {
            return;
        }
        this.j.add(bVn2);
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.j;
        }
        if (string.equals(b)) {
            return this.k;
        }
        if (string.equals(d)) {
            return this.k ? this.l.m() : this.l.l();
        }
        if (string.equals(e)) {
            return this.a();
        }
        if (string.equals(f)) {
            return this.l.d().c();
        }
        if (string.equals(g)) {
            ani_2 ani_22 = new ani_2();
            ani_22.a((CharSequence)(this.a() + "/" + this.l.d().c()));
            return new ani_2().i().a(this.a() == this.l.d().c() ? azf_2.h : azf_2.e).a(ani_22).j().r();
        }
        if (string.equals(h)) {
            return this.k ? this.l.j().contains(this.l.q()) : this.l.i().contains(this.l.q());
        }
        return null;
    }

    public short a() {
        return this.k ? this.l.o() : this.l.n();
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    boolean b(int n) {
        return this.j.contains(bVr.b.a(n));
    }
}

