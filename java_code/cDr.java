/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

class cDr {
    private final ArrayList<akr_0> a = new ArrayList();
    private int b;

    cDr() {
    }

    public void a(akr_0 akr_02) {
        this.a.add(akr_02);
        this.b = this.a.size();
    }

    public akr_0 a() {
        if (this.a.size() == 0) {
            return null;
        }
        if (this.b == this.a.size()) {
            this.b();
            this.b = 0;
        }
        akr_0 akr_02 = this.a.get(this.b);
        ++this.b;
        return akr_02;
    }

    private void b() {
        Collections.shuffle(this.a, Hw.f());
    }
}

