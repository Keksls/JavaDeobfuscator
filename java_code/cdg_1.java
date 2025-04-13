/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

/*
 * Renamed from cdg
 */
class cdg_1
implements cdh_1 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;

    cdg_1(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    @Override
    public void a(ScreenElement screenElement) {
        if (screenElement.r() > this.e) {
            this.e = screenElement.r();
        }
        screenElement.b(screenElement.r() + this.a);
        short s2 = screenElement.n();
        screenElement.a((short)(Math.abs(s2) + this.b));
        if (screenElement.j() != 0 && s2 != 0) {
            screenElement.c(this.d);
            int n = s2 > 0 ? this.c : -this.c;
            screenElement.d(s2 + n);
        } else {
            screenElement.d(0);
        }
    }

    public int a() {
        return this.e;
    }
}

