/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.set.hash.TIntHashSet;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Stack;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class aNF
extends ahq {
    private static final Logger J = Logger.getLogger(aNF.class);
    private final Stack<ape_0> K = new Stack();
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private int Q;
    private final TIntHashSet R = new TIntHashSet();
    private final boolean[] S = new boolean[256];
    private abz_0 T;
    private final ArrayList<abz_0> U = new ArrayList();
    private static final Comparator<abz_0> V = new aNH();

    public aNF(YK yK) {
        super(yK);
        this.b().a(aiu.b);
        this.a(bNT.f());
        this.a(ahs.d());
        this.a(abe_0.d());
        this.a(fsm_0.a);
        this.a(blq_0.c());
        this.a(cdr_1.a);
        this.b().a(new aNG(this));
    }

    public void l(boolean bl) {
        this.N = bl;
    }

    public void m(boolean bl) {
        this.L = bl;
    }

    public void n(boolean bl) {
        this.M = bl;
    }

    @Override
    public void b(boolean bl) {
        super.b(bl);
        this.d(0.0f);
        this.h(false);
        apv_0.a().b();
        apw_0.a().c();
        bNT.f().d();
        cdw_0.n().u();
        abe_0.d().f();
        ayu_2.a().d();
    }

    @Override
    public void a(int n) {
        acz.a().a(n);
        ZI.a.a(n);
        super.a(n);
        this.u();
    }

    private static boolean a(char c2) {
        return c2 >= '\u0000' && c2 < '\u0100';
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        char c2;
        if (this.L) {
            dhK.a(keyEvent);
        }
        if (aNF.a(c2 = keyEvent.getKeyChar()) && !this.S[c2]) {
            this.S[c2] = true;
        }
        return false;
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        char c2;
        if (this.M) {
            dhK.b(keyEvent);
        }
        if (aNF.a(c2 = keyEvent.getKeyChar())) {
            this.S[c2] = false;
        }
        return false;
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean d(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean e(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        if (!this.R.contains(mouseEvent.getButton())) {
            this.R.add(mouseEvent.getButton());
        }
        this.P = mouseEvent.getX();
        this.Q = mouseEvent.getY();
        dhL.a(mouseEvent.getX(), mouseEvent.getY(), mouseEvent.getButton());
        return false;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
        if (this.R.contains(mouseEvent.getButton())) {
            this.R.remove(mouseEvent.getButton());
        }
        dhL.a(mouseEvent.getX(), mouseEvent.getY(), mouseEvent.getButton(), mouseEvent.getModifiersEx());
        return true;
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        if (!cww_0.c().a()) {
            this.b().c((float)mouseWheelEvent.getWheelRotation() * 0.1f);
        }
        return false;
    }

    @Override
    public boolean f(MouseEvent mouseEvent) {
        int n;
        super.f(mouseEvent);
        if (!this.O) {
            return false;
        }
        int n2 = mouseEvent.getX() - this.P;
        if (n2 * n2 + (n = mouseEvent.getY() - this.Q) * n < 200) {
            return true;
        }
        dhL.b(mouseEvent.getX(), mouseEvent.getY());
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        super.g(mouseEvent);
        this.g(mouseEvent.getX(), mouseEvent.getY());
        return false;
    }

    private boolean N() {
        return !this.R.isEmpty();
    }

    void g(int n, int n2) {
        this.T = this.d(n, n2);
        if (!this.N()) {
            if (this.N) {
                dhL.a(n, n2);
            }
        } else if (this.O) {
            dhL.b(n, n2);
        }
    }

    public abz_0 d(int n, int n2) {
        bNK bNK2;
        afv afv22;
        this.U.clear();
        float f2 = this.a((float)n);
        float f3 = this.b((float)n2);
        bmr_1 bmr_12 = azu_0.j().k();
        int n3 = bmr_12 == null ? -1 : bmr_12.cQ();
        ArrayList arrayList = afz_0.d().a(f2, f3);
        for (afv afv22 : arrayList) {
            boolean bl;
            if (afv22 == null || !(bl = afv22.az() == n3) || !afv22.aE()) continue;
            this.U.add(afv22);
        }
        ahv ahv2 = (ahv)ahs.d().b(f2, f3);
        if (ahv2 != null) {
            this.U.add(ahv2);
        }
        if ((afv22 = abe_0.d().b(f2, f3)) != null && afv22 instanceof abz_0) {
            this.U.add(afv22);
        }
        if (n3 == -1 && (bNK2 = bNT.f().b(new aNI(this, n, n2))) != null) {
            this.U.add(bNK2);
        }
        this.U.sort(V);
        abz_0 abz_02 = null;
        if (!this.U.isEmpty()) {
            abz_02 = this.U.get(0);
        }
        afz_0.d().a(abz_02);
        bNT.f().a(abz_02);
        ahs.d().a(abz_02);
        abe_0.d().a(abz_02);
        if (abz_02 != null && abz_02.aE()) {
            abz_02.e(true);
        }
        return abz_02;
    }

    @NotNull
    public ArrayList<abz_0> e(int n, int n2) {
        float f2 = this.a((float)n);
        float f3 = this.b((float)n2);
        boolean bl = false;
        if (azu_0.j().k() != null) {
            bl = azu_0.j().k().bz() != null;
        }
        ArrayList<abz_0> arrayList = new ArrayList<abz_0>();
        ArrayList arrayList2 = afz_0.d().a(f2, f3);
        arrayList.addAll(arrayList2);
        if (!bl) {
            ArrayList arrayList3 = ahs.d().a(f2, f3);
            arrayList.addAll(arrayList3);
            Collection<bNK> collection = bNT.f().a(new aNI(this, n, n2));
            arrayList.addAll(collection);
            ArrayList<abz_0> arrayList4 = aPc.f().a(f2, f3);
            if (arrayList4 != null) {
                arrayList.addAll(arrayList4);
            }
        }
        arrayList.sort(V);
        return arrayList;
    }

    @Override
    public boolean a(FocusEvent focusEvent) {
        return false;
    }

    @Override
    public boolean b(FocusEvent focusEvent) {
        return false;
    }

    public void a(ape_0 ape_02) {
        this.K.push(ape_02);
    }

    public void u() {
        while (!this.K.empty()) {
            ape_0 ape_02 = this.K.pop();
            ape_02.b();
        }
    }

    public abz_0 v() {
        return this.T;
    }

    public boolean e(int n) {
        assert (aNF.a((char)n));
        return this.S[n];
    }

    public boolean f(int n) {
        return this.R.contains(n);
    }

    public void o(boolean bl) {
        this.O = bl;
    }

    @Override
    protected void c(boolean bl) {
        super.c(bl);
        cco_2.a().b(bl);
    }

    @Override
    protected acb_0 a(aug_2 aug_22) {
        aNF aNF2 = new aNF(this.n);
        aNF2.f = aug_22;
        return aNF2;
    }

    @Override
    protected void h() {
        super.h();
        aNL.a.a();
    }

    public aNI f(int n, int n2) {
        return new aNI(this, n, n2);
    }

    static /* synthetic */ float a(aNF aNF2, float f2) {
        return aNF2.a(f2);
    }

    static /* synthetic */ float b(aNF aNF2, float f2) {
        return aNF2.b(f2);
    }
}

