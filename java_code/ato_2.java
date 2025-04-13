/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.set.hash.TIntHashSet;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from atO
 */
class ato_2 {
    public final int a;
    public final Anm b;
    public final gc_0 c;
    private List<FR> g = null;
    public final int d;
    public TIntHashSet e;

    ato_2(int n, Anm anm, gc_0 gc_02, int n2) {
        this(n, anm, gc_02, n2, null);
    }

    ato_2(int n, Anm anm, gc_0 gc_02, int n2, TIntHashSet tIntHashSet) {
        this.a = n;
        this.b = anm;
        this.c = gc_02;
        this.d = n2;
        this.e = tIntHashSet;
    }

    ato_2(ato_2 ato_22) {
        this.a = ato_22.a;
        this.b = ato_22.b;
        this.c = null;
        this.d = ato_22.d;
        this.e = ato_22.e;
    }

    public final boolean a() {
        return this.b.f() && this.b.q().m();
    }

    @NotNull
    public final List<FR> b() {
        FR[] fRArray;
        if (!this.a()) {
            return Collections.emptyList();
        }
        if (this.g != null) {
            return this.g;
        }
        LinkedList<FR> linkedList = new LinkedList<FR>();
        assert (this.c != null);
        String string = this.c.b();
        assert (string != null);
        for (FR fR : fRArray = this.b.q().q()) {
            if (!string.contains(fR.a)) continue;
            linkedList.add(fR);
        }
        this.g = Collections.unmodifiableList(linkedList);
        return this.g;
    }
}

