/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

class emm
extends emi {
    final /* synthetic */ int a;
    final /* synthetic */ Consumer b;
    final /* synthetic */ emj c;

    emm(emj emj2, int n, Consumer consumer) {
        this.c = emj2;
        this.a = n;
        this.b = consumer;
    }

    @Override
    public void a() {
        this.c.a(this.a, (Consumer<emh>)this.b);
    }

    @Override
    public void a(String string) {
        this.b.accept(emh.d);
    }
}

