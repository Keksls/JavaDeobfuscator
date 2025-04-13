/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public abstract class ePX
extends fo_1 {
    protected final epl_0 d;
    private List<ePW> e;

    ePX(epl_0 epl_02) {
        this.d = epl_02;
    }

    public void b() {
        if (this.e == null) {
            return;
        }
        for (ePW ePW2 : this.e) {
            ePW2.a();
        }
    }

    public void a(ePW ePW2) {
        if (this.e == null) {
            this.e = new ArrayList<ePW>();
        }
        if (!this.e.contains(ePW2)) {
            this.e.add(ePW2);
        }
    }
}

