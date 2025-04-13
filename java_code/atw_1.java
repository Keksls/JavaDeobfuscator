/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.set.hash.TIntHashSet;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from atW
 */
class atw_1
extends atu_1 {
    static final /* synthetic */ boolean c;

    atw_1() {
    }

    @Override
    public void f() {
        if (!c && this.a()) {
            throw new AssertionError();
        }
        super.f();
    }

    @Override
    boolean a(Anm anm, int n) {
        if (!c) {
            throw new AssertionError((Object)"on ne peut pas faire d'op\u00e9ration sur le NULL");
        }
        return false;
    }

    @Override
    public boolean a(@NotNull Anm anm, TIntHashSet tIntHashSet) {
        if (!c) {
            throw new AssertionError((Object)"on ne peut pas faire d'op\u00e9ration sur le NULL");
        }
        return false;
    }

    @Override
    atu_1 h() {
        return this;
    }

    static {
        c = !atu_1.class.desiredAssertionStatus();
    }
}

