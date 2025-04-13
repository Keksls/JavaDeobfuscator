/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

class cDt {
    private final ArrayList<akr_0> a = new ArrayList();
    private int b;
    private final ArrayList<akr_0> c = new ArrayList();
    private int d;

    cDt() {
    }

    public void a(akr_0 akr_02, byte by) {
        switch (by) {
            case 0: {
                this.a.add(akr_02);
                this.b = this.a.size();
                break;
            }
            case 1: {
                this.c.add(akr_02);
                this.d = this.c.size();
            }
        }
    }

    public akr_0 a(byte by) {
        switch (by) {
            case 0: {
                if (this.a.size() == 0) {
                    return null;
                }
                if (this.b == this.a.size()) {
                    this.a(this.a);
                    this.b = 0;
                }
                akr_0 akr_02 = this.a.get(this.b);
                ++this.b;
                return akr_02;
            }
            case 1: {
                if (this.c.size() == 0) {
                    return null;
                }
                if (this.d == this.c.size()) {
                    this.a(this.c);
                    this.d = 0;
                }
                akr_0 akr_03 = this.c.get(this.d);
                ++this.d;
                return akr_03;
            }
        }
        return null;
    }

    private void a(ArrayList<akr_0> arrayList) {
        Collections.shuffle(arrayList, Hw.f());
    }
}

