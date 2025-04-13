/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fcL
 */
public abstract class fcl_0
extends fcg_0<fcl> {
    private static final Logger a = Logger.getLogger(fcl_0.class);
    private final Set<Long> b = new HashSet<Long>();
    private final List<fcl> c = new ArrayList<fcl>();

    protected fcl_0(faX faX2) {
        super(faX2);
    }

    @Override
    void b(faU faU2) {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            this.c.get(k).a(faU2);
        }
    }

    void c(faU faU2) {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            this.c.get(k).a(this.g(), faU2);
        }
    }

    @Override
    public void bf_() {
    }

    @Nullable
    public faU c(long l) {
        if (!this.b.contains(l)) {
            return null;
        }
        return this.a(l);
    }

    protected abstract faU a(long var1);

    @Override
    public void a(fcl fcl2) {
        if (fcl2 == null) {
            return;
        }
        this.c.add(fcl2);
    }

    @Override
    public void b(fcl fcl2) {
        this.c.remove(fcl2);
    }

    public boolean d(faU faU2) {
        return this.b.contains(faU2.a_());
    }

    @Override
    public abstract void a(@NotNull faU var1);

    @Override
    public abstract void b(long var1);

    public void a(long l, fct_0 fct_02) {
        throw new UnsupportedOperationException();
    }

    public void b(long l, fct_0 fct_02) {
        throw new UnsupportedOperationException();
    }

    public void e(@NotNull faU faU2) {
        faV faV2 = faU2.fE();
        if (!faX.a(faV2.m(), this.g())) {
            a.error((Object)("[NATION] Registering " + faU2 + " to nation " + this.g() + " but he is in " + faV2.m()));
            return;
        }
        if (this.b.contains(faU2.a_())) {
            a.error((Object)("[NATION] Registering " + faU2 + " to nation " + this.g() + " but he's already in it"));
            return;
        }
        this.b.add(faU2.a_());
        this.b(faU2);
    }

    public boolean f(@NotNull faU faU2) {
        faV faV2 = faU2.fE();
        faX faX2 = faV2.m();
        if (faX2 != this.g()) {
            boolean bl;
            boolean bl2 = bl = !faX2.d(faU2);
            if (bl) {
                a.error((Object)("[NATION] Impossible d'ajouter le joueur " + faU2 + " \u00e0 la nation " + this.g() + " car on ne peut pas l'enlever \u00e0 sa nation courante (" + faX2 + ")"));
                return false;
            }
        }
        this.b.add(faU2.a_());
        faV2.b(this.g());
        this.b(faU2);
        return true;
    }

    public boolean g(@NotNull faU faU2) {
        boolean bl = this.b.remove(faU2.a_());
        if (!bl && !faX.a(faX.i, this.g())) {
            a.error((Object)("[NATION] Trying to remove " + faU2.a_() + " from nation " + this.g() + " but he is not in it."));
            return false;
        }
        this.c(faU2);
        return true;
    }

    @Override
    public void a(TObjectProcedure<faU> tObjectProcedure) {
        this.b.forEach(l -> tObjectProcedure.execute((Object)this.a((long)l)));
    }

    public void d(long l) {
        boolean bl = this.b.remove(l);
        if (!bl) {
            a.info((Object)("[NATION] Trying to remove " + l + " from " + this.g() + " after a disconnection but he's not in it"));
        }
    }

    public int b() {
        return this.b.size();
    }

    @Override
    public /* synthetic */ void a(fcj fcj2) {
        this.b((fcl)fcj2);
    }

    @Override
    public /* synthetic */ void b(fcj fcj2) {
        this.a((fcl)fcj2);
    }
}

