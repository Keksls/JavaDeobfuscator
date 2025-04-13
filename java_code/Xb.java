/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;

public abstract class Xb
extends fl_1 {
    protected final LinkedList<WX> a = new LinkedList();

    public void a(WX wX) {
        this.a.add(wX);
    }

    public boolean b(WX wX) {
        return this.a.remove(wX);
    }

    public byte[] b() {
        return this.a(this.b_());
    }
}

