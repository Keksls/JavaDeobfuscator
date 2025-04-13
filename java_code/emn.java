/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

class emn
extends emi {
    final /* synthetic */ String a;
    final /* synthetic */ Consumer b;
    final /* synthetic */ emj c;

    emn(emj emj2, String string, Consumer consumer) {
        this.c = emj2;
        this.a = string;
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

