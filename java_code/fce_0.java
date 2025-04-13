/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fcE
 */
public abstract class fce_0
extends fcg_0<fci> {
    protected static final Logger a = Logger.getLogger(fce_0.class);
    @Nullable
    private fcf_0 b = null;
    @Nullable
    final TIntObjectHashMap<abd_2> c = new TIntObjectHashMap();
    private int d = 0;
    private final List<fci> e = new ArrayList<fci>();

    protected fce_0(faX faX2) {
        super(faX2);
    }

    @Override
    public void bf_() {
    }

    @Override
    void b(int n) {
        if (this.d > 0) {
            return;
        }
        fci[] fciArray = new fci[this.e.size()];
        this.e.toArray(fciArray);
        for (int k = fciArray.length - 1; k >= 0; --k) {
            fciArray[k].a(n, this.g());
        }
    }

    @Override
    public void a(fci fci2) {
        if (fci2 == null) {
            return;
        }
        this.e.add(fci2);
    }

    @Override
    public void b(fci fci2) {
        this.e.remove(fci2);
    }

    public abstract void b(int var1, int[] var2);

    @Override
    public abstract void a(int var1);

    public abstract void d(int var1, int[] var2);

    public abstract void c(int var1, int[] var2);

    void b() {
        ++this.d;
    }

    void c() {
        --this.d;
    }

    @Nullable
    public abd_2 c(int n) {
        return (abd_2)this.c.get(n);
    }

    protected void e(int n, int[] nArray) {
        abd_2 abd_22 = this.e(n);
        int n2 = nArray.length;
        for (int k = 0; k < n2; ++k) {
            abd_22.a(nArray[k]);
        }
        this.e();
        this.b(n);
    }

    protected void f(int n, int[] nArray) {
        abd_2 abd_22 = this.c(n);
        if (abd_22 == null) {
            return;
        }
        int n2 = nArray.length;
        int n3 = abd_22.a();
        block0: for (int k = n3 - 1; k >= 0; --k) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (abd_22.c(k) != nArray[i2]) continue;
                abd_22.b(k);
                continue block0;
            }
        }
        this.e();
        this.b(n);
    }

    protected void d(int n) {
        abd_2 abd_22 = this.c(n);
        if (abd_22 == null || abd_22.a() == 0) {
            return;
        }
        abd_22.b();
        this.e();
        this.b(n);
    }

    protected void a(int n, int[] nArray) {
        if (nArray == null || nArray.length == 0) {
            this.d(n);
            return;
        }
        abd_2 abd_22 = this.e(n);
        if (this.a(nArray, abd_22)) {
            return;
        }
        abd_22.b();
        int n2 = nArray.length;
        for (int k = 0; k < n2; ++k) {
            abd_22.a(nArray[k]);
        }
        this.e();
        this.b(n);
    }

    boolean a(int[] nArray, @NotNull abd_2 abd_22) {
        if (abd_22.a() == 0) {
            return nArray == null || nArray.length == 0;
        }
        if (nArray == null || nArray.length != abd_22.a()) {
            return false;
        }
        boolean bl = true;
        for (int k = 0; k < abd_22.a(); ++k) {
            int n = abd_22.d(k);
            boolean bl2 = false;
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                if (nArray[i2] != n) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            bl = false;
            break;
        }
        return bl;
    }

    @NotNull
    protected abd_2 e(int n) {
        abd_2 abd_22 = (abd_2)this.c.get(n);
        if (abd_22 != null) {
            return abd_22;
        }
        abd_22 = new abd_2();
        this.c.put(n, (Object)abd_22);
        return abd_22;
    }

    private void e() {
        if (this.b != null) {
            this.b.c();
        }
    }

    @NotNull
    public fbu_0 d() {
        if (this.b == null) {
            this.b = new fcf_0(this);
        }
        return this.b;
    }

    @Override
    public /* synthetic */ void a(fcj fcj2) {
        this.b((fci)fcj2);
    }

    @Override
    public /* synthetic */ void b(fcj fcj2) {
        this.a((fci)fcj2);
    }
}

