/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.text.EntityText;

/*
 * Renamed from Zy
 */
public class zy_0
implements ZD {
    private final acb_0 a;
    private final zf_0 b;
    private float c;
    private float d;
    private float e;
    private float f = -1.0f;
    private float g = -1.0f;
    private int h = -1;
    private int i = -1;
    private final boolean j;

    public zy_0(acb_0 acb_02, zf_0 zf_02, boolean bl) {
        this.a = acb_02;
        this.b = zf_02;
        this.j = bl;
    }

    private void a() {
        abY abY2 = this.a.b();
        this.e = abY2.g();
        int n = abY2.o();
        int n2 = abY2.p();
        int n3 = (int)((float)this.b.a() / this.e);
        int n4 = (int)((float)this.b.b() / this.e);
        this.c = n3 + n;
        this.d = n4 + n2;
    }

    @Override
    public void a(zu_0 zu_02, int n) {
        int n2 = zu_0.e(zu_02);
        int n3 = zu_02.g();
        EntityText entityText = zu_02.n();
        int n4 = n3 / 4;
        int n5 = n3 / 2;
        int n6 = entityText.j();
        int n7 = entityText.h();
        if (n2 > n5) {
            this.a();
            if (this.f == -1.0f) {
                this.f = zu_02.b();
            }
            if (this.g == -1.0f) {
                this.g = zu_02.c();
            }
            if (this.j) {
                if (this.h == -1) {
                    this.h = n7;
                }
                if (this.i == -1) {
                    this.i = n6;
                }
            }
            int n8 = n2 - n5;
            int n9 = n3 - n5;
            int n10 = Math.round(zu_0.d(n8, this.f, this.c - (zu_02.z() - (float)zu_02.b()), n9));
            int n11 = Math.round(zu_0.d(n8, this.g, this.d - (zu_02.A() - (float)zu_02.c()), n9));
            zu_02.a(n10);
            zu_02.b(n11);
            if (this.j && n7 > 0 && n6 > 0) {
                int n12 = Math.max(0, (int)((float)n7 - ((float)n7 - zu_0.d(n8, this.h, 0.0f, n3))));
                int n13 = Math.max(0, (int)((float)n6 - ((float)n6 - zu_0.d(n8, this.i, 0.0f, n3))));
                zu_02.n().b(zu_0.d(n8, 2.0f, 1.0f, n3));
            }
        } else if (n2 < n4) {
            int n14 = (int)zu_0.c(n2, 0.0f, 2.0f, n4);
            zu_02.b((int)zu_0.c(n2, 60.0f, 60.0f, n3));
            zu_02.a(-(n7 + n14) / 2);
            if (this.j) {
                zu_02.n().b((float)n14);
            }
        }
        zu_02.B();
    }
}

