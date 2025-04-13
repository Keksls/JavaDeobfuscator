/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;

public class abY
extends ahq_0 {
    private int a;
    private int c;
    private abZ d = abZ.c;

    public abY(acb_0 acb_02) {
        super(acb_02);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public void a(boolean bl) {
        this.d = bl ? abZ.a : abZ.c;
    }

    public boolean c() {
        return this.d == abZ.b;
    }

    public final void a(int n, int n2) {
        if (this.d == abZ.b) {
            return;
        }
        this.a = n;
        this.c = n2;
        if (this.d == abZ.a) {
            this.d = abZ.b;
        }
    }

    @Override
    public final float[] a(aiG aiG2) {
        return acw.a().a(aiG2);
    }

    @Override
    public final int d() {
        ahh_0 ahh_02 = this.u();
        if (ahh_02 instanceof aiG) {
            aiG aiG2 = (aiG)((Object)ahh_02);
            return aiG2.aq();
        }
        return this.a();
    }

    public static DisplayedScreenElement a(acs_0 acs_02, int n, int n2, int n3) {
        return acs_02.e(n, n2, n3, acV.c);
    }

    public final void e() {
        this.a(0, 0);
    }
}

