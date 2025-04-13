/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.alea.graphics.havenWorldMini.DisplayedScreenMultiElement;
import gnu.trove.procedure.TObjectProcedure;

public class aPg
implements TObjectProcedure<esy_2> {
    final /* synthetic */ float a;
    final /* synthetic */ DisplayedScreenMultiElement b;

    public aPg(DisplayedScreenMultiElement displayedScreenMultiElement, float f2) {
        this.b = displayedScreenMultiElement;
        this.a = f2;
    }

    public boolean a(esy_2 esy_22) {
        this.b(esy_22);
        return true;
    }

    private void b(esy_2 esy_22) {
        afk_2 afk_22 = esy_22.j();
        int n = fkk_0.b(afk_22.c);
        if (n < this.b.o || n >= this.b.o + this.b.q) {
            return;
        }
        int n2 = fkk_0.c(afk_22.e);
        if (n2 < this.b.p || n2 >= this.b.p + this.b.r) {
            return;
        }
        int n3 = esy_22.f();
        aPh.b(this.b.l, n3, esy_22.h() - this.b.o * 9, esy_22.i() - this.b.p * 9, this.a, this.b.n.f(n3));
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esy_2)object);
    }
}

