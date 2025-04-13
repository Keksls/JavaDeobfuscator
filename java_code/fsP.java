/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

class fsP
implements Iterator<fvE> {
    private int b = -1;
    private fso c = null;
    private int d = -1;
    final /* synthetic */ fsn_0 a;

    fsP(fsn_0 fsn_02) {
        this.a = fsn_02;
        this.b();
    }

    private void b() {
        while (this.b < this.a.l.size()) {
            if (this.c != null && ++this.d < this.c.getWidgetChildren().size()) {
                return;
            }
            ++this.b;
            if (this.b >= this.a.l.size()) {
                return;
            }
            this.c = this.a.getContainerFromLayer(this.a.l.get(this.b));
            this.d = -1;
        }
    }

    @Override
    public boolean hasNext() {
        return this.b < this.a.l.size();
    }

    public fvE a() {
        fvE fvE2 = this.c.getWidgetChildren().get(this.d);
        this.b();
        return fvE2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.a();
    }
}

